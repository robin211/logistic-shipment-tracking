package com.fli.elogistic.driver.ui

import android.content.Context
import android.view.View
import com.fli.elogistic.driver.R
import com.google.android.material.snackbar.Snackbar

interface BaseInterface{
    private fun createSnackbar(view: View, message: String, actionMessage: String, onClick: () -> Unit = {}){
        Snackbar.make(view, message, Snackbar.LENGTH_INDEFINITE).setAction(actionMessage) {
            kotlin.run(onClick)
        }.show()
    }

    fun createOkSnackbar(view: View, message: String, context: Context, onClick: () -> Unit = {}){
        createSnackbar(view, message, context.getString(R.string.ok), onClick)
    }

    fun createRetrySnackbar(view: View, message: String, context: Context, onClick: () -> Unit = {}){
        createSnackbar(view, message, context.getString(R.string.retry), onClick)
    }


    fun onUnauthorized(message: String): Boolean{
        return true
    }
}