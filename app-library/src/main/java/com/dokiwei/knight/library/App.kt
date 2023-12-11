package com.dokiwei.knight.library

import android.app.Application
import com.dokiwei.knight.common.ModuleMediator
import com.orhanobut.logger.Logger

/**
 * @author DokiWei
 * @date 2023/11/11 22:32
 */
class App:ModuleMediator.AppInitial {
    override fun init(app: Application) {
        Logger.i("资料模块开始初始化...")
        Logger.i("资料模块初始化完成")
    }
}