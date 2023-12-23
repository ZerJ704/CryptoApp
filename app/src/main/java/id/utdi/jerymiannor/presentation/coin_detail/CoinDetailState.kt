package id.utdi.jerymiannor.presentation.coin_detail

import id.utdi.jerymiannor.domain.model.CoinDetail

data class CoinDetailState( //TODO: CoinDetailState digunakan untuk merepresentasikan state dari layar detail koin pada aplikasi, dengan informasi loading, daftar koin, dan error.
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
