package com.example.aroutetest.activity

import android.net.Uri
import android.os.Bundle
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.callback.NavigationCallback
import com.alibaba.android.arouter.launcher.ARouter
import com.example.aroutetest.base.BaseActivity
import com.example.aroutetest.bean.User
import com.example.aroutetest.common.ArouteConstants
import com.example.aroutetest.databinding.ActivityMainBinding
import com.example.base.AroutePath

@Route(path = AroutePath.Main.PATH_MAINACTIVITY)
class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding?.apply {
            mMainNextBtn.setOnClickListener {
                ARouter.getInstance().build(AroutePath.Main.PATH_SECONDACTIVITY).navigation()
            }
            mMainWithDataBtn.setOnClickListener {
                val bundle = Bundle().apply {
                    putString("name", "MainActivity")
                }

                ARouter.getInstance().build(AroutePath.Main.PATH_SECONDACTIVITY)
                    .withString("key_str", "zhangsan")
                    .withObject("user", User("lisi"))
                    .withBundle(ArouteConstants.KEY_BUNDLE, bundle).navigation()
            }
            mSchemeBtn.setOnClickListener {
                val uri = Uri.parse(AroutePath.Main.PATH_SCHEME_URI)
                ARouter.getInstance().build(uri)
                    .navigation(this@MainActivity, object : NavigationCallback {
                        override fun onFound(postcard: Postcard?) {
                            println("onFound--->" + postcard.toString())
                        }

                        override fun onLost(postcard: Postcard?) {
                            println("onLost--->" + postcard.toString())
                        }

                        override fun onArrival(postcard: Postcard?) {
                            println("onArrival--->" + postcard.toString())
                        }

                        override fun onInterrupt(postcard: Postcard?) {
                            println("onInterrupt--->" + postcard.toString())
                        }

                    })

            }
            mServiceBtn.setOnClickListener {
                ARouter.getInstance().build(AroutePath.Module2.PATH_MODULE2ACTIVITY)
                    .navigation()
            }
        }
    }

    override fun getSubBinding(): ActivityMainBinding? {
        return ActivityMainBinding.inflate(layoutInflater)
    }
}