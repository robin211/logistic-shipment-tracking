package com.fli.elogistic.driver.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.fli.elogistic.driver.db.Converter.class})
@androidx.room.Database(entities = {com.fli.elogistic.driver.models.identity.FakeGpsPackageModel.class, com.fli.elogistic.driver.models.orders.ImageListModel.class}, version = 2)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/fli/elogistic/driver/db/FLIDriverDb;", "Landroidx/room/RoomDatabase;", "()V", "fakeGpsDao", "Lcom/fli/elogistic/driver/db/FakeGpsDao;", "imageListDao", "Lcom/fli/elogistic/driver/db/ImageListDao;", "Companion", "app_mockDebug"})
public abstract class FLIDriverDb extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_1_2 = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.fli.elogistic.driver.db.FLIDriverDb.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fli.elogistic.driver.db.FakeGpsDao fakeGpsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fli.elogistic.driver.db.ImageListDao imageListDao();
    
    public FLIDriverDb() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/fli/elogistic/driver/db/FLIDriverDb$Companion;", "", "()V", "MIGRATION_1_2", "Landroidx/room/migration/Migration;", "getMIGRATION_1_2", "()Landroidx/room/migration/Migration;", "app_mockDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_1_2() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}