package kr.rinc.apicreator.network

import android.annotation.SuppressLint
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@SuppressLint("StaticFieldLeak")
object RincRetroInit {
    val networkList: RincNetworkList
    private val SERVER_URL: String = "http://rinc.kr:7002"

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl(SERVER_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        networkList = retrofit.create(RincNetworkList::class.java)
    }
}