package id.utdi.jerymiannor.domain.use_case.get_coin

import id.utdi.jerymiannor.common.Resource
import id.utdi.jerymiannor.data.remote.dto.toCoinDetail
import id.utdi.jerymiannor.domain.model.CoinDetail
import id.utdi.jerymiannor.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor( //TODO: pada usecase ini digunakan untuk mengambil data coin dari server dan try-catch untuk mengatur beberapa kondisi kesalahan yang mungkin terjadi saat mengambil data koin.
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coin))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}