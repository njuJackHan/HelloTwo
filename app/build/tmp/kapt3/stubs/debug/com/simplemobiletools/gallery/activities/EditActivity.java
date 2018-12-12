package com.simplemobiletools.gallery.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 U2\u00020\u00012\u00020\u0002:\u0001UB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020 H\u0002J\b\u0010$\u001a\u00020 H\u0002J\b\u0010%\u001a\u00020 H\u0002J\n\u0010&\u001a\u0004\u0018\u00010\'H\u0002J\n\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u0014\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00180+H\u0002J\b\u0010,\u001a\u00020 H\u0002J\b\u0010-\u001a\u00020 H\u0002J\b\u0010.\u001a\u00020 H\u0002J\u0012\u0010/\u001a\u00020 2\b\u00100\u001a\u0004\u0018\u000101H\u0014J\u0010\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u000204H\u0016J\u0018\u00105\u001a\u00020 2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020\u00182\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020 H\u0014J\b\u0010>\u001a\u00020 H\u0014J\b\u0010?\u001a\u00020 H\u0002J(\u0010@\u001a\u00020 2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u00162\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u0018H\u0002J \u0010G\u001a\u00020 2\u0006\u0010C\u001a\u00020\u00162\u0006\u0010H\u001a\u00020\n2\u0006\u0010F\u001a\u00020\u0018H\u0002J\b\u0010I\u001a\u00020 H\u0002J\u0010\u0010J\u001a\u00020 2\u0006\u0010H\u001a\u00020\nH\u0002J\b\u0010K\u001a\u00020 H\u0002J\b\u0010L\u001a\u00020 H\u0002J\b\u0010M\u001a\u00020 H\u0002J\b\u0010N\u001a\u00020 H\u0002J\b\u0010O\u001a\u00020\u0018H\u0002J\u0010\u0010P\u001a\u00020 2\u0006\u0010Q\u001a\u00020\u0005H\u0002J\b\u0010R\u001a\u00020 H\u0002J\b\u0010S\u001a\u00020 H\u0002J\b\u0010T\u001a\u00020 H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006V"}, d2 = {"Lcom/simplemobiletools/gallery/activities/EditActivity;", "Lcom/simplemobiletools/gallery/activities/SimpleActivity;", "Lcom/theartofdev/edmodo/cropper/CropImageView$OnCropImageCompleteListener;", "()V", "ASPECT_RATIO_FOUR_THREE", "", "ASPECT_RATIO_FREE", "ASPECT_RATIO_ONE_ONE", "ASPECT_RATIO_SIXTEEN_NINE", "ASPECT_X", "", "ASPECT_Y", "CROP", "CROP_ROTATE_ASPECT_RATIO", "CROP_ROTATE_NONE", "PRIMARY_ACTION_CROP_ROTATE", "PRIMARY_ACTION_FILTER", "PRIMARY_ACTION_NONE", "currAspectRatio", "currCropRotateAction", "currPrimaryAction", "initialBitmap", "Landroid/graphics/Bitmap;", "isCropIntent", "", "isEditingWithThirdParty", "resizeHeight", "resizeWidth", "saveUri", "Landroid/net/Uri;", "uri", "applyFilter", "", "filterItem", "Lcom/simplemobiletools/gallery/models/FilterItem;", "bottomCropRotateClicked", "bottomFilterClicked", "editWith", "getAreaSize", "Landroid/graphics/Point;", "getFiltersAdapter", "Lcom/simplemobiletools/gallery/adapters/FiltersAdapter;", "getNewFilePath", "Lkotlin/Pair;", "initEditActivity", "loadCropImageView", "loadDefaultImageView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onCropImageComplete", "view", "Lcom/theartofdev/edmodo/cropper/CropImageView;", "result", "Lcom/theartofdev/edmodo/cropper/CropImageView$CropResult;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onResume", "onStop", "resizeImage", "saveBitmap", "file", "Ljava/io/File;", "bitmap", "out", "Ljava/io/OutputStream;", "showSavingToast", "saveBitmapToFile", "path", "saveImage", "scanFinalPath", "setupAspectRatioButtons", "setupBottomActions", "setupCropRotateActionButtons", "setupPrimaryActionButtons", "shouldCropSquare", "updateAspectRatio", "aspectRatio", "updateAspectRatioButtons", "updateCropRotateActionButtons", "updatePrimaryActionButtons", "Companion", "gallery_debug"})
public final class EditActivity extends com.simplemobiletools.gallery.activities.SimpleActivity implements com.theartofdev.edmodo.cropper.CropImageView.OnCropImageCompleteListener {
    private final java.lang.String ASPECT_X = "aspectX";
    private final java.lang.String ASPECT_Y = "aspectY";
    private final java.lang.String CROP = "crop";
    private final int ASPECT_RATIO_FREE = 0;
    private final int ASPECT_RATIO_ONE_ONE = 1;
    private final int ASPECT_RATIO_FOUR_THREE = 2;
    private final int ASPECT_RATIO_SIXTEEN_NINE = 3;
    private final int PRIMARY_ACTION_NONE = 0;
    private final int PRIMARY_ACTION_FILTER = 1;
    private final int PRIMARY_ACTION_CROP_ROTATE = 2;
    private final int CROP_ROTATE_NONE = 0;
    private final int CROP_ROTATE_ASPECT_RATIO = 1;
    private android.net.Uri uri;
    private android.net.Uri saveUri;
    private int resizeWidth;
    private int resizeHeight;
    private int currPrimaryAction;
    private int currCropRotateAction;
    private int currAspectRatio;
    private boolean isCropIntent;
    private boolean isEditingWithThirdParty;
    private android.graphics.Bitmap initialBitmap;
    public static final com.simplemobiletools.gallery.activities.EditActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initEditActivity() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void loadDefaultImageView() {
    }
    
    private final void loadCropImageView() {
    }
    
    private final void saveImage() {
    }
    
    private final com.simplemobiletools.gallery.adapters.FiltersAdapter getFiltersAdapter() {
        return null;
    }
    
    private final void setupBottomActions() {
    }
    
    private final void setupPrimaryActionButtons() {
    }
    
    private final void bottomFilterClicked() {
    }
    
    private final void bottomCropRotateClicked() {
    }
    
    private final void setupCropRotateActionButtons() {
    }
    
    private final void setupAspectRatioButtons() {
    }
    
    private final void updatePrimaryActionButtons() {
    }
    
    private final void applyFilter(com.simplemobiletools.gallery.models.FilterItem filterItem) {
    }
    
    private final void updateAspectRatio(int aspectRatio) {
    }
    
    private final void updateAspectRatioButtons() {
    }
    
    private final void updateCropRotateActionButtons() {
    }
    
    private final void resizeImage() {
    }
    
    private final boolean shouldCropSquare() {
        return false;
    }
    
    private final android.graphics.Point getAreaSize() {
        return null;
    }
    
    @java.lang.Override()
    public void onCropImageComplete(@org.jetbrains.annotations.NotNull()
    com.theartofdev.edmodo.cropper.CropImageView view, @org.jetbrains.annotations.NotNull()
    com.theartofdev.edmodo.cropper.CropImageView.CropResult result) {
    }
    
    private final kotlin.Pair<java.lang.String, java.lang.Boolean> getNewFilePath() {
        return null;
    }
    
    private final void saveBitmapToFile(android.graphics.Bitmap bitmap, java.lang.String path, boolean showSavingToast) {
    }
    
    private final void saveBitmap(java.io.File file, android.graphics.Bitmap bitmap, java.io.OutputStream out, boolean showSavingToast) {
    }
    
    private final void editWith() {
    }
    
    private final void scanFinalPath(java.lang.String path) {
    }
    
    public EditActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/simplemobiletools/gallery/activities/EditActivity$Companion;", "", "()V", "gallery_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}