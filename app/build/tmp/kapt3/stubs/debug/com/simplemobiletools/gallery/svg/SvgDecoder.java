package com.simplemobiletools.gallery.svg;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J0\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/simplemobiletools/gallery/svg/SvgDecoder;", "Lcom/bumptech/glide/load/ResourceDecoder;", "Ljava/io/InputStream;", "Lcom/caverock/androidsvg/SVG;", "()V", "decode", "Lcom/bumptech/glide/load/engine/Resource;", "source", "width", "", "height", "options", "Lcom/bumptech/glide/load/Options;", "handles", "", "gallery_debug"})
public final class SvgDecoder implements com.bumptech.glide.load.ResourceDecoder<java.io.InputStream, com.caverock.androidsvg.SVG> {
    
    @java.lang.Override()
    public boolean handles(@org.jetbrains.annotations.NotNull()
    java.io.InputStream source, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.load.Options options) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.bumptech.glide.load.engine.Resource<com.caverock.androidsvg.SVG> decode(@org.jetbrains.annotations.NotNull()
    java.io.InputStream source, int width, int height, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.load.Options options) {
        return null;
    }
    
    public SvgDecoder() {
        super();
    }
}