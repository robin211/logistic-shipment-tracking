package com.fli.elogistic.driver.repo;

import java.lang.System;

/**
 * A generic class that can provide a resource backed by both the sqlite database and the network.
 *
 *
 * You can read more about it in the [Architecture
 * * Guide](https://developer.android.com/arch).
 * @param <ResultType>
 * @param <RequestType>
 * </RequestType></ResultType>
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u000bJ\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\u000bH%J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH%J\b\u0010\u0011\u001a\u00020\u000eH\u0014J\u001d\u0010\u0012\u001a\u0004\u0018\u00018\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0015\u00a2\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H%\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0003J\u0017\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00018\u0000H%\u00a2\u0006\u0002\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/fli/elogistic/driver/repo/NetworkBoundResource;", "ResultType", "RequestType", "", "appExecutors", "Lcom/fli/elogistic/driver/AppExecutors;", "(Lcom/fli/elogistic/driver/AppExecutors;)V", "result", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/fli/elogistic/driver/models/Resource;", "asLiveData", "Landroidx/lifecycle/LiveData;", "createCall", "fetchFromNetwork", "", "dbSource", "loadFromDb", "onFetchFailed", "processResponse", "response", "(Lcom/fli/elogistic/driver/models/Resource;)Ljava/lang/Object;", "saveCallResult", "item", "(Ljava/lang/Object;)V", "setValue", "newValue", "shouldFetch", "", "data", "(Ljava/lang/Object;)Z", "app_stagingDebug"})
public abstract class NetworkBoundResource<ResultType extends java.lang.Object, RequestType extends java.lang.Object> {
    private final androidx.lifecycle.MediatorLiveData<com.fli.elogistic.driver.models.Resource<ResultType>> result = null;
    private final com.fli.elogistic.driver.AppExecutors appExecutors = null;
    
    @androidx.annotation.MainThread()
    private final void setValue(com.fli.elogistic.driver.models.Resource<? extends ResultType> newValue) {
    }
    
    private final void fetchFromNetwork(androidx.lifecycle.LiveData<ResultType> dbSource) {
    }
    
    protected void onFetchFailed() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<ResultType>> asLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    protected RequestType processResponse(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.Resource<? extends RequestType> response) {
        return null;
    }
    
    @androidx.annotation.WorkerThread()
    protected abstract void saveCallResult(RequestType item);
    
    @androidx.annotation.MainThread()
    protected abstract boolean shouldFetch(@org.jetbrains.annotations.Nullable()
    ResultType data);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    protected abstract androidx.lifecycle.LiveData<ResultType> loadFromDb();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    protected abstract androidx.lifecycle.LiveData<com.fli.elogistic.driver.models.Resource<RequestType>> createCall();
    
    @androidx.annotation.MainThread()
    public NetworkBoundResource(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.AppExecutors appExecutors) {
        super();
    }
}