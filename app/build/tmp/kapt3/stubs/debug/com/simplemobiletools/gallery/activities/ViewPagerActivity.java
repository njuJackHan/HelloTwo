package com.simplemobiletools.gallery.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u0087\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0087\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006H\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\bH\u0002J\u0018\u0010&\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0002J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u0006H\u0002J\b\u0010+\u001a\u00020\u001dH\u0002J\b\u0010,\u001a\u00020\u001dH\u0002J\b\u0010-\u001a\u00020\u001dH\u0016J\b\u0010.\u001a\u00020\u0012H\u0002J\b\u0010/\u001a\u000200H\u0002J\n\u00101\u001a\u0004\u0018\u000102H\u0002J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0002J\n\u00104\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u00105\u001a\u00020\bH\u0002J\b\u00106\u001a\u00020\u0006H\u0002J\u0016\u00107\u001a\u00020\u00122\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0002J\b\u00109\u001a\u00020\u001dH\u0016J\b\u0010:\u001a\u00020\u001dH\u0016J\u0016\u0010;\u001a\u00020\u001d2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\nH\u0002J\b\u0010>\u001a\u00020\u001dH\u0002J\b\u0010?\u001a\u00020\u001dH\u0002J\b\u0010@\u001a\u00020\u001dH\u0002J\b\u0010A\u001a\u00020\u001dH\u0002J\b\u0010B\u001a\u00020\u001dH\u0002J\b\u0010C\u001a\u00020\u001dH\u0002J\u0016\u0010D\u001a\u00020\u00062\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH\u0002J\b\u0010F\u001a\u00020\u0006H\u0002J\b\u0010G\u001a\u00020\u001dH\u0003J\"\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020\u00122\u0006\u0010J\u001a\u00020\u00122\b\u0010K\u001a\u0004\u0018\u00010LH\u0014J\u0012\u0010M\u001a\u00020\u001d2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u0012\u0010P\u001a\u00020\u001d2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0014J\u0010\u0010S\u001a\u00020\u00062\u0006\u0010T\u001a\u00020UH\u0016J\b\u0010V\u001a\u00020\u001dH\u0014J\u0010\u0010W\u001a\u00020\u00062\u0006\u0010X\u001a\u00020YH\u0016J\u0010\u0010Z\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020\u0012H\u0016J \u0010\\\u001a\u00020\u001d2\u0006\u0010]\u001a\u00020\u00122\u0006\u0010^\u001a\u00020$2\u0006\u0010_\u001a\u00020\u0012H\u0016J\u0010\u0010`\u001a\u00020\u001d2\u0006\u0010]\u001a\u00020\u0012H\u0016J\b\u0010a\u001a\u00020\u001dH\u0014J\b\u0010b\u001a\u00020\u001dH\u0015J\b\u0010c\u001a\u00020\u001dH\u0002J\b\u0010d\u001a\u00020\u001dH\u0002J\b\u0010e\u001a\u00020\u001dH\u0002J\u0010\u0010f\u001a\u00020\u001d2\u0006\u0010g\u001a\u00020\u0012H\u0002J \u0010h\u001a\u00020\u001d2\u0006\u0010i\u001a\u00020\b2\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020mH\u0002J\b\u0010n\u001a\u00020\u001dH\u0002J\u0018\u0010o\u001a\u00020\u001d2\u0006\u0010p\u001a\u00020\b2\u0006\u0010q\u001a\u00020\bH\u0002J\b\u0010r\u001a\u00020\u001dH\u0002J\b\u0010s\u001a\u00020\u001dH\u0002J\b\u0010t\u001a\u00020\u001dH\u0002J\b\u0010u\u001a\u00020\u001dH\u0002J\u0010\u0010v\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006H\u0002J\b\u0010w\u001a\u00020\u001dH\u0002J\b\u0010x\u001a\u00020\u001dH\u0002J\b\u0010y\u001a\u00020\u001dH\u0002J\b\u0010z\u001a\u00020\u001dH\u0002J\"\u0010{\u001a\u00020\u001d2\u0006\u0010|\u001a\u00020\u00062\u0010\b\u0002\u0010}\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010~H\u0002J\u0011\u0010\u007f\u001a\u00020\u001d2\u0007\u0010\u0080\u0001\u001a\u00020\u0012H\u0002J\u0011\u0010\u0081\u0001\u001a\u00020\u00062\u0006\u0010i\u001a\u00020\bH\u0003J\t\u0010\u0082\u0001\u001a\u00020\u001dH\u0002J\u0014\u0010\u0083\u0001\u001a\u00020\u001d2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u000fH\u0002J\u0017\u0010\u0085\u0001\u001a\u00020\u001d2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0002J\t\u0010\u0086\u0001\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0088\u0001"}, d2 = {"Lcom/simplemobiletools/gallery/activities/ViewPagerActivity;", "Lcom/simplemobiletools/gallery/activities/SimpleActivity;", "Landroid/support/v4/view/ViewPager$OnPageChangeListener;", "Lcom/simplemobiletools/gallery/fragments/ViewPagerFragment$FragmentListener;", "()V", "mAreSlideShowMediaVisible", "", "mDirectory", "", "mFavoritePaths", "Ljava/util/ArrayList;", "mIsFullScreen", "mIsOrientationLocked", "mIsSlideshowActive", "mMediaFiles", "Lcom/simplemobiletools/gallery/models/Medium;", "mPath", "mPos", "", "mPrevHashcode", "mRotationDegrees", "mShowAll", "mSlideshowHandler", "Landroid/os/Handler;", "mSlideshowInterval", "mSlideshowMedia", "", "mSlideshowMoveBackwards", "animatePagerTransition", "", "forward", "askConfirmDelete", "checkDeleteConfirmation", "checkOrientation", "checkSystemUI", "convertToDegree", "", "stringDMS", "copyFile", "source", "destination", "copyMoveTo", "isCopyOperation", "deleteConfirmed", "deleteDirectoryIfEmpty", "fragmentClicked", "getChangeOrientationIcon", "getCurrentFile", "Ljava/io/File;", "getCurrentFragment", "Lcom/simplemobiletools/gallery/fragments/ViewPagerFragment;", "getCurrentMedia", "getCurrentMedium", "getCurrentPath", "getMediaForSlideshow", "getPositionInList", "items", "goToNextItem", "goToPrevItem", "gotMedia", "thumbnailItems", "Lcom/simplemobiletools/gallery/models/ThumbnailItem;", "initBottomActionButtons", "initBottomActions", "initBottomActionsLayout", "initFavorites", "initSlideshow", "initViewPager", "isDirEmpty", "media", "isShowHiddenFlagNeeded", "measureScreen", "onActivityResult", "requestCode", "resultCode", "resultData", "Landroid/content/Intent;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPageScrollStateChanged", "state", "onPageScrolled", "position", "positionOffset", "positionOffsetPixels", "onPageSelected", "onPause", "onResume", "refreshViewPager", "renameFile", "restoreFile", "rotateImage", "degrees", "saveFile", "path", "bitmap", "Landroid/graphics/Bitmap;", "out", "Ljava/io/FileOutputStream;", "saveImageAs", "saveImageToFile", "oldPath", "newPath", "scheduleSwipe", "setupRotation", "showOnMap", "showProperties", "slideshowEnded", "startSlideshow", "stopSlideshow", "swipeToNextMedium", "toggleFavorite", "toggleFileVisibility", "hide", "callback", "Lkotlin/Function0;", "toggleOrientation", "orientation", "tryRotateByExif", "updateActionbarTitle", "updateBottomActionIcons", "medium", "updatePagerItems", "videoEnded", "Companion", "gallery_debug"})
public final class ViewPagerActivity extends com.simplemobiletools.gallery.activities.SimpleActivity implements android.support.v4.view.ViewPager.OnPageChangeListener, com.simplemobiletools.gallery.fragments.ViewPagerFragment.FragmentListener {
    private java.lang.String mPath;
    private java.lang.String mDirectory;
    private boolean mIsFullScreen;
    private int mPos;
    private boolean mShowAll;
    private boolean mIsSlideshowActive;
    private int mRotationDegrees;
    private int mPrevHashcode;
    private android.os.Handler mSlideshowHandler;
    private int mSlideshowInterval;
    private boolean mSlideshowMoveBackwards;
    private java.util.List<com.simplemobiletools.gallery.models.Medium> mSlideshowMedia;
    private boolean mAreSlideShowMediaVisible;
    private boolean mIsOrientationLocked;
    private java.util.ArrayList<com.simplemobiletools.gallery.models.Medium> mMediaFiles;
    private java.util.ArrayList<java.lang.String> mFavoritePaths;
    private static int screenWidth;
    private static int screenHeight;
    public static final com.simplemobiletools.gallery.activities.ViewPagerActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void initViewPager() {
    }
    
    private final void initBottomActions() {
    }
    
    private final void initFavorites() {
    }
    
    private final void setupRotation() {
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
    
    private final void updatePagerItems(java.util.List<com.simplemobiletools.gallery.models.Medium> media) {
    }
    
    private final void initSlideshow() {
    }
    
    private final void startSlideshow() {
    }
    
    private final void animatePagerTransition(boolean forward) {
    }
    
    private final void slideshowEnded(boolean forward) {
    }
    
    private final void stopSlideshow() {
    }
    
    private final void scheduleSwipe() {
    }
    
    private final void swipeToNextMedium() {
    }
    
    private final boolean getMediaForSlideshow() {
        return false;
    }
    
    private final void copyMoveTo(boolean isCopyOperation) {
    }
    
    private final void toggleFileVisibility(boolean hide, kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    private final void rotateImage(int degrees) {
    }
    
    private final void toggleOrientation(int orientation) {
    }
    
    private final int getChangeOrientationIcon() {
        return 0;
    }
    
    private final void saveImageAs() {
    }
    
    private final void saveImageToFile(java.lang.String oldPath, java.lang.String newPath) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.N)
    private final boolean tryRotateByExif(java.lang.String path) {
        return false;
    }
    
    private final void copyFile(java.lang.String source, java.lang.String destination) {
    }
    
    private final void saveFile(java.lang.String path, android.graphics.Bitmap bitmap, java.io.FileOutputStream out) {
    }
    
    private final boolean isShowHiddenFlagNeeded() {
        return false;
    }
    
    private final com.simplemobiletools.gallery.fragments.ViewPagerFragment getCurrentFragment() {
        return null;
    }
    
    private final void showProperties() {
    }
    
    private final void showOnMap() {
    }
    
    private final float convertToDegree(java.lang.String stringDMS) {
        return 0.0F;
    }
    
    private final void initBottomActionsLayout() {
    }
    
    private final void initBottomActionButtons() {
    }
    
    private final void updateBottomActionIcons(com.simplemobiletools.gallery.models.Medium medium) {
    }
    
    private final void toggleFavorite() {
    }
    
    private final void restoreFile() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent resultData) {
    }
    
    private final void checkDeleteConfirmation() {
    }
    
    private final void askConfirmDelete() {
    }
    
    private final void deleteConfirmed() {
    }
    
    private final boolean isDirEmpty(java.util.ArrayList<com.simplemobiletools.gallery.models.Medium> media) {
        return false;
    }
    
    private final void renameFile() {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.Nullable()
    android.content.res.Configuration newConfig) {
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final void measureScreen() {
    }
    
    private final void refreshViewPager() {
    }
    
    private final void gotMedia(java.util.ArrayList<com.simplemobiletools.gallery.models.ThumbnailItem> thumbnailItems) {
    }
    
    private final int getPositionInList(java.util.List<com.simplemobiletools.gallery.models.Medium> items) {
        return 0;
    }
    
    private final void deleteDirectoryIfEmpty() {
    }
    
    private final void checkOrientation() {
    }
    
    @java.lang.Override()
    public void fragmentClicked() {
    }
    
    @java.lang.Override()
    public boolean videoEnded() {
        return false;
    }
    
    @java.lang.Override()
    public void goToPrevItem() {
    }
    
    @java.lang.Override()
    public void goToNextItem() {
    }
    
    private final void checkSystemUI() {
    }
    
    private final void updateActionbarTitle() {
    }
    
    private final com.simplemobiletools.gallery.models.Medium getCurrentMedium() {
        return null;
    }
    
    private final java.util.List<com.simplemobiletools.gallery.models.Medium> getCurrentMedia() {
        return null;
    }
    
    private final java.lang.String getCurrentPath() {
        return null;
    }
    
    private final java.io.File getCurrentFile() {
        return null;
    }
    
    @java.lang.Override()
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }
    
    @java.lang.Override()
    public void onPageSelected(int position) {
    }
    
    @java.lang.Override()
    public void onPageScrollStateChanged(int state) {
    }
    
    public ViewPagerActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/simplemobiletools/gallery/activities/ViewPagerActivity$Companion;", "", "()V", "screenHeight", "", "getScreenHeight", "()I", "setScreenHeight", "(I)V", "screenWidth", "getScreenWidth", "setScreenWidth", "gallery_debug"})
    public static final class Companion {
        
        public final int getScreenWidth() {
            return 0;
        }
        
        public final void setScreenWidth(int p0) {
        }
        
        public final int getScreenHeight() {
            return 0;
        }
        
        public final void setScreenHeight(int p0) {
        }
        
        private Companion() {
            super();
        }
    }
}