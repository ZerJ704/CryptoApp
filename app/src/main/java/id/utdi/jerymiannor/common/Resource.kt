package id.utdi.jerymiannor.common

//TODO: class ini digunakan untuk menyimpan respons yang diperoleh dari API dan dapat digunakan oleh CoinListViewModel, CoinListScreen, dan CoinListItem.
sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T>(data: T? = null) : Resource<T>(data)
}