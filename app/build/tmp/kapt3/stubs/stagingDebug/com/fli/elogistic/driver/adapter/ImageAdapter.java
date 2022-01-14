package com.fli.elogistic.driver.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u0010\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u000b2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/fli/elogistic/driver/adapter/ImageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/fli/elogistic/driver/adapter/ImageAdapter$ImageHolder;", "imageUrlList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "listName", "", "(Ljava/util/ArrayList;Ljava/lang/String;)V", "addImage", "", "image", "deleteImage", "bitmap", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ImageHolder", "app_stagingDebug"})
public final class ImageAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.fli.elogistic.driver.adapter.ImageAdapter.ImageHolder> {
    private java.util.ArrayList<java.lang.Object> imageUrlList;
    private java.lang.String listName;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.fli.elogistic.driver.adapter.ImageAdapter.ImageHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.fli.elogistic.driver.adapter.ImageAdapter.ImageHolder holder, int position) {
    }
    
    public final void addImage(@org.jetbrains.annotations.NotNull()
    java.lang.Object image) {
    }
    
    public final void deleteImage(@org.jetbrains.annotations.Nullable()
    java.lang.Object bitmap) {
    }
    
    public ImageAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Object> imageUrlList, @org.jetbrains.annotations.NotNull()
    java.lang.String listName) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/fli/elogistic/driver/adapter/ImageAdapter$ImageHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Landroid/view/View;", "(Lcom/fli/elogistic/driver/adapter/ImageAdapter;Landroid/view/View;)V", "item", "", "view", "bindLocation", "", "app_stagingDebug"})
    public final class ImageHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.view.View view;
        private java.lang.Object item;
        
        public final void bindLocation(@org.jetbrains.annotations.Nullable()
        java.lang.Object item) {
        }
        
        public ImageHolder(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
            super(null);
        }
    }
}