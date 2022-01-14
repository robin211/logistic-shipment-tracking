package com.fli.elogistic.driver.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016J0\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016J0\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0011"}, d2 = {"Lcom/fli/elogistic/driver/ui/BaseInterface;", "", "createOkSnackbar", "", "view", "Landroid/view/View;", "message", "", "context", "Landroid/content/Context;", "onClick", "Lkotlin/Function0;", "createRetrySnackbar", "createSnackbar", "actionMessage", "onUnauthorized", "", "app_stagingDebug"})
public abstract interface BaseInterface {
    
    public abstract void createOkSnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick);
    
    public abstract void createRetrySnackbar(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick);
    
    public abstract boolean onUnauthorized(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        private static void createSnackbar(com.fli.elogistic.driver.ui.BaseInterface $this, android.view.View view, java.lang.String message, java.lang.String actionMessage, kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
        }
        
        public static void createOkSnackbar(@org.jetbrains.annotations.NotNull()
        com.fli.elogistic.driver.ui.BaseInterface $this, @org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
        }
        
        public static void createRetrySnackbar(@org.jetbrains.annotations.NotNull()
        com.fli.elogistic.driver.ui.BaseInterface $this, @org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
        }
        
        public static boolean onUnauthorized(@org.jetbrains.annotations.NotNull()
        com.fli.elogistic.driver.ui.BaseInterface $this, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            return false;
        }
    }
}