package id.utdi.jerymiannor.domain.use_case.get_coins

import id.utdi.jerymiannor.common.Resource
import id.utdi.jerymiannor.data.remote.dto.toCoin
import id.utdi.jerymiannor.domain.model.Coin
import id.utdi.jerymiannor.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor( //TODO: pada usecase ini digunakan untuk mengambil data coin dari server dan try-catch untuk mengatur beberapa kondisi kesalahan yang mungkin terjadi saat mengambil data koin.
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success(coins))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}