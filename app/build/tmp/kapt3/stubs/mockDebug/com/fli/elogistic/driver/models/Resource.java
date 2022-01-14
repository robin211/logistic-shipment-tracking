package com.fli.elogistic.driver.models;

import java.lang.System;

/**
 * A generic class that holds a value with its loading status.
 * @param <T>
 * </T>
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \"*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\"B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0004H\u00c6\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003JL\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010 \u001a\u00020\tH\u00d6\u0001J\t\u0010!\u001a\u00020\u0007H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006#"}, d2 = {"Lcom/fli/elogistic/driver/models/Resource;", "T", "", "status", "Lcom/fli/elogistic/driver/models/Status;", "response", "message", "", "statusCode", "", "rawErrorData", "(Lcom/fli/elogistic/driver/models/Status;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getRawErrorData", "getResponse", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getStatus", "()Lcom/fli/elogistic/driver/models/Status;", "getStatusCode", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/fli/elogistic/driver/models/Status;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/String;)Lcom/fli/elogistic/driver/models/Resource;", "equals", "", "other", "hashCode", "toString", "Companion", "app_mockDebug"})
public final class Resource<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final com.fli.elogistic.driver.models.Status status = null;
    @org.jetbrains.annotations.Nullable()
    private final T response = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    private final int statusCode = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String rawErrorData = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.fli.elogistic.driver.models.Resource.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.models.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final int getStatusCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRawErrorData() {
        return null;
    }
    
    public Resource(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.Status status, @org.jetbrains.annotations.Nullable()
    T response, @org.jetbrains.annotations.Nullable()
    java.lang.String message, int statusCode, @org.jetbrains.annotations.Nullable()
    java.lang.String rawErrorData) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.models.Status component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * A generic class that holds a value with its loading status.
     * @param <T>
     * </T>
     */
    @org.jetbrains.annotations.NotNull()
    public final com.fli.elogistic.driver.models.Resource<T> copy(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.models.Status status, @org.jetbrains.annotations.Nullable()
    T response, @org.jetbrains.annotations.Nullable()
    java.lang.String message, int statusCode, @org.jetbrains.annotations.Nullable()
    java.lang.String rawErrorData) {
        return null;
    }
    
    /**
     * A generic class that holds a value with its loading status.
     * @param <T>
     * </T>
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * A generic class that holds a value with its loading status.
     * @param <T>
     * </T>
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A generic class that holds a value with its loading status.
     * @param <T>
     * </T>
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\tJ?\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u0001H\u00052\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\u000fJ+\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lcom/fli/elogistic/driver/models/Resource$Companion;", "", "()V", "error", "Lcom/fli/elogistic/driver/models/Resource;", "T", "msg", "", "data", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/fli/elogistic/driver/models/Resource;", "statusCode", "", "rawErrorData", "(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/String;)Lcom/fli/elogistic/driver/models/Resource;", "loading", "(Ljava/lang/Object;)Lcom/fli/elogistic/driver/models/Resource;", "success", "message", "app_mockDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.fli.elogistic.driver.models.Resource<T> success(@org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.fli.elogistic.driver.models.Resource<T> error(@org.jetbrains.annotations.Nullable()
        java.lang.String msg, @org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.fli.elogistic.driver.models.Resource<T> loading(@org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.fli.elogistic.driver.models.Resource<T> success(@org.jetbrains.annotations.Nullable()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.fli.elogistic.driver.models.Resource<T> error(@org.jetbrains.annotations.Nullable()
        java.lang.String msg, @org.jetbrains.annotations.Nullable()
        T data, int statusCode, @org.jetbrains.annotations.Nullable()
        java.lang.String rawErrorData) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}