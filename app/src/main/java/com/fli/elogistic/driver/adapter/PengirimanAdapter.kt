package com.fli.elogistic.driver.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.models.KonfirmasiOrderModel
import com.fli.elogistic.driver.ui.activities.PengirimanDetailActivity

class PengirimanAdapter(
    private var listItemKonfirmasi: ArrayList<KonfirmasiOrderModel>) : RecyclerView.Adapter<PengirimanAdapter.KonfirmasiItemHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): KonfirmasiItemHolder {
        return KonfirmasiItemHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(
                R.layout.pengiriman_list_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return listItemKonfirmasi.size
    }

    override fun onBindViewHolder(holder: KonfirmasiItemHolder, position: Int) {
        holder.bindLocation(listItemKonfirmasi[position])
    }

    inner class KonfirmasiItemHolder(v: View) : RecyclerView.ViewHolder(v) {
        private var view: View = v
        private var item: KonfirmasiOrderModel? = null
        init {
            v.setOnClickListener{
                val intent = Intent(view.context, PengirimanDetailActivity::class.java)
                intent.putExtra("Model", item!!)
                startActivity(view.context,intent,null)
            }
        }

        fun bindLocation(item: KonfirmasiOrderModel) {
            this.item = item
            view.findViewById<TextView>(R.id.txt_initial_location).text = item.initialLocation
            view.findViewById<TextView>(R.id.txt_pick_location).text = item.pickUpLocations
            view.findViewById<TextView>(R.id.txt_drop_location).text = item.dropLocations
            view.findViewById<TextView>(R.id.txt_final_location).text = item.lastLocation
        }

    }

}