/**
 * Created by hehtao on 2017/6/20.
 */

package com.detao.hetao.kitlondemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_message.*



class MessageActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        val  lginfo = intent.getSerializableExtra(this::class.toString())

        if (lginfo is loginInfo){   // 强制类型转换有点费事,不像C和OC那么直接,但是如此引入类型检查反而更安全
            tv_message.text = lginfo.getACC();
        }
    }
}