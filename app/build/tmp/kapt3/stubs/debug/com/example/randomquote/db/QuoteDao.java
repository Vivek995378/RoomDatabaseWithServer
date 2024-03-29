package com.example.randomquote.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/randomquote/db/QuoteDao;", "", "addQuotes", "", "quotes", "", "Lcom/example/randomquote/models/Result;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuotes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface QuoteDao {
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmSuppressWildcards()
    @androidx.room.Insert()
    public abstract java.lang.Object addQuotes(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.randomquote.models.Result> quotes, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM quote")
    public abstract java.lang.Object getQuotes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.randomquote.models.Result>> continuation);
}