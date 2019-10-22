package com.aadteam64.groupchallenge

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_fourth.*

class FourthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        ObjectAnimator.ofFloat(image_view_stars, "translationX", 120f, 10f).apply {
            duration = 2000
            start()
        }

        btnNext.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            startActivity(intent)
        }
    }



    fun correct (view: View) {

        // Root Animator Set
        val rootSet = AnimatorSet()

        // Flip Animation
        val btn1 = ObjectAnimator.ofFloat(radio_btn_1, "alpha", 1.0f, 0.0f)
        btn1.duration = 1000

        // Scale Animations
        val btn2 = ObjectAnimator.ofFloat(radio_btn_2, "alpha", 1.0f, 0.0f)
        btn2.duration = 1000


        val btn3 = ObjectAnimator.ofFloat(radio_btn_3, "alpha", 1.0f, 0.0f)
        btn3.duration = 1000


        rootSet.playTogether(btn1, btn2, btn3)

        rootSet.start()
        radio_btn_1.isClickable = false
        radio_btn_2.isClickable = false
        radio_btn_3.isClickable = false
        radio_btn_4.isClickable = false
    }

}