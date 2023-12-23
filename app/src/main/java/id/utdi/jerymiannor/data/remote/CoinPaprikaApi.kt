package id.utdi.jerymiannor.data.remote

import id.utdi.jerymiannor.data.remote.dto.CoinDetailDto
import id.utdi.jerymiannor.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi { //TODO: pada interface ini digunakan untuk mengambil daftar koin dan detail koin dari server atau API yang digunakan dengan mengirim request HTTP get ke endpoint masing-masing.

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(
        @Path("coinId") coinId: String
    ): CoinDetailDto
}