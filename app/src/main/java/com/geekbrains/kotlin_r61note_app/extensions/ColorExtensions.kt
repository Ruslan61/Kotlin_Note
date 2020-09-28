package com.geekbrains.kotlin_r61note_app.extensions

import android.content.Context
import androidx.core.content.ContextCompat
import com.geekbrains.kotlin_r61note_app.R
import com.geekbrains.kotlin_r61note_app.data.entity.Note

inline fun Note.Color.getColorInt(context: Context) =
    ContextCompat.getColor(context, getColorRes(context))

inline fun Note.Color.getColorRes(context: Context) = when (this) {
    Note.Color.WHITE -> R.color.white
    Note.Color.VIOLET -> R.color.violet
    Note.Color.YELLOW -> R.color.yellow
    Note.Color.RED -> R.color.red
    Note.Color.PINK -> R.color.pink
    Note.Color.GREEN -> R.color.green
}