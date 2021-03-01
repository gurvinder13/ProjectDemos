package com.example.projectdemos.data.model


import com.google.gson.annotations.SerializedName

data class Media(
    @SerializedName("approved_for_syndication")
    val approvedForSyndication: Int,
    val caption: String,
    val copyright: String,
    @SerializedName("media-metadata")
    val mediaMetadata: List<MediaMetadata>,
    val subtype: String,
    val type: String
)