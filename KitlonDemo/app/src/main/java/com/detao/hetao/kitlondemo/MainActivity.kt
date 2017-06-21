/**
 * Created by hehtao on 2017/6/20.  玩转Activity 正向和逆向传值
 */

package com.detao.hetao.kitlondemo

import android.accounts.Account
import android.content.Intent
import android.hardware.display.DisplayManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import kotlinx.android.synthetic.main.activity_main.*
import com.detao.hetao.kitlondemo.MessageActivity
import java.io.Serializable


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
            System.out.println(MessageActivity::class.toString())
        }
        tv_message.width = outMetrics.widthPixels / 4;
        tv_message.setOnClickListener {
            System.out.println("message")
        }
        tv_mine.width = outMetrics.widthPixels / 4;
        tv_mine.setOnClickListener {
            val  intent = Intent(this,MessageActivity::class.java)
            val info = loginInfo("111","2222")
            intent.putExtra(MessageActivity::class.toString(),info);      // 传递class
//            intent.putExtra(MessageActivity::class.toString() ,"hello") // 传递String等基本类型数据
            startActivity(intent);

        }
    }
}



class loginInfo(val account: String,val password: String): Serializable{  //必须有 Serializable 接口
     fun  getACC(): String = account;  //简单的lambda
     init {
        System.out.println(account + password);
     }
}


//  看不懂的推荐研读《Kotlin document》
//  中文版翻译:https://github.com/huanglizhuo/kotlin-in-chinese
//  英文原版:https://kotlinlang.org/docs/reference/