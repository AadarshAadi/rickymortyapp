package com.aadarsh.rickymorty.data.models


import com.google.gson.annotations.SerializedName

data class ListResponse(
    @SerializedName("results")
    val details: List<Details>
)