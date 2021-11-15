package com.example.weatherapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val api = retrofit.getClient().create(weatherapi::class.java)

        api.getWeather(498817,"e64bca153f7787a2fb97d15fe168b1d2").enqueue(object: Callback<WeatherResponse> {
            override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {

            }

            override fun onResponse(call: Call<WeatherResponse>, response: Response<WeatherResponse>) {

            }
        })
    }
}