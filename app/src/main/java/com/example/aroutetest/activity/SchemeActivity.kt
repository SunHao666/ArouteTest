package com.example.aroutetest.activity

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.aroutetest.base.BaseActivity
import com.example.aroutetest.databinding.AcySchemeBinding
import com.example.base.AroutePath
import java.lang.StringBuilder

@Route(path = AroutePath.Main.PATH_SCHEME_ARRIVE)
class SchemeActivity:BaseActivity<AcySchemeBinding>() {
    override fun getSubBinding() =  AcySchemeBinding.inflate(layoutInflater)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val uri = intent.data
        val strBuilder = StringBuilder()
        uri?.apply {
            strBuilder.append(scheme).append(host).append(path)
                .append(getQueryParameter("parameter"))
        }
        println("------>${strBuilder.toString()}")
        mBinding?.mSchemeContentTv?.text = strBuilder.toString()
//        ARouter.getInstance().build(uri).navigation()mExtras = {Bundle@16449} "Bundle[mParcelledData.dataSize=184]"
    }
}