package id.utdi.jerymiannor.data.remote.dto

import com.google.gson.annotations.SerializedName

data class Links( //TODO: digunakan untuk menyimpan informasi link kripto seperti link beberapa media sosial hingga youtube.
    val explorer: List<String>,
    val facebook: List<String>,
    val reddit: List<String>,
    @SerializedName("source_code")
    val sourceCode: List<String>,
    val website: List<String>,
    val youtube: List<String>
)