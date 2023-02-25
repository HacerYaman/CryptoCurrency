package com.baitenthy.retrofitkotlin.model

import com.google.gson.annotations.SerializedName

data class CryptoModel(         //data sınıfının modeli

    @SerializedName("price")
    val price: String,
    @SerializedName("currency")
    val currency: String

    )