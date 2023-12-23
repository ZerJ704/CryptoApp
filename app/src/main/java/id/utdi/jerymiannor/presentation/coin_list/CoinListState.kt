package id.utdi.jerymiannor.presentation.coin_list

import id.utdi.jerymiannor.domain.model.Coin

data class CoinListState( //TODO: CoinListState digunakan untuk merepresentasikan state dari layar daftar koin pada aplikasi, dengan informasi loading, daftar koin, dan error.
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
