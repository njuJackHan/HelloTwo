package com.simplemobiletools.gallery.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\"B/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\u0002\u0010\rJ\b\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0016J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000bH\u0016J\u0010\u0010!\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u000bH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/simplemobiletools/gallery/adapters/FiltersAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/simplemobiletools/gallery/adapters/FiltersAdapter$ViewHolder;", "Lcom/simplemobiletools/gallery/interfaces/FilterAdapterListener;", "context", "Landroid/content/Context;", "filterItems", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/gallery/models/FilterItem;", "itemClick", "Lkotlin/Function1;", "", "", "(Landroid/content/Context;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V", "getContext", "()Landroid/content/Context;", "currentSelection", "getFilterItems", "()Ljava/util/ArrayList;", "getItemClick", "()Lkotlin/jvm/functions/Function1;", "strokeBackground", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "getCurrentFilter", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCurrentFilter", "ViewHolder", "gallery_debug"})
public final class FiltersAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.simplemobiletools.gallery.adapters.FiltersAdapter.ViewHolder> implements com.simplemobiletools.gallery.interfaces.FilterAdapterListener {
    private com.simplemobiletools.gallery.models.FilterItem currentSelection;
    private android.graphics.drawable.Drawable strokeBackground;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.simplemobiletools.gallery.models.FilterItem> filterItems = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> itemClick = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.gallery.adapters.FiltersAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.simplemobiletools.gallery.adapters.FiltersAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.simplemobiletools.gallery.models.FilterItem getCurrentFilter() {
        return null;
    }
    
    @java.lang.Override()
    public void setCurrentFilter(int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.gallery.models.FilterItem> getFilterItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getItemClick() {
        return null;
    }
    
    public FiltersAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.gallery.models.FilterItem> filterItems, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> itemClick) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lcom/simplemobiletools/gallery/adapters/FiltersAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "filterAdapterListener", "Lcom/simplemobiletools/gallery/interfaces/FilterAdapterListener;", "(Landroid/view/View;Lcom/simplemobiletools/gallery/interfaces/FilterAdapterListener;)V", "getFilterAdapterListener", "()Lcom/simplemobiletools/gallery/interfaces/FilterAdapterListener;", "bindView", "filterItem", "Lcom/simplemobiletools/gallery/models/FilterItem;", "strokeBackground", "Landroid/graphics/drawable/Drawable;", "gallery_debug"})
    public static final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.simplemobiletools.gallery.interfaces.FilterAdapterListener filterAdapterListener = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View bindView(@org.jetbrains.annotations.NotNull()
        com.simplemobiletools.gallery.models.FilterItem filterItem, @org.jetbrains.annotations.NotNull()
        android.graphics.drawable.Drawable strokeBackground) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.simplemobiletools.gallery.interfaces.FilterAdapterListener getFilterAdapterListener() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.simplemobiletools.gallery.interfaces.FilterAdapterListener filterAdapterListener) {
            super(null);
        }
    }
}