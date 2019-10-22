package com.aadteam64.groupchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SpinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spin)


    }

    fun RunAnimation(v: View) {
        StartLoading()


        val handler = Handler()
        handler.postDelayed(Runnable { StopLoading() }, 5000)
    }

    fun StartLoading() {
        val refreshImage = this.findViewById(R.id.anim_spin) as ImageView
        refreshImage.setImageDrawable(resources.getDrawable(R.drawable.loading_circle))
        val rotateLoading = AnimationUtils.loadAnimation(this, R.anim.rotate)
        refreshImage.clearAnimation()
        refreshImage.setAnimation(rotateLoading)
    }

    fun StopLoading() {
        val refreshImage = this.findViewById(R.id.anim_spin) as ImageView
        if (refreshImage.getAnimation() != null) {
            refreshImage.clearAnimation()
            refreshImage.setImageDrawable(resources.getDrawable(R.drawable.loading_circle))
        }
    }

}
