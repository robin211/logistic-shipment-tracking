package com.fli.elogistic.driver.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.constants.CURRENT_LOCATION_ID
import com.fli.elogistic.driver.models.LocationAddressModel
import com.fli.elogistic.driver.models.shipment.ShipmentModel
import com.fli.elogistic.driver.ui.activities.LokasiPenjemputanActivity
import com.fli.elogistic.driver.ui.activities.PengirimanDetailActivity

class LocationAddressDetilAdapter(
    private var listLocationAddress: ArrayList<LocationAddressModel>,
    var isPenjemputan: Boolean,
    var konfirmasiOrderModel: ShipmentModel?,
    var isFinished: Boolean
) : RecyclerView.Adapter<LocationAddressDetilAdapter.LocationAddressHolder>() {
    val FUNCTION_TYPE_BERANGKAT_PENJEMPUTAN = 1
    val FUNCTION_TYPE_SAMPAI_PENJEMPUTAN = 2
    val FUNCTION_TYPE_BERANGKAT_PENGIRIMAN = 3
    val FUNCTION_TYPE_SAMPAI_PENGIRIMAN = 4
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LocationAddressHolder {
        return LocationAddressHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(
                R.layout.multi_location_item_maps_detil,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return listLocationAddress.size
    }

    override fun onBindViewHolder(holder: LocationAddressHolder, position: Int) {
        holder.bindLocation(listLocationAddress[position], position)
    }

    inner class LocationAddressHolder(v: View) : RecyclerView.ViewHolder(v) {
        private var view: View = v
        private var item: LocationAddressModel? = null
        private var position: Int? = 0
        private var showPhoto = false

        init {
            v.setOnClickListener {

                v.findViewById<TextView>(R.id.btn_detil_initial).setOnClickListener {
                    var shipmentModel: ShipmentModel? = null
                    var currentSequence = 0
                    CURRENT_LOCATION_ID = item!!.locationId!!.toLong()
                    if (konfirmasiOrderModel != null) {
                        shipmentModel = konfirmasiOrderModel
                    }
                    currentSequence = if (isPenjemputan) {
                        item!!.sequence?.plus(1)!!
                    } else {
                        item!!.sequence!!
                    }

                    item!!.isCurrentSequenceArrived!!.also { showPhoto = it }
                    if (view.context is PengirimanDetailActivity) {
                        (view.context as PengirimanDetailActivity).gotoLokasiPenjemputan(
                            item!!,
                            shipmentModel!!,
                            isPenjemputan,
                            currentSequence,
                            showPhoto
                        )
                    }

                }
                if (item!!.currentSequence >= position!!.plus(2)) {
                    v.findViewById<TextView>(R.id.btn_detil_initial_inactive).setOnClickListener {
                        val intent = Intent(view.context, LokasiPenjemputanActivity::class.java)
                        intent.putExtra("Model", item!!)
                        CURRENT_LOCATION_ID = item!!.locationId!!.toLong()
                        if (konfirmasiOrderModel != null) {
                            intent.putExtra("OrderModel", konfirmasiOrderModel)
                        }
                        if (isPenjemputan) {
                            intent.putExtra("currentSequence", item!!.sequence?.plus(1))
                            intent.putExtra("isPenjemputan", true)
                        } else {
                            intent.putExtra("currentSequence", item!!.sequence)
                            intent.putExtra("isPenjemputan", false)
                        }
                        startActivity(view.context, intent, null)
                        if (view.context is PengirimanDetailActivity) {
                            (view.context as PengirimanDetailActivity).finishActivity()
                        }
                    }
                }

                v.findViewById<ImageView>(R.id.btn_maps).setOnClickListener {
                    if (view.context is PengirimanDetailActivity) {
                        (view.context as PengirimanDetailActivity).goesToGoogleMaps(
                            item!!.latitude,
                            item!!.longitude, item!!.location!!
                        )
                    }
                }

            }
        }

        fun bindLocation(item: LocationAddressModel, position: Int) {
            this.item = item
            this.position = position
            if (isPenjemputan) {
                view.findViewById<TextView>(R.id.txt_location).text = item.location
                view.findViewById<TextView>(R.id.txt_address).text = item.address
                view.findViewById<TextView>(R.id.txt_location2).visibility = View.GONE
                view.findViewById<TextView>(R.id.txt_address2).visibility = View.GONE
                if (position == 0) {
                    view.findViewById<ImageView>(R.id.pin).visibility = View.VISIBLE
                }
                if ((item.currentSequence == position.plus(1L) && item.isCurretSequenceFinished) ||
                    (item.currentSequence == position.plus(2L) && !item.isCurretSequenceFinished)
                ) {
                    view.findViewById<TextView>(R.id.btn_detil_initial).visibility =
                        View.VISIBLE
                    view.findViewById<TextView>(R.id.btn_detil_initial_inactive).visibility =
                        View.GONE

                    if (item.currentSequence == position.plus(1L) && item.isCurretSequenceFinished) {
                        if (view.context is PengirimanDetailActivity) {
                            val no = position.plus(1L).toString()
                            (view.context as PengirimanDetailActivity).setBtnText("Berangkat ke Lokasi Multipick $no")
                            (view.context as PengirimanDetailActivity).setBtnFunction(
                                FUNCTION_TYPE_BERANGKAT_PENJEMPUTAN
                            )
                            (view.context as PengirimanDetailActivity).setCurrentLocationInfo(
                                item.locationId!!,
                                item.location!!
                            )
                        }
                    } else {
                        if (view.context is PengirimanDetailActivity) {
                            if (item.isCurrentSequenceArrived!!) {
                                (view.context as PengirimanDetailActivity).btnKirimGone()
                            } else {
                                val no = position.plus(1L).toString()
                                (view.context as PengirimanDetailActivity).setBtnText("Sampai di Lokasi Multipick $no")
                                (view.context as PengirimanDetailActivity).setBtnFunction(
                                    FUNCTION_TYPE_SAMPAI_PENJEMPUTAN
                                )
                                (view.context as PengirimanDetailActivity).setCurrentLocationInfo(
                                    item.locationId!!,
                                    item.location!!
                                )
                            }
                        }
                    }

                } else {
                    view.findViewById<TextView>(R.id.btn_detil_initial).visibility =
                        View.GONE
                    view.findViewById<TextView>(R.id.btn_detil_initial_inactive).visibility =
                        View.VISIBLE
                }

            } else {
                view.findViewById<TextView>(R.id.txt_location).visibility = View.GONE
                view.findViewById<TextView>(R.id.txt_address).visibility = View.GONE
                view.findViewById<TextView>(R.id.txt_location2).visibility = View.VISIBLE
                view.findViewById<TextView>(R.id.txt_address2).visibility = View.VISIBLE
                view.findViewById<TextView>(R.id.txt_location2).text = item.location
                view.findViewById<TextView>(R.id.txt_address2).text = item.address
                val orderModel = konfirmasiOrderModel
                if (position == 0) {
                    view.findViewById<ImageView>(R.id.pinYellow).visibility = View.VISIBLE
                    view.findViewById<View>(R.id.view1).visibility = View.GONE
                }
                if (orderModel != null) {
                    val sizeMultipick = orderModel.multiPick.size
                    val sizePenjemputan = sizeMultipick.plus(1L)
                    if ((item.currentSequence == sizePenjemputan && item.isCurretSequenceFinished) ||
                        (item.currentSequence == sizePenjemputan.plus(position).plus(1) &&
                                !item.isCurretSequenceFinished && !item.isCurretSequenceBASTSubmitted)
                    ) {
                        view.findViewById<TextView>(R.id.btn_detil_initial).visibility =
                            View.VISIBLE
                        view.findViewById<TextView>(R.id.btn_detil_initial_inactive).visibility =
                            View.GONE
                        if (item.currentSequence == sizePenjemputan && item.isCurretSequenceFinished) {
                            if (view.context is PengirimanDetailActivity) {
                                val no = position.plus(1)
                                (view.context as PengirimanDetailActivity).setBtnText("Berangkat ke Lokasi Multidrop $no")
                                (view.context as PengirimanDetailActivity).setBtnFunction(
                                    FUNCTION_TYPE_BERANGKAT_PENGIRIMAN
                                )
                                (view.context as PengirimanDetailActivity).setCurrentLocationInfo(
                                    item.locationId!!,
                                    item.location!!
                                )
                            }
                        } else {
                            if (view.context is PengirimanDetailActivity) {
                                if (item.isCurrentSequenceArrived!!) {
                                    (view.context as PengirimanDetailActivity).btnKirimGone()
                                } else {
                                    val no = position.plus(1)
                                    (view.context as PengirimanDetailActivity).setBtnText("Sampai di Lokasi Multidrop $no")
                                    (view.context as PengirimanDetailActivity).setBtnFunction(
                                        FUNCTION_TYPE_SAMPAI_PENGIRIMAN
                                    )
                                    (view.context as PengirimanDetailActivity).setCurrentLocationInfo(
                                        item.locationId!!,
                                        item.location!!
                                    )
                                }
                            }
                        }
                    } else {
                        if (isPenjemputan) {
                            if (item.currentSequence == position.plus(1L)){
                                if (item.isCurretSequenceBASTSubmitted) {
                                    view.findViewById<TextView>(R.id.btn_detil_initial).visibility =
                                        View.GONE
                                    view.findViewById<TextView>(R.id.btn_detil_initial_inactive).visibility =
                                        View.VISIBLE
                                } else {
                                    view.findViewById<TextView>(R.id.btn_detil_initial).visibility =
                                        View.VISIBLE
                                    view.findViewById<TextView>(R.id.btn_detil_initial_inactive).visibility =
                                        View.GONE
                                    (view.context as PengirimanDetailActivity).btnKirimGone()
                                }
                            }
                        } else {
                            if (item.currentSequence == sizePenjemputan.plus(position).plus(1)) {
                                if (!item.isCurretSequenceBASTSubmitted) {
                                    view.findViewById<TextView>(R.id.btn_detil_initial).visibility =
                                        View.VISIBLE
                                    view.findViewById<TextView>(R.id.btn_detil_initial_inactive).visibility =
                                        View.GONE
                                    (view.context as PengirimanDetailActivity).btnKirimGone()
                                }
                            }
                        }

                    }
                }

            }
            if (isFinished) {
                view.findViewById<TextView>(R.id.btn_detil_initial).visibility =
                    View.GONE
                view.findViewById<TextView>(R.id.btn_detil_initial_inactive).visibility =
                    View.GONE
            }

        }

    }

}