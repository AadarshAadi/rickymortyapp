package com.aadarsh.rickymorty.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.aadarsh.rickymorty.data.remote.ApiService
import com.aadarsh.rickymorty.paging.RickandMortyPagingSource
import javax.inject.Inject

class RickandMortyRepository @Inject constructor(
    private val apiService: ApiService
) {

    fun getSearchResults(query: String, status: String) =
        Pager(
            config = PagingConfig(
                pageSize = 20,
                maxSize = 100,
                enablePlaceholders = false
            ),
            pagingSourceFactory = { RickandMortyPagingSource(apiService, query, status) }
        ).liveData


}