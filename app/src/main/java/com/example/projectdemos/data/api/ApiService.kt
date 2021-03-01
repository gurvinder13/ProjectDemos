package com.example.projectdemos.data.api

import com.example.projectdemos.data.model.ArticleResponse
import retrofit2.http.GET

interface ApiService {
    @GET("v2/viewed/7.json?api-key=uaOxjpsRkatA4GmHHwve45KtWNw1CSAC")
    suspend fun getUsers(): ArticleResponse
}