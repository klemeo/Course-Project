package com.example.data.model.location_responses

import com.google.gson.annotations.SerializedName

class LocationResultResponsesBodyData(
    @SerializedName("created")
    val created: String?,
    @SerializedName("dimension")
    val dimension: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("residents")
    val residents: List<String>?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("url")
    val url: String?
)