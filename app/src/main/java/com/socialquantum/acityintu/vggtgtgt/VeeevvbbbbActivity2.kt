package com.socialquantum.acityintu.vggtgtgt

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import com.socialquantum.acityintu.R
import com.socialquantum.acityintu.databinding.ActivityVeeevvbbbb2Binding
import com.socialquantum.acityintu.defrfr.BaBaBaClass.Companion.hy26hyhy5hyhy
import com.socialquantum.acityintu.defrfr.BaBaBaClass.Companion.gtgthu
import com.socialquantum.acityintu.defrfr.BaBaBaClass.Companion.gthgthgt
import com.socialquantum.acityintu.defrfr.BaBaBaClass.Companion.hykpokkhykkhy
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException

class VeeevvbbbbActivity2 : AppCompatActivity() {

    private fun hyijjihyjihy(uri: String): Boolean {

        val hynjhynjhynj = packageManager
        try {

            hynjhynjhynj.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)

            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    private val gjigtjgtji = 1

    var hkjoihyjiyh: ValueCallback<Array<Uri>>? = null
    lateinit var gtngtnjkgtngtnjtg: WebView
    lateinit var hgjhjyhyjjhyi: ActivityVeeevvbbbb2Binding
    var ikioiol: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hgjhjyhyjjhyi = ActivityVeeevvbbbb2Binding.inflate(layoutInflater)
        setContentView(hgjhjyhyjjhyi.root)

        gtngtnjkgtngtnjtg = hgjhjyhyjjhyi.bgbgbgbggb
        Snackbar.make(
            hgjhjyhyjjhyi.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()


        val hyjihyjihyjhy = CookieManager.getInstance()
        hyjihyjihyjhy.setAcceptCookie(true)
        hyjihyjihyjhy.setAcceptThirdPartyCookies(gtngtnjkgtngtnjtg, true)
        g59gt5gt59gt()
        val hynhynkhynhynj: Activity = this
        gtngtnjkgtngtnjtg.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (hyijjihyjihy(url)) {

                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        startActivity(intent)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                gthyyhy(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(hynhynkhynhynj, description, Toast.LENGTH_SHORT).show()
            }


        }
        gtngtnjkgtngtnjtg.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                hkjoihyjiyh?.onReceiveValue(null)
                hkjoihyjiyh = filePathCallback
                var frgthyju: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (frgthyju!!.resolveActivity(packageManager) != null) {

                    var drfrgtt: File? = null
                    try {
                        drfrgtt = jukiloo()
                        frgthyju.putExtra("PhotoPath", ikioiol)
                    } catch (ex: IOException) {
                    }

                    if (drfrgtt != null) {
                        ikioiol = "file:" + drfrgtt.absolutePath
                        frgthyju.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(drfrgtt)
                        )
                    } else {
                        frgthyju = null
                    }
                }
                val jhyjhyjihyihyj = Intent(Intent.ACTION_GET_CONTENT)
                jhyjhyjihyihyj.addCategory(Intent.CATEGORY_OPENABLE)
                jhyjhyjihyihyj.type = "image/*"
                val bfrfvvfrvrfvvrfg: Array<Intent?> =
                    frgthyju?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val hpkokujouj = Intent(Intent.ACTION_CHOOSER)
                hpkokujouj.putExtra(Intent.EXTRA_INTENT, jhyjhyjihyihyj)
                hpkokujouj.putExtra(Intent.EXTRA_TITLE, getString(R.string.dfgtimage_chooserefrgtgttt))
                hpkokujouj.putExtra(Intent.EXTRA_INITIAL_INTENTS, bfrfvvfrvrfvvrfg)
                startActivityForResult(
                    hpkokujouj, gjigtjgtji
                )
                return true
            }

            @Throws(IOException::class)
            private fun jukiloo(): File {
                var frgtgy = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!frgtgy.exists()) {
                    frgtgy.mkdirs()
                }

                frgtgy =
                    File(frgtgy.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return frgtgy
            }

        }

        gtngtnjkgtngtnjtg.loadUrl(ggtgt59gt5gt5gt())
    }


    private fun g59gt5gt59gt() {
        val g59gt59tg5 = gtngtnjkgtngtnjtg.settings
        g59gt59tg5.javaScriptEnabled = true

        g59gt59tg5.useWideViewPort = true

        g59gt59tg5.loadWithOverviewMode = true
        g59gt59tg5.allowFileAccess = true
        g59gt59tg5.domStorageEnabled = true
        g59gt59tg5.userAgentString = g59gt59tg5.userAgentString.replace("; wv", "")

        g59gt59tg5.javaScriptCanOpenWindowsAutomatically = true
        g59gt59tg5.setSupportMultipleWindows(false)

        g59gt59tg5.displayZoomControls = false
        g59gt59tg5.builtInZoomControls = true
        g59gt59tg5.setSupportZoom(true)

        g59gt59tg5.pluginState = WebSettings.PluginState.ON
        g59gt59tg5.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        g59gt59tg5.cacheMode = WebSettings.LOAD_DEFAULT

        g59gt59tg5.allowContentAccess = true
    }




    private fun ggtgt59gt5gt5gt(): String {

        val h5y55hy = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val hyjuuu = "com.socialquantum.acityintu"

        val gtgt5hy95hy59hy:String? = Hawk.get(gtgthu, "null")
        val thyy: String? = Hawk.get(hy26hyhy5hyhy, "null")
        val hhy5hyuj: String? = Hawk.get(hykpokkhykkhy, "null")

        val h5hy59yh59hy5 = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)



        val hhy55hy6 = "deviceID="
        val gtjitgjitg = "sub_id_1="
        val puouou = "ad_id="
        val h26hy62hy2hy = "sub_id_4="
        val mnhjkjk = "sub_id_5="
        val mnhkyihky = "sub_id_6="


        val hykhykhyij = "naming"
        val hhy59hy59hy5hy = "deeporg"


        val gthyy = Build.VERSION.RELEASE

        val gthtghugt = Hawk.get(gthgthgt, "null")

        var gthugthugt = ""
        if (gtgt5hy95hy59hy != "null"){
            gthugthugt = "$gthtghugt$gtjitgjitg$gtgt5hy95hy59hy&$hhy55hy6$h5hy59yh59hy5&$puouou$thyy&$h26hy62hy2hy$hyjuuu&$mnhjkjk$gthyy&$mnhkyihky$hykhykhyij"
            hjhyjhyjhyyihj(h5hy59yh59hy5.toString())
        } else {
            gthugthugt = "$gthtghugt$gtjitgjitg$hhy5hyuj&$hhy55hy6$h5hy59yh59hy5&$puouou$thyy&$h26hy62hy2hy$hyjuuu&$mnhjkjk$gthyy&$mnhkyihky$hhy59hy59hy5hy"
            hjhyjhyjhyyihj(h5hy59yh59hy5.toString())
        }
        Log.d("lolo", "res is $gthugthugt")

        return h5y55hy.getString("SAVED_URL", gthugthugt).toString()
    }




    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != gjigtjgtji || hkjoihyjiyh == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var hyhyhyhyhyuj: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                hyhyhyhyhyuj = arrayOf(Uri.parse(ikioiol))
            } else {
                val gtgtggttg = data.dataString
                if (gtgtggttg != null) {
                    hyhyhyhyhyuj = arrayOf(Uri.parse(gtgtggttg))
                }
            }
        }
        hkjoihyjiyh?.onReceiveValue(hyhyhyhyhyuj)
        hkjoihyjiyh = null
    }




    var urlfififif = ""
    fun gthyyhy(gtjigtjigtji: String?) {
        if (!gtjigtjigtji!!.contains("t.me")) {

            if (urlfififif == "") {
                urlfififif = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    gtjigtjigtji
                ).toString()

                val gtgyhyj = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val defr = gtgyhyj.edit()
                defr.putString("SAVED_URL", gtjigtjigtji)
                defr.apply()
            }
        }
    }

    private var yhygttt6 = false
    override fun onBackPressed() {


        if (gtngtnjkgtngtnjtg.canGoBack()) {
            if (yhygttt6) {
                gtngtnjkgtngtnjtg.stopLoading()
                gtngtnjkgtngtnjtg.loadUrl(urlfififif)
            }
            this.yhygttt6 = true
            gtngtnjkgtngtnjtg.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                yhygttt6 = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    private fun hjhyjhyjhyyihj(hyhy5hy59hy: String) {
        OneSignal.setExternalUserId(
            hyhy5hy59hy,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val gt5tggt5 = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $gt5tggt5"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val nbbnbm =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $nbbnbm"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val mjmjjhhgf = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $mjmjjhhgf"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

}