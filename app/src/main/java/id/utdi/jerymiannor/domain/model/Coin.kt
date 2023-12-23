package id.utdi.jerymiannor.domain.model

data class Coin( //TODO: ini adalah data class untuk coin yang mencakup val id hingga symbol.
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String
)
