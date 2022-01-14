package com.fli.elogistic.driver.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.models.LocationAddressModel
import com.fli.elogistic.driver.ui.activities.KonfirmasiDetailActivity
import com.fli.elogistic.driver.ui.activities.PengirimanDetailActivity

class LocationAddressAdapter(
    private var listLocationAddress: ArrayList<LocationAddressModel>) : RecyclerView.Adapter<LocationAddressAdapter.LocationAddressHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LocationAddressHolder {
        return LocationAddressHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(
                R.layout.multi_location_item_maps,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return listLocationAddress.size
    }

    override fun onBindViewHolder(holder: LocationAddressHolder, position: Int) {
        holder.bindLocation(listLocationAddress[position])
    }

    inner class LocationAddressHolder(v: View) : RecyclerView.ViewHolder(v) {
        private var view: View = v
        private var item: LocationAddressModel? = null
        init {
            v.setOnClickListener{
                if (view.context is KonfirmasiDetailActivity) {
                    (view.context as KonfirmasiDetailActivity).goesToGoogleMaps(item!!.latitude,
                        item!!.longitude, item!!.location!!)
                }
            }
        }

        fun bindLocation(item: LocationAddressModel) {
            this.item = item
            view.findViewById<TextView>(R.id.txt_location).text = item.location
            view.findViewById<TextView>(R.id.txt_address).text = item.address

        }

    }

}