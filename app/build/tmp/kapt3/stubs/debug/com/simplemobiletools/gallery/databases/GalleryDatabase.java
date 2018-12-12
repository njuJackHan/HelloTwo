package com.simplemobiletools.gallery.databases;

import java.lang.System;

@android.arch.persistence.room.Database(entities = {com.simplemobiletools.gallery.models.Directory.class, com.simplemobiletools.gallery.models.Medium.class}, version = 4)
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/simplemobiletools/gallery/databases/GalleryDatabase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "DirectoryDao", "Lcom/simplemobiletools/gallery/interfaces/DirectoryDao;", "MediumDao", "Lcom/simplemobiletools/gallery/interfaces/MediumDao;", "Companion", "gallery_debug"})
public abstract class GalleryDatabase extends android.arch.persistence.room.RoomDatabase {
    private static com.simplemobiletools.gallery.databases.GalleryDatabase db;
    public static final com.simplemobiletools.gallery.databases.GalleryDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.simplemobiletools.gallery.interfaces.DirectoryDao DirectoryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.simplemobiletools.gallery.interfaces.MediumDao MediumDao();
    
    public GalleryDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/simplemobiletools/gallery/databases/GalleryDatabase$Companion;", "", "()V", "db", "Lcom/simplemobiletools/gallery/databases/GalleryDatabase;", "destroyInstance", "", "getInstance", "context", "Landroid/content/Context;", "gallery_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.simplemobiletools.gallery.databases.GalleryDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        public final void destroyInstance() {
        }
        
        private Companion() {
            super();
        }
    }
}