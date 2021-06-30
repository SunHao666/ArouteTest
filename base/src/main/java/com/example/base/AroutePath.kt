package com.example.base

object AroutePath {
    class Main{
        companion object{
            const val PATH_MAINACTIVITY = "/Main/MainActivity"
            const val PATH_SECONDACTIVITY = "/Main/SecondActivity"
            const val PATH_THREEACTIVITY = "/Main/ThreeActivity"

            const val PATH_SCHEME_URI = "arouter://m.aliyun.com/Main/SchemeActivity?parameter=hello scheme"
            const val PATH_SCHEME_ARRIVE = "/Main/SchemeActivity"
        }
    }

    class Module1{
        companion object{
            const val PATH_MODULE1ACTIVITY = "/Module1/ModuleActivity"
            const val PATH_HELLOSERVICE = "/Module1/HelloServiceImpl"

        }
    }

    class Module2{
        companion object{
            const val PATH_MODULE2ACTIVITY = "/Module2/ModuleActivity"
        }
    }
}