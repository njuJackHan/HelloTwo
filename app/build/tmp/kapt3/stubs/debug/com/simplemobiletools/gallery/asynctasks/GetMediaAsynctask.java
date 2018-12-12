package com.simplemobiletools.gallery.asynctasks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BZ\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\'\u0010\r\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000e\u00a2\u0006\u0002\u0010\u0013J\'\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020 \"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0014J\u0006\u0010#\u001a\u00020\u0012R2\u0010\r\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018\u00a8\u0006$"}, d2 = {"Lcom/simplemobiletools/gallery/asynctasks/GetMediaAsynctask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/gallery/models/ThumbnailItem;", "context", "Landroid/content/Context;", "mPath", "", "isPickImage", "", "isPickVideo", "showAll", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "media", "", "(Landroid/content/Context;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function1;)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "getContext", "()Landroid/content/Context;", "()Z", "getMPath", "()Ljava/lang/String;", "mediaFetcher", "Lcom/simplemobiletools/gallery/helpers/MediaFetcher;", "getShowAll", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/util/ArrayList;", "onPostExecute", "stopFetching", "gallery_debug"})
public final class GetMediaAsynctask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.util.ArrayList<com.simplemobiletools.gallery.models.ThumbnailItem>> {
    private final com.simplemobiletools.gallery.helpers.MediaFetcher mediaFetcher = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mPath = null;
    private final boolean isPickImage = false;
    private final boolean isPickVideo = false;
    private final boolean showAll = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.util.ArrayList<com.simplemobiletools.gallery.models.ThumbnailItem>, kotlin.Unit> callback = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.util.ArrayList<com.simplemobiletools.gallery.models.ThumbnailItem> doInBackground(@org.jetbrains.annotations.NotNull()
    java.lang.Void... params) {
        return null;
    }
    
    @java.lang.Override()
    protected void onPostExecute(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.gallery.models.ThumbnailItem> media) {
    }
    
    public final void stopFetching() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMPath() {
        return null;
    }
    
    public final boolean isPickImage() {
        return false;
    }
    
    public final boolean isPickVideo() {
        return false;
    }
    
    public final boolean getShowAll() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.util.ArrayList<com.simplemobiletools.gallery.models.ThumbnailItem>, kotlin.Unit> getCallback() {
        return null;
    }
    
    public GetMediaAsynctask(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String mPath, boolean isPickImage, boolean isPickVideo, boolean showAll, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.simplemobiletools.gallery.models.ThumbnailItem>, kotlin.Unit> callback) {
        super();
    }
}