package com.dokiwei.knight.core.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.dokiwei.knight.common.ModuleMediator
import com.dokiwei.knight.core.OccupationType

/**
 * @author DokiWei
 * @date 2023/11/12 16:57
 */
/**
 * 职业实体类
 *
 * @property id 唯一id
 * @property name 职业名
 * @property level 职业等级
 * @property type 职业类型
 * @property str 力量
 * @property vit 体质
 * @property dex 技巧
 * @property per 感知
 * @property agi 敏捷
 * @property will 意志
 */
@Entity(tableName = ModuleMediator.TableName.OCCUPATION_TABLE)
data class OccupationEntity(
    @PrimaryKey val id: Int? = null,
    val name: String,
    val level: Int,
    val type: OccupationType,
    val skill: List<SkillEntity>,
    val str: Int = 0,
    val vit: Int = 0,
    val dex: Int = 0,
    val per: Int = 0,
    val agi: Int = 0,
    val will: Int = 0
)