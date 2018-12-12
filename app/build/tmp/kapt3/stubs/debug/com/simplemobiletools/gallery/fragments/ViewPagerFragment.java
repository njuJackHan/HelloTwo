package com.simplemobiletools.gallery.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/simplemobiletools/gallery/fragments/ViewPagerFragment;", "Landroid/support/v4/app/Fragment;", "()V", "listener", "Lcom/simplemobiletools/gallery/fragments/ViewPagerFragment$FragmentListener;", "getListener", "()Lcom/simplemobiletools/gallery/fragments/ViewPagerFragment$FragmentListener;", "setListener", "(Lcom/simplemobiletools/gallery/fragments/ViewPagerFragment$FragmentListener;)V", "fullscreenToggled", "", "isFullscreen", "", "getMediumExtendedDetails", "", "medium", "Lcom/simplemobiletools/gallery/models/Medium;", "getPathToLoad", "FragmentListener", "gallery_debug"})
public abstract class ViewPagerFragment extends android.support.v4.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private com.simplemobiletools.gallery.fragments.ViewPagerFragment.FragmentListener listener;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.simplemobiletools.gallery.fragments.ViewPagerFragment.FragmentListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    com.simplemobiletools.gallery.fragments.ViewPagerFragment.FragmentListener p0) {
    }
    
    public abstract void fullscreenToggled(boolean isFullscreen);
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMediumExtendedDetails(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.gallery.models.Medium medium) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPathToLoad(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.gallery.models.Medium medium) {
        return null;
    }
    
    public ViewPagerFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/simplemobiletools/gallery/fragments/ViewPagerFragment$FragmentListener;", "", "fragmentClicked", "", "goToNextItem", "goToPrevItem", "videoEnded", "", "gallery_debug"})
    public static abstract interface FragmentListener {
        
        public abstract void fragmentClicked();
        
        public abstract boolean videoEnded();
        
        public abstract void goToPrevItem();
        
        public abstract void goToNextItem();
    }
}