package com.example.module1

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.base.AroutePath
import com.example.base.service.HelloService
@Route(path = AroutePath.Module1.PATH_HELLOSERVICE)
class HelloServiceImpl:HelloService {
    override fun sayHello(name: String) {
        println("hello $name")
    }

    override fun init(context: Context?) {

    }
}