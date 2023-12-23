package id.utdi.jerymiannor.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import id.utdi.jerymiannor.presentation.coin_detail.CoinDetailScreen
import id.utdi.jerymiannor.presentation.coin_list.CoinListScreen
import id.utdi.jerymiannor.presentation.ui.theme.CryptoAppTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() { //TODO: pada MainActivity, layout utama diatur pada CryptoAppTheme dengan warna background, kemudian terdapat navigasi menggunakan navhost dan navcontroller dengan tujuan layar coin list screen dan coin detail screen.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoAppTheme {
                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.CoinListScreen.route
                    ) {
                        composable(
                            route = Screen.CoinListScreen.route
                        ) { CoinListScreen(navController) }
                        composable(
                            route = Screen.CoinDetailScreen.route + "/{coinId}"
                        ) { CoinDetailScreen() }
                    }
                }
            }
        }
    }
}
