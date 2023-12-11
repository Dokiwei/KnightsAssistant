package com.dokiwei.knight.core.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.dokiwei.knight.core.entity.OccupationEntity
import kotlinx.coroutines.flow.StateFlow

/**
 * @author DokiWei
 * @date 2023/11/12 17:31
 */
@Dao
interface OccupationDao {
    @Delete
    suspend fun removeData(data: OccupationEntity)

    @Insert
    suspend fun addData(data: OccupationEntity)

    @Insert
    suspend fun addDatas(datas: List<OccupationEntity>)

    @Update
    suspend fun update(data: OccupationEntity)

    @Query("select * from occupation_table")
    suspend fun getAllData(): StateFlow<OccupationEntity>

    @Query("select * from occupation_table where name = :name")
    suspend fun getDataByName(name: String): OccupationEntity

    @Query("select * from occupation_table where id = :id")
    suspend fun getDataById(id: Int): OccupationEntity
}
