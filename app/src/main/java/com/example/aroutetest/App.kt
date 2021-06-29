package com.example.aroutetest

import android.app.Application
import android.os.Build
import androidx.viewbinding.BuildConfig
import com.alibaba.android.arouter.launcher.ARouter

class App:Application() {
    override fun onCreate() {
        super.onCreate()
        initAroute()
    }

    private fun initAroute() {
        //Aroute 初始化
        if(BuildConfig.DEBUG){
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(this)
    }
}