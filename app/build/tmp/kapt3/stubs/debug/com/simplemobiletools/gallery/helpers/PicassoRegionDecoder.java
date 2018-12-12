package com.simplemobiletools.gallery.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/simplemobiletools/gallery/helpers/PicassoRegionDecoder;", "Lcom/davemorrissey/labs/subscaleview/decoder/ImageRegionDecoder;", "()V", "decoder", "Landroid/graphics/BitmapRegionDecoder;", "decoderLock", "", "decodeRegion", "Landroid/graphics/Bitmap;", "rect", "Landroid/graphics/Rect;", "sampleSize", "", "init", "Landroid/graphics/Point;", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "isReady", "", "recycle", "", "gallery_debug"})
public final class PicassoRegionDecoder implements com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder {
    private android.graphics.BitmapRegionDecoder decoder;
    private final java.lang.Object decoderLock = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.graphics.Point init(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.graphics.Bitmap decodeRegion(@org.jetbrains.annotations.NotNull()
    android.graphics.Rect rect, int sampleSize) {
        return null;
    }
    
    @java.lang.Override()
    public boolean isReady() {
        return false;
    }
    
    @java.lang.Override()
    public void recycle() {
    }
    
    public PicassoRegionDecoder() {
        super();
    }
}