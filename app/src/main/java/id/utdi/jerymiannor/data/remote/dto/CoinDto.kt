package id.utdi.jerymiannor.data.remote.dto

import com.google.gson.annotations.SerializedName
import id.utdi.jerymiannor.domain.model.Coin

data class CoinDto( //TODO: class ini digunakan untuk menyimpan informasi Coin mulai dari id hingga symbol.
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("is_new")
    val isNew: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

fun CoinDto.toCoin(): Coin = Coin(
    id = id,
    isActive = isActive,
    name = name,
    rank = rank,
    symbol = symbol
)
