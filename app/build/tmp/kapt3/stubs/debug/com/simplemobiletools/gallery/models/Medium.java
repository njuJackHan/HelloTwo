package com.simplemobiletools.gallery.models;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "media", indices = {@android.arch.persistence.room.Index(unique = true, value = {"full_path"})})
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001JBW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010,\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\t\u0010-\u001a\u00020\u0004H\u00c6\u0003J\t\u0010.\u001a\u00020\u0006H\u00c6\u0003J\t\u0010/\u001a\u00020\u0006H\u00c6\u0003J\t\u00100\u001a\u00020\u0006H\u00c6\u0003J\t\u00101\u001a\u00020\u0004H\u00c6\u0003J\t\u00102\u001a\u00020\u0004H\u00c6\u0003J\t\u00103\u001a\u00020\u0004H\u00c6\u0003J\t\u00104\u001a\u00020\rH\u00c6\u0003J\t\u00105\u001a\u00020\u000fH\u00c6\u0003Jt\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u000f2\b\u00109\u001a\u0004\u0018\u00010:H\u00d6\u0003J\u000e\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\rJ\u0010\u0010=\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u0004H\u0002J\u000e\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\rJ\u0006\u0010A\u001a\u00020\u000fJ\t\u0010B\u001a\u00020\rH\u00d6\u0001J\u0006\u0010C\u001a\u00020\u000fJ\u0006\u0010D\u001a\u00020\u000fJ\u0006\u0010E\u001a\u00020\u000fJ\u0006\u0010F\u001a\u00020\u000fJ\u0006\u0010G\u001a\u00020\u000fJ\u0006\u0010H\u001a\u00020\u000fJ\t\u0010I\u001a\u00020\u0006H\u00d6\u0001R\u001e\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0013R\u001e\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u00a8\u0006K"}, d2 = {"Lcom/simplemobiletools/gallery/models/Medium;", "Ljava/io/Serializable;", "Lcom/simplemobiletools/gallery/models/ThumbnailItem;", "id", "", "name", "", "path", "parentPath", "modified", "taken", "size", "type", "", "isFavorite", "", "deletedTS", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJIZJ)V", "getDeletedTS", "()J", "setDeletedTS", "(J)V", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "()Z", "setFavorite", "(Z)V", "getModified", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getParentPath", "setParentPath", "getPath", "setPath", "getSize", "getTaken", "setTaken", "getType", "()I", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJIZJ)Lcom/simplemobiletools/gallery/models/Medium;", "equals", "other", "", "getBubbleText", "sorting", "getDayStartTS", "ts", "getGroupingKey", "groupBy", "getIsInRecycleBin", "hashCode", "isGIF", "isHidden", "isImage", "isRaw", "isSVG", "isVideo", "toString", "Companion", "gallery_debug"})
public final class Medium extends com.simplemobiletools.gallery.models.ThumbnailItem implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.PrimaryKey(autoGenerate = true)
    private java.lang.Long id;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "filename")
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "full_path")
    private java.lang.String path;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "parent_path")
    private java.lang.String parentPath;
    @android.arch.persistence.room.ColumnInfo(name = "last_modified")
    private final long modified = 0L;
    @android.arch.persistence.room.ColumnInfo(name = "date_taken")
    private long taken;
    @android.arch.persistence.room.ColumnInfo(name = "size")
    private final long size = 0L;
    @android.arch.persistence.room.ColumnInfo(name = "type")
    private final int type = 0;
    @android.arch.persistence.room.ColumnInfo(name = "is_favorite")
    private boolean isFavorite;
    @android.arch.persistence.room.ColumnInfo(name = "deleted_ts")
    private long deletedTS;
    private static final long serialVersionUID = -6553149366975655L;
    public static final com.simplemobiletools.gallery.models.Medium.Companion Companion = null;
    
    public final boolean isGIF() {
        return false;
    }
    
    public final boolean isImage() {
        return false;
    }
    
    public final boolean isVideo() {
        return false;
    }
    
    public final boolean isRaw() {
        return false;
    }
    
    public final boolean isSVG() {
        return false;
    }
    
    public final boolean isHidden() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBubbleText(int sorting) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGroupingKey(int groupBy) {
        return null;
    }
    
    public final boolean getIsInRecycleBin() {
        return false;
    }
    
    private final java.lang.String getDayStartTS(long ts) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPath() {
        return null;
    }
    
    public final void setPath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getParentPath() {
        return null;
    }
    
    public final void setParentPath(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getModified() {
        return 0L;
    }
    
    public final long getTaken() {
        return 0L;
    }
    
    public final void setTaken(long p0) {
    }
    
    public final long getSize() {
        return 0L;
    }
    
    public final int getType() {
        return 0;
    }
    
    public final boolean isFavorite() {
        return false;
    }
    
    public final void setFavorite(boolean p0) {
    }
    
    public final long getDeletedTS() {
        return 0L;
    }
    
    public final void setDeletedTS(long p0) {
    }
    
    public Medium(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    java.lang.String parentPath, long modified, long taken, long size, int type, boolean isFavorite, long deletedTS) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long component6() {
        return 0L;
    }
    
    public final long component7() {
        return 0L;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final long component10() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.gallery.models.Medium copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    java.lang.String parentPath, long modified, long taken, long size, int type, boolean isFavorite, long deletedTS) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/simplemobiletools/gallery/models/Medium$Companion;", "", "()V", "serialVersionUID", "", "gallery_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}