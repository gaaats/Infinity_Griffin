package com.socialquantum.acityintu.rjiogtjigtjigt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import com.socialquantum.acityintu.R
import com.socialquantum.acityintu.defrfr.BaBaBaClass
import com.socialquantum.acityintu.defrfr.BaBaBaClass.Companion.hy26hyhy5hyhy
import com.socialquantum.acityintu.defrfr.BaBaBaClass.Companion.hyhy5yh95h
import com.socialquantum.acityintu.gtnjgtnjtgngt.GaaaamemmeActivity2
import com.socialquantum.acityintu.nhmkmkyhumkyh.Soorrro2Activity2
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Sorrrr1Activity2 : AppCompatActivity() {


    private fun gtjgtjigtjgtji() {

        val bnggtgtjgtngt = hyjijihyhyjjihy()

        if (bnggtgtjgtngt == "0") {
            jhjyhyjihyij()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                gthgthhugt()
            }

            khyjihyjihyjihy()
        }
    }

    private fun gthgthhugt(){
        val hykohykohykohy = AdvertisingIdClient(applicationContext)
        hykohykohykohy.start()
        val fbgbhgtbhgt = hykohykohykohy.info.id
        Hawk.put(hy26hyhy5hyhy, fbgbhgtbhgt)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorrrr12)
        gtjgtjigtjgtji()
    }

    private fun hyjijihyhyjjihy(): String? {
        val gtjigtjigtjgti: String? = Hawk.get(hyhy5yh95h)
        return gtjigtjigtjgti
    }

    private fun jhjyhyjihyij() {
        val vbfrfrgyfryggrf = Intent(this@Sorrrr1Activity2, GaaaamemmeActivity2::class.java)
        Hawk.put(BaBaBaClass.gtgth, null)
        Hawk.put(BaBaBaClass.g2hy59h55hy59hy, null)
        Hawk.put(BaBaBaClass.hyhy5yh95h, null)
        startActivity(vbfrfrgyfryggrf)
        finish()
    }

    private fun khyjihyjihyjihy() {
        val tggghgthugt = Intent(this@Sorrrr1Activity2, Soorrro2Activity2::class.java)
        startActivity(tggghgthugt)
        finish()
    }



}