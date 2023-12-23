package id.utdi.jerymiannor.data.remote.dto

data class LinksExtended( //TODO: class ini digunakan untuk menyimpan informasi tentang link kripto seperti stats, type, dan url yang dapat digunakan oleh CoinDetailViewModel, CoinDetailScreen, dan LinksListItem.
    val stats: Stats,
    val type: String,
    val url: String
)