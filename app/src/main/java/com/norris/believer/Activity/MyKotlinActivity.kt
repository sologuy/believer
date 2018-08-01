package com.norris.believer.Activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.util.Log
import com.norris.believer.Bean.ArticleBean
import com.norris.believer.Bean.HomeBean
import com.norris.believer.R
import kotlinx.android.synthetic.main.activity_my_kotlin.*

class MyKotlinActivity : AppCompatActivity() {
    var TAG: String = "MyKotlinActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_kotlin)
        val c: Int = max(3, 4)
        Log.d(TAG, c.toString())
        tvKotlin.text = c.toString()
        tvKotlin.ellipsize = TextUtils.TruncateAt.END
        tvKotlin.text = c.toString() + max2(7, 8).toString()
        val strList:Array<String> = arrayOf("1","2","string")
        myFun(strList)

        var article  = ArticleBean()
        article.mindsharelist = HomeBean.MindsharelistBean()
        article.mindsharelist.current_page
    }

    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    fun max2(a: Int, b: Int): Int = if (a < b) b else a

    fun myFun(args:Array<String>){
        val name = if (args.size>0) args[0] else "kotlin"
        println(TAG+name+"---$name")
    }
}
