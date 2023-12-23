package id.utdi.jerymiannor.presentation

sealed class Screen(val route: String) { //TODO: kelas Screen ini adalah kelas yang mendefinisikan file yang dapat menggunakan kelas ini dengan rute ke layar coin list screen dan coin detail screen.
    object CoinListScreen: Screen("coin_list_screen")
    object CoinDetailScreen: Screen("coin_detail_screen")
}
