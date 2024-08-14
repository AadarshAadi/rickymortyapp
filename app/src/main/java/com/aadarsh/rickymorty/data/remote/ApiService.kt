package com.aadarsh.rickymorty.data.remote

import com.aadarsh.rickymorty.data.models.ListResponse
import com.aadarsh.rickymorty.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun searchCharacters(
        @Query("name")
        searchQuery : String,
        @Query("page")
        page : Int,
        @Query("status")
        status : String
    ) : Response<ListResponse>




}