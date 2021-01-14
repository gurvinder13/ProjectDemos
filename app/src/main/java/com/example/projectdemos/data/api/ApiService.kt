package com.example.projectdemos.data.api

import com.example.projectdemos.data.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}