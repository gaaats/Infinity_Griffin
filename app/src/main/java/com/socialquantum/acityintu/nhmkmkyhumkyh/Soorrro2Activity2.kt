package com.socialquantum.acityintu.nhmkmkyhumkyh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.orhanobut.hawk.Hawk
import com.socialquantum.acityintu.vggtgtgt.VeeevvbbbbActivity2
import com.socialquantum.acityintu.databinding.ActivitySoorrro22Binding
import com.socialquantum.acityintu.defrfr.BaBaBaClass
import com.socialquantum.acityintu.defrfr.BaBaBaClass.Companion.gtgth
import com.socialquantum.acityintu.defrfr.BaBaBaClass.Companion.gtgthu
import com.socialquantum.acityintu.defrfr.BaBaBaClass.Companion.hyhy5yh95h
import com.socialquantum.acityintu.defrfr.BaBaBaClass.Companion.g2hy59h55hy59hy
import com.socialquantum.acityintu.defrfr.BaBaBaClass.Companion.hykpokkhykkhy
import com.socialquantum.acityintu.gtnjgtnjtgngt.GaaaamemmeActivity2
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class Soorrro2Activity2 : AppCompatActivity() {
    private fun ghtyytyt() {
        val jjuujkikilo5 = Intent(this@Soorrro2Activity2, GaaaamemmeActivity2::class.java)
        Hawk.put(gtgth, null)
        Hawk.put(g2hy59h55hy59hy, null)
        Hawk.put(BaBaBaClass.hyhy5yh95h, null)
        startActivity(jjuujkikilo5)
        finish()
    }

    lateinit var hy5hy59hy5: ActivitySoorrro22Binding

    private val gttg5595gt5gt = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            Hawk.put(gtgthu, dataGotten)
        }

        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        hy5hy59hy5 = ActivitySoorrro22Binding.inflate(layoutInflater)
        setContentView(hy5hy59hy5.root)

        val hy59hy59hy59: String? = Hawk.get(hyhy5yh95h, "null")

        if (hy59hy59hy59 == "1") {
            AppsFlyerLib.getInstance()
                .init("5uJunS9gJcDJdN7k5bwrqQ", gttg5595gt5gt, applicationContext)
            AppsFlyerLib.getInstance().start(this)
        }

        gtugthgthugt()

    }


    private fun gtjgtjigtjitgj() {
        val hy5959 = Intent(this@Soorrro2Activity2, VeeevvbbbbActivity2::class.java)
        Hawk.put(gtgth, null)
        Hawk.put(g2hy59h55hy59hy, null)
        Hawk.put(BaBaBaClass.hyhy5yh95h, null)
        startActivity(hy5959)
        finish()
    }


    private fun gtugthgthugt() {

        val ftgtt: String = Hawk.get(gtgth)
        val gtghylp: String = Hawk.get(g2hy59h55hy59hy, "null")

        val gthgt: String? = Hawk.get(hykpokkhykkhy, "null")
        val vnfbyg: String? = Hawk.get(hyhy5yh95h, "null")
        var dfedfredr: String? = Hawk.get(gtgthu)

        if (vnfbyg == "1") {
            val hyohyitutu = Executors.newSingleThreadScheduledExecutor()
            hyohyitutu.scheduleAtFixedRate({
                if (dfedfredr != null) {

                    if (dfedfredr!!.contains("tdb2") || ftgtt.contains(gtghylp) || gthgt!!.contains(
                            "tdb2"
                        )
                    ) {
                        hyohyitutu.shutdown()

                        gtjgtjigtjitgj()
                    } else {
                        hyohyitutu.shutdown()

                        ghtyytyt()
                    }
                } else {
                    dfedfredr = Hawk.get(gtgthu)
                }
            }, 0, 1, TimeUnit.SECONDS)
        } else if (ftgtt.contains(gtghylp)) {

            gtjgtjigtjitgj()
        } else {
            ghtyytyt()
        }

    }

}