package com.simplemobiletools.gallery.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J \u0010\n\u001a\u00020\u00032\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0005j\b\u0012\u0004\u0012\u00020\f`\u0007H&\u00a8\u0006\r"}, d2 = {"Lcom/simplemobiletools/gallery/interfaces/DirectoryOperationsListener;", "", "deleteFolders", "", "folders", "Ljava/util/ArrayList;", "Ljava/io/File;", "Lkotlin/collections/ArrayList;", "recheckPinnedFolders", "refreshItems", "updateDirectories", "directories", "Lcom/simplemobiletools/gallery/models/Directory;", "gallery_debug"})
public abstract interface DirectoryOperationsListener {
    
    public abstract void refreshItems();
    
    public abstract void deleteFolders(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.io.File> folders);
    
    public abstract void recheckPinnedFolders();
    
    public abstract void updateDirectories(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.gallery.models.Directory> directories);
}