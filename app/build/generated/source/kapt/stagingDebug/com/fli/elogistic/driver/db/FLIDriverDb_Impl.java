package com.fli.elogistic.driver.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class FLIDriverDb_Impl extends FLIDriverDb {
  private volatile FakeGpsDao _fakeGpsDao;

  private volatile ImageListDao _imageListDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `FakeGpsPackageModel` (`id` INTEGER NOT NULL, `packageName` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ImageListModel` (`shipmentId` INTEGER NOT NULL, `type` TEXT NOT NULL, `urlList` TEXT NOT NULL, PRIMARY KEY(`shipmentId`, `type`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1609c1f71778b965943533d4b61e330b')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `FakeGpsPackageModel`");
        _db.execSQL("DROP TABLE IF EXISTS `ImageListModel`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
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
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsFakeGpsPackageModel = new HashMap<String, TableInfo.Column>(3);
        _columnsFakeGpsPackageModel.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFakeGpsPackageModel.put("packageName", new TableInfo.Column("packageName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFakeGpsPackageModel.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFakeGpsPackageModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFakeGpsPackageModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFakeGpsPackageModel = new TableInfo("FakeGpsPackageModel", _columnsFakeGpsPackageModel, _foreignKeysFakeGpsPackageModel, _indicesFakeGpsPackageModel);
        final TableInfo _existingFakeGpsPackageModel = TableInfo.read(_db, "FakeGpsPackageModel");
        if (! _infoFakeGpsPackageModel.equals(_existingFakeGpsPackageModel)) {
          return new RoomOpenHelper.ValidationResult(false, "FakeGpsPackageModel(com.fli.elogistic.driver.models.identity.FakeGpsPackageModel).\n"
                  + " Expected:\n" + _infoFakeGpsPackageModel + "\n"
                  + " Found:\n" + _existingFakeGpsPackageModel);
        }
        final HashMap<String, TableInfo.Column> _columnsImageListModel = new HashMap<String, TableInfo.Column>(3);
        _columnsImageListModel.put("shipmentId", new TableInfo.Column("shipmentId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsImageListModel.put("type", new TableInfo.Column("type", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsImageListModel.put("urlList", new TableInfo.Column("urlList", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysImageListModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesImageListModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoImageListModel = new TableInfo("ImageListModel", _columnsImageListModel, _foreignKeysImageListModel, _indicesImageListModel);
        final TableInfo _existingImageListModel = TableInfo.read(_db, "ImageListModel");
        if (! _infoImageListModel.equals(_existingImageListModel)) {
          return new RoomOpenHelper.ValidationResult(false, "ImageListModel(com.fli.elogistic.driver.models.orders.ImageListModel).\n"
                  + " Expected:\n" + _infoImageListModel + "\n"
                  + " Found:\n" + _existingImageListModel);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "1609c1f71778b965943533d4b61e330b", "227a414d88ce18dd300c9da81c76c192");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "FakeGpsPackageModel","ImageListModel");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `FakeGpsPackageModel`");
      _db.execSQL("DELETE FROM `ImageListModel`");
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
  public FakeGpsDao fakeGpsDao() {
    if (_fakeGpsDao != null) {
      return _fakeGpsDao;
    } else {
      synchronized(this) {
        if(_fakeGpsDao == null) {
          _fakeGpsDao = new FakeGpsDao_Impl(this);
        }
        return _fakeGpsDao;
      }
    }
  }

  @Override
  public ImageListDao imageListDao() {
    if (_imageListDao != null) {
      return _imageListDao;
    } else {
      synchronized(this) {
        if(_imageListDao == null) {
          _imageListDao = new ImageListDao_Impl(this);
        }
        return _imageListDao;
      }
    }
  }
}
