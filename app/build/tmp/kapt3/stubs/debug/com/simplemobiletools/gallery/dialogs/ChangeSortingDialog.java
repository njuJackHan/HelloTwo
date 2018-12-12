package com.simplemobiletools.gallery.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014H\u0016J\b\u0010\u001f\u001a\u00020\u000bH\u0002J\b\u0010 \u001a\u00020\u000bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/simplemobiletools/gallery/dialogs/ChangeSortingDialog;", "Landroid/content/DialogInterface$OnClickListener;", "activity", "Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;", "isDirectorySorting", "", "showFolderCheckbox", "path", "", "callback", "Lkotlin/Function0;", "", "(Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;ZZLjava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getActivity", "()Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;", "getCallback", "()Lkotlin/jvm/functions/Function0;", "config", "Lcom/simplemobiletools/gallery/helpers/Config;", "currSorting", "", "()Z", "getPath", "()Ljava/lang/String;", "pathToUse", "view", "Landroid/view/View;", "onClick", "dialog", "Landroid/content/DialogInterface;", "which", "setupOrderRadio", "setupSortRadio", "gallery_debug"})
public final class ChangeSortingDialog implements android.content.DialogInterface.OnClickListener {
    private int currSorting;
    private com.simplemobiletools.gallery.helpers.Config config;
    private java.lang.String pathToUse;
    private android.view.View view;
    @org.jetbrains.annotations.NotNull()
    private final com.simplemobiletools.commons.activities.BaseSimpleActivity activity = null;
    private final boolean isDirectorySorting = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String path = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> callback = null;
    
    private final void setupSortRadio() {
    }
    
    private final void setupOrderRadio() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog, int which) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.simplemobiletools.commons.activities.BaseSimpleActivity getActivity() {
        return null;
    }
    
    public final boolean isDirectorySorting() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getCallback() {
        return null;
    }
    
    public ChangeSortingDialog(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity activity, boolean isDirectorySorting, boolean showFolderCheckbox, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
        super();
    }
}