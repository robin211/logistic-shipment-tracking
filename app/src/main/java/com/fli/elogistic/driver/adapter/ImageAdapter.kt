package com.fli.elogistic.driver.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.ui.activities.AccidentActivity
import com.fli.elogistic.driver.ui.activities.LaporanKerusakanSelisihActivity
import com.fli.elogistic.driver.ui.activities.LokasiPenjemputanActivity

class ImageAdapter(
    private var imageUrlList: ArrayList<Any>,
    private var listName: String,
) : RecyclerView.Adapter<ImageAdapter.ImageHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ImageHolder {
        return ImageHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(
                R.layout.list_image,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return imageUrlList.size
    }

    override fun onBindViewHolder(holder: ImageHolder, position: Int) {
//        if (imageUrlList.size == 0){
//            for (i in 1..3){
//                holder.bindLocation(imageUrlList[position])
//            }
//        }
        holder.bindLocation(imageUrlList[position])
    }

    fun addImage(image: Any) {
        imageUrlList.add(image)
        notifyDataSetChanged()
    }

    fun deleteImage(bitmap: Any?) {
        imageUrlList.remove(bitmap)
        notifyDataSetChanged()
    }

    inner class ImageHolder(v: View) : RecyclerView.ViewHolder(v) {
        private var view: View = v
        private var item: Any? = null

        init {
            view.findViewById<ImageView>(R.id.delete_image).setOnClickListener {
                deleteImage(item)
                if (view.context is LokasiPenjemputanActivity){
                    (view.context as LokasiPenjemputanActivity).deleteImage(item, listName, position)
                }
                if (view.context is LaporanKerusakanSelisihActivity){
                    (view.context as LaporanKerusakanSelisihActivity).deleteImage(item, listName)
                }
                if (view.context is AccidentActivity){
                    (view.context as AccidentActivity).deleteImage(item)
                }
            }
        }

        fun bindLocation(item: Any?) {
            if (item != null){
                this.item = item
                Glide.with(view.context).load(item).into(view.findViewById(R.id.image))
            }
        }

    }

}