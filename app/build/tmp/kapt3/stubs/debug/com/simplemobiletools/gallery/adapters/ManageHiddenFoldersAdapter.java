package com.simplemobiletools.gallery.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016J\u001a\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0018\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J\u0018\u0010\'\u001a\u00020$2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001aH\u0016J\u0010\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0006H\u0002J\b\u00103\u001a\u00020\u000eH\u0002J\u0016\u00104\u001a\u00020\u000e2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u00066"}, d2 = {"Lcom/simplemobiletools/gallery/adapters/ManageHiddenFoldersAdapter;", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter;", "activity", "Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;", "folders", "Ljava/util/ArrayList;", "", "listener", "Lcom/simplemobiletools/commons/interfaces/RefreshRecyclerViewListener;", "recyclerView", "Lcom/simplemobiletools/commons/views/MyRecyclerView;", "itemClick", "Lkotlin/Function1;", "", "", "(Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;Ljava/util/ArrayList;Lcom/simplemobiletools/commons/interfaces/RefreshRecyclerViewListener;Lcom/simplemobiletools/commons/views/MyRecyclerView;Lkotlin/jvm/functions/Function1;)V", "config", "Lcom/simplemobiletools/gallery/helpers/Config;", "getFolders", "()Ljava/util/ArrayList;", "setFolders", "(Ljava/util/ArrayList;)V", "getListener", "()Lcom/simplemobiletools/commons/interfaces/RefreshRecyclerViewListener;", "actionItemPressed", "id", "", "getActionMenuId", "getIsItemSelectable", "", "position", "getItemCount", "getSelectableItemCount", "markViewHolderSelection", "select", "viewHolder", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter$ViewHolder;", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "prepareActionMode", "menu", "Landroid/view/Menu;", "prepareItemSelection", "setupView", "view", "Landroid/view/View;", "folder", "tryUnhideFolders", "unhideFolders", "removeFolders", "gallery_debug"})
public final class ManageHiddenFoldersAdapter extends com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter {
    private final com.simplemobiletools.gallery.helpers.Config config = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> folders;
    @org.jetbrains.annotations.Nullable()
    private final com.simplemobiletools.commons.interfaces.RefreshRecyclerViewListener listener = null;
    
    @java.lang.Override()
    public int getActionMenuId() {
        return 0;
    }
    
    @java.lang.Override()
    public void prepareActionMode(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public void prepareItemSelection(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder viewHolder) {
    }
    
    @java.lang.Override()
    public void markViewHolderSelection(boolean select, @org.jetbrains.annotations.Nullable()
    com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder viewHolder) {
    }
    
    @java.lang.Override()
    public void actionItemPressed(int id) {
    }
    
    @java.lang.Override()
    public int getSelectableItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean getIsItemSelectable(int position) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    private final void setupView(android.view.View view, java.lang.String folder) {
    }
    
    private final void tryUnhideFolders() {
    }
    
    private final void unhideFolders(java.util.ArrayList<java.lang.String> removeFolders) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getFolders() {
        return null;
    }
    
    public final void setFolders(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.simplemobiletools.commons.interfaces.RefreshRecyclerViewListener getListener() {
        return null;
    }
    
    public ManageHiddenFoldersAdapter(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> folders, @org.jetbrains.annotations.Nullable()
    com.simplemobiletools.commons.interfaces.RefreshRecyclerViewListener listener, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.views.MyRecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> itemClick) {
        super(null, null, null, null);
    }
}