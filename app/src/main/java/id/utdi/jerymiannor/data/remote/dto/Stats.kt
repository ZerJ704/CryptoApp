package id.utdi.jerymiannor.data.remote.dto

data class Stats( //TODO: class Stats digunakan untuk menyimpan informasi statistik tentang kripto yang dapat digunakan oleh CoinDetailViewModel, CoinDetailScreen, dan StatsListItem.
    val contributors: Int,
    val followers: Int,
    val stars: Int,
    val subscribers: Int
)