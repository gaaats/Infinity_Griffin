package com.socialquantum.acityintu.defrfr

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class BaBaBaClass:Application() {


    private fun rfjjgtjtgjigtjijgt() {
        Hawk.init(this).build()
    }

    companion object {
        const val ghyujjuujuj = "4d24ff2d-d132-48d3-a0bf-41f486f6375d"
        var hyhy5yh95h = "appsChecker"
        var gtgthu: String? = "c11"
        var gthgthgt = "link"
        var hy26hyhy5hyhy: String? = "mainid"
        var hykpokkhykkhy: String? = "d11"
        var g2hy59h55hy59hy: String? = "countryCode"
        var gtgth = "geo"

    }


    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ghyujjuujuj)
        rfjjgtjtgjigtjijgt()
    }
}