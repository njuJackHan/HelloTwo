package com.simplemobiletools.gallery.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u00a2\u0006\u0002\u0010\u0014J\u0010\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u0016H\u0016J\b\u00105\u001a\u00020\u0013H\u0002J\b\u00106\u001a\u00020\u0013H\u0002J\u0010\u00107\u001a\u00020\u00132\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u00020\u00132\u0006\u00108\u001a\u000209H\u0002J\b\u0010;\u001a\u00020\u0013H\u0002J\u0010\u0010<\u001a\u00020\u00132\u0006\u0010=\u001a\u00020\nH\u0002J\b\u0010>\u001a\u00020\u0013H\u0002J\b\u0010?\u001a\u00020\u0013H\u0002J\b\u0010@\u001a\u00020\u0013H\u0002J\b\u0010A\u001a\u00020\u0013H\u0002J\b\u0010B\u001a\u00020\u0016H\u0016J\b\u0010C\u001a\u000202H\u0002J\u0010\u0010D\u001a\u00020\n2\u0006\u0010E\u001a\u00020\u0016H\u0016J\u0018\u0010F\u001a\u0004\u0018\u0001022\u0006\u0010E\u001a\u00020\u00162\u0006\u0010G\u001a\u00020\u0016J\b\u0010H\u001a\u00020\u0016H\u0016J\u0010\u0010I\u001a\u00020\u00162\u0006\u0010E\u001a\u00020\u0016H\u0016J\b\u0010J\u001a\u00020\u0016H\u0016J\u000e\u0010K\u001a\b\u0012\u0004\u0012\u00020M0LH\u0002J\u000e\u0010N\u001a\b\u0012\u0004\u0012\u00020201H\u0002J\u000e\u0010O\u001a\u00020\n2\u0006\u0010E\u001a\u00020\u0016J\u001a\u0010P\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020\n2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u0018\u0010T\u001a\u00020\u00132\u0006\u0010U\u001a\u00020S2\u0006\u0010E\u001a\u00020\u0016H\u0016J\u0018\u0010V\u001a\u00020S2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u0016H\u0016J\u0010\u0010Z\u001a\u00020\u00132\u0006\u0010U\u001a\u00020SH\u0016J\u0010\u0010[\u001a\u00020\u00132\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010\\\u001a\u00020\u00132\u0006\u0010R\u001a\u00020SH\u0016J\b\u0010]\u001a\u00020\u0013H\u0002J\b\u0010^\u001a\u00020\u0013H\u0002J\u0018\u0010_\u001a\u00020\u00132\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020cH\u0002J\u0018\u0010d\u001a\u00020\u00132\u0006\u0010`\u001a\u00020a2\u0006\u0010e\u001a\u00020MH\u0002J\b\u0010f\u001a\u00020\u0013H\u0002J\b\u0010g\u001a\u00020\u0013H\u0002J\u0010\u0010h\u001a\u00020\u00132\u0006\u0010i\u001a\u00020\nH\u0002J\u0010\u0010j\u001a\u00020\u00132\u0006\u0010k\u001a\u00020\nH\u0002J\u000e\u0010l\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\nJ\u000e\u0010m\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\nJ\u000e\u0010n\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\nJ\u0014\u0010o\u001a\u00020\u00132\f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u000601R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0016X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0016X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001dR\u000e\u0010\'\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010/\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020201X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006q"}, d2 = {"Lcom/simplemobiletools/gallery/adapters/MediaAdapter;", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter;", "activity", "Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;", "media", "", "Lcom/simplemobiletools/gallery/models/ThumbnailItem;", "listener", "Lcom/simplemobiletools/gallery/interfaces/MediaOperationsListener;", "isAGetIntent", "", "allowMultiplePicks", "recyclerView", "Lcom/simplemobiletools/commons/views/MyRecyclerView;", "fastScroller", "Lcom/simplemobiletools/commons/views/FastScroller;", "itemClick", "Lkotlin/Function1;", "", "", "(Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;Ljava/util/List;Lcom/simplemobiletools/gallery/interfaces/MediaOperationsListener;ZZLcom/simplemobiletools/commons/views/MyRecyclerView;Lcom/simplemobiletools/commons/views/FastScroller;Lkotlin/jvm/functions/Function1;)V", "BATCH_SIZE", "", "IMAGE_LOAD_DELAY", "", "INSTANT_LOAD_DURATION", "ITEM_MEDIUM", "ITEM_SECTION", "getAllowMultiplePicks", "()Z", "animateGifs", "config", "Lcom/simplemobiletools/gallery/helpers/Config;", "cropThumbnails", "currentMediaHash", "delayHandler", "Landroid/os/Handler;", "displayFilenames", "hasOTGConnected", "isListViewType", "getListener", "()Lcom/simplemobiletools/gallery/interfaces/MediaOperationsListener;", "loadImageInstantly", "getMedia", "()Ljava/util/List;", "setMedia", "(Ljava/util/List;)V", "scrollHorizontally", "visibleItemPaths", "Ljava/util/ArrayList;", "", "actionItemPressed", "id", "askConfirmDelete", "checkDeleteConfirmation", "checkFavoriteBtnVisibility", "menu", "Landroid/view/Menu;", "checkHideBtnVisibility", "confirmSelection", "copyMoveTo", "isCopyOperation", "deleteFiles", "editFile", "enableInstantLoad", "fixDateTaken", "getActionMenuId", "getCurrentPath", "getIsItemSelectable", "position", "getItemBubbleText", "sorting", "getItemCount", "getItemViewType", "getSelectableItemCount", "getSelectedMedia", "", "Lcom/simplemobiletools/gallery/models/Medium;", "getSelectedPaths", "isASectionTitle", "markViewHolderSelection", "select", "viewHolder", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter$ViewHolder;", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewRecycled", "prepareActionMode", "prepareItemSelection", "renameFile", "restoreFiles", "setupSection", "view", "Landroid/view/View;", "section", "Lcom/simplemobiletools/gallery/models/ThumbnailSection;", "setupThumbnail", "medium", "shareMedia", "showProperties", "toggleFavorites", "add", "toggleFileVisibility", "hide", "updateAnimateGifs", "updateCropThumbnails", "updateDisplayFilenames", "updateMedia", "newMedia", "gallery_debug"})
public final class MediaAdapter extends com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter {
    private final long INSTANT_LOAD_DURATION = 2000L;
    private final long IMAGE_LOAD_DELAY = 100L;
    private final int BATCH_SIZE = 100;
    private final int ITEM_SECTION = 0;
    private final int ITEM_MEDIUM = 1;
    private final com.simplemobiletools.gallery.helpers.Config config = null;
    private final boolean isListViewType = false;
    private java.util.ArrayList<java.lang.String> visibleItemPaths;
    private boolean loadImageInstantly;
    private android.os.Handler delayHandler;
    private int currentMediaHash;
    private final boolean hasOTGConnected = false;
    private boolean scrollHorizontally;
    private boolean animateGifs;
    private boolean cropThumbnails;
    private boolean displayFilenames;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.simplemobiletools.gallery.models.ThumbnailItem> media;
    @org.jetbrains.annotations.Nullable()
    private final com.simplemobiletools.gallery.interfaces.MediaOperationsListener listener = null;
    private final boolean isAGetIntent = false;
    private final boolean allowMultiplePicks = false;
    
    @java.lang.Override()
    public int getActionMenuId() {
        return 0;
    }
    
    @java.lang.Override()
    public void prepareItemSelection(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder viewHolder) {
    }
    
    @java.lang.Override()
    public void markViewHolderSelection(boolean select, @org.jetbrains.annotations.Nullable()
    com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder viewHolder) {
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
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override()
    public void prepareActionMode(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
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
    
    @java.lang.Override()
    public void onViewRecycled(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter.ViewHolder holder) {
    }
    
    public final boolean isASectionTitle(int position) {
        return false;
    }
    
    private final void checkHideBtnVisibility(android.view.Menu menu) {
    }
    
    private final void checkFavoriteBtnVisibility(android.view.Menu menu) {
    }
    
    private final void confirmSelection() {
    }
    
    private final void showProperties() {
    }
    
    private final void renameFile() {
    }
    
    private final void editFile() {
    }
    
    private final void toggleFileVisibility(boolean hide) {
    }
    
    private final void toggleFavorites(boolean add) {
    }
    
    private final void restoreFiles() {
    }
    
    private final void shareMedia() {
    }
    
    private final void copyMoveTo(boolean isCopyOperation) {
    }
    
    private final void fixDateTaken() {
    }
    
    private final void checkDeleteConfirmation() {
    }
    
    private final void askConfirmDelete() {
    }
    
    private final java.lang.String getCurrentPath() {
        return null;
    }
    
    private final void deleteFiles() {
    }
    
    private final java.util.List<com.simplemobiletools.gallery.models.Medium> getSelectedMedia() {
        return null;
    }
    
    private final java.util.ArrayList<java.lang.String> getSelectedPaths() {
        return null;
    }
    
    public final void updateMedia(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.gallery.models.ThumbnailItem> newMedia) {
    }
    
    public final void updateDisplayFilenames(boolean displayFilenames) {
    }
    
    public final void updateAnimateGifs(boolean animateGifs) {
    }
    
    public final void updateCropThumbnails(boolean cropThumbnails) {
    }
    
    private final void enableInstantLoad() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getItemBubbleText(int position, int sorting) {
        return null;
    }
    
    private final void setupThumbnail(android.view.View view, com.simplemobiletools.gallery.models.Medium medium) {
    }
    
    private final void setupSection(android.view.View view, com.simplemobiletools.gallery.models.ThumbnailSection section) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.simplemobiletools.gallery.models.ThumbnailItem> getMedia() {
        return null;
    }
    
    public final void setMedia(@org.jetbrains.annotations.NotNull()
    java.util.List<com.simplemobiletools.gallery.models.ThumbnailItem> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.simplemobiletools.gallery.interfaces.MediaOperationsListener getListener() {
        return null;
    }
    
    public final boolean isAGetIntent() {
        return false;
    }
    
    public final boolean getAllowMultiplePicks() {
        return false;
    }
    
    public MediaAdapter(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.simplemobiletools.gallery.models.ThumbnailItem> media, @org.jetbrains.annotations.Nullable()
    com.simplemobiletools.gallery.interfaces.MediaOperationsListener listener, boolean isAGetIntent, boolean allowMultiplePicks, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.views.MyRecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    com.simplemobiletools.commons.views.FastScroller fastScroller, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> itemClick) {
        super(null, null, null, null);
    }
}