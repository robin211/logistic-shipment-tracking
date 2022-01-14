package com.fli.elogistic.driver.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.models.biayaDanTambahanOngkir.BiayaOngkirModel
import org.jetbrains.anko.sdk27.coroutines.onClick

class DaftarBiayaAdapter(
    private var listBiayaOngkirModel: ArrayList<BiayaOngkirModel>, var isTambahan: Boolean
) : RecyclerView.Adapter<DaftarBiayaAdapter.BiayaHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BiayaHolder {
//        val layoutId = if (isTambahan) R.layout.item_biaya_tambahan else R.layout.item_daftar_biaya
        val layoutId = R.layout.item_daftar_biaya
        return BiayaHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(
                layoutId,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return listBiayaOngkirModel.size
    }

    override fun onBindViewHolder(holder: BiayaHolder, position: Int) {
        holder.bindLocation(listBiayaOngkirModel[position], position, isTambahan)
    }

    inner class BiayaHolder(v: View) : RecyclerView.ViewHolder(v) {
        private var view: View = v
        private var item: BiayaOngkirModel? = null

//        init {
//            if (isTambahan){
//                view.findViewById<ImageView>(R.id.btn_upload).onClick {
//
//                }
//            }
//
//        }

        fun bindLocation(item: BiayaOngkirModel, position: Int, isEnabled: Boolean) {
            this.item = item

                val number = view.findViewById<TextView>(R.id.no)
                val no = position + 1
                number.text = no.toString()
                if (item.status == "SUDAH_DIKIRIM") {
                    view.findViewById<TextView>(R.id.txt_status).visibility = View.VISIBLE
                    view.findViewById<TextView>(R.id.txt_status_belum_dikirim).visibility = View.GONE
                } else {
                    view.findViewById<TextView>(R.id.txt_status).visibility = View.GONE
                    view.findViewById<TextView>(R.id.txt_status_belum_dikirim).visibility = View.VISIBLE
                }
                val notes = view.findViewById<TextView>(R.id.txt_notes)

                view.findViewById<TextView>(R.id.nama).text = item.shippingCostName
                view.findViewById<EditText>(R.id.biaya).setText(item.amount.toString())
                val catatan = "Catatan: ${item.notes}"
                notes.text = catatan

        }

    }

}