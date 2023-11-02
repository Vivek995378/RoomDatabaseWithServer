package com.example.randomquote.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/randomquote/viewmodels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/randomquote/repository/QuoteRepository;", "(Lcom/example/randomquote/repository/QuoteRepository;)V", "quoteList", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/paging/PagingData;", "Lcom/example/randomquote/models/Result;", "getQuotes", "Landroidx/lifecycle/LiveData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.randomquote.repository.QuoteRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<androidx.paging.PagingData<com.example.randomquote.models.Result>> quoteList = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.randomquote.repository.QuoteRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getQuotes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<androidx.paging.PagingData<com.example.randomquote.models.Result>>> continuation) {
        return null;
    }
}