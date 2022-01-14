package com.fli.elogistic.driver.binding

import androidx.databinding.DataBindingComponent

class ActivityDataBindingComponent: DataBindingComponent {
    private val adapter by lazy { BindingAdapters }

    fun getBindingAdapters(): BindingAdapters = adapter

}