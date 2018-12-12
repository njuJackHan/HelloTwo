package com.simplemobiletools.gallery.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u001a\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u001a\u001c\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\u000e\u001a\n\u0010\u000f\u001a\u00020\u0001*\u00020\u0010\u001aG\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152#\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016\u001a\u0012\u0010\u001a\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u001b\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\f\u001a$\u0010\u001d\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006\u001a \u0010\u001e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u001a0\u0010\u001f\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u001a\u0012\u0010 \u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0018\u0010!\u001a\u00020\u0001*\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013\u001a\u0012\u0010\"\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010#\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0018\u0010$\u001a\u00020\u0001*\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013\u001a\u0018\u0010%\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u001a\u0012\u0010&\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001aA\u0010\'\u001a\u00020\u0001*\u00020\u00022\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\f2%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016\u001aC\u0010+\u001a\u00020\u0001*\u00020\u00022\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00132\u0006\u0010.\u001a\u00020\f2!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00010\u0016\u001aK\u00100\u001a\u00020\u0001*\u00020\u00022\u0006\u00101\u001a\u00020-2\b\b\u0002\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016\u00a8\u00064"}, d2 = {"addNoMedia", "", "Lcom/simplemobiletools/commons/activities/BaseSimpleActivity;", "path", "", "callback", "Lkotlin/Function0;", "emptyAndDisableTheRecycleBin", "emptyTheRecycleBin", "hideSystemUI", "Landroid/support/v7/app/AppCompatActivity;", "toggleActionBarVisibility", "", "launchAbout", "Lcom/simplemobiletools/gallery/activities/SimpleActivity;", "launchCamera", "Landroid/app/Activity;", "movePathsInRecycleBin", "paths", "Ljava/util/ArrayList;", "mediumDao", "Lcom/simplemobiletools/gallery/interfaces/MediumDao;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "wasSuccess", "openEditor", "openPath", "forceChooser", "removeNoMedia", "restoreRecycleBinPath", "restoreRecycleBinPaths", "setAs", "shareMediaPaths", "shareMediumPath", "sharePath", "sharePaths", "showRecycleBinEmptyingDialog", "showSystemUI", "toggleFileVisibility", "oldPath", "hide", "newPath", "tryCopyMoveFilesTo", "fileDirItems", "Lcom/simplemobiletools/commons/models/FileDirItem;", "isCopyOperation", "destinationPath", "tryDeleteFileDirItem", "fileDirItem", "allowDeleteFolder", "deleteFromDatabase", "gallery_debug"})
public final class ActivityKt {
    
    public static final void sharePath(@org.jetbrains.annotations.NotNull()
    android.app.Activity $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    public static final void sharePaths(@org.jetbrains.annotations.NotNull()
    android.app.Activity $receiver, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> paths) {
    }
    
    public static final void shareMediumPath(@org.jetbrains.annotations.NotNull()
    android.app.Activity $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    public static final void shareMediaPaths(@org.jetbrains.annotations.NotNull()
    android.app.Activity $receiver, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> paths) {
    }
    
    public static final void setAs(@org.jetbrains.annotations.NotNull()
    android.app.Activity $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    public static final void openPath(@org.jetbrains.annotations.NotNull()
    android.app.Activity $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String path, boolean forceChooser) {
    }
    
    public static final void openEditor(@org.jetbrains.annotations.NotNull()
    android.app.Activity $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String path) {
    }
    
    public static final void launchCamera(@org.jetbrains.annotations.NotNull()
    android.app.Activity $receiver) {
    }
    
    public static final void launchAbout(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.gallery.activities.SimpleActivity $receiver) {
    }
    
    public static final void showSystemUI(@org.jetbrains.annotations.NotNull()
    android.support.v7.app.AppCompatActivity $receiver, boolean toggleActionBarVisibility) {
    }
    
    public static final void hideSystemUI(@org.jetbrains.annotations.NotNull()
    android.support.v7.app.AppCompatActivity $receiver, boolean toggleActionBarVisibility) {
    }
    
    public static final void addNoMedia(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public static final void removeNoMedia(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public static final void toggleFileVisibility(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String oldPath, boolean hide, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback) {
    }
    
    public static final void tryCopyMoveFilesTo(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity $receiver, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.simplemobiletools.commons.models.FileDirItem> fileDirItems, boolean isCopyOperation, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> callback) {
    }
    
    public static final void tryDeleteFileDirItem(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity $receiver, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.models.FileDirItem fileDirItem, boolean allowDeleteFolder, boolean deleteFromDatabase, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
    }
    
    public static final void movePathsInRecycleBin(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity $receiver, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> paths, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.gallery.interfaces.MediumDao mediumDao, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
    }
    
    public static final void restoreRecycleBinPath(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public static final void restoreRecycleBinPaths(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity $receiver, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> paths, @org.jetbrains.annotations.NotNull()
    com.simplemobiletools.gallery.interfaces.MediumDao mediumDao, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public static final void emptyTheRecycleBin(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity $receiver, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public static final void emptyAndDisableTheRecycleBin(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
    
    public static final void showRecycleBinEmptyingDialog(@org.jetbrains.annotations.NotNull()
    com.simplemobiletools.commons.activities.BaseSimpleActivity $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
    }
}