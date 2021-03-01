package com.example.projectdemos.data.model


import com.google.gson.annotations.SerializedName

data class Result(
    val `abstract`: String,
    @SerializedName("adx_keywords")
    val adxKeywords: String,
    @SerializedName("asset_id")
    val assetId: Long,
    val byline: String,
    val column: Any,
    val media: List<Media>,
    val publishedDate: String,
    val section: String,
    val source: String,
    val subsection: String,
    val title: String,
    val type: String,
    val updated: String,
    val uri: String,
    val url: String
)