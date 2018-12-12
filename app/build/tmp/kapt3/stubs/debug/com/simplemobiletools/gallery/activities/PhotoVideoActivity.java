package com.simplemobiletools.gallery.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\b\u0010\u001a\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\u0012\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0013H\u0014J\u0010\u0010\'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u0013H\u0002J\b\u0010+\u001a\u00020\u0007H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/simplemobiletools/gallery/activities/PhotoVideoActivity;", "Lcom/simplemobiletools/gallery/activities/SimpleActivity;", "Lcom/simplemobiletools/gallery/fragments/ViewPagerFragment$FragmentListener;", "()V", "mFragment", "Lcom/simplemobiletools/gallery/fragments/ViewPagerFragment;", "mIsFromGallery", "", "mIsFullScreen", "mIsVideo", "getMIsVideo", "()Z", "setMIsVideo", "(Z)V", "mMedium", "Lcom/simplemobiletools/gallery/models/Medium;", "mUri", "Landroid/net/Uri;", "checkIntent", "", "savedInstanceState", "Landroid/os/Bundle;", "fragmentClicked", "goToNextItem", "goToPrevItem", "initBottomActionButtons", "initBottomActions", "initBottomActionsLayout", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onResume", "sendViewPagerIntent", "path", "", "showProperties", "videoEnded", "gallery_debug"})
public class PhotoVideoActivity extends com.simplemobiletools.gallery.activities.SimpleActivity implements com.simplemobiletools.gallery.fragments.ViewPagerFragment.FragmentListener {
    private com.simplemobiletools.gallery.models.Medium mMedium;
    private boolean mIsFullScreen;
    private boolean mIsFromGallery;
    private com.simplemobiletools.gallery.fragments.ViewPagerFragment mFragment;
    private android.net.Uri mUri;
    private boolean mIsVideo;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean getMIsVideo() {
        return false;
    }
    
    public final void setMIsVideo(boolean p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void checkIntent(android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.Nullable()
    android.content.res.Configuration newConfig) {
    }
    
    private final void sendViewPagerIntent(java.lang.String path) {
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
    
    private final void showProperties() {
    }
    
    private final void initBottomActions() {
    }
    
    private final void initBottomActionsLayout() {
    }
    
    private final void initBottomActionButtons() {
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
    
    public PhotoVideoActivity() {
        super();
    }
}