package id.utdi.jerymiannor.domain.repository

import id.utdi.jerymiannor.data.remote.dto.CoinDetailDto
import id.utdi.jerymiannor.data.remote.dto.CoinDto

interface CoinRepository { //TODO: Pada interface ini digunakan metode getCoins dan getCoinByID untuk mengambil data koin dari server dan data detail koin dari server berdasarkan ID koin.
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}