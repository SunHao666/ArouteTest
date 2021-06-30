package com.example.module1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.base.AroutePath

@Route(path = AroutePath.Module1.PATH_MODULE1ACTIVITY)
class Module1Activity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("module1进来了----》")
    }
}