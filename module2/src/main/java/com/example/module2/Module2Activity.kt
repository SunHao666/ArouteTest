package com.example.module2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.base.AroutePath
import com.example.base.service.HelloService

@Route(path = AroutePath.Module2.PATH_MODULE2ACTIVITY)
class Module2Activity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acy_module2)
        println("module2----->")

//        val helloService =
//            ARouter.getInstance().build(AroutePath.Module1.PATH_HELLOSERVICE).navigation() as HelloService
        val helloService = ARouter.getInstance().navigation(HelloService::class.java) as HelloService
        helloService.sayHello("周杰伦")
        findViewById<Button>(R.id.mToModule1Btn).setOnClickListener {
            ARouter.getInstance().build(AroutePath.Module1.PATH_MODULE1ACTIVITY).navigation()
        }
    }
}