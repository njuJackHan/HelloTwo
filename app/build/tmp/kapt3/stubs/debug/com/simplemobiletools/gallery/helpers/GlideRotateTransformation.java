package com.simplemobiletools.gallery.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0014J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/simplemobiletools/gallery/helpers/GlideRotateTransformation;", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "rotateRotationAngle", "", "(I)V", "getRotateRotationAngle", "()I", "transform", "Landroid/graphics/Bitmap;", "pool", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "bitmap", "outWidth", "outHeight", "updateDiskCacheKey", "", "messageDigest", "Ljava/security/MessageDigest;", "gallery_debug"})
public final class GlideRotateTransformation extends com.bumptech.glide.load.resource.bitmap.BitmapTransformation {
    private final int rotateRotationAngle = 0;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.graphics.Bitmap transform(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool pool, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, int outWidth, int outHeight) {
        return null;
    }
    
    @java.lang.Override()
    public void updateDiskCacheKey(@org.jetbrains.annotations.NotNull()
    java.security.MessageDigest messageDigest) {
    }
    
    public final int getRotateRotationAngle() {
        return 0;
    }
    
    public GlideRotateTransformation(int rotateRotationAngle) {
        super();
    }
}