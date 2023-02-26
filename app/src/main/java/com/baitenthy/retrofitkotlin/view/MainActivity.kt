package com.baitenthy.retrofitkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.baitenthy.retrofitkotlin.R
import com.baitenthy.retrofitkotlin.model.CryptoModel
import com.baitenthy.retrofitkotlin.service.CryptoAPI
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private val BASE_URL="https://raw.githubusercontent.com/"
    private var cryptoModels: ArrayList<CryptoModel>?= null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json

        loadData()

    }

    private fun loadData() {

        val retrofit= Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service= retrofit.create(CryptoAPI:: class.java)        //API ile retrofiti birbirine bağlıyorum
        val call= service.getData()

        call.enqueue(object : Callback<List<CryptoModel>> {
            override fun onResponse(
                call: Call<List<CryptoModel>>,
                response: Response<List<CryptoModel>>
            ) {

                if(response.isSuccessful){              //eğer boş değilse kod bloğunu çalıştır demek
                    response.body()?.let {

                        cryptoModels= ArrayList(it)

                    }
                }
            }

            override fun onFailure(call: Call<List<CryptoModel>>, t: Throwable) {

            }

        })

    }
}