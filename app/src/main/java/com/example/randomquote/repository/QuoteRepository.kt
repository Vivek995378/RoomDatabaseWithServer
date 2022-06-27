package com.example.randomquote.repository

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.paging.*
import com.example.randomquote.ApiPagingSource
import com.example.randomquote.DatabasePagingSource
import com.example.randomquote.api.QuoteService
import com.example.randomquote.db.QuoteDatabase
import com.example.randomquote.models.QuoteList
import com.example.randomquote.models.Result
import com.example.randomquote.utils.NetworkUtils

interface QuoteListRepository {
    suspend fun getQuotes(): LiveData<PagingData<Result>>
}

class QuoteRepository(
    private val quoteService: QuoteService,
    private val quoteDatabase: QuoteDatabase,
    private val applicationContext: Context
) : QuoteListRepository {

    private val quotesLiveData = MutableLiveData<QuoteList>()

    val quotes: LiveData<QuoteList>
        get() = quotesLiveData

    override suspend fun getQuotes(): LiveData<PagingData<Result>> {
        if (NetworkUtils.isInternetAvailable(applicationContext)) {
            val result = quoteService.getQuotes(1)
            quoteDatabase.quoteDao().addQuotes(result.body()!!.results)
           // Log.d("Happy" , quoteDatabase.quoteDao().getQuotes().toString())
            return Pager(
                config = PagingConfig(
                    pageSize = 20,
                    enablePlaceholders = false
                ),
                pagingSourceFactory = { ApiPagingSource(quoteService) }
            ).liveData
        }
        else{
            return Pager(
                config = PagingConfig(
                    pageSize = 20,
                    enablePlaceholders = false
                ),
                pagingSourceFactory = { DatabasePagingSource(quoteDatabase) }
            ).liveData
        }
    }
//    suspend fun getQuotes(page: Int) {
//
//        if (NetworkUtils.isInternetAvailable(applicationContext)) {
//            //            val result = quoteService.getQuotes(page)
////            if(result?.body() != null){
////                quoteDatabase.quoteDao().addQuotes(result.body()!!.results)
////                quotesLiveData.postValue(result.body())
////            }
//
//        } else {
//            val quotes = quoteDatabase.quoteDao().getQuotes()
//            val quoteList = QuoteList(1, 1, 1, quotes, 1, 1)
//            quotesLiveData.postValue(quoteList)
//        }
//
//    }
}







