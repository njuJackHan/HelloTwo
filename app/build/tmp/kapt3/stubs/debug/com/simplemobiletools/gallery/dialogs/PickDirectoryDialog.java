package com.simplemobiletools.gallery.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007\u00a2\u0006\u0002\u0010\fJ \u0010-\u001a\u00020\u000b2\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001fH\u0002J\b\u0010/\u001a\u00020\u000bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR,\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001e0\u001dj\b\u0012\u0004\u0012\u00020\u001e`\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\"\u0010&\u001a\n (*\u0004\u0018\u00010\'0\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u00060"}, d2 = {"Lcom/simplemobiletools/gallery/dialogs/PickDirectoryDialog;", "", "activity", "Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;", "sourcePath", "", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "path", "", "(Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getActivity", "()Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "dialog", "Landroid/support/v7/app/AlertDialog;", "getDialog", "()Landroid/support/v7/app/AlertDialog;", "setDialog", "(Landroid/support/v7/app/AlertDialog;)V", "isGridViewType", "", "()Z", "setGridViewType", "(Z)V", "shownDirectories", "Ljava/util/ArrayList;", "Lcom/simplemobiletools/gallery/models/Directory;", "Lkotlin/collections/ArrayList;", "getShownDirectories", "()Ljava/util/ArrayList;", "setShownDirectories", "(Ljava/util/ArrayList;)V", "getSourcePath", "()Ljava/lang/String;", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "gotDirectories", "newDirs", "showOtherFolder", "gallery_debug"})
public final class PickDirectoryDialog {
    @org.jetbrains.annotations.NotNull()
    private android.support.v7.app.AlertDialog dialog;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.simplemobiletools.gallery.models.Directory> shownDirectories;
    private android.view.View view;
    private boolean isGridViewType;
    @org.jetbrains.annotations.NotNull()
    private final com.simplemobiletools.commons.activities.BaseSimpleActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sourcePath = null;
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
    public final java.util.ArrayList<com.simplemobiletools.gallery.models.Directory> getShownDirectories() {
        return null;
    }
    
    public final void setShownDirectories(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.gallery.models.Directory> p0) {
    }
    
    public final android.view.View getView() {
        return null;
    }
    
    public final void setView(android.view.View p0) {
    }
    
    public final boolean isGridViewType() {
        return false;
    }
    
    public final void setGridViewType(boolean p0) {
    }
    
    private final void showOtherFolder() {
    }
    
    private final void gotDirectories(java.util.ArrayList<com.simplemobiletools.gallery.models.Directory> newDirs) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.commons.activities.BaseSimpleActivity getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSourcePath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getCallback() {
        return null;
    }
    
    public PickDirectoryDialog(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String sourcePath, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback) {
        super();
    }
}