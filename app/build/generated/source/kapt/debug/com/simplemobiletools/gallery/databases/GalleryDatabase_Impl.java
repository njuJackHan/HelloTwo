package com.simplemobiletools.gallery.databases;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import com.simplemobiletools.gallery.interfaces.DirectoryDao;
import com.simplemobiletools.gallery.interfaces.DirectoryDao_Impl;
import com.simplemobiletools.gallery.interfaces.MediumDao;
import com.simplemobiletools.gallery.interfaces.MediumDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public class GalleryDatabase_Impl extends GalleryDatabase {
  private volatile DirectoryDao _directoryDao;

  private volatile MediumDao _mediumDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(4) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `directories` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `path` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `filename` TEXT NOT NULL, `media_count` INTEGER NOT NULL, `last_modified` INTEGER NOT NULL, `date_taken` INTEGER NOT NULL, `size` INTEGER NOT NULL, `location` INTEGER NOT NULL, `media_types` INTEGER NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX `index_directories_path` ON `directories` (`path`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `media` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `filename` TEXT NOT NULL, `full_path` TEXT NOT NULL, `parent_path` TEXT NOT NULL, `last_modified` INTEGER NOT NULL, `date_taken` INTEGER NOT NULL, `size` INTEGER NOT NULL, `type` INTEGER NOT NULL, `is_favorite` INTEGER NOT NULL, `deleted_ts` INTEGER NOT NULL)");
        _db.execSQL("CREATE UNIQUE INDEX `index_media_full_path` ON `media` (`full_path`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"40db2e0b781bb5dddc46cd78a6b9f905\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `directories`");
        _db.execSQL("DROP TABLE IF EXISTS `media`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsDirectories = new HashMap<String, TableInfo.Column>(10);
        _columnsDirectories.put("id", new TableInfo.Column("id", "INTEGER", false, 1));
        _columnsDirectories.put("path", new TableInfo.Column("path", "TEXT", true, 0));
        _columnsDirectories.put("thumbnail", new TableInfo.Column("thumbnail", "TEXT", true, 0));
        _columnsDirectories.put("filename", new TableInfo.Column("filename", "TEXT", true, 0));
        _columnsDirectories.put("media_count", new TableInfo.Column("media_count", "INTEGER", true, 0));
        _columnsDirectories.put("last_modified", new TableInfo.Column("last_modified", "INTEGER", true, 0));
        _columnsDirectories.put("date_taken", new TableInfo.Column("date_taken", "INTEGER", true, 0));
        _columnsDirectories.put("size", new TableInfo.Column("size", "INTEGER", true, 0));
        _columnsDirectories.put("location", new TableInfo.Column("location", "INTEGER", true, 0));
        _columnsDirectories.put("media_types", new TableInfo.Column("media_types", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDirectories = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDirectories = new HashSet<TableInfo.Index>(1);
        _indicesDirectories.add(new TableInfo.Index("index_directories_path", true, Arrays.asList("path")));
        final TableInfo _infoDirectories = new TableInfo("directories", _columnsDirectories, _foreignKeysDirectories, _indicesDirectories);
        final TableInfo _existingDirectories = TableInfo.read(_db, "directories");
        if (! _infoDirectories.equals(_existingDirectories)) {
          throw new IllegalStateException("Migration didn't properly handle directories(com.simplemobiletools.gallery.models.Directory).\n"
                  + " Expected:\n" + _infoDirectories + "\n"
                  + " Found:\n" + _existingDirectories);
        }
        final HashMap<String, TableInfo.Column> _columnsMedia = new HashMap<String, TableInfo.Column>(10);
        _columnsMedia.put("id", new TableInfo.Column("id", "INTEGER", false, 1));
        _columnsMedia.put("filename", new TableInfo.Column("filename", "TEXT", true, 0));
        _columnsMedia.put("full_path", new TableInfo.Column("full_path", "TEXT", true, 0));
        _columnsMedia.put("parent_path", new TableInfo.Column("parent_path", "TEXT", true, 0));
        _columnsMedia.put("last_modified", new TableInfo.Column("last_modified", "INTEGER", true, 0));
        _columnsMedia.put("date_taken", new TableInfo.Column("date_taken", "INTEGER", true, 0));
        _columnsMedia.put("size", new TableInfo.Column("size", "INTEGER", true, 0));
        _columnsMedia.put("type", new TableInfo.Column("type", "INTEGER", true, 0));
        _columnsMedia.put("is_favorite", new TableInfo.Column("is_favorite", "INTEGER", true, 0));
        _columnsMedia.put("deleted_ts", new TableInfo.Column("deleted_ts", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMedia = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMedia = new HashSet<TableInfo.Index>(1);
        _indicesMedia.add(new TableInfo.Index("index_media_full_path", true, Arrays.asList("full_path")));
        final TableInfo _infoMedia = new TableInfo("media", _columnsMedia, _foreignKeysMedia, _indicesMedia);
        final TableInfo _existingMedia = TableInfo.read(_db, "media");
        if (! _infoMedia.equals(_existingMedia)) {
          throw new IllegalStateException("Migration didn't properly handle media(com.simplemobiletools.gallery.models.Medium).\n"
                  + " Expected:\n" + _infoMedia + "\n"
                  + " Found:\n" + _existingMedia);
        }
      }
    }, "40db2e0b781bb5dddc46cd78a6b9f905", "d94ac6a4fcbbb244d0ab9d0b06632b30");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "directories","media");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `directories`");
      _db.execSQL("DELETE FROM `media`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public DirectoryDao DirectoryDao() {
    if (_directoryDao != null) {
      return _directoryDao;
    } else {
      synchronized(this) {
        if(_directoryDao == null) {
          _directoryDao = new DirectoryDao_Impl(this);
        }
        return _directoryDao;
      }
    }
  }

  @Override
  public MediumDao MediumDao() {
    if (_mediumDao != null) {
      return _mediumDao;
    } else {
      synchronized(this) {
        if(_mediumDao == null) {
          _mediumDao = new MediumDao_Impl(this);
        }
        return _mediumDao;
      }
    }
  }
}
