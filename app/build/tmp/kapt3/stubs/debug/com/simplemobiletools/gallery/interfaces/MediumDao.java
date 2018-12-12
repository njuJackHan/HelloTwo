package com.simplemobiletools.gallery.interfaces;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\nH\'J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tH\'J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\'J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\'J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0014H\'J(\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\'\u00a8\u0006\u001f"}, d2 = {"Lcom/simplemobiletools/gallery/interfaces/MediumDao;", "", "clearFavorites", "", "clearRecycleBin", "deleteMediumPath", "path", "", "getDeletedMedia", "", "Lcom/simplemobiletools/gallery/models/Medium;", "getFavoritePaths", "getFavorites", "getMediaFromPath", "insert", "medium", "insertAll", "media", "updateDeleted", "deletedTS", "", "updateFavorite", "isFavorite", "", "updateFavoriteDateTaken", "dateTaken", "updateMedium", "oldPath", "newParentPath", "newFilename", "newFullPath", "gallery_debug"})
public abstract interface MediumDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT filename, full_path, parent_path, last_modified, date_taken, size, type, is_favorite, deleted_ts FROM media WHERE deleted_ts = 0 AND parent_path = :path COLLATE NOCASE")
    public abstract java.util.List<com.simplemobiletools.gallery.models.Medium> getMediaFromPath(@org.jetbrains.annotations.NotNull()
    java.lang.String path);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT filename, full_path, parent_path, last_modified, date_taken, size, type, is_favorite, deleted_ts FROM media WHERE deleted_ts = 0 AND is_favorite = 1")
    public abstract java.util.List<com.simplemobiletools.gallery.models.Medium> getFavorites();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT full_path FROM media WHERE deleted_ts = 0 AND is_favorite = 1")
    public abstract java.util.List<java.lang.String> getFavoritePaths();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT filename, full_path, parent_path, last_modified, date_taken, size, type, is_favorite, deleted_ts FROM media WHERE deleted_ts != 0")
    public abstract java.util.List<com.simplemobiletools.gallery.models.Medium> getDeletedMedia();
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.gallery.models.Medium medium);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.simplemobiletools.gallery.models.Medium> media);
    
    @android.arch.persistence.room.Query(value = "DELETE FROM media WHERE full_path = :path COLLATE NOCASE")
    public abstract void deleteMediumPath(@org.jetbrains.annotations.NotNull()
    java.lang.String path);
    
    @android.arch.persistence.room.Query(value = "UPDATE OR REPLACE media SET filename = :newFilename, full_path = :newFullPath, parent_path = :newParentPath WHERE full_path = :oldPath COLLATE NOCASE")
    public abstract void updateMedium(@org.jetbrains.annotations.NotNull()
    java.lang.String oldPath, @org.jetbrains.annotations.NotNull()
    java.lang.String newParentPath, @org.jetbrains.annotations.NotNull()
    java.lang.String newFilename, @org.jetbrains.annotations.NotNull()
    java.lang.String newFullPath);
    
    @android.arch.persistence.room.Query(value = "UPDATE media SET is_favorite = :isFavorite WHERE full_path = :path COLLATE NOCASE")
    public abstract void updateFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String path, boolean isFavorite);
    
    @android.arch.persistence.room.Query(value = "UPDATE media SET deleted_ts = :deletedTS WHERE full_path = :path COLLATE NOCASE")
    public abstract void updateDeleted(@org.jetbrains.annotations.NotNull()
    java.lang.String path, long deletedTS);
    
    @android.arch.persistence.room.Query(value = "UPDATE media SET date_taken = :dateTaken WHERE full_path = :path COLLATE NOCASE")
    public abstract void updateFavoriteDateTaken(@org.jetbrains.annotations.NotNull()
    java.lang.String path, long dateTaken);
    
    @android.arch.persistence.room.Query(value = "DELETE FROM media WHERE deleted_ts != 0")
    public abstract void clearRecycleBin();
    
    @android.arch.persistence.room.Query(value = "UPDATE media SET is_favorite = 0")
    public abstract void clearFavorites();
}