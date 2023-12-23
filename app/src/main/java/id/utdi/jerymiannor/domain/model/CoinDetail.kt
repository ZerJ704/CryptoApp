package id.utdi.jerymiannor.domain.model

import id.utdi.jerymiannor.data.remote.dto.TeamMember

data class CoinDetail( //TODO: ini merupakan data class untuk detail koin yang mencakup val coinId hingga team.
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>
)
