package com.simplemobiletools.gallery.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00032\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH&J \u0010\t\u001a\u00020\u00032\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0006j\b\u0012\u0004\u0012\u00020\u000b`\bH&\u00a8\u0006\f"}, d2 = {"Lcom/simplemobiletools/gallery/interfaces/MediaOperationsListener;", "", "refreshItems", "", "selectedPaths", "paths", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "tryDeleteFiles", "fileDirItems", "Lcom/simplemobiletools/commons/models/FileDirItem;", "gallery_debug"})
public abstract interface MediaOperationsListener {
    
    public abstract void refreshItems();
    
    public abstract void tryDeleteFiles(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.commons.models.FileDirItem> fileDirItems);
    
    public abstract void selectedPaths(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> paths);
}