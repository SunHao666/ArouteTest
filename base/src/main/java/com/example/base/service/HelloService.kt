package com.example.base.service

import com.alibaba.android.arouter.facade.template.IProvider

interface HelloService:IProvider {
    fun sayHello(name:String)
}