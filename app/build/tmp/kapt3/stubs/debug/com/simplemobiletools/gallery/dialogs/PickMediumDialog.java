package com.simplemobiletools.gallery.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\n0\u0007\u00a2\u0006\u0002\u0010\u000bJ \u0010*\u001a\u00020\n2\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` H\u0002J\b\u0010,\u001a\u00020\nH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR,\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\n0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR*\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0019\u0010%\u001a\n \'*\u0004\u0018\u00010&0&\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)\u00a8\u0006-"}, d2 = {"Lcom/simplemobiletools/gallery/dialogs/PickMediumDialog;", "", "activity", "Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;", "path", "", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "(Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getActivity", "()Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "dialog", "Landroid/support/v7/app/AlertDialog;", "getDialog", "()Landroid/support/v7/app/AlertDialog;", "setDialog", "(Landroid/support/v7/app/AlertDialog;)V", "isGridViewType", "", "()Z", "setGridViewType", "(Z)V", "getPath", "()Ljava/lang/String;", "shownMedia", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/gallery/models/ThumbnailItem;", "Lkotlin/collections/ArrayList;", "getShownMedia", "()Ljava/util/ArrayList;", "setShownMedia", "(Ljava/util/ArrayList;)V", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getView", "()Landroid/view/View;", "gotMedia", "media", "showOtherFolder", "gallery_debug"})
public final class PickMediumDialog {
    @org.jetbrains.annotations.NotNull()
    private android.support.v7.app.AlertDialog dialog;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.simplemobiletools.gallery.models.ThumbnailItem> shownMedia;
    private final android.view.View view = null;
    private boolean isGridViewType;
    @org.jetbrains.annotations.NotNull()
    private final com.simplemobiletools.commons.activities.BaseSimpleActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String path = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> callback = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.app.AlertDialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.NotNull()
    android.support.v7.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.simplemobiletools.gallery.models.ThumbnailItem> getShownMedia() {
        return null;
    }
    
    public final void setShownMedia(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.gallery.models.ThumbnailItem> p0) {
    }
    
    public final android.view.View getView() {
        return null;
    }
    
    public final boolean isGridViewType() {
        return false;
    }
    
    public final void setGridViewType(boolean p0) {
    }
    
    private final void showOtherFolder() {
    }
    
    private final void gotMedia(java.util.ArrayList<com.simplemobiletools.gallery.models.ThumbnailItem> media) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.commons.activities.BaseSimpleActivity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getCallback() {
        return null;
    }
    
    public PickMediumDialog(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback) {
        super();
    }
}