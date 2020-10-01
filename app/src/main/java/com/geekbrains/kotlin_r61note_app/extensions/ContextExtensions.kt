package com.geekbrains.kotlin_r61note_app.extensions

import android.content.Context

inline fun Context.dip(value: Int) = resources.displayMetrics.density * value