package com.simplemobiletools.gallery.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0003J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\"\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001bH\u0014J\u0012\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%H\u0016J\u001a\u0010&\u001a\u00020\u00162\b\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0017J\u0010\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u0016H\u0002J\b\u0010/\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u00060"}, d2 = {"Lcom/simplemobiletools/gallery/activities/SetWallpaperActivity;", "Lcom/simplemobiletools/gallery/activities/SimpleActivity;", "Lcom/theartofdev/edmodo/cropper/CropImageView$OnCropImageCompleteListener;", "()V", "PICK_IMAGE", "", "isLandscapeRatio", "", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "wallpaperFlag", "wallpaperManager", "Landroid/app/WallpaperManager;", "getWallpaperManager", "()Landroid/app/WallpaperManager;", "setWallpaperManager", "(Landroid/app/WallpaperManager;)V", "changeAspectRatio", "", "isLandscape", "confirmWallpaper", "handleImage", "intent", "Landroid/content/Intent;", "onActivityResult", "requestCode", "resultCode", "resultData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onCropImageComplete", "view", "Lcom/theartofdev/edmodo/cropper/CropImageView;", "result", "Lcom/theartofdev/edmodo/cropper/CropImageView$CropResult;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setupAspectRatio", "setupBottomActions", "gallery_debug"})
public final class SetWallpaperActivity extends com.simplemobiletools.gallery.activities.SimpleActivity implements com.theartofdev.edmodo.cropper.CropImageView.OnCropImageCompleteListener {
    private final int PICK_IMAGE = 1;
    private boolean isLandscapeRatio;
    private int wallpaperFlag;
    @org.jetbrains.annotations.NotNull()
    public android.net.Uri uri;
    @org.jetbrains.annotations.NotNull()
    public android.app.WallpaperManager wallpaperManager;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getUri() {
        return null;
    }
    
    public final void setUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.WallpaperManager getWallpaperManager() {
        return null;
    }
    
    public final void setWallpaperManager(@org.jetbrains.annotations.NotNull()
    android.app.WallpaperManager p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void handleImage(android.content.Intent intent) {
    }
    
    private final void setupBottomActions() {
    }
    
    private final void setupAspectRatio() {
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
    
    private final void changeAspectRatio(boolean isLandscape) {
    }
    
    @android.annotation.SuppressLint(value = {"InlinedApi"})
    private final void confirmWallpaper() {
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    @java.lang.Override()
    public void onCropImageComplete(@org.jetbrains.annotations.Nullable()
    com.theartofdev.edmodo.cropper.CropImageView view, @org.jetbrains.annotations.NotNull()
    com.theartofdev.edmodo.cropper.CropImageView.CropResult result) {
    }
    
    /**
     * * Callback for pickImage().
     */
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent resultData) {
    }
    
    public SetWallpaperActivity() {
        super();
    }
}
