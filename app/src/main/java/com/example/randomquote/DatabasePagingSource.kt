package com.example.randomquote

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.randomquote.db.QuoteDatabase
import com.example.randomquote.models.Result

class DatabasePagingSource(val database: QuoteDatabase) : PagingSource<Int, Result>(){
    override fun getRefreshKey(state: PagingState<Int, Result>): Int? {
        return state.anchorPosition
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Result> {
        return try {
            val position: Int = params.key ?: DatabasePagingSource.FIRST_PAGE_INDEX
            Log.d("Happy" , "Offline")
            val response = database.quoteDao().getQuotes()

            LoadResult.Page(data = response,
                prevKey = if (position == DatabasePagingSource.FIRST_PAGE_INDEX) null else position - 1,
                nextKey = if (response.isEmpty()) null else position + 1)
        }
        catch (e: Exception) {
            LoadResult.Error(e)
        }
    }
    companion object {
        private const val FIRST_PAGE_INDEX = 1
    }
}