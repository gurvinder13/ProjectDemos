package com.example.projectdemos.data.repository

import com.example.projectdemos.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()
}