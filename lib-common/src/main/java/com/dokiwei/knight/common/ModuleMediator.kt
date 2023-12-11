package com.dokiwei.knight.common

import android.app.Application

/**
 * @author DokiWei
 * @date 2023/11/11 21:13
 */
object ModuleMediator {
    const val IS_RELEASE = true

    object ARouterConstants {
        private const val SETTING_MODULE = "/setting/"
        private const val LIBRARY_MODULE = "/library/"
        private const val CALCULATE_MODULE = "/calculate/"

        const val SETTING_ACTIVITY = SETTING_MODULE + "SettingActivity"
        const val LIBRARY_ACTIVITY = LIBRARY_MODULE + "LibraryActivity"
        const val CALCULATE_ACTIVITY = CALCULATE_MODULE + "CalculateActivity"
    }

    object TableName{
        const val OCCUPATION_TABLE = "occupation_table"
        const val ROLE_TABLE = "role_table"
        const val SKILL_TABLE = "skill_table"
    }

    private const val APP_CALCULATE_CLASS = "com.dokiwei.knight.calculate.App"
    private const val APP_SETTING_CLASS = "com.dokiwei.knight.setting.App"
    private const val APP_LIBRARY_CLASS = "com.dokiwei.knight.library.App"

    interface AppInitial {
        fun init(app: Application)
    }

    fun init(app: Application) {
        val appClasses = arrayOf(
            this.APP_CALCULATE_CLASS, this.APP_SETTING_CLASS, APP_LIBRARY_CLASS
        )
        appClasses.forEach { className ->
            try {
                val clazz = Class.forName(className)
                val appInitial = clazz.getDeclaredConstructor().newInstance() as AppInitial
                appInitial.init(app)
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            }
        }
    }
}