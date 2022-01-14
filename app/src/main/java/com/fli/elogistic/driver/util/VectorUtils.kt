package com.fli.elogistic.driver.util

import android.content.Context
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat

fun showVector(context: Context, id: Int): VectorDrawableCompat?{
    val resources = context.resources
    val theme = context.theme
    return VectorDrawableCompat.create(resources, id, theme)
}