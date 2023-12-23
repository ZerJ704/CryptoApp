package id.utdi.jerymiannor.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.utdi.jerymiannor.common.Constants
import id.utdi.jerymiannor.data.remote.CoinPaprikaApi
import id.utdi.jerymiannor.data.repository.CoinRepositoryImpl
import id.utdi.jerymiannor.domain.repository.CoinRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule { //TODO: AppModule menyediakan dependensi untuk aplikasi ini dengan fungsi providePaprikaApi untuk mengambil data koin dari server dan fungsi provideCoinRepository untuk mengimplementasikan CoinRepository dengan menggunakan instance CoinPaprikaApi yang telah disediakan.

    @Provides
    @Singleton
    fun providePaprikaApi(): CoinPaprikaApi = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(CoinPaprikaApi::class.java)

    @Provides
    @Singleton
    fun provideCoinRepository(
        api: CoinPaprikaApi
    ): CoinRepository = CoinRepositoryImpl(api)

}