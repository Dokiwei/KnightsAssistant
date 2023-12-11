package com.dokiwei.knight.assistant

import android.app.Application
import android.content.Context
import android.view.MotionEvent
import android.view.View
import com.dokiwei.knight.common.ModuleMediator
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.BuildConfig
import com.orhanobut.logger.Logger

/**
 * @author DokiWei
 * @date 2023/11/11 21:11
 */
class App:Application() {
    override fun onCreate() {
        super.onCreate()
        Logger.addLogAdapter(object : AndroidLogAdapter() {
            override fun isLoggable(priority: Int, tag: String?): Boolean {
                return BuildConfig.DEBUG
            }
        })
        Logger.i("软件开始初始化...")
        ModuleMediator.init(this)
        Logger.i("软件初始化完成")
    }
}