package com.simplemobiletools.gallery.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u001aH\u0016J\b\u0010*\u001a\u00020\u0013H\u0002J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\rH\u0002J\u0010\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020\u00132\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00101\u001a\u00020\u00132\u0006\u00102\u001a\u00020\rH\u0002J\b\u00103\u001a\u00020\u0013H\u0002J\b\u00104\u001a\u00020\u0013H\u0002J\b\u00105\u001a\u00020\u0013H\u0002J\b\u00106\u001a\u00020\u001aH\u0016J\u0016\u00107\u001a\b\u0012\u0004\u0012\u0002080\u00052\u0006\u00109\u001a\u00020%H\u0002J\u0010\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\u001aH\u0016J\b\u0010<\u001a\u00020\u001aH\u0016J(\u0010=\u001a\u0012\u0012\u0004\u0012\u00020%0\u0005j\b\u0012\u0004\u0012\u00020%`\u00072\u0006\u00109\u001a\u00020%2\u0006\u0010>\u001a\u00020\rH\u0002J\b\u0010?\u001a\u00020\u001aH\u0016J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020%0AH\u0002J\u0010\u0010B\u001a\u00020\u00132\u0006\u00109\u001a\u00020%H\u0002J\u001a\u0010C\u001a\u00020\u00132\u0006\u0010D\u001a\u00020\r2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J\u0018\u0010G\u001a\u00020\u00132\u0006\u0010H\u001a\u00020F2\u0006\u0010;\u001a\u00020\u001aH\u0016J\u0018\u0010I\u001a\u00020F2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u001aH\u0016J\u0010\u0010M\u001a\u00020\u00132\u0006\u0010H\u001a\u00020FH\u0016J\u0018\u0010N\u001a\u00020\u00132\u0006\u0010O\u001a\u00020%2\u0006\u00109\u001a\u00020%H\u0002J\u0010\u0010P\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020\rH\u0002J\u0010\u0010R\u001a\u00020\u00132\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u0010S\u001a\u00020\u00132\u0006\u0010E\u001a\u00020FH\u0016J\b\u0010T\u001a\u00020\u0013H\u0002J\u0018\u0010U\u001a\u00020\u00132\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u0006H\u0002J\b\u0010Y\u001a\u00020\u0013H\u0002J \u0010Z\u001a\u00020\u00132\u0016\u0010[\u001a\u0012\u0012\u0004\u0012\u0002080\u0005j\b\u0012\u0004\u0012\u000208`\u0007H\u0002J\u0010\u0010\\\u001a\u00020\u00132\u0006\u0010]\u001a\u00020\rH\u0002J\u0010\u0010^\u001a\u00020\u00132\u0006\u0010_\u001a\u00020\rH\u0002J\b\u0010`\u001a\u00020\u0013H\u0002J\u000e\u0010a\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\rJ\u000e\u0010b\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\rJ\u001e\u0010c\u001a\u00020\u00132\u0016\u0010d\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007J\b\u0010e\u001a\u00020\u0013H\u0002J\u000e\u0010f\u001a\u00020\u00132\u0006\u0010\'\u001a\u00020\rR\u000e\u0010\u0015\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006g"}, d2 = {"Lcom/simplemobiletools/gallery/adapters/DirectoryAdapter;", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter;", "activity", "Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;", "dirs", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/gallery/models/Directory;", "Lkotlin/collections/ArrayList;", "listener", "Lcom/simplemobiletools/gallery/interfaces/DirectoryOperationsListener;", "recyclerView", "Lcom/simplemobiletools/commons/views/MyRecyclerView;", "isPickIntent", "", "fastScroller", "Lcom/simplemobiletools/commons/views/FastScroller;", "itemClick", "Lkotlin/Function1;", "", "", "(Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;Ljava/util/ArrayList;Lcom/simplemobiletools/gallery/interfaces/DirectoryOperationsListener;Lcom/simplemobiletools/commons/views/MyRecyclerView;ZLcom/simplemobiletools/commons/views/FastScroller;Lkotlin/jvm/functions/Function1;)V", "animateGifs", "config", "Lcom/simplemobiletools/gallery/helpers/Config;", "cropThumbnails", "currentDirectoriesHash", "", "getDirs", "()Ljava/util/ArrayList;", "setDirs", "(Ljava/util/ArrayList;)V", "isListViewType", "()Z", "getListener", "()Lcom/simplemobiletools/gallery/interfaces/DirectoryOperationsListener;", "pinnedFolders", "", "", "scrollHorizontally", "showMediaCount", "actionItemPressed", "id", "askConfirmDelete", "changeAlbumCover", "useDefault", "checkHideBtnVisibility", "menu", "Landroid/view/Menu;", "checkPinBtnVisibility", "copyMoveTo", "isCopyOperation", "deleteFolders", "emptyAndDisableRecycleBin", "emptyRecycleBin", "getActionMenuId", "getAlbumCoversWithout", "Lcom/simplemobiletools/gallery/models/AlbumCover;", "path", "getIsItemSelectable", "position", "getItemCount", "getOTGFilePaths", "showHidden", "getSelectableItemCount", "getSelectedPaths", "Ljava/util/HashSet;", "hideFolder", "markViewHolderSelection", "select", "viewHolder", "Lcom/simplemobiletools/commons/adapters/MyRecyclerViewAdapter$ViewHolder;", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewRecycled", "pickMediumFrom", "targetFolder", "pinFolders", "pin", "prepareActionMode", "prepareItemSelection", "renameDir", "setupView", "view", "Landroid/view/View;", "directory", "showProperties", "storeCovers", "albumCovers", "toggleFoldersVisibility", "hide", "tryEmptyRecycleBin", "askConfirmation", "tryExcludeFolder", "updateAnimateGifs", "updateCropThumbnails", "updateDirs", "newDirs", "updateFolderNames", "updateShowMediaCount", "gallery_debug"})
public final class DirectoryAdapter extends com.simplemobiletools.commons.adapters.MyRecyclerViewAdapter {
    private final com.simplemobiletools.gallery.helpers.Config config = null;
    private final boolean isListViewType = false;
    private java.util.Set<java.lang.String> pinnedFolders;
    private boolean scrollHorizontally;
    private boolean showMediaCount;
    private boolean animateGifs;
    private boolean cropThumbnails;
    private int currentDirectoriesHash;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.simplemobiletools.gallery.models.Directory> dirs;
    @org.jetbrains.annotations.Nullable()
    private final com.simplemobiletools.gallery.interfaces.DirectoryOperationsListener listener = null;
    private final boolean isPickIntent = false;
    
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
    
    private final void checkHideBtnVisibility(android.view.Menu menu) {
    }
    
    private final void checkPinBtnVisibility(android.view.Menu menu) {
    }
    
    private final void showProperties() {
    }
    
    private final void renameDir() {
    }
    
    private final void toggleFoldersVisibility(boolean hide) {
    }
    
    private final void tryEmptyRecycleBin(boolean askConfirmation) {
    }
    
    private final void emptyRecycleBin() {
    }
    
    private final void emptyAndDisableRecycleBin() {
    }
    
    private final void updateFolderNames() {
    }
    
    private final void hideFolder(java.lang.String path) {
    }
    
    private final void tryExcludeFolder() {
    }
    
    private final void pinFolders(boolean pin) {
    }
    
    private final void copyMoveTo(boolean isCopyOperation) {
    }
    
    private final java.util.ArrayList<java.lang.String> getOTGFilePaths(java.lang.String path, boolean showHidden) {
        return null;
    }
    
    private final void askConfirmDelete() {
    }
    
    private final void deleteFolders() {
    }
    
    private final void changeAlbumCover(boolean useDefault) {
    }
    
    private final void pickMediumFrom(java.lang.String targetFolder, java.lang.String path) {
    }
    
    private final java.util.ArrayList<com.simplemobiletools.gallery.models.AlbumCover> getAlbumCoversWithout(java.lang.String path) {
        return null;
    }
    
    private final void storeCovers(java.util.ArrayList<com.simplemobiletools.gallery.models.AlbumCover> albumCovers) {
    }
    
    private final java.util.HashSet<java.lang.String> getSelectedPaths() {
        return null;
    }
    
    public final void updateDirs(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.gallery.models.Directory> newDirs) {
    }
    
    public final void updateAnimateGifs(boolean animateGifs) {
    }
    
    public final void updateCropThumbnails(boolean cropThumbnails) {
    }
    
    public final void updateShowMediaCount(boolean showMediaCount) {
    }
    
    private final void setupView(android.view.View view, com.simplemobiletools.gallery.models.Directory directory) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.gallery.models.Directory> getDirs() {
        return null;
    }
    
    public final void setDirs(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.gallery.models.Directory> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.simplemobiletools.gallery.interfaces.DirectoryOperationsListener getListener() {
        return null;
    }
    
    public final boolean isPickIntent() {
        return false;
    }
    
    public DirectoryAdapter(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity activity, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.gallery.models.Directory> dirs, @org.jetbrains.annotations.Nullable()
    com.simplemobiletools.gallery.interfaces.DirectoryOperationsListener listener, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.views.MyRecyclerView recyclerView, boolean isPickIntent, @org.jetbrains.annotations.Nullable()
    com.simplemobiletools.commons.views.FastScroller fastScroller, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> itemClick) {
        super(null, null, null, null);
    }
}