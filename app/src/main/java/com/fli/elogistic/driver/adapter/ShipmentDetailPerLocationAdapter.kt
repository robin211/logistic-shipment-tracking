package com.fli.elogistic.driver.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.constants.*
import com.fli.elogistic.driver.models.shipment.DetailPerLocationModel
import com.fli.elogistic.driver.models.shipment.DetailPerLocationWithPictureModel
import com.fli.elogistic.driver.ui.activities.LokasiPenjemputanActivity

class ShipmentDetailPerLocationAdapter(
    private var listDetailPerLocation: ArrayList<DetailPerLocationWithPictureModel>,
    var isPenjemputan: Boolean, var currentSequence: Long, var isCurrentSequenceFinish: Boolean,
    var isCurrentSequenceBASTSubmitted: Boolean,
    var isSuspended: Boolean,
    var listButtonVisibility: ArrayList<Boolean>,
    var showPhoto: Boolean
) : RecyclerView.Adapter<ShipmentDetailPerLocationAdapter.DetailPerLocationHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DetailPerLocationHolder {
        return DetailPerLocationHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(
                R.layout.list_pesanan,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return listDetailPerLocation.size
    }

    override fun onBindViewHolder(holderDetailPer: DetailPerLocationHolder, position: Int) {
        holderDetailPer.bindLocation(listDetailPerLocation[position], position)
    }

    fun addImageSuratJalan(image: Any, position: Int) {
        listDetailPerLocation[position].listImageSuratJalan!!.add(image)
        notifyDataSetChanged()
    }

    fun removeImageSuratJalan(image: Any, position: Int) {
        listDetailPerLocation[position].listImageSuratJalan!!.remove(image)
        notifyDataSetChanged()
    }

    fun addImageDokumentasi(image: Any, position: Int) {
        listDetailPerLocation[position].listImageDokumentasi!!.add(image)
        notifyDataSetChanged()
    }

    fun removeImageDokumentasi(image: Any, position: Int) {
        listDetailPerLocation[position].listImageDokumentasi!!.remove(image)
        notifyDataSetChanged()
    }

    fun addImagePerintahPengiriman(image: Any, position: Int) {
        listDetailPerLocation[position].listImagePerintahPengiriman!!.add(image)
        notifyDataSetChanged()
    }

    fun removeImagePerintahPengiriman(image: Any, position: Int) {
        listDetailPerLocation[position].listImagePerintahPengiriman!!.remove(image)
        notifyDataSetChanged()
    }

    inner class DetailPerLocationHolder(v: View) : RecyclerView.ViewHolder(v) {
        private var view: View = v
        private var item: DetailPerLocationModel? = null
        private var position: Int? = 0

        private val OPERATION_CAPTURE_PHOTO_SURAT_JALAN = 1
        private val OPERATION_CAPTURE_PHOTO_DOKUMENTASI = 2
        private val OPERATION_CAPTURE_PHOTO_PERINTAH_PENGIRIMAN = 3

        init {
            val chevronUp = v.findViewById<ImageView>(R.id.chevronup)
            val chevronDown = v.findViewById<ImageView>(R.id.chevrondown)
//            val btnKirim = v.findViewById<TextView>(R.id.btn_kirim)

            v.findViewById<RelativeLayout>(R.id.header).setOnClickListener {
                if (chevronUp.visibility == View.VISIBLE) {
                    chevronDown.visibility = View.VISIBLE
                    chevronUp.visibility = View.GONE

                    v.findViewById<ScrollView>(R.id.content_holder).visibility = View.GONE
                } else {
                    chevronDown.visibility = View.GONE
                    chevronUp.visibility = View.VISIBLE
                    v.findViewById<ScrollView>(R.id.content_holder).visibility = View.VISIBLE

                    view.findViewById<RelativeLayout>(R.id.kategori_holder).visibility =
                        View.VISIBLE
                    view.findViewById<RelativeLayout>(R.id.catatan_holder).visibility = View.VISIBLE

                    if (isPenjemputan) {
                        view.findViewById<RelativeLayout>(R.id.kontak_pengirim_holder).visibility =
                            View.VISIBLE

                    } else {
                        view.findViewById<RelativeLayout>(R.id.kontak_pengirim_holder).visibility =
                            View.VISIBLE
                        view.findViewById<RelativeLayout>(R.id.kontak_penerima_holder).visibility =
                            View.VISIBLE

                    }

                    if (!isCurrentSequenceFinish && currentSequence > 0) {
                        view.findViewById<RelativeLayout>(R.id.detail_holder).visibility =
                            View.VISIBLE
                    }
                }
            }

            v.findViewById<ImageView>(R.id.camera_big_surat_jalan).setOnClickListener {
                takePicture(OPERATION_CAPTURE_PHOTO_SURAT_JALAN, position!!)
            }

            v.findViewById<ImageView>(R.id.camera_big_dokumentasi).setOnClickListener {
                takePicture(OPERATION_CAPTURE_PHOTO_DOKUMENTASI, position!!)
            }

            v.findViewById<ImageView>(R.id.camera_big_perintah_pengiriman).setOnClickListener {
                takePicture(OPERATION_CAPTURE_PHOTO_PERINTAH_PENGIRIMAN, position!!)
            }

            v.findViewById<ImageView>(R.id.camera_small_surat_jalan).setOnClickListener {
                takePicture(OPERATION_CAPTURE_PHOTO_SURAT_JALAN, position!!)
            }

            v.findViewById<ImageView>(R.id.camera_small_dokumentasi).setOnClickListener {
                takePicture(OPERATION_CAPTURE_PHOTO_DOKUMENTASI, position!!)
            }

            v.findViewById<ImageView>(R.id.camera_small_perintah_pengiriman).setOnClickListener {
                takePicture(OPERATION_CAPTURE_PHOTO_PERINTAH_PENGIRIMAN, position!!)
            }

            v.findViewById<TextView>(R.id.txt_lapor_kerusakan).setOnClickListener {
                if (view.context is LokasiPenjemputanActivity) {
                    (view.context as LokasiPenjemputanActivity).goesToBasp()
                }
            }


        }

        private fun takePicture(actionCode: Int, position: Int) {
            if (actionCode == OPERATION_CAPTURE_PHOTO_SURAT_JALAN) {
                if (listDetailPerLocation[position].listImageSuratJalan!!.size == MAX_IMAGE_SURAT_JALAN_DOKUMENTASI) {
                    Toast.makeText(
                        view.context,
                        "Jumlah_maksimal_photo_terpenuhi",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    if (view.context is LokasiPenjemputanActivity) {
                        (view.context as LokasiPenjemputanActivity).captureImage(actionCode, position)
                    }
                }
            } else if (actionCode == OPERATION_CAPTURE_PHOTO_DOKUMENTASI) {
                if (listDetailPerLocation[position].listImageDokumentasi!!.size == MAX_IMAGE_SURAT_JALAN_DOKUMENTASI) {
                    Toast.makeText(
                        view.context,
                        "Jumlah_maksimal_photo_terpenuhi",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    if (view.context is LokasiPenjemputanActivity) {
                        (view.context as LokasiPenjemputanActivity).captureImage(actionCode, position)
                    }
                }
            } else {
                if (listDetailPerLocation[position].listImagePerintahPengiriman!!.size == MAX_IMAGE_SURAT_JALAN_DOKUMENTASI) {
                    Toast.makeText(
                        view.context,
                        "Jumlah_maksimal_photo_terpenuhi",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    if (view.context is LokasiPenjemputanActivity) {
                        (view.context as LokasiPenjemputanActivity).captureImage(actionCode, position)
                    }
                }
            }
        }

        @SuppressLint("SetTextI18n", "UseCompatLoadingForDrawables")
        fun bindLocation(item: DetailPerLocationWithPictureModel, position: Int) {
            val LIST_NAME_SURAT_JALAN = "Surat Jalan"
            val LIST_NAME_DOKUMENTASI = "Dokumentasi"
            val LIST_NAME_PERINTAH_PENGIRIMAN = "Perintah Pengiriman"
            this.item = item.detailPerLocationModel
            this.position = position

            val rvSuratJalan = view.findViewById<RecyclerView>(R.id.rv_foto)
            val rvDokumentasi = view.findViewById<RecyclerView>(R.id.rv_foto_dokumentasi)
            val rvPerintahPengiriman =
                view.findViewById<RecyclerView>(R.id.rv_foto_perintah_pengiriman)
            val btnKirim = view.findViewById<TextView>(R.id.btn_kirim)
            val btnLapor = view.findViewById<TextView>(R.id.txt_lapor_kerusakan2)
            val txtStatus = view.findViewById<TextView>(R.id.txt_di_lokasi_penjemputan2)
            val txtStatus3 = view.findViewById<TextView>(R.id.txt_di_lokasi_penjemputan3)

            if (listButtonVisibility[position]){
                btnKirim.visibility = View.VISIBLE
            }
            else btnKirim.visibility = View.GONE

            var updateRedis = true

//            var visibleCount = 0
//            for (i in 0 until listButtonVisibility.size.minus(1)) {
//                if (listButtonVisibility[i]) visibleCount += 1
//            }
//
//            if (visibleCount >= 1) updateRedis = false

            view.findViewById<TextView>(R.id.no_pes).text = item.detailPerLocationModel.shipmentsTitle
            view.findViewById<TextView>(R.id.txt_kategori_barang).text = item.detailPerLocationModel.categoryName
            view.findViewById<TextView>(R.id.txt_sub_kategori_barang).text = item.detailPerLocationModel.subCategoryName
            view.findViewById<TextView>(R.id.txt_catatan).text = item.detailPerLocationModel.goodsNote

            var location = ""
            var multipickSize = 0
            var multidropSize = 0
            var totalSequence = 0L
            if (view.context is LokasiPenjemputanActivity) {
                multipickSize = (view.context as LokasiPenjemputanActivity).getMultipickSize()
                multidropSize = (view.context as LokasiPenjemputanActivity).getMultidropSize()
                totalSequence = (view.context as LokasiPenjemputanActivity).getTotalSequence()
            }
            if (isPenjemputan) {
                if (view.context is LokasiPenjemputanActivity) {
                    location = (view.context as LokasiPenjemputanActivity).getLocationName(true)
                }
                view.findViewById<RelativeLayout>(R.id.kontak_pengirim_holder).visibility =
                    View.VISIBLE
                view.findViewById<TextView>(R.id.txt_nama_pengirim).text = item.detailPerLocationModel.picNameSender
                view.findViewById<TextView>(R.id.txt_no_telp_pengirim).text = item.detailPerLocationModel.picPhoneSender

                if (currentSequence == 0L) {
                    btnKirim.visibility = View.GONE
                    //========================================================================

                    //===========================================================
                } else if (currentSequence == 1L && !isCurrentSequenceFinish) {
                    if (showPhoto){
                        if (!item.detailPerLocationModel.isPicTaken){
                            btnKirim.visibility = View.VISIBLE
                            view.findViewById<LinearLayout>(R.id.all_photo_holder).visibility=
                                View.VISIBLE
                            btnKirim.text =
                                "Simpan & Lanjutkan"
                            btnKirim.setOnClickListener {
                                CURRENT_SHIPMENT_ID = item.detailPerLocationModel.shipmentsId
                                if (view.context is LokasiPenjemputanActivity) {
                                    (view.context as LokasiPenjemputanActivity).startPostSquence(
                                        STATUS_DI_LOKASI_PENJEMPUTAN,
                                        location,
                                        false,
                                        updateRedis, true
                                    )
                                }

                            }
                        }else {
                            btnKirim.visibility = View.GONE
                            view.findViewById<LinearLayout>(R.id.all_photo_holder).visibility=
                                View.GONE
                        }
                    }else{
                        btnKirim.visibility = View.GONE
                        view.findViewById<LinearLayout>(R.id.all_photo_holder).visibility=
                            View.GONE
                    }
                } else if ((currentSequence == 1L && isCurrentSequenceFinish) ||
                    (currentSequence in 2..multipickSize &&
                            isCurrentSequenceFinish)
                ) {
                    btnKirim.visibility = View.GONE
                    //=========================================================

                    //===================================================================
                } else if (currentSequence > 1L && currentSequence <= multipickSize.plus(
                        1
                    ) && !isCurrentSequenceFinish
                ) {
                    if (showPhoto){
                        if (!item.detailPerLocationModel.isPicTaken){
                            btnKirim.visibility = View.VISIBLE
                            view.findViewById<LinearLayout>(R.id.all_photo_holder).visibility=
                                View.VISIBLE
                            btnKirim.text = "Simpan & Lanjutkan"
                            btnKirim.setOnClickListener {
                                CURRENT_SHIPMENT_ID = item.detailPerLocationModel.shipmentsId
                                if (view.context is LokasiPenjemputanActivity) {
                                    (view.context as LokasiPenjemputanActivity).startPostSquence(
                                        STATUS_DI_LOKASI_PENJEMPUTAN,
                                        location,
                                        false,
                                        updateRedis,
                                        true
                                    )
                                }
                            }
                        }else{
                            btnKirim.visibility = View.GONE
                            view.findViewById<LinearLayout>(R.id.all_photo_holder).visibility=
                                View.GONE
                        }
                    }else{
                        btnKirim.visibility = View.GONE
                        view.findViewById<LinearLayout>(R.id.all_photo_holder).visibility=
                            View.GONE
                    }
                }

            } else {
                if (view.context is LokasiPenjemputanActivity) {
                    location = (view.context as LokasiPenjemputanActivity).getLocationName(false)
                }
                view.findViewById<RelativeLayout>(R.id.kontak_pengirim_holder).visibility =
                    View.VISIBLE
                view.findViewById<RelativeLayout>(R.id.kontak_penerima_holder).visibility =
                    View.VISIBLE
                view.findViewById<TextView>(R.id.txt_nama_pengirim).text = item.detailPerLocationModel.picNameSender
                view.findViewById<TextView>(R.id.txt_no_telp_pengirim).text = item.detailPerLocationModel.picPhoneSender
                view.findViewById<TextView>(R.id.txt_nama_penerima).text = item.detailPerLocationModel.picName
                view.findViewById<TextView>(R.id.txt_no_telp_penerima).text = item.detailPerLocationModel.picPhone

                if (currentSequence == totalSequence.minus(1) && isCurrentSequenceFinish && isCurrentSequenceBASTSubmitted) {
                    btnKirim.visibility = View.GONE
                    //========================================================================

                    //================================================================
                } else if (currentSequence == totalSequence && !isCurrentSequenceFinish) {
                    if (showPhoto){
                        if (!item.detailPerLocationModel.isPicTaken){
                            btnKirim.visibility = View.VISIBLE
                            view.findViewById<LinearLayout>(R.id.all_photo_holder).visibility=
                                View.VISIBLE
                            btnKirim.text = "Simpan"
                            btnKirim.setOnClickListener {
                                CURRENT_SHIPMENT_ID = item.detailPerLocationModel.shipmentsId
                                if (view.context is LokasiPenjemputanActivity) {
                                    (view.context as LokasiPenjemputanActivity).startPostSquence(
                                        STATUS_DI_LOKASI_TUJUAN,
                                        location,
                                        true,
                                        updateRedis, true
                                    )
                                }
                            }
                        }else {
                            if (!item.detailPerLocationModel.isBastTaken){
                                view.findViewById<LinearLayout>(R.id.all_photo_holder).visibility=
                                    View.GONE
                                btnKirim.visibility = View.VISIBLE
                                txtStatus.visibility = View.VISIBLE
                                btnLapor.visibility = View.VISIBLE
                                btnLapor.setOnClickListener {
                                    if (view.context is LokasiPenjemputanActivity) {
                                        (view.context as LokasiPenjemputanActivity).goesToBasp()
                                    }
                                }
                                btnKirim.text = view.context.getString(R.string.berita_acara_serah_terima)
                                btnKirim.setOnClickListener {
                                    if (view.context is LokasiPenjemputanActivity) {
                                        (view.context as LokasiPenjemputanActivity).goesToBast(updateRedis, item.detailPerLocationModel)
                                    }
                                }
                            }else{
                                btnKirim.visibility = View.GONE
                                view.findViewById<LinearLayout>(R.id.all_photo_holder).visibility=
                                    View.GONE
                            }
                        }
                    }else{
                        btnKirim.visibility = View.GONE
                        view.findViewById<LinearLayout>(R.id.all_photo_holder).visibility=
                            View.GONE
                    }

                } else if (currentSequence == totalSequence && isCurrentSequenceFinish && !isCurrentSequenceBASTSubmitted) {
                    if (!item.detailPerLocationModel.isBastTaken){
                        view.findViewById<LinearLayout>(R.id.all_photo_holder).visibility=
                            View.GONE
                        btnKirim.visibility = View.VISIBLE
                        txtStatus.visibility = View.VISIBLE
                        btnLapor.visibility = View.VISIBLE
                        btnLapor.setOnClickListener {
                            if (view.context is LokasiPenjemputanActivity) {
                                (view.context as LokasiPenjemputanActivity).goesToBasp()
                            }
                        }
                        btnKirim.text = view.context.getString(R.string.berita_acara_serah_terima)
                        btnKirim.setOnClickListener {
                            if (view.context is LokasiPenjemputanActivity) {
                                (view.context as LokasiPenjemputanActivity).goesToBast(updateRedis, item.detailPerLocationModel)
                            }
                        }
                    }else {
                        btnKirim.visibility = View.GONE
                        view.findViewById<LinearLayout>(R.id.all_photo_holder).visibility=
                            View.GONE
                    }
                } else if (currentSequence == totalSequence && isCurrentSequenceFinish && isCurrentSequenceBASTSubmitted) {
                    btnKirim.visibility = View.GONE
                } else if ((currentSequence == multipickSize.plus(1L) &&
                            isCurrentSequenceFinish) || (currentSequence > multipickSize.plus(1L) &&
                            currentSequence <= multipickSize.plus(multidropSize) &&
                            isCurrentSequenceFinish)
                ) {
                    if (multidropSize > 0) {
                        btnKirim.visibility = View.GONE
                        //=============================================

                        //==============================================
                    } else {
                        btnKirim.visibility = View.GONE
                        //=============================================

                        //===========================================
                    }

                } else if ((currentSequence > multipickSize.plus(1) &&
                            currentSequence < totalSequence)
                ) {
                    btnKirim.visibility = View.VISIBLE
                    val no = currentSequence.minus(multipickSize).minus(1)
                    if (!isCurrentSequenceFinish) {
                        if (showPhoto){
                            btnKirim.visibility = View.VISIBLE
                            view.findViewById<LinearLayout>(R.id.all_photo_holder).visibility=
                                View.VISIBLE
                            btnKirim.text = "Simpan & Lanjutkan"
                            btnKirim.setOnClickListener {
                                CURRENT_SHIPMENT_ID = item.detailPerLocationModel.shipmentsId
                                if (view.context is LokasiPenjemputanActivity) {
                                    (view.context as LokasiPenjemputanActivity).startPostSquence(
                                        STATUS_DI_LOKASI_TUJUAN,
                                        location,
                                        true,
                                        updateRedis,
                                        true
                                    )
                                }
                            }
                        }else{
                            btnKirim.visibility = View.GONE
                            view.findViewById<LinearLayout>(R.id.all_photo_holder).visibility=
                                View.GONE
                        }

                    } else {
                        if (!item.detailPerLocationModel.isBastTaken){
                            btnKirim.visibility = View.VISIBLE
                            txtStatus.visibility = View.VISIBLE
                            btnLapor.visibility = View.VISIBLE
                            btnLapor.setOnClickListener {
                                if (view.context is LokasiPenjemputanActivity) {
                                    (view.context as LokasiPenjemputanActivity).goesToBasp()
                                }
                            }
                            btnKirim.text = view.context.getString(R.string.berita_acara_serah_terima)
                            btnKirim.setOnClickListener {
                                if (view.context is LokasiPenjemputanActivity) {
                                    (view.context as LokasiPenjemputanActivity).goesToBast(updateRedis, item.detailPerLocationModel)
                                }
                            }
                        }else{
                            btnKirim.visibility = View.GONE
                            view.findViewById<LinearLayout>(R.id.all_photo_holder).visibility=
                                View.GONE
                        }

                    }

                }
            }


            if (!isCurrentSequenceFinish && currentSequence > 0) {
                view.findViewById<RelativeLayout>(R.id.detail_holder).visibility = View.VISIBLE
            }

            if (item.listImageSuratJalan!!.size > 0) {
                view.findViewById<ImageView>(R.id.camera_big_surat_jalan).visibility = View.GONE
                view.findViewById<ImageView>(R.id.camera_small_surat_jalan).visibility =
                    View.VISIBLE
                rvSuratJalan.visibility = View.VISIBLE
                val adapter = ImageAdapter(item.listImageSuratJalan, LIST_NAME_SURAT_JALAN)
                val manager = LinearLayoutManager(
                    view.context,
                    LinearLayoutManager.HORIZONTAL,
                    true
                )

                rvSuratJalan.adapter = adapter
                rvSuratJalan.layoutManager = manager
                rvSuratJalan.scrollToPosition(item.listImageSuratJalan.size - 1)
            } else {
                view.findViewById<ImageView>(R.id.camera_big_surat_jalan).visibility = View.VISIBLE
                view.findViewById<ImageView>(R.id.camera_small_surat_jalan).visibility = View.GONE
                rvSuratJalan.visibility = View.GONE
            }

            if (item.listImageDokumentasi!!.size > 0) {
                view.findViewById<ImageView>(R.id.camera_big_dokumentasi).visibility = View.GONE
                view.findViewById<ImageView>(R.id.camera_small_dokumentasi).visibility =
                    View.VISIBLE
                rvDokumentasi.visibility = View.VISIBLE
                val adapter = ImageAdapter(item.listImageDokumentasi, LIST_NAME_DOKUMENTASI)
                val manager = LinearLayoutManager(
                    view.context,
                    LinearLayoutManager.HORIZONTAL,
                    true
                )

                rvDokumentasi.adapter = adapter
                rvDokumentasi.layoutManager = manager
                rvDokumentasi.scrollToPosition(item.listImageSuratJalan.size - 1)
            } else {
                view.findViewById<ImageView>(R.id.camera_big_dokumentasi).visibility = View.VISIBLE
                view.findViewById<ImageView>(R.id.camera_small_dokumentasi).visibility = View.GONE
                rvDokumentasi.visibility = View.GONE
            }

            if (item.listImagePerintahPengiriman!!.size > 0) {
                view.findViewById<ImageView>(R.id.camera_big_perintah_pengiriman).visibility =
                    View.GONE
                view.findViewById<ImageView>(R.id.camera_small_perintah_pengiriman).visibility =
                    View.VISIBLE
                rvPerintahPengiriman.visibility = View.VISIBLE
                val adapter =
                    ImageAdapter(item.listImagePerintahPengiriman, LIST_NAME_PERINTAH_PENGIRIMAN)
                val manager = LinearLayoutManager(
                    view.context,
                    LinearLayoutManager.HORIZONTAL,
                    true
                )

                rvPerintahPengiriman.adapter = adapter
                rvPerintahPengiriman.layoutManager = manager
                rvPerintahPengiriman.scrollToPosition(item.listImageSuratJalan.size - 1)
            } else {
                view.findViewById<ImageView>(R.id.camera_big_perintah_pengiriman).visibility =
                    View.VISIBLE
                view.findViewById<ImageView>(R.id.camera_small_perintah_pengiriman).visibility =
                    View.GONE
                rvPerintahPengiriman.visibility = View.GONE
            }
            if (isSuspended) {
                btnLapor.visibility = View.GONE
                btnKirim.visibility = View.GONE
                if (item.detailPerLocationModel.isBasp) {
                    txtStatus.visibility = View.GONE
                    txtStatus3.visibility = View.VISIBLE
                }
            } else {
                if (btnKirim.text.isEmpty()){
                    btnKirim.visibility = View.GONE
                    btnLapor.visibility = View.GONE
                }
                if (item.detailPerLocationModel.isBasp) {
                    btnLapor.visibility = View.GONE
                }
                if (TASK_PER_LOCATION_FINISHED){
                    btnKirim.visibility = View.GONE
                    btnLapor.visibility = View.GONE
                }
            }
        }
    }

}