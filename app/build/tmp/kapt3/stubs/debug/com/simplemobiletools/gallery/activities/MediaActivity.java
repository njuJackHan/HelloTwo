package com.simplemobiletools.gallery.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\u0018\u0000 v2\u00020\u00012\u00020\u0002:\u0001vB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002J\u0016\u0010,\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002J\b\u0010-\u001a\u00020(H\u0002J\b\u0010.\u001a\u00020(H\u0002J\b\u0010/\u001a\u00020(H\u0002J\b\u00100\u001a\u00020(H\u0002J\b\u00101\u001a\u00020(H\u0002J\u0016\u00102\u001a\u00020(2\f\u00103\u001a\b\u0012\u0004\u0012\u0002040*H\u0002J\b\u00105\u001a\u00020(H\u0002J\b\u00106\u001a\u00020(H\u0002J\u0018\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020 2\u0006\u00109\u001a\u00020 H\u0002J\b\u0010:\u001a\u00020(H\u0002J\n\u0010;\u001a\u0004\u0018\u00010<H\u0002J \u0010=\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\b\b\u0002\u0010>\u001a\u00020\u0007H\u0002J\b\u0010?\u001a\u00020(H\u0002J\b\u0010@\u001a\u00020(H\u0002J\b\u0010A\u001a\u00020(H\u0002J\b\u0010B\u001a\u00020\u0007H\u0002J\b\u0010C\u001a\u00020\u0007H\u0002J\u0010\u0010D\u001a\u00020(2\u0006\u0010E\u001a\u00020\u0019H\u0002J\u0016\u0010F\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002J\"\u0010G\u001a\u00020(2\u0006\u0010H\u001a\u00020 2\u0006\u0010I\u001a\u00020 2\b\u0010J\u001a\u0004\u0018\u00010KH\u0014J\u0012\u0010L\u001a\u00020(2\b\u0010M\u001a\u0004\u0018\u00010NH\u0014J\u0010\u0010O\u001a\u00020\u00072\u0006\u0010P\u001a\u00020QH\u0016J\b\u0010R\u001a\u00020(H\u0014J\u0010\u0010S\u001a\u00020\u00072\u0006\u0010T\u001a\u00020\u001bH\u0016J\b\u0010U\u001a\u00020(H\u0014J\b\u0010V\u001a\u00020(H\u0014J\b\u0010W\u001a\u00020(H\u0014J\b\u0010X\u001a\u00020(H\u0014J\b\u0010Y\u001a\u00020(H\u0002J\b\u0010Z\u001a\u00020(H\u0016J\b\u0010[\u001a\u00020(H\u0002J\u0010\u0010\\\u001a\u00020(2\u0006\u0010]\u001a\u00020\u0019H\u0002J\u0016\u0010^\u001a\u00020(2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00190*H\u0016J\b\u0010`\u001a\u00020(H\u0002J\b\u0010a\u001a\u00020(H\u0002J\b\u0010b\u001a\u00020(H\u0002J\b\u0010c\u001a\u00020(H\u0002J\b\u0010d\u001a\u00020(H\u0002J\u0010\u0010e\u001a\u00020(2\u0006\u0010P\u001a\u00020QH\u0002J\b\u0010f\u001a\u00020(H\u0002J\b\u0010g\u001a\u00020(H\u0002J\b\u0010h\u001a\u00020(H\u0002J\b\u0010i\u001a\u00020(H\u0002J\b\u0010j\u001a\u00020(H\u0002J\b\u0010k\u001a\u00020(H\u0002J\b\u0010l\u001a\u00020(H\u0002J\u0010\u0010m\u001a\u00020(2\u0006\u0010n\u001a\u00020\u0007H\u0002J\u0016\u0010o\u001a\u00020(2\f\u0010p\u001a\b\u0012\u0004\u0012\u0002040*H\u0016J\b\u0010q\u001a\u00020(H\u0002J\b\u0010r\u001a\u00020(H\u0002J\b\u0010s\u001a\u00020(H\u0002J\b\u0010t\u001a\u00020(H\u0002J\b\u0010u\u001a\u00020(H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006w"}, d2 = {"Lcom/simplemobiletools/gallery/activities/MediaActivity;", "Lcom/simplemobiletools/gallery/activities/SimpleActivity;", "Lcom/simplemobiletools/gallery/interfaces/MediaOperationsListener;", "()V", "LAST_MEDIA_CHECK_PERIOD", "", "mAllowPickingMultiple", "", "mCurrAsyncTask", "Lcom/simplemobiletools/gallery/asynctasks/GetMediaAsynctask;", "mDirectoryDao", "Lcom/simplemobiletools/gallery/interfaces/DirectoryDao;", "mIsGetAnyIntent", "mIsGetImageIntent", "mIsGetVideoIntent", "mIsGettingMedia", "mIsSearchOpen", "mLastMediaHandler", "Landroid/os/Handler;", "mLatestMediaDateId", "mLatestMediaId", "mLoadedInitialPhotos", "mMediumDao", "Lcom/simplemobiletools/gallery/interfaces/MediumDao;", "mPath", "", "mSearchMenuItem", "Landroid/view/MenuItem;", "mShowAll", "mStoredAnimateGifs", "mStoredCropThumbnails", "mStoredPrimaryColor", "", "mStoredScrollHorizontally", "mStoredShowInfoBubble", "mStoredTextColor", "mTempShowHiddenHandler", "mZoomListener", "Lcom/simplemobiletools/commons/views/MyRecyclerView$MyZoomListener;", "calculateContentHeight", "", "media", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/gallery/models/ThumbnailItem;", "calculateContentWidth", "changeViewType", "checkLastMediaChanged", "columnCountChanged", "deleteDBDirectory", "deleteDirectoryIfEmpty", "deleteFilteredFiles", "filtered", "Lcom/simplemobiletools/commons/models/FileDirItem;", "emptyAndDisableRecycleBin", "emptyRecycleBin", "getBubbleTextItem", "index", "sorting", "getMedia", "getMediaAdapter", "Lcom/simplemobiletools/gallery/adapters/MediaAdapter;", "gotMedia", "isFromCache", "hideFolder", "increaseColumnCount", "initZoomListener", "isDirEmpty", "isSetWallpaperIntent", "itemClicked", "path", "measureRecyclerViewContent", "onActivityResult", "requestCode", "resultCode", "resultData", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onOptionsItemSelected", "item", "onPause", "onResume", "onStart", "onStop", "reduceColumnCount", "refreshItems", "restoreAllFiles", "searchQueryChanged", "text", "selectedPaths", "paths", "setupAdapter", "setupGridLayoutManager", "setupLayoutManager", "setupListLayoutManager", "setupScrollDirection", "setupSearch", "showFilterMediaDialog", "showGroupByDialog", "showSortingDialog", "startAsyncTask", "storeStateVariables", "switchToFolderView", "toggleFilenameVisibility", "toggleTemporarilyShowHidden", "show", "tryDeleteFiles", "fileDirItems", "tryExcludeFolder", "tryHideFolder", "tryToggleTemporarilyShowHidden", "tryloadGallery", "unhideFolder", "Companion", "gallery_debug"})
public final class MediaActivity extends com.simplemobiletools.gallery.activities.SimpleActivity implements com.simplemobiletools.gallery.interfaces.MediaOperationsListener {
    private final long LAST_MEDIA_CHECK_PERIOD = 3000L;
    private java.lang.String mPath;
    private boolean mIsGetImageIntent;
    private boolean mIsGetVideoIntent;
    private boolean mIsGetAnyIntent;
    private boolean mIsGettingMedia;
    private boolean mAllowPickingMultiple;
    private boolean mShowAll;
    private boolean mLoadedInitialPhotos;
    private boolean mIsSearchOpen;
    private long mLatestMediaId;
    private long mLatestMediaDateId;
    private android.os.Handler mLastMediaHandler;
    private android.os.Handler mTempShowHiddenHandler;
    private com.simplemobiletools.gallery.asynctasks.GetMediaAsynctask mCurrAsyncTask;
    private com.simplemobiletools.commons.views.MyRecyclerView.MyZoomListener mZoomListener;
    private android.view.MenuItem mSearchMenuItem;
    private boolean mStoredAnimateGifs;
    private boolean mStoredCropThumbnails;
    private boolean mStoredScrollHorizontally;
    private boolean mStoredShowInfoBubble;
    private int mStoredTextColor;
    private int mStoredPrimaryColor;
    private com.simplemobiletools.gallery.interfaces.MediumDao mMediumDao;
    private com.simplemobiletools.gallery.interfaces.DirectoryDao mDirectoryDao;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<com.simplemobiletools.gallery.models.ThumbnailItem> mMedia;
    public static final com.simplemobiletools.gallery.activities.MediaActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void storeStateVariables() {
    }
    
    private final void setupSearch(android.view.Menu menu) {
    }
    
    private final void searchQueryChanged(java.lang.String text) {
    }
    
    private final void tryloadGallery() {
    }
    
    private final com.simplemobiletools.gallery.adapters.MediaAdapter getMediaAdapter() {
        return null;
    }
    
    private final void setupAdapter() {
    }
    
    private final void setupScrollDirection() {
    }
    
    private final java.lang.String getBubbleTextItem(int index, int sorting) {
        return null;
    }
    
    private final void checkLastMediaChanged() {
    }
    
    private final void showSortingDialog() {
    }
    
    private final void showFilterMediaDialog() {
    }
    
    private final void emptyRecycleBin() {
    }
    
    private final void emptyAndDisableRecycleBin() {
    }
    
    private final void restoreAllFiles() {
    }
    
    private final void toggleFilenameVisibility() {
    }
    
    private final void switchToFolderView() {
    }
    
    private final void changeViewType() {
    }
    
    private final void showGroupByDialog() {
    }
    
    private final void tryHideFolder() {
    }
    
    private final void hideFolder() {
    }
    
    private final void unhideFolder() {
    }
    
    private final void tryExcludeFolder() {
    }
    
    private final void deleteDirectoryIfEmpty() {
    }
    
    private final void getMedia() {
    }
    
    private final void startAsyncTask() {
    }
    
    private final boolean isDirEmpty() {
        return false;
    }
    
    private final void deleteDBDirectory() {
    }
    
    private final void tryToggleTemporarilyShowHidden() {
    }
    
    private final void toggleTemporarilyShowHidden(boolean show) {
    }
    
    private final void setupLayoutManager() {
    }
    
    private final void setupGridLayoutManager() {
    }
    
    private final void measureRecyclerViewContent(java.util.ArrayList<com.simplemobiletools.gallery.models.ThumbnailItem> media) {
    }
    
    private final void calculateContentWidth(java.util.ArrayList<com.simplemobiletools.gallery.models.ThumbnailItem> media) {
    }
    
    private final void calculateContentHeight(java.util.ArrayList<com.simplemobiletools.gallery.models.ThumbnailItem> media) {
    }
    
    private final void initZoomListener() {
    }
    
    private final void setupListLayoutManager() {
    }
    
    private final void increaseColumnCount() {
    }
    
    private final void reduceColumnCount() {
    }
    
    private final void columnCountChanged() {
    }
    
    private final boolean isSetWallpaperIntent() {
        return false;
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent resultData) {
    }
    
    private final void itemClicked(java.lang.String path) {
    }
    
    private final void gotMedia(java.util.ArrayList<com.simplemobiletools.gallery.models.ThumbnailItem> media, boolean isFromCache) {
    }
    
    @java.lang.Override()
    public void tryDeleteFiles(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.commons.models.FileDirItem> fileDirItems) {
    }
    
    private final void deleteFilteredFiles(java.util.ArrayList<com.simplemobiletools.commons.models.FileDirItem> filtered) {
    }
    
    @java.lang.Override()
    public void refreshItems() {
    }
    
    @java.lang.Override()
    public void selectedPaths(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> paths) {
    }
    
    public MediaActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/simplemobiletools/gallery/activities/MediaActivity$Companion;", "", "()V", "mMedia", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/gallery/models/ThumbnailItem;", "getMMedia", "()Ljava/util/ArrayList;", "setMMedia", "(Ljava/util/ArrayList;)V", "gallery_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.simplemobiletools.gallery.models.ThumbnailItem> getMMedia() {
            return null;
        }
        
        public final void setMMedia(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.simplemobiletools.gallery.models.ThumbnailItem> p0) {
        }
        
        private Companion() {
            super();
        }
    }
}