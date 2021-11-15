package com.example.weatherapplication

import android.accounts.AuthenticatorDescription
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface weatherapi {
    @GET("/data/2.5/weather")
    fun getWeather(
        @Query("id") id: Int,
        @Query("appid") key: String): Call<WeatherResponse>
}

data class WeatherResponse(
    val coord: Coord?,
    val weather: List<Weather>?,
    val base: String?,
    val main: Main?,
    val visibility: Int?,
    val wind: Wind?,
    val clouds: Clouds?,
    val dt: Int?,
    val sys: Sys?,
    val timezone: Int?,
    val id: Int?,
    val name: String?,
    val cod: Int?
)

data class Coord(
    val lat: Float?,
    val lon: Float?
)

data class Weather(
    val id: Int?,
    val main: String?,
    val description: String?,
    val icon: String?
)

data class Main(
    val temp: Float?,
    val feels_like: Float?,
    val temp_min: Float?,
    val temp_max: Float?,
    val pressure: Int?,
    val humidity: Int?
)

data class Wind(
    val speed: Float?,
    val deg: Int?
)

data class Clouds(
    val all: Int?
)

data class Sys(
    val type: Int?,
    val id: Int?,
    val message: Float?,
    val country: String?,
    val sunrise: Int?,
    val sunset: Int?
)