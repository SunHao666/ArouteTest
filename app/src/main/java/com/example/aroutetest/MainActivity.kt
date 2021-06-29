package com.example.aroutetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.aroutetest.base.BaseActivity
import com.example.aroutetest.common.ArouteConstants
import com.example.aroutetest.databinding.ActivityMainBinding
import com.example.aroutetest.path.AroutePath

@Route(path = AroutePath.PATH_MAINACTIVITY)
class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding?.apply {
            mMainNextBtn.setOnClickListener {
                ARouter.getInstance().build(AroutePath.PATH_SECONDACTIVITY).navigation()
            }
            mMainWithDataBtn.setOnClickListener {
                val bundle = Bundle().apply {
                    putString("name","MainActivity")
                }

                ARouter.getInstance().build(AroutePath.PATH_SECONDACTIVITY).
                    withBundle(ArouteConstants.KEY_BUNDLE,bundle).navigation()
            }
        }
    }

    override fun getSubBinding(): ActivityMainBinding? {
        return ActivityMainBinding.inflate(layoutInflater)
    }
}