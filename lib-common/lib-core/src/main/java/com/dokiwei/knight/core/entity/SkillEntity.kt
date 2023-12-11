package com.dokiwei.knight.core.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.dokiwei.knight.common.ModuleMediator
import com.dokiwei.knight.core.SkillType

/**
 * 技能实体类
 *
 * @property id 唯一id
 * @property name 技能名字
 * @property description 技能描述
 * @property energy 消耗能量数
 * @property level 技能等级
 * @property type 技能类型
 */
@Entity(tableName = ModuleMediator.TableName.SKILL_TABLE)
data class SkillEntity(
    @PrimaryKey val id: Int? = null,
    val name: String,
    val description: String,
    val energy: Int,
    val level: Int,
    val type: SkillType
)
