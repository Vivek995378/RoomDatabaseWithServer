package com.example.randomquote.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.randomquote.models.Result
import retrofit2.Response

@Dao
interface QuoteDao {

    @Insert
    @JvmSuppressWildcards
    suspend fun addQuotes(quotes: List<Result>)

    @Query("SELECT * FROM quote")
    suspend fun getQuotes() : List<Result>
}