package com.fli.elogistic.driver.binding

import androidx.databinding.DataBindingComponent
import androidx.fragment.app.Fragment

class FragmentDataBindingComponent(val fragment: Fragment) : DataBindingComponent {

    private val fragmentAdapter by lazy { FragmentBindingAdapters }

    private val adapter by lazy { BindingAdapters }

    fun getBindingAdapters(): BindingAdapters = adapter

    fun getFragmentBindingAdapters(): FragmentBindingAdapters = fragmentAdapter

}