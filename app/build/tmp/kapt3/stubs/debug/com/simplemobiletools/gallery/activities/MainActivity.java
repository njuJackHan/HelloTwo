package com.simplemobiletools.gallery.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010+\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J\u0016\u00100\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J\b\u00101\u001a\u00020,H\u0002J\u0016\u00102\u001a\u00020,2\f\u00103\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J\b\u00104\u001a\u00020,H\u0002J\b\u00105\u001a\u00020,H\u0002J\u0016\u00106\u001a\u00020,2\f\u00103\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J\b\u00107\u001a\u00020,H\u0002J\b\u00108\u001a\u00020,H\u0002J\b\u00109\u001a\u00020,H\u0002JJ\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020\u00072\f\u0010<\u001a\b\u0012\u0004\u0012\u00020=0.2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020?0.2\u0006\u0010@\u001a\u00020\u00072\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00070B2\u0006\u0010C\u001a\u00020\fH\u0002J\b\u0010D\u001a\u00020,H\u0002J$\u0010E\u001a\u00020,2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020G0.2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020I0.H\u0002J\u0016\u0010J\u001a\u00020,2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020I0.H\u0016J\u0010\u0010K\u001a\u00020,2\u0006\u0010L\u001a\u00020MH\u0002J\u0018\u0010N\u001a\u00020,2\u0006\u0010L\u001a\u00020M2\u0006\u0010O\u001a\u00020MH\u0002J\u0018\u0010P\u001a\u00020,2\u0006\u0010L\u001a\u00020M2\u0006\u0010O\u001a\u00020MH\u0002J\u0010\u0010Q\u001a\u00020\u00072\u0006\u0010R\u001a\u00020\tH\u0002J\u0018\u0010S\u001a\u0012\u0012\u0004\u0012\u00020/0.j\b\u0012\u0004\u0012\u00020/`TH\u0002J\b\u0010U\u001a\u00020,H\u0002J\n\u0010V\u001a\u0004\u0018\u00010WH\u0002J\u0016\u0010X\u001a\u00020,2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J\u0010\u0010Z\u001a\u00020,2\u0006\u0010[\u001a\u00020MH\u0002J\u0010\u0010\\\u001a\u00020\f2\u0006\u0010[\u001a\u00020MH\u0002J\u0010\u0010]\u001a\u00020\f2\u0006\u0010[\u001a\u00020MH\u0002J\b\u0010^\u001a\u00020,H\u0002J\b\u0010_\u001a\u00020,H\u0002J\u0010\u0010`\u001a\u00020\f2\u0006\u0010[\u001a\u00020MH\u0002J\u0010\u0010a\u001a\u00020\f2\u0006\u0010[\u001a\u00020MH\u0002J\u0010\u0010b\u001a\u00020\f2\u0006\u0010[\u001a\u00020MH\u0002J\u0010\u0010c\u001a\u00020\f2\u0006\u0010[\u001a\u00020MH\u0002J\u0010\u0010d\u001a\u00020\f2\u0006\u0010[\u001a\u00020MH\u0002J\u0010\u0010e\u001a\u00020\f2\u0006\u0010[\u001a\u00020MH\u0002J\u0010\u0010f\u001a\u00020\f2\u0006\u0010[\u001a\u00020MH\u0002J\u0010\u0010g\u001a\u00020\f2\u0006\u0010[\u001a\u00020MH\u0002J\u0012\u0010h\u001a\u00020\f2\b\u0010[\u001a\u0004\u0018\u00010MH\u0002J\u0010\u0010i\u001a\u00020\f2\u0006\u0010[\u001a\u00020MH\u0002J\u0010\u0010j\u001a\u00020,2\u0006\u0010;\u001a\u00020\u0007H\u0002J\u0016\u0010k\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J\"\u0010l\u001a\u00020,2\u0006\u0010m\u001a\u00020\t2\u0006\u0010n\u001a\u00020\t2\b\u0010L\u001a\u0004\u0018\u00010MH\u0014J\u0012\u0010o\u001a\u00020,2\b\u0010p\u001a\u0004\u0018\u00010qH\u0014J\u0010\u0010r\u001a\u00020\f2\u0006\u0010s\u001a\u00020tH\u0016J\b\u0010u\u001a\u00020,H\u0014J\u0010\u0010v\u001a\u00020\f2\u0006\u0010w\u001a\u00020xH\u0016J\b\u0010y\u001a\u00020,H\u0014J\u0010\u0010z\u001a\u00020,2\u0006\u0010p\u001a\u00020qH\u0014J\b\u0010{\u001a\u00020,H\u0014J\u0010\u0010|\u001a\u00020,2\u0006\u0010}\u001a\u00020qH\u0014J\b\u0010~\u001a\u00020,H\u0014J\b\u0010\u007f\u001a\u00020,H\u0014J\t\u0010\u0080\u0001\u001a\u00020,H\u0016J\t\u0010\u0081\u0001\u001a\u00020,H\u0002J\t\u0010\u0082\u0001\u001a\u00020,H\u0016J\t\u0010\u0083\u0001\u001a\u00020,H\u0002J\u0017\u0010\u0084\u0001\u001a\u00020,2\f\u00103\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J\t\u0010\u0085\u0001\u001a\u00020,H\u0002J\t\u0010\u0086\u0001\u001a\u00020,H\u0002J\t\u0010\u0087\u0001\u001a\u00020,H\u0002J\t\u0010\u0088\u0001\u001a\u00020,H\u0002J\t\u0010\u0089\u0001\u001a\u00020,H\u0002J\t\u0010\u008a\u0001\u001a\u00020,H\u0002J\t\u0010\u008b\u0001\u001a\u00020,H\u0002J\u0017\u0010\u008c\u0001\u001a\u00020,2\f\u00103\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J\t\u0010\u008d\u0001\u001a\u00020,H\u0002J\t\u0010\u008e\u0001\u001a\u00020,H\u0002J\u0012\u0010\u008f\u0001\u001a\u00020,2\u0007\u0010\u0090\u0001\u001a\u00020\fH\u0002J\t\u0010\u0091\u0001\u001a\u00020,H\u0002J\t\u0010\u0092\u0001\u001a\u00020,H\u0002J\u0017\u0010\u0093\u0001\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0094\u0001"}, d2 = {"Lcom/simplemobiletools/gallery/activities/MainActivity;", "Lcom/simplemobiletools/gallery/activities/SimpleActivity;", "Lcom/simplemobiletools/gallery/interfaces/DirectoryOperationsListener;", "()V", "LAST_MEDIA_CHECK_PERIOD", "", "NEW_APP_PACKAGE", "", "PICK_MEDIA", "", "PICK_WALLPAPER", "mAllowPickingMultiple", "", "mDirectoryDao", "Lcom/simplemobiletools/gallery/interfaces/DirectoryDao;", "mIsGetAnyContentIntent", "mIsGetImageContentIntent", "mIsGetVideoContentIntent", "mIsGettingDirs", "mIsPasswordProtectionPending", "mIsPickImageIntent", "mIsPickVideoIntent", "mIsSetWallpaperIntent", "mIsThirdPartyIntent", "mLastMediaHandler", "Landroid/os/Handler;", "mLatestMediaDateId", "mLatestMediaId", "mLoadedInitialPhotos", "mMediumDao", "Lcom/simplemobiletools/gallery/interfaces/MediumDao;", "mShouldStopFetching", "mStoredAnimateGifs", "mStoredCropThumbnails", "mStoredPrimaryColor", "mStoredScrollHorizontally", "mStoredShowInfoBubble", "mStoredShowMediaCount", "mStoredTextColor", "mTempShowHiddenHandler", "mWasProtectionHandled", "mZoomListener", "Lcom/simplemobiletools/commons/views/MyRecyclerView$MyZoomListener;", "calculateContentHeight", "", "directories", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/gallery/models/Directory;", "calculateContentWidth", "changeViewType", "checkInvalidDirectories", "dirs", "checkLastMediaChanged", "checkOTGInclusion", "checkPlaceholderVisibility", "checkRecycleBinItems", "checkWhatsNewDialog", "columnCountChanged", "createDirectoryFromMedia", "path", "curMedia", "Lcom/simplemobiletools/gallery/models/Medium;", "albumCovers", "Lcom/simplemobiletools/gallery/models/AlbumCover;", "hiddenString", "includedFolders", "", "isSortingAscending", "createNewFolder", "deleteFilteredFolders", "fileDirItems", "Lcom/simplemobiletools/commons/models/FileDirItem;", "folders", "Ljava/io/File;", "deleteFolders", "fillExtraOutput", "resultData", "Landroid/content/Intent;", "fillIntentPath", "resultIntent", "fillPickedPaths", "getBubbleTextItem", "index", "getCurrentlyDisplayedDirs", "Lkotlin/collections/ArrayList;", "getDirectories", "getRecyclerAdapter", "Lcom/simplemobiletools/gallery/adapters/DirectoryAdapter;", "gotDirectories", "newDirs", "handleMediaIntent", "intent", "hasImageContentData", "hasVideoContentData", "increaseColumnCount", "initZoomListener", "isGetAnyContentIntent", "isGetContentIntent", "isGetImageContentIntent", "isGetVideoContentIntent", "isImageType", "isPickImageIntent", "isPickIntent", "isPickVideoIntent", "isSetWallpaperIntent", "isVideoType", "itemClicked", "measureRecyclerViewContent", "onActivityResult", "requestCode", "resultCode", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onRestoreInstanceState", "onResume", "onSaveInstanceState", "outState", "onStart", "onStop", "recheckPinnedFolders", "reduceColumnCount", "refreshItems", "removeTempFolder", "setupAdapter", "setupGridLayoutManager", "setupLatestMediaId", "setupLayoutManager", "setupListLayoutManager", "setupScrollDirection", "showAllMedia", "showFilterMediaDialog", "showSortedDirs", "showSortingDialog", "storeStateVariables", "toggleTemporarilyShowHidden", "show", "tryLoadGallery", "tryToggleTemporarilyShowHidden", "updateDirectories", "gallery_debug"})
public final class MainActivity extends com.simplemobiletools.gallery.activities.SimpleActivity implements com.simplemobiletools.gallery.interfaces.DirectoryOperationsListener {
    private final int PICK_MEDIA = 2;
    private final int PICK_WALLPAPER = 3;
    private final long LAST_MEDIA_CHECK_PERIOD = 3000L;
    private final java.lang.String NEW_APP_PACKAGE = "com.simplemobiletools.clock";
    private boolean mIsPickImageIntent;
    private boolean mIsPickVideoIntent;
    private boolean mIsGetImageContentIntent;
    private boolean mIsGetVideoContentIntent;
    private boolean mIsGetAnyContentIntent;
    private boolean mIsSetWallpaperIntent;
    private boolean mAllowPickingMultiple;
    private boolean mIsThirdPartyIntent;
    private boolean mIsGettingDirs;
    private boolean mLoadedInitialPhotos;
    private boolean mIsPasswordProtectionPending;
    private boolean mWasProtectionHandled;
    private boolean mShouldStopFetching;
    private long mLatestMediaId;
    private long mLatestMediaDateId;
    private android.os.Handler mLastMediaHandler;
    private android.os.Handler mTempShowHiddenHandler;
    private com.simplemobiletools.commons.views.MyRecyclerView.MyZoomListener mZoomListener;
    private boolean mStoredAnimateGifs;
    private boolean mStoredCropThumbnails;
    private boolean mStoredScrollHorizontally;
    private boolean mStoredShowMediaCount;
    private boolean mStoredShowInfoBubble;
    private int mStoredTextColor;
    private int mStoredPrimaryColor;
    private com.simplemobiletools.gallery.interfaces.MediumDao mMediumDao;
    private com.simplemobiletools.gallery.interfaces.DirectoryDao mDirectoryDao;
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
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    protected void onRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle savedInstanceState) {
    }
    
    private final com.simplemobiletools.gallery.adapters.DirectoryAdapter getRecyclerAdapter() {
        return null;
    }
    
    private final void storeStateVariables() {
    }
    
    private final void removeTempFolder() {
    }
    
    private final void checkOTGInclusion() {
    }
    
    private final void tryLoadGallery() {
    }
    
    private final void getDirectories() {
    }
    
    private final void showSortingDialog() {
    }
    
    private final void showFilterMediaDialog() {
    }
    
    private final void showAllMedia() {
    }
    
    private final void changeViewType() {
    }
    
    private final void tryToggleTemporarilyShowHidden() {
    }
    
    private final void toggleTemporarilyShowHidden(boolean show) {
    }
    
    @java.lang.Override()
    public void deleteFolders(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.io.File> folders) {
    }
    
    private final void deleteFilteredFolders(java.util.ArrayList<com.simplemobiletools.commons.models.FileDirItem> fileDirItems, java.util.ArrayList<java.io.File> folders) {
    }
    
    private final void setupLayoutManager() {
    }
    
    private final void setupGridLayoutManager() {
    }
    
    private final void measureRecyclerViewContent(java.util.ArrayList<com.simplemobiletools.gallery.models.Directory> directories) {
    }
    
    private final void calculateContentWidth(java.util.ArrayList<com.simplemobiletools.gallery.models.Directory> directories) {
    }
    
    private final void calculateContentHeight(java.util.ArrayList<com.simplemobiletools.gallery.models.Directory> directories) {
    }
    
    private final void initZoomListener() {
    }
    
    private final void setupListLayoutManager() {
    }
    
    private final void createNewFolder() {
    }
    
    private final void increaseColumnCount() {
    }
    
    private final void reduceColumnCount() {
    }
    
    private final void columnCountChanged() {
    }
    
    private final boolean isPickImageIntent(android.content.Intent intent) {
        return false;
    }
    
    private final boolean isPickVideoIntent(android.content.Intent intent) {
        return false;
    }
    
    private final boolean isPickIntent(android.content.Intent intent) {
        return false;
    }
    
    private final boolean isGetContentIntent(android.content.Intent intent) {
        return false;
    }
    
    private final boolean isGetImageContentIntent(android.content.Intent intent) {
        return false;
    }
    
    private final boolean isGetVideoContentIntent(android.content.Intent intent) {
        return false;
    }
    
    private final boolean isGetAnyContentIntent(android.content.Intent intent) {
        return false;
    }
    
    private final boolean isSetWallpaperIntent(android.content.Intent intent) {
        return false;
    }
    
    private final boolean hasImageContentData(android.content.Intent intent) {
        return false;
    }
    
    private final boolean hasVideoContentData(android.content.Intent intent) {
        return false;
    }
    
    private final boolean isImageType(android.content.Intent intent) {
        return false;
    }
    
    private final boolean isVideoType(android.content.Intent intent) {
        return false;
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent resultData) {
    }
    
    private final void fillExtraOutput(android.content.Intent resultData) {
    }
    
    private final void fillPickedPaths(android.content.Intent resultData, android.content.Intent resultIntent) {
    }
    
    private final void fillIntentPath(android.content.Intent resultData, android.content.Intent resultIntent) {
    }
    
    private final void itemClicked(java.lang.String path) {
    }
    
    private final void handleMediaIntent(android.content.Intent intent) {
    }
    
    private final void gotDirectories(java.util.ArrayList<com.simplemobiletools.gallery.models.Directory> newDirs) {
    }
    
    private final void checkPlaceholderVisibility(java.util.ArrayList<com.simplemobiletools.gallery.models.Directory> dirs) {
    }
    
    private final void showSortedDirs(java.util.ArrayList<com.simplemobiletools.gallery.models.Directory> dirs) {
    }
    
    private final com.simplemobiletools.gallery.models.Directory createDirectoryFromMedia(java.lang.String path, java.util.ArrayList<com.simplemobiletools.gallery.models.Medium> curMedia, java.util.ArrayList<com.simplemobiletools.gallery.models.AlbumCover> albumCovers, java.lang.String hiddenString, java.util.Set<java.lang.String> includedFolders, boolean isSortingAscending) {
        return null;
    }
    
    private final void setupAdapter(java.util.ArrayList<com.simplemobiletools.gallery.models.Directory> dirs) {
    }
    
    private final void setupScrollDirection() {
    }
    
    private final void checkInvalidDirectories(java.util.ArrayList<com.simplemobiletools.gallery.models.Directory> dirs) {
    }
    
    private final java.util.ArrayList<com.simplemobiletools.gallery.models.Directory> getCurrentlyDisplayedDirs() {
        return null;
    }
    
    private final java.lang.String getBubbleTextItem(int index) {
        return null;
    }
    
    private final void setupLatestMediaId() {
    }
    
    private final void checkLastMediaChanged() {
    }
    
    private final void checkRecycleBinItems() {
    }
    
    @java.lang.Override()
    public void refreshItems() {
    }
    
    @java.lang.Override()
    public void recheckPinnedFolders() {
    }
    
    @java.lang.Override()
    public void updateDirectories(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.gallery.models.Directory> directories) {
    }
    
    private final void checkWhatsNewDialog() {
    }
    
    public MainActivity() {
        super();
    }
}