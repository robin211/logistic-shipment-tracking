package com.fli.elogistic.driver.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.fli.elogistic.driver.models.identity.FakeGpsPackageModel
import com.fli.elogistic.driver.models.orders.ImageListModel


@Database(
    entities = [FakeGpsPackageModel::class, ImageListModel::class],
    version = 2
)
@TypeConverters(Converter::class)
abstract class FLIDriverDb : RoomDatabase() {
    abstract fun fakeGpsDao(): FakeGpsDao
    abstract fun imageListDao(): ImageListDao


    companion object{
        val MIGRATION_1_2: Migration = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL(
                        "CREATE TABLE `ImageListModel` (`shipmentId` INTEGER NOT NULL, `type` TEXT NOT NULL, `urlList` TEXT NOT NULL,"

                                + " PRIMARY KEY(`shipmentId`, `type`))");
            }
        }
    }
}