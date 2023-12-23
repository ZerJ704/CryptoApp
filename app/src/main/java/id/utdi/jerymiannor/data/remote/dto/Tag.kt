package id.utdi.jerymiannor.data.remote.dto

import com.google.gson.annotations.SerializedName

data class Tag( //TODO: class ini mendefinisikan nama properti yang berbeda untuk deserialisasi dan serialisasi.
    @SerializedName("coin_counter")
    val coinCounter: Int,
    @SerializedName("ico_counter")
    val icoCounter: Int,
    val id: String,
    val name: String
)