package com.indogusmas.myappli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.indogusmas.log.TestLog

class MainActivity : AppCompatActivity() {

    val  testLog = TestLog()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testLog.test
    }
}