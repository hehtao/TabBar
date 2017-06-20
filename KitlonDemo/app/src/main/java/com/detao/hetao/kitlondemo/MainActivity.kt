package com.detao.hetao.kitlondemo

import android.content.Intent
import android.hardware.display.DisplayManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import kotlinx.android.synthetic.main.activity_main.*
import com.detao.hetao.kitlondemo.MessageActivity


val  outMetrics = DisplayMetrics()

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        windowManager.defaultDisplay.getMetrics(outMetrics);
        tv_connecter.width = outMetrics.widthPixels / 4;
        tv_connecter.setOnClickListener {
            System.out.println("connecter")
        }
        tv_home.width = outMetrics.widthPixels / 4;
        tv_home.setOnClickListener {
            System.out.println("connecter")
        }
        tv_message.width = outMetrics.widthPixels / 4;
        tv_message.setOnClickListener {
            System.out.println("message")
        }
        tv_mine.width = outMetrics.widthPixels / 4;
        tv_mine.setOnClickListener {
            System.out.println("mine")

            val  intent = Intent(this,MessageActivity::class.java)

            startActivity(intent)
        }
    }
}
