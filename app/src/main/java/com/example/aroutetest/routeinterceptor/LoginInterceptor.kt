//package com.example.aroutetest.routeinterceptor
//
//import android.content.Context
//import com.alibaba.android.arouter.facade.Postcard
//import com.alibaba.android.arouter.facade.callback.InterceptorCallback
//import com.alibaba.android.arouter.facade.template.IInterceptor
//
//class LoginInterceptor : IInterceptor{
//    override fun init(context: Context?) {
//
//
//    }
//
//    override fun process(postcard: Postcard?, callback: InterceptorCallback?) {
//        //判断path是否需要登录  是去登录 否
//        //
//        //处理完成
//        callback?.onContinue(postcard)
//    }
//}