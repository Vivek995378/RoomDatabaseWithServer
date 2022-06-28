package com.example.randomquote.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.*
import com.example.randomquote.models.QuoteList
import com.example.randomquote.models.Result
import com.example.randomquote.repository.QuoteRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repository: QuoteRepository) : ViewModel() {

//    init {
//        viewModelScope.launch(Dispatchers.IO){
//            repository.getQuotes(1)
//            repository.getListData()
//        }
//    }

    private val quoteList = MutableLiveData<PagingData<Result>>()

    suspend fun getQuotes(): LiveData<PagingData<Result>> {
        val response = repository.getQuotes().cachedIn(viewModelScope)
        quoteList.value = response.value
        return response
    }

//    val quotes : LiveData<QuoteList>
//    get() = repository.quotes
}