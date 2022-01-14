package com.fli.elogistic.driver.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.fli.elogistic.driver.models.identity.FakeGpsPackageModel
import com.fli.elogistic.driver.models.orders.ImageListModel

@Dao
interface ImageListDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertImageList(images: ArrayList<ImageListModel>)

    @Query("SELECT * FROM ImageListModel where shipmentId = :shipmentId AND type = :type")
    fun getImageList(shipmentId: Long, type: String): LiveData<List<ImageListModel>>

    @Query("DELETE FROM ImageListModel where shipmentId = :shipmentId")
    fun deleteImagesFromDb(shipmentId:Long)
}