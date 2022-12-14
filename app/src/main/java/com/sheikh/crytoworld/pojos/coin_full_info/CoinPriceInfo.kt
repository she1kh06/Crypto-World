package com.sheikh.crytoworld.pojos.coin_full_info

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.sheikh.crytoworld.retorfit.ApiFactory.BASE_IMAGE_URL
import com.sheikh.crytoworld.utils.convertTimeStampToTime

@Entity(tableName = "crypto_database")
data class CoinPriceInfo(

    @SerializedName("TYPE")
    @Expose
    val type: String,

    @SerializedName("MARKET")
    @Expose
    val market: String,

    @PrimaryKey
    @SerializedName("FROMSYMBOL")
    @Expose
    val fromSymbol: String,

    @SerializedName("TOSYMBOL")
    @Expose
    val toSymbol: String,

    @SerializedName("FLAGS")
    @Expose
    val flags: String,

    @SerializedName("PRICE")
    @Expose
    val price: Double,

    @SerializedName("LASTUPDATE")
    @Expose
    val lastUpdate: Long,        // It was Int and i changed this to Long

    @SerializedName("MEDIAN")
    @Expose
    val median: Double,

    @SerializedName("LASTVOLUME")
    @Expose
    val lastVolume: Double,

    @SerializedName("LASTVOLUMETO")
    @Expose
    val lastVolumeTo: Double,

    @SerializedName("LASTTRADEID")
    @Expose
    val lastTradeId: String,

    @SerializedName("VOLUMEDAY")
    @Expose
    val volumeDay: Double,

    @SerializedName("VOLUMEDAYTO")
    @Expose
    val volumeDayTo: Double,

    @SerializedName("VOLUME24HOUR")
    @Expose
    val volume24hour: Double,

    @SerializedName("VOLUME24HOURTO")
    @Expose
    val volume24hourTo: Double,

    @SerializedName("OPENDAY")
    @Expose
    val openDay: Double,

    @SerializedName("HIGHDAY")
    @Expose
    val highDay: Double,

    @SerializedName("LOWDAY")
    @Expose
    val lowDay: Double,

    @SerializedName("OPEN24HOUR")
    @Expose
    val open24hour: Double,

    @SerializedName("HIGH24HOUR")
    @Expose
    val high24hour: Double,

    @SerializedName("LOW24HOUR")
    @Expose
    val low24hour: Double,

    @SerializedName("LASTMARKET")
    @Expose
    val lastMarket: String,

    @SerializedName("VOLUMEHOUR")
    @Expose
    val volumeHour: Double,

    @SerializedName("VOLUMEHOURTO")
    @Expose
    val volumeHourTo: Double,

    @SerializedName("OPENHOUR")
    @Expose
    val openHour: Double,

    @SerializedName("HIGHHOUR")
    @Expose
    val highHour: Double,

    @SerializedName("LOWHOUR")
    @Expose
    val lowHour: Double,

    @SerializedName("TOPTIERVOLUME24HOUR")
    @Expose
    val topTierVolume24Hour: Double,

    @SerializedName("TOPTIERVOLUME24HOURTO")
    @Expose
    val topTierVolume24HourTo: Double,

    @SerializedName("CHANGE24HOUR")
    @Expose
    val change24hour: Double,

    @SerializedName("CHANGEPCT24HOUR")
    @Expose
    val changePct24Hour: Double,

    @SerializedName("CHANGEDAY")
    @Expose
    val changeDay: Double,

    @SerializedName("CHANGEPCTDAY")
    @Expose
    val changePctDay: Double,

    @SerializedName("CHANGEHOUR")
    @Expose
    val changeHour: Double,

    @SerializedName("CHANGEPCTHOUR")
    @Expose
    val changePctHour: Double,

    @SerializedName("CONVERSIONTYPE")
    @Expose
    val conversionType: String,

    @SerializedName("CONVERSIONSYMBOL")
    @Expose
    val conversionSymbol: String,


    @SerializedName("CIRCULATINGSUPPLYMKTCAP")
    @Expose
    val circulatingSupplyMktCap: Double,

    @SerializedName("TOTALVOLUME24H")
    @Expose
    val totalVolume24h: Double,

    @SerializedName("TOTALVOLUME24HTO")
    @Expose
    val totalVolume24hTo: Double,

    @SerializedName("TOTALTOPTIERVOLUME24H")
    @Expose
    val totalTopTierVolume24h: Double,

    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    @Expose
    val totalTopTierVolume24hTo: Double,

    @SerializedName("IMAGEURL")
    @Expose
    val imageUrl: String
) {
    fun getLastUpdatedTime() = convertTimeStampToTime(lastUpdate)


    fun getFullImageURL() = BASE_IMAGE_URL + imageUrl
}