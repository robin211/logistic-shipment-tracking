package com.fli.elogistic.driver.adapter

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.constants.CURRENT_SHIPMENT_CARGO_ID
import com.fli.elogistic.driver.models.POD.PodSimpleModel
import com.fli.elogistic.driver.models.PodModel
import com.fli.elogistic.driver.ui.activities.PODDetailActivity
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class PODAdapter(
    private var listPOD: ArrayList<PodSimpleModel>) : RecyclerView.Adapter<PODAdapter.PodItemHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PodItemHolder {
        return PodItemHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(
                R.layout.list_dokument_pod_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return listPOD.size
    }

    override fun onBindViewHolder(holder: PodItemHolder, position: Int) {
        holder.bindLocation(listPOD[position])
    }

    inner class PodItemHolder(v: View) : RecyclerView.ViewHolder(v) {
        private var view: View = v
        private var item: PodSimpleModel? = null
        init {
            v.setOnClickListener{
                val intent = Intent(view.context, PODDetailActivity::class.java)
//                todo update value of CURRENT_SHIPMENT_ID
                CURRENT_SHIPMENT_CARGO_ID = item!!.id.toLong()
                intent.putExtra("Model", item!!)
                startActivity(view.context,intent,null)
            }
        }

        @SuppressLint("UseCompatLoadingForDrawables", "SimpleDateFormat")
        fun bindLocation(item: PodSimpleModel) {
            this.item = item

            val dateFormatter = SimpleDateFormat("dd MMM yyyy")
            val hourFormatter = SimpleDateFormat("hh:mm")
            val dateString = dateFormatter.format(Date(item.pickupDate))
            val hourString = hourFormatter.format(Date(item.pickupDate))

            view.findViewById<TextView>(R.id.txt_no_kargo).text = item.title
            view.findViewById<TextView>(R.id.txt_date).text = dateString
            view.findViewById<TextView>(R.id.txt_time).text = hourString
            val tvPOD = view.findViewById<TextView>(R.id.tag_pod)
            when (item.latestStatus) {
                "BELUM_KIRIM_DOKUMEN" -> {
                    tvPOD.background = view.context.getDrawable(R.drawable.ic_belumkirimdokumen)
                    tvPOD.text = view.context.getString(R.string.belum_kirim_dokumen)
                }
                "DOKUMEN_TERKIRIM" -> {
                    tvPOD.background = view.context.getDrawable(R.drawable.ic_dokumenterkirim)
                    tvPOD.text = view.context.getString(R.string.dokumen_terkirim)
                }
                "DOKUMEN_TIDAK_LENGKAP" -> {
                    tvPOD.background = view.context.getDrawable(R.drawable.ic_dokumentidaklengkap)
                    tvPOD.text = view.context.getString(R.string.dokumen_tidak_lengkap)
                }
                "DOKUMEN_LENGKAP" -> {
                    tvPOD.background = view.context.getDrawable(R.drawable.ic_dokumenlengkap)
                    tvPOD.text = view.context.getString(R.string.dokumen_lengkap)
                }
            }
        }

    }

}