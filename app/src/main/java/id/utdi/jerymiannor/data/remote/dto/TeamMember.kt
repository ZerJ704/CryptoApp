package id.utdi.jerymiannor.data.remote.dto

data class TeamMember( //TODO: class ini mengelola informasi tentang team members yang dapat digunakan oleh CoinDetailViewModel, CoinDetailScreen, dan TeamListItem.
    val id: String,
    val name: String,
    val position: String
)