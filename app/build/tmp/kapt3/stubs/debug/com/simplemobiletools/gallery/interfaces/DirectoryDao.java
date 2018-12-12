package com.simplemobiletools.gallery.interfaces;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH\'J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\'J@\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0011H\'J(\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\'\u00a8\u0006\u001b"}, d2 = {"Lcom/simplemobiletools/gallery/interfaces/DirectoryDao;", "", "deleteDirPath", "", "path", "", "deleteRecycleBin", "getAll", "", "Lcom/simplemobiletools/gallery/models/Directory;", "insert", "directory", "insertAll", "directories", "updateDirectory", "thumbnail", "mediaCnt", "", "lastModified", "", "dateTaken", "size", "mediaTypes", "updateDirectoryAfterRename", "name", "newPath", "oldPath", "gallery_debug"})
public abstract interface DirectoryDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT path, thumbnail, filename, media_count, last_modified, date_taken, size, location, media_types FROM directories")
    public abstract java.util.List<com.simplemobiletools.gallery.models.Directory> getAll();
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.gallery.models.Directory directory);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.simplemobiletools.gallery.models.Directory> directories);
    
    @android.arch.persistence.room.Query(value = "DELETE FROM directories WHERE path = :path COLLATE NOCASE")
    public abstract void deleteDirPath(@org.jetbrains.annotations.NotNull()
    java.lang.String path);
    
    @android.arch.persistence.room.Query(value = "UPDATE OR REPLACE directories SET thumbnail = :thumbnail, media_count = :mediaCnt, last_modified = :lastModified, date_taken = :dateTaken, size = :size, media_types = :mediaTypes WHERE path = :path COLLATE NOCASE")
    public abstract void updateDirectory(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    java.lang.String thumbnail, int mediaCnt, long lastModified, long dateTaken, long size, int mediaTypes);
    
    @android.arch.persistence.room.Query(value = "UPDATE directories SET thumbnail = :thumbnail, filename = :name, path = :newPath WHERE path = :oldPath COLLATE NOCASE")
    public abstract void updateDirectoryAfterRename(@org.jetbrains.annotations.NotNull()
    java.lang.String thumbnail, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String newPath, @org.jetbrains.annotations.NotNull()
    java.lang.String oldPath);
    
    @android.arch.persistence.room.Query(value = "DELETE FROM directories WHERE path = \'recycle_bin\' COLLATE NOCASE")
    public abstract void deleteRecycleBin();
}