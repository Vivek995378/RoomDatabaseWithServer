package com.example.randomquote

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.randomquote.api.QuoteService
import com.example.randomquote.models.Result

class ApiPagingSource(val apiservice: QuoteService) : PagingSource<Int, Result>() {
    override fun getRefreshKey(state: PagingState<Int, Result>): Int? {
        return state.anchorPosition
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Result> {
        return try {
            val position: Int = params.key ?: FIRST_PAGE_INDEX
            val response = apiservice.getQuotes(position)
//            val quoteData = response.body()!!.results         //Cause null pointer exception
              val quoteData = response.body()?.results ?:arrayListOf()

            LoadResult.Page(
                data = quoteData,
                prevKey = if (position == FIRST_PAGE_INDEX) null else position - 1,
                nextKey = if (quoteData.isEmpty()) null else position + 1
            )

        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    companion object {
        private const val FIRST_PAGE_INDEX = 1
    }
}