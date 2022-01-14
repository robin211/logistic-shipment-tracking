package com.fli.elogistic.driver.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.fli.elogistic.driver.ui.fragments.*

class ViewPagerBottomAdapter (fm: FragmentManager): FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    private val pages = listOf(
        KonfirmasiFragment(),
//        PenjemputanFragment(),
        PengirimanFragment(),
        SelesaiFragment(),
        HardCopyPODFragment(),
        AkunFragment()
    )

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Konfirmasi"
            1 -> "Pengiriman"
            2 -> "Selesai"
            3 -> "Hard Copy POD"
            else -> {
                return "Akun"
            }
        }
    }
}