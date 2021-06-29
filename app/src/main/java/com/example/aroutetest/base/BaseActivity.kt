package com.example.aroutetest.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<T:ViewBinding>:AppCompatActivity() {
    protected var mBinding:T? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = getSubBinding()
        setContentView(mBinding?.root)
    }

    abstract fun getSubBinding(): T?
}