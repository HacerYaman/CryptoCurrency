package com.baitenthy.retrofitkotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.baitenthy.retrofitkotlin.R
import com.baitenthy.retrofitkotlin.model.CryptoModel

class CryptoAdapter (private val cryptoList: ArrayList<CryptoModel>): RecyclerView.Adapter<CryptoAdapter.RowHolder>() {

    class RowHolder(view : View) : RecyclerView.ViewHolder(view) {

        fun bind(){
            itemView

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.rv_row,parent,false)
        return RowHolder(view)
    }

    override fun onBindViewHolder(holder: RowHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return cryptoList.count()
    }
}