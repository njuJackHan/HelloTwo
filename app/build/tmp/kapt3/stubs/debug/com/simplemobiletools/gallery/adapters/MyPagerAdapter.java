package com.simplemobiletools.gallery.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u000eJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0019H\u0016J\u0018\u0010 \u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u000e\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006&"}, d2 = {"Lcom/simplemobiletools/gallery/adapters/MyPagerAdapter;", "Landroid/support/v4/app/FragmentStatePagerAdapter;", "activity", "Lcom/simplemobiletools/gallery/activities/ViewPagerActivity;", "fm", "Landroid/support/v4/app/FragmentManager;", "media", "", "Lcom/simplemobiletools/gallery/models/Medium;", "(Lcom/simplemobiletools/gallery/activities/ViewPagerActivity;Landroid/support/v4/app/FragmentManager;Ljava/util/List;)V", "getActivity", "()Lcom/simplemobiletools/gallery/activities/ViewPagerActivity;", "fragments", "Ljava/util/HashMap;", "", "Lcom/simplemobiletools/gallery/fragments/ViewPagerFragment;", "Lkotlin/collections/HashMap;", "getMedia", "()Ljava/util/List;", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "any", "", "getCount", "getCurrentFragment", "getItem", "Landroid/support/v4/app/Fragment;", "getItemPosition", "item", "instantiateItem", "saveState", "Landroid/os/Parcelable;", "toggleFullscreen", "isFullscreen", "", "gallery_debug"})
public final class MyPagerAdapter extends android.support.v4.app.FragmentStatePagerAdapter {
    private final java.util.HashMap<java.lang.Integer, com.simplemobiletools.gallery.fragments.ViewPagerFragment> fragments = null;
    @org.jetbrains.annotations.NotNull()
    private final com.simplemobiletools.gallery.activities.ViewPagerActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.simplemobiletools.gallery.models.Medium> media = null;
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.support.v4.app.Fragment getItem(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemPosition(@org.jetbrains.annotations.NotNull()
    java.lang.Object item) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object instantiateItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int position) {
        return null;
    }
    
    @java.lang.Override()
    public void destroyItem(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup container, int position, @org.jetbrains.annotations.NotNull()
    java.lang.Object any) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.simplemobiletools.gallery.fragments.ViewPagerFragment getCurrentFragment(int position) {
        return null;
    }
    
    public final void toggleFullscreen(boolean isFullscreen) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.Parcelable saveState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.gallery.activities.ViewPagerActivity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.simplemobiletools.gallery.models.Medium> getMedia() {
        return null;
    }
    
    public MyPagerAdapter(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.gallery.activities.ViewPagerActivity activity, @org.jetbrains.annotations.NotNull()
    android.support.v4.app.FragmentManager fm, @org.jetbrains.annotations.NotNull()
    java.util.List<com.simplemobiletools.gallery.models.Medium> media) {
        super(null);
    }
}