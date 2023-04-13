package com.gurkanmutlu.fragmentkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun firstFragment(view: View) {
        val fragmentmanager = supportFragmentManager
        val fragmentTransaction = fragmentmanager.beginTransaction()

        val firstFragment = BlankFragment()
        fragmentTransaction.replace(R.id. frameLayout , firstFragment).commit()

    }

    fun secondFragment(view: View) {

        val fragmentmanager = supportFragmentManager.beginTransaction()
        val secondFragment = BlankFragment2()
        fragmentmanager.replace(R.id.frameLayout, secondFragment).commit()
    }
}
