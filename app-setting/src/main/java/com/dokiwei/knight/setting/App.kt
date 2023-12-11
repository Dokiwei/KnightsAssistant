package com.dokiwei.knight.setting

import android.app.Application
import com.dokiwei.knight.common.ModuleMediator
import com.orhanobut.logger.Logger

/**
 * @author DokiWei
 * @date 2023/11/11 22:34
 */
class App:ModuleMediator.AppInitial {
    override fun init(app: Application) {
        Logger.i("设置模块开始初始化...")
        Logger.i("设置模块初始化完成")
    }
}