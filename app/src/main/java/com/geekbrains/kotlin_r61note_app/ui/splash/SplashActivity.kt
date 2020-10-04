package com.geekbrains.kotlin_r61note_app.ui.splash

import android.os.Handler
import org.koin.android.viewmodel.ext.android.viewModel
import com.geekbrains.kotlin_r61note_app.ui.base.BaseActivity
import com.geekbrains.kotlin_r61note_app.ui.main.MainActivity

class SplashActivity : BaseActivity<Boolean?>() {

    override val viewModel: SplashViewModel by viewModel()

    override val layoutRes = null

    override fun onResume() {
        super.onResume()
        Handler().postDelayed({ viewModel.requestUser() }, 1000)
    }

    override fun renderData(data: Boolean?) {
        data?.takeIf { it }?.let {
            startMainActivity()
        }
    }

    fun startMainActivity() {
        MainActivity.start(this)
        finish()
    }

}