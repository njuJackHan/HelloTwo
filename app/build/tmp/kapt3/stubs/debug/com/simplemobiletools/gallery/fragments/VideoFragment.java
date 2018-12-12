package com.simplemobiletools.gallery.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u000204H\u0002J\b\u00106\u001a\u000204H\u0002J\u0010\u00107\u001a\u0002042\u0006\u00108\u001a\u00020\u0018H\u0016J\u0010\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020\bH\u0002J\b\u0010;\u001a\u00020\u0018H\u0002J\b\u0010<\u001a\u000204H\u0002J\b\u0010=\u001a\u000204H\u0002J\b\u0010>\u001a\u000204H\u0002J\u0010\u0010?\u001a\u0002042\u0006\u0010@\u001a\u00020AH\u0016J&\u0010B\u001a\u0004\u0018\u00010&2\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010F2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\b\u0010I\u001a\u000204H\u0016J\b\u0010J\u001a\u000204H\u0016J \u0010K\u001a\u0002042\u0006\u0010L\u001a\u00020\u001e2\u0006\u0010M\u001a\u00020\b2\u0006\u0010N\u001a\u00020\u0018H\u0016J\b\u0010O\u001a\u000204H\u0016J\u0010\u0010P\u001a\u0002042\u0006\u0010Q\u001a\u00020HH\u0016J\u0010\u0010R\u001a\u0002042\u0006\u0010L\u001a\u00020\u001eH\u0016J\u0010\u0010S\u001a\u0002042\u0006\u0010L\u001a\u00020\u001eH\u0016J\"\u0010T\u001a\u0002042\b\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010W\u001a\u00020\b2\u0006\u0010:\u001a\u00020\bH\u0016J\u0012\u0010X\u001a\u00020\u00182\b\u0010U\u001a\u0004\u0018\u00010VH\u0016J\"\u0010Y\u001a\u0002042\b\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010W\u001a\u00020\b2\u0006\u0010:\u001a\u00020\bH\u0016J\u0012\u0010Z\u001a\u0002042\b\u0010U\u001a\u0004\u0018\u00010VH\u0016J\b\u0010[\u001a\u000204H\u0002J\u0006\u0010\\\u001a\u000204J\b\u0010]\u001a\u000204H\u0002J\b\u0010^\u001a\u000204H\u0002J\u0010\u0010_\u001a\u0002042\u0006\u0010`\u001a\u00020\u0018H\u0016J\u0010\u0010a\u001a\u0002042\u0006\u0010b\u001a\u00020\bH\u0002J\b\u0010c\u001a\u000204H\u0003J\b\u0010d\u001a\u000204H\u0002J\b\u0010e\u001a\u000204H\u0002J\b\u0010f\u001a\u000204H\u0002J\b\u0010g\u001a\u000204H\u0002J\u0010\u0010h\u001a\u0002042\u0006\u0010i\u001a\u00020\u0018H\u0002J\b\u0010j\u001a\u000204H\u0002J\b\u0010k\u001a\u000204H\u0002J\b\u0010l\u001a\u000204H\u0002J\b\u0010m\u001a\u000204H\u0002J\b\u0010n\u001a\u00020\u0018H\u0002J\b\u0010o\u001a\u000204H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u00020-X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u000e\u00102\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006p"}, d2 = {"Lcom/simplemobiletools/gallery/fragments/VideoFragment;", "Lcom/simplemobiletools/gallery/fragments/ViewPagerFragment;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "()V", "HIDE_PAUSE_DELAY", "", "MIN_SKIP_LENGTH", "", "PLAY_PAUSE_VISIBLE_ALPHA", "", "PROGRESS", "", "brightnessSideScroll", "Lcom/simplemobiletools/gallery/helpers/MediaSideScroll;", "mCurrTime", "mCurrTimeView", "Landroid/widget/TextView;", "mDuration", "mExoPlayer", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "mHidePauseHandler", "Landroid/os/Handler;", "mIsDragged", "", "mIsExoPlayerInitialized", "mIsFragmentVisible", "mIsFullscreen", "mIsPlaying", "mSeekBar", "Landroid/widget/SeekBar;", "mStoredBottomActions", "mStoredExtendedDetails", "mStoredHideExtendedDetails", "mStoredShowExtendedDetails", "mTextureView", "Landroid/view/TextureView;", "mTimeHolder", "Landroid/view/View;", "mTimerHandler", "mVideoSize", "Landroid/graphics/Point;", "mView", "mWasFragmentInit", "medium", "Lcom/simplemobiletools/gallery/models/Medium;", "getMedium", "()Lcom/simplemobiletools/gallery/models/Medium;", "setMedium", "(Lcom/simplemobiletools/gallery/models/Medium;)V", "volumeSideScroll", "checkExtendedDetails", "", "checkFullscreen", "cleanup", "fullscreenToggled", "isFullscreen", "getExtendedDetailsY", "height", "hasNavBar", "initExoPlayer", "initExoPlayerListeners", "initTimeHolder", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onProgressChanged", "seekBar", "progress", "fromUser", "onResume", "onSaveInstanceState", "outState", "onStartTrackingTouch", "onStopTrackingTouch", "onSurfaceTextureAvailable", "surface", "Landroid/graphics/SurfaceTexture;", "width", "onSurfaceTextureDestroyed", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "pauseVideo", "playVideo", "releaseExoPlayer", "schedulePlayPauseFadeOut", "setMenuVisibility", "menuVisible", "setProgress", "seconds", "setVideoSize", "setupPlayer", "setupTimeHolder", "setupTimer", "setupVideoDuration", "skip", "forward", "storeStateVariables", "toggleFullscreen", "togglePlayPause", "videoCompleted", "videoEnded", "videoPrepared", "gallery_debug"})
public final class VideoFragment extends com.simplemobiletools.gallery.fragments.ViewPagerFragment implements android.view.TextureView.SurfaceTextureListener, android.widget.SeekBar.OnSeekBarChangeListener {
    private final java.lang.String PROGRESS = "progress";
    private final int MIN_SKIP_LENGTH = 2000;
    private final long HIDE_PAUSE_DELAY = 2000L;
    private final float PLAY_PAUSE_VISIBLE_ALPHA = 0.8F;
    private android.view.TextureView mTextureView;
    private android.widget.TextView mCurrTimeView;
    private android.widget.SeekBar mSeekBar;
    private android.view.View mTimeHolder;
    private android.view.View mView;
    private com.google.android.exoplayer2.SimpleExoPlayer mExoPlayer;
    private android.graphics.Point mVideoSize;
    private android.os.Handler mTimerHandler;
    private android.os.Handler mHidePauseHandler;
    private boolean mIsPlaying;
    private boolean mIsDragged;
    private boolean mIsFullscreen;
    private boolean mIsFragmentVisible;
    private boolean mWasFragmentInit;
    private boolean mIsExoPlayerInitialized;
    private int mCurrTime;
    private int mDuration;
    private boolean mStoredShowExtendedDetails;
    private boolean mStoredHideExtendedDetails;
    private boolean mStoredBottomActions;
    private int mStoredExtendedDetails;
    private com.simplemobiletools.gallery.helpers.MediaSideScroll brightnessSideScroll;
    private com.simplemobiletools.gallery.helpers.MediaSideScroll volumeSideScroll;
    @org.jetbrains.annotations.NotNull()
    public com.simplemobiletools.gallery.models.Medium medium;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.gallery.models.Medium getMedium() {
        return null;
    }
    
    public final void setMedium(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.gallery.models.Medium p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void setMenuVisibility(boolean menuVisible) {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    private final void storeStateVariables() {
    }
    
    private final void setupPlayer() {
    }
    
    private final void initExoPlayer() {
    }
    
    private final void initExoPlayerListeners() {
    }
    
    private final void toggleFullscreen() {
    }
    
    private final void initTimeHolder() {
    }
    
    private final boolean hasNavBar() {
        return false;
    }
    
    private final void setupTimeHolder() {
    }
    
    private final void setupTimer() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void checkFullscreen() {
    }
    
    private final void togglePlayPause() {
    }
    
    public final void playVideo() {
    }
    
    private final void pauseVideo() {
    }
    
    private final void schedulePlayPauseFadeOut() {
    }
    
    private final boolean videoEnded() {
        return false;
    }
    
    private final void setProgress(int seconds) {
    }
    
    private final void setupVideoDuration() {
    }
    
    private final void videoPrepared() {
    }
    
    private final void videoCompleted() {
    }
    
    private final void cleanup() {
    }
    
    private final void releaseExoPlayer() {
    }
    
    @java.lang.Override()
    public void onSurfaceTextureSizeChanged(@org.jetbrains.annotations.Nullable()
    android.graphics.SurfaceTexture surface, int width, int height) {
    }
    
    @java.lang.Override()
    public void onSurfaceTextureUpdated(@org.jetbrains.annotations.Nullable()
    android.graphics.SurfaceTexture surface) {
    }
    
    @java.lang.Override()
    public boolean onSurfaceTextureDestroyed(@org.jetbrains.annotations.Nullable()
    android.graphics.SurfaceTexture surface) {
        return false;
    }
    
    @java.lang.Override()
    public void onSurfaceTextureAvailable(@org.jetbrains.annotations.Nullable()
    android.graphics.SurfaceTexture surface, int width, int height) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
    private final void setVideoSize() {
    }
    
    private final void checkExtendedDetails() {
    }
    
    private final void skip(boolean forward) {
    }
    
    @java.lang.Override()
    public void onProgressChanged(@org.jetbrains.annotations.NotNull()
    android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    }
    
    @java.lang.Override()
    public void onStartTrackingTouch(@org.jetbrains.annotations.NotNull()
    android.widget.SeekBar seekBar) {
    }
    
    @java.lang.Override()
    public void onStopTrackingTouch(@org.jetbrains.annotations.NotNull()
    android.widget.SeekBar seekBar) {
    }
    
    @java.lang.Override()
    public void fullscreenToggled(boolean isFullscreen) {
    }
    
    private final float getExtendedDetailsY(int height) {
        return 0.0F;
    }
    
    public VideoFragment() {
        super();
    }
}