package com.baitenthy.retrofitkotlin.service

import com.baitenthy.retrofitkotlin.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET




interface CryptoAPI {

    //GET, POST, UPDATE, DELETE...

    //https://raw.githubusercontent.com/
    //bu kısmı lazım ana linkin sonrası
    // atilsamancioglu/K21-JSONDataSet/master/crypto.json


    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData(): Call<List<CryptoModel>>                       //asenkron şekilde yapılan işlem


}