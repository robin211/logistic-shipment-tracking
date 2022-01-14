package com.fli.elogistic.driver.ui.activities


import android.content.Intent
import android.os.Bundle
import android.view.Menu
import androidx.activity.viewModels
import androidx.viewpager.widget.ViewPager
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.adapter.ViewPagerBottomAdapter
import com.fli.elogistic.driver.databinding.ActivityMainBinding
import com.fli.elogistic.driver.models.KonfirmasiOrderModel
import com.fli.elogistic.driver.util.setToken
import com.fli.elogistic.driver.viewmodel.IdentityViewModel
import com.google.android.material.bottomnavigation.BottomNavigationView

@Suppress("unused")
class MainActivity : BaseActivity() {
    lateinit var binding: ActivityMainBinding
    private val authViewModel: IdentityViewModel by viewModels()
//    lateinit var listDataDummy: ArrayList<KonfirmasiOrderModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        listDataDummy = initDataDummy()

        binding.mainLogoutButton.setOnClickListener {
            authViewModel.doLogout()
        }

        authViewModel.getLogoutResult().observe(this, {
            handleResponse(it,
                { logout() },
                { logout() })
        })

        binding.viewPager.adapter =
            ViewPagerBottomAdapter(
                supportFragmentManager
            )

        binding.btmTab.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        if (savedInstanceState == null) {
            binding.viewPager.currentItem = 0
        }

        binding.viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                val menu: Menu = binding.btmTab.menu
                menu.getItem(position).isChecked = true
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })
    }

    private val mOnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.konfirmasi_item -> {
                    binding.viewPager.currentItem = 0
                    return@OnNavigationItemSelectedListener true
                }
                R.id.pengiriman_item -> {
                    binding.viewPager.currentItem = 1
                    return@OnNavigationItemSelectedListener true
                }
                R.id.selesai_item -> {
                    binding.viewPager.currentItem = 2
                    return@OnNavigationItemSelectedListener true
                }
                R.id.hard_copy_ppod -> {
                    binding.viewPager.currentItem = 3
                    return@OnNavigationItemSelectedListener true
                }
                R.id.akun_item -> {
                    binding.viewPager.currentItem = 4
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    private fun logout() {
        sp.setToken("")
        val intent = Intent(this, AuthorizationActivity::class.java)
        startActivity(intent)
        finish()
    }

//    fun getDataDummy(): ArrayList<KonfirmasiOrderModel> {
//        return listDataDummy
//    }

//    private fun initDataDummy(): ArrayList<KonfirmasiOrderModel> {
//        val listModel:ArrayList<KonfirmasiOrderModel> = ArrayList()
//        val model1 = KonfirmasiOrderModel(
//            sp.getLong("id1", 0L),
//            sp.getString("noKargo1", ""),
//            sp.getString("tipeKendaraan1", ""),
//            sp.getString("noKendaraan1", ""),
//            sp.getString("datePickUp1", ""),
//            sp.getString("timePickUp1", ""),
//            sp.getString("initialLocation1", ""),
//            sp.getString("pickUpLocations1", ""),
//            sp.getString("dropLocations1", ""),
//            sp.getString("lastLocation1", ""),
//            sp.getString("status1", ""),
//            sp.getBoolean("initStart1", false),
//            sp.getBoolean("initFinish1", false),
//            sp.getBoolean("pickOneStart1", false),
//            sp.getBoolean("pickOneFinish1", false),
//            sp.getBoolean("pickTwoStart1", false),
//            sp.getBoolean("pickTwoFinish1", false),
//            sp.getBoolean("finalStart1", false),
//            sp.getBoolean("finalFinish1", false),
//            sp.getBoolean("dropOneStart1", false),
//            sp.getBoolean("dropOneFinish1", false),
//            sp.getBoolean("dropTwoStart1", false),
//            sp.getBoolean("dropTwoFinish1", false)
//        )
//        val model2 = KonfirmasiOrderModel(
//            sp.getLong("id2", 0L),
//            sp.getString("noKargo2", ""),
//            sp.getString("tipeKendaraan2", ""),
//            sp.getString("noKendaraan2", ""),
//            sp.getString("datePickUp2", ""),
//            sp.getString("timePickUp2", ""),
//            sp.getString("initialLocation2", ""),
//            sp.getString("pickUpLocations2", ""),
//            sp.getString("dropLocations2", ""),
//            sp.getString("lastLocation2", ""),
//            sp.getString("status2", ""),
//            sp.getBoolean("initStart2", false),
//            sp.getBoolean("initFinish2", false),
//            sp.getBoolean("pickOneStart2", false),
//            sp.getBoolean("pickOneFinish2", false),
//            sp.getBoolean("pickTwoStart2", false),
//            sp.getBoolean("pickTwoFinish2", false),
//            sp.getBoolean("finalStart2", false),
//            sp.getBoolean("finalFinish2", false),
//            sp.getBoolean("dropOneStart2", false),
//            sp.getBoolean("dropOneFinish2", false),
//            sp.getBoolean("dropTwoStart2", false),
//            sp.getBoolean("dropTwoFinish2", false)
//        )
//        listModel.add(model1)
//        listModel.add(model2)
//        return listModel
//    }

    override fun onResume() {
        super.onResume()
//        listDataDummy = initDataDummy()
    }

    override fun onBackPressed() {
        val a = Intent(Intent.ACTION_MAIN)
        a.addCategory(Intent.CATEGORY_HOME)
        a.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(a)
    }
}