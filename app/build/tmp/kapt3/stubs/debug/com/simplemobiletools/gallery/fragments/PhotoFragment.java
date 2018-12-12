package com.simplemobiletools.gallery.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0002J\u0010\u0010&\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0002J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\nH\u0002J\b\u0010+\u001a\u00020\nH\u0002J\b\u0010,\u001a\u00020\nH\u0002J\u0010\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\fH\u0002J\b\u0010/\u001a\u00020\"H\u0002J\u0012\u00100\u001a\u00020\"2\b\b\u0002\u00101\u001a\u00020\nH\u0002J\b\u00102\u001a\u00020\"H\u0002J\b\u00103\u001a\u00020\"H\u0002J\b\u00104\u001a\u00020\"H\u0002J\b\u00105\u001a\u00020\"H\u0003J\u0010\u00106\u001a\u00020\"2\u0006\u00107\u001a\u000208H\u0016J$\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u001b2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010@\u001a\u00020\"H\u0016J\b\u0010A\u001a\u00020\"H\u0016J\b\u0010B\u001a\u00020\"H\u0016J\b\u0010C\u001a\u00020\"H\u0002J\b\u0010D\u001a\u00020\"H\u0002J\u0010\u0010E\u001a\u00020\"2\u0006\u0010.\u001a\u00020\fH\u0002J\u000e\u0010F\u001a\u00020\"2\u0006\u00101\u001a\u00020\nJ\u0018\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020H2\u0006\u0010%\u001a\u00020\nH\u0002J\b\u0010J\u001a\u00020\"H\u0002J\u0010\u0010K\u001a\u00020\"2\u0006\u0010L\u001a\u00020\fH\u0016J\b\u0010M\u001a\u00020\"H\u0002J\b\u0010N\u001a\u00020\"H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006O"}, d2 = {"Lcom/simplemobiletools/gallery/fragments/PhotoFragment;", "Lcom/simplemobiletools/gallery/fragments/ViewPagerFragment;", "()V", "DEFAULT_DOUBLE_TAP_ZOOM", "", "ZOOMABLE_VIEW_LOAD_DELAY", "", "gifDrawable", "Lpl/droidsonroids/gif/GifDrawable;", "imageOrientation", "", "isFragmentVisible", "", "isFullscreen", "isPanorama", "loadZoomableViewHandler", "Landroid/os/Handler;", "medium", "Lcom/simplemobiletools/gallery/models/Medium;", "getMedium", "()Lcom/simplemobiletools/gallery/models/Medium;", "setMedium", "(Lcom/simplemobiletools/gallery/models/Medium;)V", "storedExtendedDetails", "storedHideExtendedDetails", "storedShowExtendedDetails", "view", "Landroid/view/ViewGroup;", "getView", "()Landroid/view/ViewGroup;", "setView", "(Landroid/view/ViewGroup;)V", "wasInit", "addZoomableView", "", "checkIfPanorama", "degreesForRotation", "orientation", "fullscreenToggled", "getDoubleTapZoomScale", "width", "height", "getExtendedDetailsY", "getImageOrientation", "getMinTileDpi", "gifFragmentVisibilityChanged", "isVisible", "initExtendedDetails", "loadBitmap", "degrees", "loadGif", "loadImage", "loadSVG", "measureScreen", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onPause", "onResume", "openPanorama", "photoClicked", "photoFragmentVisibilityChanged", "rotateImageViewBy", "rotateViaMatrix", "Landroid/graphics/Bitmap;", "original", "scheduleZoomableView", "setMenuVisibility", "menuVisible", "storeStateVariables", "tryLoadingWithGlide", "gallery_debug"})
public final class PhotoFragment extends com.simplemobiletools.gallery.fragments.ViewPagerFragment {
    private final float DEFAULT_DOUBLE_TAP_ZOOM = 2.0F;
    private final long ZOOMABLE_VIEW_LOAD_DELAY = 300L;
    private boolean isFragmentVisible;
    private boolean isFullscreen;
    private boolean wasInit;
    private boolean isPanorama;
    private int imageOrientation;
    private pl.droidsonroids.gif.GifDrawable gifDrawable;
    private android.os.Handler loadZoomableViewHandler;
    private boolean storedShowExtendedDetails;
    private boolean storedHideExtendedDetails;
    private int storedExtendedDetails;
    @org.jetbrains.annotations.NotNull()
    public android.view.ViewGroup view;
    @org.jetbrains.annotations.NotNull()
    public com.simplemobiletools.gallery.models.Medium medium;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.ViewGroup getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.gallery.models.Medium getMedium() {
        return null;
    }
    
    public final void setMedium(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.gallery.models.Medium p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void setMenuVisibility(boolean menuVisible) {
    }
    
    private final void storeStateVariables() {
    }
    
    @android.annotation.SuppressLint(value = {"NewApi"})
    private final void measureScreen() {
    }
    
    private final void gifFragmentVisibilityChanged(boolean isVisible) {
    }
    
    private final void photoFragmentVisibilityChanged(boolean isVisible) {
    }
    
    private final int degreesForRotation(int orientation) {
        return 0;
    }
    
    private final android.graphics.Bitmap rotateViaMatrix(android.graphics.Bitmap original, int orientation) {
        return null;
    }
    
    private final void loadImage() {
    }
    
    private final void loadGif() {
    }
    
    private final void loadSVG() {
    }
    
    private final void loadBitmap(int degrees) {
    }
    
    private final void tryLoadingWithGlide() {
    }
    
    private final void openPanorama() {
    }
    
    private final void scheduleZoomableView() {
    }
    
    private final void addZoomableView() {
    }
    
    private final int getMinTileDpi() {
        return 0;
    }
    
    private final void checkIfPanorama() {
    }
    
    private final int getImageOrientation() {
        return 0;
    }
    
    private final float getDoubleTapZoomScale(int width, int height) {
        return 0.0F;
    }
    
    public final void rotateImageViewBy(int degrees) {
    }
    
    private final void initExtendedDetails() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    private final void photoClicked() {
    }
    
    @java.lang.Override()
    public void fullscreenToggled(boolean isFullscreen) {
    }
    
    private final float getExtendedDetailsY(int height) {
        return 0.0F;
    }
    
    public PhotoFragment() {
        super();
    }
}