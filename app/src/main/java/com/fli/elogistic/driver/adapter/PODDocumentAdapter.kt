package com.fli.elogistic.driver.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.models.POD.PodDocumentModel

class PODDocumentAdapter(
    private var podDocumentList: ArrayList<PodDocumentModel>
) : RecyclerView.Adapter<PODDocumentAdapter.PODDocumentHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PODDocumentHolder {
        return PODDocumentHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(
                R.layout.list_dokumen_pod,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return podDocumentList.size
    }

    override fun onBindViewHolder(holder: PODDocumentHolder, position: Int) {
//        if (podDocumentList.size == 0){
//            for (i in 1..3){
//                holder.bindLocation(imageUrlList.get(position))
//            }
//        }
        holder.bindLocation(podDocumentList.get(position))
    }

//    fun addImage(bitmap: Bitmap) {
//        imageUrlList.add(bitmap)
//        notifyDataSetChanged()
//    }

    inner class PODDocumentHolder(v: View) : RecyclerView.ViewHolder(v) {
        private var view: View = v
        private var item: PodDocumentModel? = null

//        init {
//            v.setOnClickListener {
//                if (view.context is LokasiPenjemputanActivity) {
//                    (view.context as LokasiPenjemputanActivity).takePicture()
//                }
//            }
//        }

        fun bindLocation(item: PodDocumentModel?) {
            if (item != null){
                this.item = item
                view.findViewById<TextView>(R.id.txt_tipe_dokumen).text = item.tipe
                view.findViewById<TextView>(R.id.txt_nama_dokumen).text = item.nama
            }
        }

    }

}