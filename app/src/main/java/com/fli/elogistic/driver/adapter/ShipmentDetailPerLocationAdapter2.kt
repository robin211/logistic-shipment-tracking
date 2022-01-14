package com.fli.elogistic.driver.adapter

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.constants.*
import com.fli.elogistic.driver.models.shipment.DetailPerLocationWithPictureModel
import com.fli.elogistic.driver.services.LocationsService
import com.fli.elogistic.driver.ui.activities.LokasiPenjemputanActivity

class ShipmentDetailPerLocationAdapter2(
    private var listDetailPerLocation: ArrayList<DetailPerLocationWithPictureModel>,
    var isPenjemputan: Boolean, var currentSequence: Long, var isCurrentSequenceFinish: Boolean,
    var isCurrentSequenceBASTSubmitted: Boolean,
    var isSuspended: Boolean,
    var listButtonVisibility: ArrayList<Boolean>
) : RecyclerView.Adapter<ShipmentDetailPerLocationAdapter2.DetailPerLocationHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DetailPerLocationHolder {
        return DetailPerLocationHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(
                R.layout.list_pesanan2,
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

    fun addImageSuratJalan(image: Any, position : Int) {
        if (listDetailPerLocation[position].listImageSuratJalan!!.size>0){
            listDetailPerLocation[position].listImageSuratJalan!!.add(image)
        }
        notifyDataSetChanged()
    }

    fun removeImageSuratJalan(image: Any, position : Int) {
//        listDetailPerLocation[position].listImageSuratJalan!!.remove(image)
        notifyDataSetChanged()
    }

    fun addImageDokumentasi(image: Any, position: Int) {
//        listDetailPerLocation[position].listImageDokumentasi!!.add(image)
        notifyDataSetChanged()
    }

    fun removeImageDokumentasi(image: Any, position: Int) {
//        listDetailPerLocation[position].listImageDokumentasi!!.remove(image)
        notifyDataSetChanged()
    }

    fun addImagePerintahPengiriman(image: Any, position: Int) {
//        listDetailPerLocation[position].listImagePerintahPengiriman!!.add(image)
        notifyDataSetChanged()
    }

    fun removeImagePerintahPengiriman(image: Any, position: Int) {
//        listDetailPerLocation[position].listImagePerintahPengiriman!!.remove(image)
        notifyDataSetChanged()
    }

    inner class DetailPerLocationHolder(v: View) : RecyclerView.ViewHolder(v) {
        private var view: View = v
        private var item: DetailPerLocationWithPictureModel? = null
        private var position: Int? = 0

        private val OPERATION_CAPTURE_PHOTO_SURAT_JALAN = 1
        private val OPERATION_CAPTURE_PHOTO_DOKUMENTASI = 2
        private val OPERATION_CAPTURE_PHOTO_PERINTAH_PENGIRIMAN = 3

        init {
            val chevronUp = v.findViewById<ImageView>(R.id.chevronup)
            val chevronDown = v.findViewById<ImageView>(R.id.chevrondown)

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
                takePicture(OPERATION_CAPTURE_PHOTO_SURAT_JALAN)
            }

            v.findViewById<ImageView>(R.id.camera_big_dokumentasi).setOnClickListener {
                takePicture(OPERATION_CAPTURE_PHOTO_DOKUMENTASI)
            }

            v.findViewById<ImageView>(R.id.camera_big_perintah_pengiriman).setOnClickListener {
                takePicture(OPERATION_CAPTURE_PHOTO_PERINTAH_PENGIRIMAN)
            }

            v.findViewById<ImageView>(R.id.camera_small_surat_jalan).setOnClickListener {
                takePicture(OPERATION_CAPTURE_PHOTO_SURAT_JALAN)
            }

            v.findViewById<ImageView>(R.id.camera_small_dokumentasi).setOnClickListener {
                takePicture(OPERATION_CAPTURE_PHOTO_DOKUMENTASI)
            }

            v.findViewById<ImageView>(R.id.camera_small_perintah_pengiriman).setOnClickListener {
                takePicture(OPERATION_CAPTURE_PHOTO_PERINTAH_PENGIRIMAN)
            }

            v.findViewById<TextView>(R.id.txt_lapor_kerusakan).setOnClickListener {
                if (view.context is LokasiPenjemputanActivity) {
                    (view.context as LokasiPenjemputanActivity).goesToBasp()
                }
            }


        }

        private fun takePicture(actionCode: Int) {
            if (actionCode == OPERATION_CAPTURE_PHOTO_SURAT_JALAN) {
                if (item!!.listImageSuratJalan!!.size == MAX_IMAGE_SURAT_JALAN_DOKUMENTASI) {
                    Toast.makeText(
                        view.context,
                        "Jumlah_maksimal_photo_terpenuhi",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
//                    if (view.context is LokasiPenjemputanActivity) {
//                        (view.context as LokasiPenjemputanActivity).captureImage(actionCode, position!!)
//                    }
                }
            } else if (actionCode == OPERATION_CAPTURE_PHOTO_DOKUMENTASI) {
                if (item!!.listImageDokumentasi!!.size == MAX_IMAGE_SURAT_JALAN_DOKUMENTASI) {
                    Toast.makeText(
                        view.context,
                        "Jumlah_maksimal_photo_terpenuhi",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
//                    if (view.context is LokasiPenjemputanActivity) {
//                        (view.context as LokasiPenjemputanActivity).captureImage(actionCode, position!!)
//                    }
                }
            } else {
                if (item!!.listImagePerintahPengiriman!!.size == MAX_IMAGE_SURAT_JALAN_DOKUMENTASI) {
                    Toast.makeText(
                        view.context,
                        "Jumlah_maksimal_photo_terpenuhi",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
//                    if (view.context is LokasiPenjemputanActivity) {
//                        (view.context as LokasiPenjemputanActivity).captureImage(actionCode, position!!)
//                    }
                }
            }
        }

        @SuppressLint("SetTextI18n", "UseCompatLoadingForDrawables")
        fun bindLocation(item: DetailPerLocationWithPictureModel, position: Int) {
            val LIST_NAME_SURAT_JALAN = "Surat Jalan"
            val LIST_NAME_DOKUMENTASI = "Dokumentasi"
            val LIST_NAME_PERINTAH_PENGIRIMAN = "Perintah Pengiriman"
            this.item = item
            this.position = position

            val svSuratJalan = view.findViewById<HorizontalScrollView>(R.id.foto_surat_jalan_holder)
            val sj1 = view.findViewById<ImageView>(R.id.surat_jalan_1)
            val sj2 = view.findViewById<ImageView>(R.id.surat_jalan_2)
            val sj3 = view.findViewById<ImageView>(R.id.surat_jalan_3)
            val sjh1 = view.findViewById<RelativeLayout>(R.id.surat_jalan_1_holder)
            val sjh2 = view.findViewById<RelativeLayout>(R.id.surat_jalan_2_holder)
            val sjh3 = view.findViewById<RelativeLayout>(R.id.surat_jalan_3_holder)
            val svDokumentasi = view.findViewById<HorizontalScrollView>(R.id.foto_dokumentasi_holder)
            val d1 = view.findViewById<ImageView>(R.id.dokumentasi_1)
            val d2 = view.findViewById<ImageView>(R.id.dokumentasi_2)
            val d3 = view.findViewById<ImageView>(R.id.dokumentasi_3)
            val dh1 = view.findViewById<RelativeLayout>(R.id.dokumentasi_1_holder)
            val dh2 = view.findViewById<RelativeLayout>(R.id.dokumentasi_2_holder)
            val dh3 = view.findViewById<RelativeLayout>(R.id.dokumentasi_3_holder)
            val svPerintahPengiriman = view.findViewById<HorizontalScrollView>(R.id.foto_perintah_pengiriman_holder)
            val pp1 = view.findViewById<ImageView>(R.id.perintah_pengiriman_1)
            val pp2 = view.findViewById<ImageView>(R.id.perintah_pengiriman_2)
            val pp3 = view.findViewById<ImageView>(R.id.perintah_pengiriman_3)
            val pph1 = view.findViewById<RelativeLayout>(R.id.perintah_pengiriman_1_holder)
            val pph2 = view.findViewById<RelativeLayout>(R.id.perintah_pengiriman_2_holder)
            val pph3 = view.findViewById<RelativeLayout>(R.id.perintah_pengiriman_3_holder)
            val btnKirim = view.findViewById<TextView>(R.id.btn_kirim)
            val btnLapor = view.findViewById<TextView>(R.id.txt_lapor_kerusakan2)
            val txtStatus = view.findViewById<TextView>(R.id.txt_di_lokasi_penjemputan2)
            val txtStatus3 = view.findViewById<TextView>(R.id.txt_di_lokasi_penjemputan3)

            if (listButtonVisibility[position]) btnKirim.visibility = View.VISIBLE
            else btnKirim.visibility = View.GONE

            var updateRedis = true
            var visibleCount = 0
            for (i in 0 until listButtonVisibility.size.minus(1)) {
                if (listButtonVisibility[i]) visibleCount += 1
            }

            if (visibleCount > 0) updateRedis = false

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
                    btnKirim.text = view.context.getString(R.string.berangkat_ke_lokasi_asal)
                    btnKirim.setOnClickListener {
                        CURRENT_SHIPMENT_ID = item.detailPerLocationModel.shipmentsId
                        if (view.context is LokasiPenjemputanActivity) {
                            (view.context as LokasiPenjemputanActivity).updateStatus(
                                STATUS_PENJEMPUTAN,
                                location, false, false, updateRedis, false
                            )
                        }
                        val isServiceRunning =
                            (view.context as LokasiPenjemputanActivity).isMyServiceRunning(
                                LocationsService::class.java
                            )
                        if (!isServiceRunning) {
                            val intentService =
                                Intent(view.context, LocationsService::class.java)
                            intentService.action = "ACTION_START_FOREGROUND_SERVICE"
                            ContextCompat.startForegroundService(
                                view.context,
                                intentService
                            )
                        }
                    }
                } else if (currentSequence == 1L && !isCurrentSequenceFinish) {
                    btnKirim.text =
                        view.context.getString(R.string.sampai_dilokasi_penjemputan_asal)
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
                } else if ((currentSequence == 1L && isCurrentSequenceFinish) ||
                    (currentSequence in 2..multipickSize &&
                            isCurrentSequenceFinish)
                ) {
                    val no = currentSequence.toString()
                    btnKirim.text = "Berangkat ke Lokasi Multipick $no"
                    btnKirim.setOnClickListener {
                        CURRENT_SHIPMENT_ID = item.detailPerLocationModel.shipmentsId
                        if (view.context is LokasiPenjemputanActivity) {
                            (view.context as LokasiPenjemputanActivity).updateStatus(
                                STATUS_PENJEMPUTAN,
                                location, false, false, updateRedis, false
                            )
                        }
                    }
                } else if (currentSequence > 1L && currentSequence <= multipickSize.plus(
                        1
                    ) && !isCurrentSequenceFinish
                ) {
                    val no = currentSequence.minus(1).toString()
                    btnKirim.text = "Sampai di Lokasi Multipick $no"
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
                    btnKirim.text =
                        view.context.getString(R.string.berangkat_ke_lokasi_pengiriman_akhir)
                    btnKirim.setOnClickListener {
                        CURRENT_SHIPMENT_ID = item.detailPerLocationModel.shipmentsId
                        if (view.context is LokasiPenjemputanActivity) {
                            (view.context as LokasiPenjemputanActivity).updateStatus(
                                STATUS_PENGIRIMAN,
                                location, false, false, updateRedis, false
                            )
                        }
                    }
                } else if (currentSequence == totalSequence && !isCurrentSequenceFinish) {
                    btnKirim.text =
                        view.context.getString(R.string.sampai_dilokasi_pengiriman_akhir)
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
                } else if (currentSequence == totalSequence && isCurrentSequenceFinish && !isCurrentSequenceBASTSubmitted) {
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
                } else if (currentSequence == totalSequence && isCurrentSequenceFinish && isCurrentSequenceBASTSubmitted) {
                    btnKirim.visibility = View.GONE
                } else if ((currentSequence == multipickSize.plus(1L) &&
                            isCurrentSequenceFinish) || (currentSequence > multipickSize.plus(1L) &&
                            currentSequence <= multipickSize.plus(multidropSize) &&
                            isCurrentSequenceFinish)
                ) {
                    if (multidropSize > 0) {
                        val no = currentSequence.minus(multipickSize)
                        btnKirim.text = "Berangkat ke Lokasi Multidrop $no"
                        btnKirim.setOnClickListener {
                            CURRENT_SHIPMENT_ID = item.detailPerLocationModel.shipmentsId
                            (view.context as LokasiPenjemputanActivity).updateStatus(
                                STATUS_PENJEMPUTAN,
                                location, false, false, updateRedis, false
                            )
                        }
                    } else {
                        btnKirim.text =
                            view.context.getString(R.string.berangkat_ke_lokasi_pengiriman_akhir)
                        btnKirim.setOnClickListener {
                            CURRENT_SHIPMENT_ID = item.detailPerLocationModel.shipmentsId
                            if (view.context is LokasiPenjemputanActivity) {
                                (view.context as LokasiPenjemputanActivity).updateStatus(
                                    STATUS_PENGIRIMAN,
                                    location, false, false, updateRedis, false
                                )
                            }
                        }
                    }

                } else if ((currentSequence > multipickSize.plus(1) &&
                            currentSequence < totalSequence)
                ) {
                    val no = currentSequence.minus(multipickSize).minus(1)
                    if (!isCurrentSequenceFinish) {
                        btnKirim.text = "Sampai di Lokasi Multidrop $no"
                        btnKirim.setOnClickListener {
                            CURRENT_SHIPMENT_ID = item.detailPerLocationModel.shipmentsId
                            if (view.context is LokasiPenjemputanActivity) {
                                (view.context as LokasiPenjemputanActivity).startPostSquence(
                                    STATUS_DI_LOKASI_TUJUAN,
                                    location,
                                    true, updateRedis, true
                                )
                            }
                        }
                    } else {
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
                svSuratJalan.visibility = View.VISIBLE
                when (item.listImageSuratJalan.size) {
                    1 -> {
                        Glide.with(view.context).load(item.listImageSuratJalan[0]).into(sj1)
                        sjh2.visibility = View.GONE
                        sjh3.visibility = View.GONE
                    }
                    2 -> {
                        Glide.with(view.context).load(item.listImageSuratJalan[0]).into(sj1)
                        Glide.with(view.context).load(item.listImageSuratJalan[1]).into(sj2)
                        sjh3.visibility = View.GONE
                    }
                    else -> {
                        Glide.with(view.context).load(item.listImageSuratJalan[0]).into(sj1)
                        Glide.with(view.context).load(item.listImageSuratJalan[1]).into(sj2)
                        Glide.with(view.context).load(item.listImageSuratJalan[2]).into(sj3)
                    }
                }

            } else {
                view.findViewById<ImageView>(R.id.camera_big_surat_jalan).visibility = View.VISIBLE
                view.findViewById<ImageView>(R.id.camera_small_surat_jalan).visibility = View.GONE
                svSuratJalan.visibility = View.GONE
            }

            if (item.listImageDokumentasi!!.size > 0) {
                view.findViewById<ImageView>(R.id.camera_big_dokumentasi).visibility = View.GONE
                view.findViewById<ImageView>(R.id.camera_small_dokumentasi).visibility =
                    View.VISIBLE
                svDokumentasi.visibility = View.VISIBLE
                when (item.listImageDokumentasi.size) {
                    1 -> {
                        Glide.with(view.context).load(item.listImageDokumentasi[0]).into(d1)
                        dh2.visibility = View.GONE
                        dh3.visibility = View.GONE
                    }
                    2 -> {
                        Glide.with(view.context).load(item.listImageDokumentasi[0]).into(d1)
                        Glide.with(view.context).load(item.listImageDokumentasi[1]).into(d2)
                        dh3.visibility = View.GONE
                    }
                    else -> {
                        Glide.with(view.context).load(item.listImageDokumentasi[0]).into(d1)
                        Glide.with(view.context).load(item.listImageDokumentasi[1]).into(d2)
                        Glide.with(view.context).load(item.listImageDokumentasi[2]).into(d3)
                    }
                }
            } else {
                view.findViewById<ImageView>(R.id.camera_big_dokumentasi).visibility = View.VISIBLE
                view.findViewById<ImageView>(R.id.camera_small_dokumentasi).visibility = View.GONE
                svDokumentasi.visibility = View.GONE
            }

            if (item.listImagePerintahPengiriman!!.size > 0) {
                view.findViewById<ImageView>(R.id.camera_big_perintah_pengiriman).visibility =
                    View.GONE
                view.findViewById<ImageView>(R.id.camera_small_perintah_pengiriman).visibility =
                    View.VISIBLE
                svPerintahPengiriman.visibility = View.VISIBLE
                when (item.listImagePerintahPengiriman.size) {
                    1 -> {
                        Glide.with(view.context).load(item.listImagePerintahPengiriman[0]).into(pp1)
                        pph2.visibility = View.GONE
                        pph3.visibility = View.GONE
                    }
                    2 -> {
                        Glide.with(view.context).load(item.listImagePerintahPengiriman[0]).into(pp1)
                        Glide.with(view.context).load(item.listImagePerintahPengiriman[1]).into(pp2)
                        pph3.visibility = View.GONE
                    }
                    else -> {
                        Glide.with(view.context).load(item.listImagePerintahPengiriman[0]).into(pp1)
                        Glide.with(view.context).load(item.listImagePerintahPengiriman[1]).into(pp2)
                        Glide.with(view.context).load(item.listImagePerintahPengiriman[2]).into(pp3)
                    }
                }
            } else {
                view.findViewById<ImageView>(R.id.camera_big_perintah_pengiriman).visibility =
                    View.VISIBLE
                view.findViewById<ImageView>(R.id.camera_small_perintah_pengiriman).visibility =
                    View.GONE
                svPerintahPengiriman.visibility = View.GONE
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