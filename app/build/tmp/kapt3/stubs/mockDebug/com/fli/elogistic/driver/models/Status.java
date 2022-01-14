package com.fli.elogistic.driver.models;

import java.lang.System;

/**
 * Status of a resource that is provided to the UI.
 *
 *
 * These are usually created by the Repository classes where they return
 * `LiveData<Resource<T>>` to pass back the latest data to the UI with its fetch status.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/fli/elogistic/driver/models/Status;", "", "(Ljava/lang/String;I)V", "isLoading", "", "isSuccessful", "SUCCESS", "ERROR", "LOADING", "app_mockDebug"})
public enum Status {
    /*public static final*/ SUCCESS /* = new SUCCESS() */,
    /*public static final*/ ERROR /* = new ERROR() */,
    /*public static final*/ LOADING /* = new LOADING() */;
    
    /**
     * Returns `true` if the [Status] is success else `false`.
     */
    public final boolean isSuccessful() {
        return false;
    }
    
    /**
     * Returns `true` if the [Status] is loading else `false`.
     */
    public final boolean isLoading() {
        return false;
    }
    
    Status() {
    }
}