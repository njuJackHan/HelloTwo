package com.simplemobiletools.gallery.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/simplemobiletools/gallery/interfaces/FilterAdapterListener;", "", "getCurrentFilter", "Lcom/simplemobiletools/gallery/models/FilterItem;", "setCurrentFilter", "", "position", "", "gallery_debug"})
public abstract interface FilterAdapterListener {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.simplemobiletools.gallery.models.FilterItem getCurrentFilter();
    
    public abstract void setCurrentFilter(int position);
}