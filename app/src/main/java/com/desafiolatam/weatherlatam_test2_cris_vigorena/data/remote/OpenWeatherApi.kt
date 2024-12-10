package com.desafiolatam.weatherlatam_test2_cris_vigorena.data.remote

import com.desafiolatam.weatherlatam_test2_cris_vigorena.data.local.WeatherWrapper
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface OpenWeatherService {

    @GET("weather")
    suspend fun getWeatherData(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("appid") appid: String,
        @Query("units") unit: String = "metric"
    ): Response<WeatherWrapper?>
}