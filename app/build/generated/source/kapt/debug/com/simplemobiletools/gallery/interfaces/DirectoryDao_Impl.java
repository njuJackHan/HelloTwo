package com.simplemobiletools.gallery.interfaces;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.simplemobiletools.gallery.models.Directory;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class DirectoryDao_Impl implements DirectoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfDirectory;

  private final SharedSQLiteStatement __preparedStmtOfDeleteDirPath;

  private final SharedSQLiteStatement __preparedStmtOfUpdateDirectory;

  private final SharedSQLiteStatement __preparedStmtOfUpdateDirectoryAfterRename;

  private final SharedSQLiteStatement __preparedStmtOfDeleteRecycleBin;

  public DirectoryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDirectory = new EntityInsertionAdapter<Directory>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `directories`(`id`,`path`,`thumbnail`,`filename`,`media_count`,`last_modified`,`date_taken`,`size`,`location`,`media_types`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Directory value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getPath() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPath());
        }
        if (value.getTmb() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTmb());
        }
        if (value.getName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getName());
        }
        stmt.bindLong(5, value.getMediaCnt());
        stmt.bindLong(6, value.getModified());
        stmt.bindLong(7, value.getTaken());
        stmt.bindLong(8, value.getSize());
        stmt.bindLong(9, value.getLocation());
        stmt.bindLong(10, value.getTypes());
      }
    };
    this.__preparedStmtOfDeleteDirPath = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM directories WHERE path = ? COLLATE NOCASE";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateDirectory = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE OR REPLACE directories SET thumbnail = ?, media_count = ?, last_modified = ?, date_taken = ?, size = ?, media_types = ? WHERE path = ? COLLATE NOCASE";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateDirectoryAfterRename = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE directories SET thumbnail = ?, filename = ?, path = ? WHERE path = ? COLLATE NOCASE";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteRecycleBin = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM directories WHERE path = 'recycle_bin' COLLATE NOCASE";
        return _query;
      }
    };
  }

  @Override
  public void insert(Directory directory) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfDirectory.insert(directory);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(List<Directory> directories) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfDirectory.insert(directories);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteDirPath(String path) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteDirPath.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (path == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, path);
      }
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteDirPath.release(_stmt);
    }
  }

  @Override
  public void updateDirectory(String path, String thumbnail, int mediaCnt, long lastModified,
      long dateTaken, long size, int mediaTypes) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateDirectory.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (thumbnail == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, thumbnail);
      }
      _argIndex = 2;
      _stmt.bindLong(_argIndex, mediaCnt);
      _argIndex = 3;
      _stmt.bindLong(_argIndex, lastModified);
      _argIndex = 4;
      _stmt.bindLong(_argIndex, dateTaken);
      _argIndex = 5;
      _stmt.bindLong(_argIndex, size);
      _argIndex = 6;
      _stmt.bindLong(_argIndex, mediaTypes);
      _argIndex = 7;
      if (path == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, path);
      }
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateDirectory.release(_stmt);
    }
  }

  @Override
  public void updateDirectoryAfterRename(String thumbnail, String name, String newPath,
      String oldPath) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateDirectoryAfterRename.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (thumbnail == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, thumbnail);
      }
      _argIndex = 2;
      if (name == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, name);
      }
      _argIndex = 3;
      if (newPath == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, newPath);
      }
      _argIndex = 4;
      if (oldPath == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, oldPath);
      }
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateDirectoryAfterRename.release(_stmt);
    }
  }

  @Override
  public void deleteRecycleBin() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteRecycleBin.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteRecycleBin.release(_stmt);
    }
  }

  @Override
  public List<Directory> getAll() {
    final String _sql = "SELECT path, thumbnail, filename, media_count, last_modified, date_taken, size, location, media_types FROM directories";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfPath = _cursor.getColumnIndexOrThrow("path");
      final int _cursorIndexOfTmb = _cursor.getColumnIndexOrThrow("thumbnail");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("filename");
      final int _cursorIndexOfMediaCnt = _cursor.getColumnIndexOrThrow("media_count");
      final int _cursorIndexOfModified = _cursor.getColumnIndexOrThrow("last_modified");
      final int _cursorIndexOfTaken = _cursor.getColumnIndexOrThrow("date_taken");
      final int _cursorIndexOfSize = _cursor.getColumnIndexOrThrow("size");
      final int _cursorIndexOfLocation = _cursor.getColumnIndexOrThrow("location");
      final int _cursorIndexOfTypes = _cursor.getColumnIndexOrThrow("media_types");
      final List<Directory> _result = new ArrayList<Directory>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Directory _item;
        final String _tmpPath;
        _tmpPath = _cursor.getString(_cursorIndexOfPath);
        final String _tmpTmb;
        _tmpTmb = _cursor.getString(_cursorIndexOfTmb);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final int _tmpMediaCnt;
        _tmpMediaCnt = _cursor.getInt(_cursorIndexOfMediaCnt);
        final long _tmpModified;
        _tmpModified = _cursor.getLong(_cursorIndexOfModified);
        final long _tmpTaken;
        _tmpTaken = _cursor.getLong(_cursorIndexOfTaken);
        final long _tmpSize;
        _tmpSize = _cursor.getLong(_cursorIndexOfSize);
        final int _tmpLocation;
        _tmpLocation = _cursor.getInt(_cursorIndexOfLocation);
        final int _tmpTypes;
        _tmpTypes = _cursor.getInt(_cursorIndexOfTypes);
        _item = new Directory(null,_tmpPath,_tmpTmb,_tmpName,_tmpMediaCnt,_tmpModified,_tmpTaken,_tmpSize,_tmpLocation,_tmpTypes);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
