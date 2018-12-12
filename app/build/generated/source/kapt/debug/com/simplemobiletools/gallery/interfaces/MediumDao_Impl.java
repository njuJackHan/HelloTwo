package com.simplemobiletools.gallery.interfaces;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.simplemobiletools.gallery.models.Medium;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class MediumDao_Impl implements MediumDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfMedium;

  private final SharedSQLiteStatement __preparedStmtOfDeleteMediumPath;

  private final SharedSQLiteStatement __preparedStmtOfUpdateMedium;

  private final SharedSQLiteStatement __preparedStmtOfUpdateFavorite;

  private final SharedSQLiteStatement __preparedStmtOfUpdateDeleted;

  private final SharedSQLiteStatement __preparedStmtOfUpdateFavoriteDateTaken;

  private final SharedSQLiteStatement __preparedStmtOfClearRecycleBin;

  private final SharedSQLiteStatement __preparedStmtOfClearFavorites;

  public MediumDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMedium = new EntityInsertionAdapter<Medium>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `media`(`id`,`filename`,`full_path`,`parent_path`,`last_modified`,`date_taken`,`size`,`type`,`is_favorite`,`deleted_ts`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Medium value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getPath() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPath());
        }
        if (value.getParentPath() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getParentPath());
        }
        stmt.bindLong(5, value.getModified());
        stmt.bindLong(6, value.getTaken());
        stmt.bindLong(7, value.getSize());
        stmt.bindLong(8, value.getType());
        final int _tmp;
        _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(9, _tmp);
        stmt.bindLong(10, value.getDeletedTS());
      }
    };
    this.__preparedStmtOfDeleteMediumPath = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM media WHERE full_path = ? COLLATE NOCASE";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateMedium = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE OR REPLACE media SET filename = ?, full_path = ?, parent_path = ? WHERE full_path = ? COLLATE NOCASE";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateFavorite = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE media SET is_favorite = ? WHERE full_path = ? COLLATE NOCASE";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateDeleted = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE media SET deleted_ts = ? WHERE full_path = ? COLLATE NOCASE";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateFavoriteDateTaken = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE media SET date_taken = ? WHERE full_path = ? COLLATE NOCASE";
        return _query;
      }
    };
    this.__preparedStmtOfClearRecycleBin = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM media WHERE deleted_ts != 0";
        return _query;
      }
    };
    this.__preparedStmtOfClearFavorites = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE media SET is_favorite = 0";
        return _query;
      }
    };
  }

  @Override
  public void insert(Medium medium) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfMedium.insert(medium);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAll(List<Medium> media) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfMedium.insert(media);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteMediumPath(String path) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteMediumPath.acquire();
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
      __preparedStmtOfDeleteMediumPath.release(_stmt);
    }
  }

  @Override
  public void updateMedium(String oldPath, String newParentPath, String newFilename,
      String newFullPath) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateMedium.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (newFilename == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, newFilename);
      }
      _argIndex = 2;
      if (newFullPath == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, newFullPath);
      }
      _argIndex = 3;
      if (newParentPath == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, newParentPath);
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
      __preparedStmtOfUpdateMedium.release(_stmt);
    }
  }

  @Override
  public void updateFavorite(String path, boolean isFavorite) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateFavorite.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      final int _tmp;
      _tmp = isFavorite ? 1 : 0;
      _stmt.bindLong(_argIndex, _tmp);
      _argIndex = 2;
      if (path == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, path);
      }
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateFavorite.release(_stmt);
    }
  }

  @Override
  public void updateDeleted(String path, long deletedTS) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateDeleted.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, deletedTS);
      _argIndex = 2;
      if (path == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, path);
      }
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateDeleted.release(_stmt);
    }
  }

  @Override
  public void updateFavoriteDateTaken(String path, long dateTaken) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateFavoriteDateTaken.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, dateTaken);
      _argIndex = 2;
      if (path == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, path);
      }
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateFavoriteDateTaken.release(_stmt);
    }
  }

  @Override
  public void clearRecycleBin() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearRecycleBin.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearRecycleBin.release(_stmt);
    }
  }

  @Override
  public void clearFavorites() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearFavorites.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearFavorites.release(_stmt);
    }
  }

  @Override
  public List<Medium> getMediaFromPath(String path) {
    final String _sql = "SELECT filename, full_path, parent_path, last_modified, date_taken, size, type, is_favorite, deleted_ts FROM media WHERE deleted_ts = 0 AND parent_path = ? COLLATE NOCASE";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (path == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, path);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("filename");
      final int _cursorIndexOfPath = _cursor.getColumnIndexOrThrow("full_path");
      final int _cursorIndexOfParentPath = _cursor.getColumnIndexOrThrow("parent_path");
      final int _cursorIndexOfModified = _cursor.getColumnIndexOrThrow("last_modified");
      final int _cursorIndexOfTaken = _cursor.getColumnIndexOrThrow("date_taken");
      final int _cursorIndexOfSize = _cursor.getColumnIndexOrThrow("size");
      final int _cursorIndexOfType = _cursor.getColumnIndexOrThrow("type");
      final int _cursorIndexOfIsFavorite = _cursor.getColumnIndexOrThrow("is_favorite");
      final int _cursorIndexOfDeletedTS = _cursor.getColumnIndexOrThrow("deleted_ts");
      final List<Medium> _result = new ArrayList<Medium>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Medium _item;
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpPath;
        _tmpPath = _cursor.getString(_cursorIndexOfPath);
        final String _tmpParentPath;
        _tmpParentPath = _cursor.getString(_cursorIndexOfParentPath);
        final long _tmpModified;
        _tmpModified = _cursor.getLong(_cursorIndexOfModified);
        final long _tmpTaken;
        _tmpTaken = _cursor.getLong(_cursorIndexOfTaken);
        final long _tmpSize;
        _tmpSize = _cursor.getLong(_cursorIndexOfSize);
        final int _tmpType;
        _tmpType = _cursor.getInt(_cursorIndexOfType);
        final boolean _tmpIsFavorite;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
        _tmpIsFavorite = _tmp != 0;
        final long _tmpDeletedTS;
        _tmpDeletedTS = _cursor.getLong(_cursorIndexOfDeletedTS);
        _item = new Medium(null,_tmpName,_tmpPath,_tmpParentPath,_tmpModified,_tmpTaken,_tmpSize,_tmpType,_tmpIsFavorite,_tmpDeletedTS);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Medium> getFavorites() {
    final String _sql = "SELECT filename, full_path, parent_path, last_modified, date_taken, size, type, is_favorite, deleted_ts FROM media WHERE deleted_ts = 0 AND is_favorite = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("filename");
      final int _cursorIndexOfPath = _cursor.getColumnIndexOrThrow("full_path");
      final int _cursorIndexOfParentPath = _cursor.getColumnIndexOrThrow("parent_path");
      final int _cursorIndexOfModified = _cursor.getColumnIndexOrThrow("last_modified");
      final int _cursorIndexOfTaken = _cursor.getColumnIndexOrThrow("date_taken");
      final int _cursorIndexOfSize = _cursor.getColumnIndexOrThrow("size");
      final int _cursorIndexOfType = _cursor.getColumnIndexOrThrow("type");
      final int _cursorIndexOfIsFavorite = _cursor.getColumnIndexOrThrow("is_favorite");
      final int _cursorIndexOfDeletedTS = _cursor.getColumnIndexOrThrow("deleted_ts");
      final List<Medium> _result = new ArrayList<Medium>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Medium _item;
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpPath;
        _tmpPath = _cursor.getString(_cursorIndexOfPath);
        final String _tmpParentPath;
        _tmpParentPath = _cursor.getString(_cursorIndexOfParentPath);
        final long _tmpModified;
        _tmpModified = _cursor.getLong(_cursorIndexOfModified);
        final long _tmpTaken;
        _tmpTaken = _cursor.getLong(_cursorIndexOfTaken);
        final long _tmpSize;
        _tmpSize = _cursor.getLong(_cursorIndexOfSize);
        final int _tmpType;
        _tmpType = _cursor.getInt(_cursorIndexOfType);
        final boolean _tmpIsFavorite;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
        _tmpIsFavorite = _tmp != 0;
        final long _tmpDeletedTS;
        _tmpDeletedTS = _cursor.getLong(_cursorIndexOfDeletedTS);
        _item = new Medium(null,_tmpName,_tmpPath,_tmpParentPath,_tmpModified,_tmpTaken,_tmpSize,_tmpType,_tmpIsFavorite,_tmpDeletedTS);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<String> getFavoritePaths() {
    final String _sql = "SELECT full_path FROM media WHERE deleted_ts = 0 AND is_favorite = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final List<String> _result = new ArrayList<String>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final String _item;
        _item = _cursor.getString(0);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Medium> getDeletedMedia() {
    final String _sql = "SELECT filename, full_path, parent_path, last_modified, date_taken, size, type, is_favorite, deleted_ts FROM media WHERE deleted_ts != 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("filename");
      final int _cursorIndexOfPath = _cursor.getColumnIndexOrThrow("full_path");
      final int _cursorIndexOfParentPath = _cursor.getColumnIndexOrThrow("parent_path");
      final int _cursorIndexOfModified = _cursor.getColumnIndexOrThrow("last_modified");
      final int _cursorIndexOfTaken = _cursor.getColumnIndexOrThrow("date_taken");
      final int _cursorIndexOfSize = _cursor.getColumnIndexOrThrow("size");
      final int _cursorIndexOfType = _cursor.getColumnIndexOrThrow("type");
      final int _cursorIndexOfIsFavorite = _cursor.getColumnIndexOrThrow("is_favorite");
      final int _cursorIndexOfDeletedTS = _cursor.getColumnIndexOrThrow("deleted_ts");
      final List<Medium> _result = new ArrayList<Medium>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Medium _item;
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpPath;
        _tmpPath = _cursor.getString(_cursorIndexOfPath);
        final String _tmpParentPath;
        _tmpParentPath = _cursor.getString(_cursorIndexOfParentPath);
        final long _tmpModified;
        _tmpModified = _cursor.getLong(_cursorIndexOfModified);
        final long _tmpTaken;
        _tmpTaken = _cursor.getLong(_cursorIndexOfTaken);
        final long _tmpSize;
        _tmpSize = _cursor.getLong(_cursorIndexOfSize);
        final int _tmpType;
        _tmpType = _cursor.getInt(_cursorIndexOfType);
        final boolean _tmpIsFavorite;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
        _tmpIsFavorite = _tmp != 0;
        final long _tmpDeletedTS;
        _tmpDeletedTS = _cursor.getLong(_cursorIndexOfDeletedTS);
        _item = new Medium(null,_tmpName,_tmpPath,_tmpParentPath,_tmpModified,_tmpTaken,_tmpSize,_tmpType,_tmpIsFavorite,_tmpDeletedTS);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
