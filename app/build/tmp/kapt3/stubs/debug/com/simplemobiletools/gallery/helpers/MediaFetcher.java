package com.simplemobiletools.gallery.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0002J:\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00102\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J \u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011H\u0002J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J(\u0010&\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020(2\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011H\u0002JD\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010*\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J<\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00180\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010*\u001a\u00020(2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010*\u001a\u00020(H\u0002J\u0010\u0010-\u001a\u00020\u00112\u0006\u0010*\u001a\u00020(H\u0002J\"\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00102\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00180\u00102\u0006\u00101\u001a\u00020\u0011J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u00103\u001a\u000204H\u0002J\u001c\u00105\u001a\u00020\u000e2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00180\u00102\u0006\u00106\u001a\u00020(R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u00067"}, d2 = {"Lcom/simplemobiletools/gallery/helpers/MediaFetcher;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "shouldStop", "", "getShouldStop", "()Z", "setShouldStop", "(Z)V", "addFolder", "", "curFolders", "Ljava/util/ArrayList;", "", "folder", "formatDate", "timestamp", "getFileTypeString", "key", "getFilesFrom", "Lcom/simplemobiletools/gallery/models/Medium;", "curPath", "isPickImage", "isPickVideo", "getProperDateTaken", "favoritePaths", "getFinalDate", "date", "today", "yesterday", "getFolderDateTakens", "Ljava/util/HashMap;", "", "getFoldersToScan", "getFormattedKey", "grouping", "", "getMediaInFolder", "filterMedia", "getMediaOnOTG", "getSelectionArgsQuery", "getSelectionQuery", "groupMedia", "Lcom/simplemobiletools/gallery/models/ThumbnailItem;", "media", "path", "parseCursor", "cursor", "Landroid/database/Cursor;", "sortMedia", "sorting", "gallery_debug"})
public final class MediaFetcher {
    private boolean shouldStop;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    public final boolean getShouldStop() {
        return false;
    }
    
    public final void setShouldStop(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.gallery.models.Medium> getFilesFrom(@org.jetbrains.annotations.NotNull()
    java.lang.String curPath, boolean isPickImage, boolean isPickVideo, boolean getProperDateTaken, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> favoritePaths) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getFoldersToScan() {
        return null;
    }
    
    private final java.lang.String getSelectionQuery(int filterMedia) {
        return null;
    }
    
    private final java.util.ArrayList<java.lang.String> getSelectionArgsQuery(int filterMedia) {
        return null;
    }
    
    private final java.util.ArrayList<java.lang.String> parseCursor(android.database.Cursor cursor) {
        return null;
    }
    
    private final void addFolder(java.util.ArrayList<java.lang.String> curFolders, java.lang.String folder) {
    }
    
    private final java.util.ArrayList<com.simplemobiletools.gallery.models.Medium> getMediaInFolder(java.lang.String folder, boolean isPickImage, boolean isPickVideo, int filterMedia, boolean getProperDateTaken, java.util.ArrayList<java.lang.String> favoritePaths) {
        return null;
    }
    
    private final java.util.ArrayList<com.simplemobiletools.gallery.models.Medium> getMediaOnOTG(java.lang.String folder, boolean isPickImage, boolean isPickVideo, int filterMedia, java.util.ArrayList<java.lang.String> favoritePaths) {
        return null;
    }
    
    private final java.util.HashMap<java.lang.String, java.lang.Long> getFolderDateTakens(java.lang.String folder) {
        return null;
    }
    
    public final void sortMedia(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.gallery.models.Medium> media, int sorting) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.gallery.models.ThumbnailItem> groupMedia(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.gallery.models.Medium> media, @org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return null;
    }
    
    private final java.lang.String getFormattedKey(java.lang.String key, int grouping, java.lang.String today, java.lang.String yesterday) {
        return null;
    }
    
    private final java.lang.String getFinalDate(java.lang.String date, java.lang.String today, java.lang.String yesterday) {
        return null;
    }
    
    private final java.lang.String formatDate(java.lang.String timestamp) {
        return null;
    }
    
    private final java.lang.String getFileTypeString(java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public MediaFetcher(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}