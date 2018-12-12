package com.simplemobiletools.gallery.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\bH\u0002J\b\u0010\u001c\u001a\u00020\bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/simplemobiletools/gallery/dialogs/ChangeGroupingDialog;", "Landroid/content/DialogInterface$OnClickListener;", "activity", "Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;", "path", "", "callback", "Lkotlin/Function0;", "", "(Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getActivity", "()Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;", "getCallback", "()Lkotlin/jvm/functions/Function0;", "config", "Lcom/simplemobiletools/gallery/helpers/Config;", "currGrouping", "", "getPath", "()Ljava/lang/String;", "pathToUse", "view", "Landroid/view/View;", "onClick", "dialog", "Landroid/content/DialogInterface;", "which", "setupGroupRadio", "setupOrderRadio", "gallery_debug"})
public final class ChangeGroupingDialog implements android.content.DialogInterface.OnClickListener {
    private int currGrouping;
    private com.simplemobiletools.gallery.helpers.Config config;
    private final java.lang.String pathToUse = null;
    private android.view.View view;
    @org.jetbrains.annotations.NotNull()
    private final com.simplemobiletools.commons.activities.BaseSimpleActivity activity = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String path = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> callback = null;
    
    private final void setupGroupRadio() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getCallback() {
        return null;
    }
    
    public ChangeGroupingDialog(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
        super();
    }
}