package com.example.myapplication

import android.util.Log
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.response.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

object KtorApi {
     const val BASE_URL = "https://jsonplaceholder.typicode.com"
     const val GET_UUID = "$BASE_URL/todos/"
}
