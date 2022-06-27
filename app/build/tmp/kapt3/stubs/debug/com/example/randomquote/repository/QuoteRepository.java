package com.example.randomquote.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/randomquote/repository/QuoteRepository;", "Lcom/example/randomquote/repository/QuoteListRepository;", "quoteService", "Lcom/example/randomquote/api/QuoteService;", "quoteDatabase", "Lcom/example/randomquote/db/QuoteDatabase;", "applicationContext", "Landroid/content/Context;", "(Lcom/example/randomquote/api/QuoteService;Lcom/example/randomquote/db/QuoteDatabase;Landroid/content/Context;)V", "quotes", "Landroidx/lifecycle/LiveData;", "Lcom/example/randomquote/models/QuoteList;", "getQuotes", "()Landroidx/lifecycle/LiveData;", "quotesLiveData", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/paging/PagingData;", "Lcom/example/randomquote/models/Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class QuoteRepository implements com.example.randomquote.repository.QuoteListRepository {
    private final com.example.randomquote.api.QuoteService quoteService = null;
    private final com.example.randomquote.db.QuoteDatabase quoteDatabase = null;
    private final android.content.Context applicationContext = null;
    private final androidx.lifecycle.MutableLiveData<com.example.randomquote.models.QuoteList> quotesLiveData = null;
    
    public QuoteRepository(@org.jetbrains.annotations.NotNull()
    com.example.randomquote.api.QuoteService quoteService, @org.jetbrains.annotations.NotNull()
    com.example.randomquote.db.QuoteDatabase quoteDatabase, @org.jetbrains.annotations.NotNull()
    android.content.Context applicationContext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.randomquote.models.QuoteList> getQuotes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getQuotes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<androidx.paging.PagingData<com.example.randomquote.models.Result>>> continuation) {
        return null;
    }
}