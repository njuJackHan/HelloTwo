package com.simplemobiletools.gallery.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u001bH\u0002J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020\u001bH\u0002J\b\u0010(\u001a\u00020\u001bH\u0002J`\u0010)\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010 \u001a\u00020!2\u0006\u0010*\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010\u001426\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u000e0\fJ\u0010\u00100\u001a\u00020\u00112\u0006\u00101\u001a\u00020&H\u0016J\u0010\u00102\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u001bH\u0002J\u0010\u00103\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u001bH\u0002J\u0010\u00104\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u001bH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/simplemobiletools/gallery/helpers/MediaSideScroll;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "SLIDE_INFO_FADE_DELAY", "", "activity", "Landroid/app/Activity;", "callback", "Lkotlin/Function2;", "", "", "dragThreshold", "mIsBrightnessScroll", "", "mLastTouchY", "mParentView", "Landroid/view/ViewGroup;", "mPassTouches", "mSlideInfoFadeHandler", "Landroid/os/Handler;", "mSlideInfoText", "", "mTempBrightness", "", "mTouchDownTime", "mTouchDownValue", "mTouchDownX", "mTouchDownY", "slideInfoView", "Landroid/widget/TextView;", "brightnessPercentChanged", "percent", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "getCurrentBrightness", "getCurrentVolume", "initialize", "isBrightness", "parentView", "Lkotlin/ParameterName;", "name", "x", "y", "onTouchEvent", "event", "percentChanged", "showValue", "volumePercentChanged", "gallery_debug"})
public final class MediaSideScroll extends android.widget.RelativeLayout {
    private final long SLIDE_INFO_FADE_DELAY = 1000L;
    private float mTouchDownX;
    private float mTouchDownY;
    private long mTouchDownTime;
    private int mTouchDownValue;
    private int mTempBrightness;
    private float mLastTouchY;
    private boolean mIsBrightnessScroll;
    private boolean mPassTouches;
    private float dragThreshold;
    private java.lang.String mSlideInfoText;
    private android.os.Handler mSlideInfoFadeHandler;
    private android.view.ViewGroup mParentView;
    private android.app.Activity activity;
    private android.widget.TextView slideInfoView;
    private kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, kotlin.Unit> callback;
    private java.util.HashMap _$_findViewCache;
    
    public final void initialize(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.widget.TextView slideInfoView, boolean isBrightness, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parentView, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, kotlin.Unit> callback) {
    }
    
    @java.lang.Override()
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent ev) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    private final int getCurrentVolume() {
        return 0;
    }
    
    private final int getCurrentBrightness() {
        return 0;
    }
    
    private final void percentChanged(int percent) {
    }
    
    private final void volumePercentChanged(int percent) {
    }
    
    private final void brightnessPercentChanged(int percent) {
    }
    
    private final void showValue(int percent) {
    }
    
    public MediaSideScroll(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
}