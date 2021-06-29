package com.example.aroutetest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.aroutetest.base.BaseActivity
import com.example.aroutetest.common.ArouteConstants
import com.example.aroutetest.databinding.AcySecondBinding
import com.example.aroutetest.path.AroutePath

@Route(path = AroutePath.PATH_SECONDACTIVITY)
class SecondActivity:BaseActivity<AcySecondBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bundle = intent?.getBundleExtra(ArouteConstants.KEY_BUNDLE)
        val name = bundle?.getString("name")
        println(name)
        mBinding?.apply {
            mSecContentTv.setText(name)
        }
        mBinding?.mSecNextBtn?.setOnClickListener {
            println(name)
        }
    }

    override fun getSubBinding(): AcySecondBinding {
        return AcySecondBinding.inflate(layoutInflater)
    }
}