package com.aadteam64.groupchallenge

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_fourth.*
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_third.*

class FourthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        val imgView = ObjectAnimator.ofFloat(image_view_stars, "alpha", 2.0f, 0.0f)
        imgView.duration = 2000
        val scaleX = ObjectAnimator.ofFloat(image_view_stars, "scaleX", 1.0f, 1.3f)
        scaleX.duration = 500
    }

    fun correct (view: View) {

        // Root Animator Set
        val rootSet = AnimatorSet()

        // Flip Animation
        val btn_1 = ObjectAnimator.ofFloat(radio_btn_1, "alpha", 1.0f, 0.0f)
        btn_1.duration = 1000

        // Scale Animations
        val btn_2 = ObjectAnimator.ofFloat(radio_btn_2, "alpha", 1.0f, 0.0f)
        btn_2.duration = 1000


        val btn_3 = ObjectAnimator.ofFloat(radio_btn_3, "alpha", 1.0f, 0.0f)
        btn_3.duration = 1000


        rootSet.playTogether(btn_1, btn_2, btn_3)

        rootSet.start()
        buttonNext.isVisible = true
        radio_btn_1.isClickable = false
        radio_btn_2.isClickable = false
        radio_btn_3.isClickable = false
        radio_btn_4.isClickable = false
    }

}
