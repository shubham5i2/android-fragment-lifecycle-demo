package com.sks.fragmentlifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Message", "1st activity onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message", "1st activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "1st activity onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "1st activity onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "1st activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message", "1st activity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "1st activity onDestroy")
    }
}