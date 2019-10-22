package com.aadteam64.groupchallenge

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_second.*

class
SecondActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        buttonNext.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }
    }

    fun correct (view: View) {

        // Root Animator Set
        val rootSet = AnimatorSet()

        // Flip Animation
        val opt1 = ObjectAnimator.ofFloat(option1, "alpha", 1.0f, 0.0f)
        opt1.duration = 1000


        // Child Animator Set
        val childSet = AnimatorSet()

        // Scale Animations
        val opt2 = ObjectAnimator.ofFloat(option2, "alpha", 1.0f, 0.0f)
        opt2.duration = 1000


        val opt3 = ObjectAnimator.ofFloat(option3, "alpha", 1.0f, 0.0f)
        opt3.duration = 1000


        rootSet.playTogether(opt1, opt2, opt3)

        rootSet.start()
        buttonNext.isVisible = true
        option1.isClickable = false
        option2.isClickable = false
        option3.isClickable = false
        option4.isClickable = false
    }


}
