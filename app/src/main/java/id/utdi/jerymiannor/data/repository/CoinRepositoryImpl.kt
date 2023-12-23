package id.utdi.jerymiannor.data.repository

import id.utdi.jerymiannor.data.remote.CoinPaprikaApi
import id.utdi.jerymiannor.data.remote.dto.CoinDetailDto
import id.utdi.jerymiannor.data.remote.dto.CoinDto
import id.utdi.jerymiannor.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor( //TODO: kelas ini digunakan untuk mengimplementasikan logika pengambilan data koin dari server dan menyediakan objek CoinRepository yang dapat digunakan oleh CoinListViewModel dan GetCoinsUseCase.
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> =
        api.getCoins()

    override suspend fun getCoinById(coinId: String): CoinDetailDto =
        api.getCoinById(coinId)

}