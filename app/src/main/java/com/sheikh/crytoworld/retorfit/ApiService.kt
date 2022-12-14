package com.sheikh.crytoworld.retorfit

import com.sheikh.crytoworld.pojos.coin_full_info.CoinPriceInfoRawData
import com.sheikh.crytoworld.pojos.top_coins_list.top_coin.ListOfTopCoins
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("top/totalvolfull")
    fun getTopCoins(
        @Query(QUERY_PARAM_API_KEY) api_key: String = QUERY_VALUE_API_KEY,
        @Query(QUERY_PARAM_LIMIT) limit: Int = QUERY_VALUE_LIMIT,
        @Query(
            QUERY_PARAM_CONVERT_TO
        ) convertingCurrency: String = QUERY_VALUE_CONVERT_TO
    ): Single<ListOfTopCoins>

    @GET("pricemultifull")
    fun getFullDataOfCoins(
        @Query(QUERY_PARAM_API_KEY) apiKey: String = QUERY_VALUE_API_KEY,
        @Query(QUERY_PARAM_COIN_NAME) coinName: String,
        @Query(
            QUERY_PARAM_CONVERT_VALUE
        ) convertCurrencyName: String = QUERY_VALUE_CONVERT_VALUE,
    ): Single<CoinPriceInfoRawData>

    companion object {
        private const val QUERY_PARAM_API_KEY = "api_key"
        private const val QUERY_VALUE_API_KEY = ""

        private const val QUERY_PARAM_LIMIT = "limit"
        private const val QUERY_VALUE_LIMIT = 10

        private const val QUERY_PARAM_CONVERT_TO = "tsym"
        private const val QUERY_VALUE_CONVERT_TO = "USD"

        private const val QUERY_PARAM_COIN_NAME = "fsyms"
        private const val QUERY_PARAM_CONVERT_VALUE = "tsyms"
        private const val QUERY_VALUE_CONVERT_VALUE = "USD"
    }
}