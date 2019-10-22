package com.aadteam64.groupchallenge

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        btnNext.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }
    }

    fun correct (view: View) {

        // Root Animator Set
        val rootSet = AnimatorSet()

        // Flip Animation
        val opt1 = ObjectAnimator.ofFloat(imagePic1, "alpha", 1.0f, 0.0f)
        opt1.duration = 1000


        // Child Animator Set
        val childSet1 = AnimatorSet()
        val childSet2 = AnimatorSet()

        // Scale Animations
        val opt2 = ObjectAnimator.ofFloat(imagePic3, "alpha", 1.0f, 0.0f)
        opt2.duration = 1000


        val opt3 = ObjectAnimator.ofFloat(imagePic4, "alpha", 1.0f, 0.0f)
        opt3.duration = 1000

        val scaleX = ObjectAnimator.ofFloat(imagePic2, "scaleX", 1.0f, 1.3f)
        scaleX.duration = 500

        val scaleY = ObjectAnimator.ofFloat(imagePic2, "scaleY", 1.0f, 1.3f)
        scaleY.duration = 500

        val translationX = ObjectAnimator.ofFloat(imagePic2, "translationX", 0.0f, -260f)
        translationX.duration = 500


        childSet1.playTogether(opt1, opt2, opt3, translationX)
        childSet2.playTogether(scaleX, scaleY)
        rootSet.playSequentially(childSet1, childSet2)

        rootSet.start()

        imagePic1.isClickable = false
        imagePic2.isClickable = false
        imagePic3.isClickable = false
        imagePic4.isClickable = false
        btnNext.isVisible = true
    }


}
