package com.fli.elogistic.driver.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.fli.elogistic.driver.models.identity.FakeGpsPackageModel

@Dao
interface FakeGpsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFakeGpsPackages(fakeGpsPackages: List<FakeGpsPackageModel>)

    @Query("SELECT * FROM FakeGpsPackageModel")
    fun getAllGpsList(): LiveData<List<FakeGpsPackageModel>>
}