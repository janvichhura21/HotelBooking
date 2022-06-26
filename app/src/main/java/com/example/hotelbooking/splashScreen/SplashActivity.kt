package com.example.hotelbooking.splashScreen

import android.content.Context
import android.content.SharedPreferences
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.View
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager
import com.example.hotelbooking.R
import com.example.hotelbooking.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding
    lateinit var myAdapter: SplashAdapter
    lateinit var dotsTv:Array<TextView?>
    lateinit var layouts:IntArray
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!isFirstTimeAppStart()){
            setAppStartStatus(false)
        }
        binding=DataBindingUtil.setContentView(this,R.layout.activity_splash)
        binding.root

        statusBarTransParent()
        val stb=AnimationUtils.loadAnimation(this,R.anim.stb)
        val btn=AnimationUtils.loadAnimation(this,R.anim.btn_anime)
        binding.startBtn.startAnimation(btn)
        binding.viewPager.startAnimation(stb)
        layouts= intArrayOf(R.layout.slider_1,R.layout.slider_2,R.layout.slider_3)
        myAdapter= SplashAdapter(layouts,applicationContext)
        binding.viewPager.adapter=myAdapter
        binding.viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                if (position==layouts.size-1){

                }
                else{

                }
                setDots(position)
            }

            override fun onPageScrollStateChanged(state: Int) {

            }

        })
        setDots(0)
    }

    private fun isFirstTimeAppStart():Boolean{
        val pref=applicationContext.getSharedPreferences("SLIDER_APP", Context.MODE_PRIVATE)
        return pref.getBoolean("APP_START",true)
    }

    private fun setAppStartStatus(status:Boolean){
        val pref=applicationContext.getSharedPreferences("SLIDER_APP",Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor=pref.edit()
        editor.putBoolean("APP_START",status)
        editor.apply()
    }

    private fun statusBarTransParent() {
        if (Build.VERSION.SDK_INT >= 21){
            window.decorView.systemUiVisibility=View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            val window=window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor= Color.TRANSPARENT

        }
    }

    private fun setDots(page:Int){
        binding.dotLayout.removeAllViews()
        dotsTv= arrayOfNulls(layouts.size)

        for (i in dotsTv.indices){
            dotsTv[i] = TextView(this)
            dotsTv[i]!!.text= Html.fromHtml("&#8226;")
            dotsTv[i]!!.textSize=30f
            dotsTv[i]!!.setTextColor(Color.parseColor("#a9b4bb"))
            binding.dotLayout.addView(dotsTv[i])
        }
        if (dotsTv.isNotEmpty()){
            dotsTv[page]!!.setTextColor(Color.parseColor("#4EC653"))
        }

    }
}