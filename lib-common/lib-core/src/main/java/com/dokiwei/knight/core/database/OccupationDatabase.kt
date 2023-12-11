package com.dokiwei.knight.core.database

import androidx.room.Database
import com.dokiwei.knight.core.dao.OccupationDao
import com.dokiwei.knight.core.entity.OccupationEntity
import com.dokiwei.knight.core.entity.SkillEntity

/**
 * @author DokiWei
 * @date 2023/11/12 17:51
 */
@Database(
    entities = [OccupationEntity::class, SkillEntity::class], version = 1, exportSchema = false
)
abstract class OccupationDatabase {
    abstract fun occupationDao(): OccupationDao
}