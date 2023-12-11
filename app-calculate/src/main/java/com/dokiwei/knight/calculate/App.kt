package com.dokiwei.knight.calculate

import android.app.Application
import com.dokiwei.knight.common.ModuleMediator
import com.orhanobut.logger.Logger

/**
 * @author DokiWei
 * @date 2023/11/11 21:43
 */
class App : ModuleMediator.AppInitial {
    override fun init(app: Application) {
        Logger.i("计算模块开始初始化...")
        Logger.i("计算模块初始化完成")
    }
}