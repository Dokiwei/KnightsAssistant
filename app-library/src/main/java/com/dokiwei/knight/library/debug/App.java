package com.dokiwei.knight.library.debug;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

/**
 * @author DokiWei
 * @date 2023/11/12 0:06
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                //.showThreadInfo(false)  // (Optional) 是否显示线程信息。默认值：true
                //.methodCount(0)         // (Optional) 要显示多少个方法行。默认值 2
                //.methodOffset(7)        // (Optional) 隐藏内部方法调用，直到偏移量。默认值：5
                //.logStrategy(customLog) // (Optional) 更改要打印的日志策略。默认 LogCat
                .tag("App Library Module")   // (Optional) 每个日志的全局标记。默认PRETTY_LOGGER
                .build();
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy));
        Logger.i("app-library 开始初始化...");
        Logger.i("app-library 初始化完成");
    }
}
