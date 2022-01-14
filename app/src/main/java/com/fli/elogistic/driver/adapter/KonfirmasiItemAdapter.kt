package com.fli.elogistic.driver.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.constants.CURRENT_SHIPMENT_CARGO_ID
import com.fli.elogistic.driver.constants.FINISH
import com.fli.elogistic.driver.constants.NEED_CONFIRMATION
import com.fli.elogistic.driver.constants.ON_PROCESS
import com.fli.elogistic.driver.models.shipment.ShipmentModel
import com.fli.elogistic.driver.ui.activities.KonfirmasiDetailActivity
import com.fli.elogistic.driver.ui.activities.PengirimanDetailActivity
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*


class KonfirmasiItemAdapter(
    private var listItemKonfirmasi: ArrayList<ShipmentModel>,
    private var status: Int
)  : RecyclerView.Adapter<KonfirmasiItemAdapter.KonfirmasiItemHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): KonfirmasiItemHolder {
        return KonfirmasiItemHolder(
            LayoutInflater.from(
                parent.context
            ).inflate(
                R.layout.konfirmasi_order_list_item,
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
        private var item: ShipmentModel? = null
        init {
            v.setOnClickListener{
                when (status){
                    NEED_CONFIRMATION -> {
                        CURRENT_SHIPMENT_CARGO_ID = item!!.id
                        val intent = Intent(view.context, KonfirmasiDetailActivity::class.java)
                        intent.putExtra("Model", item!!)
                        startActivity(view.context, intent, null)
                    }
                    ON_PROCESS -> {
                        val intent = Intent(view.context, PengirimanDetailActivity::class.java)
                        CURRENT_SHIPMENT_CARGO_ID = item!!.id
                        intent.putExtra("Model", item!!)
                        intent.putExtra("isFinished", false)
                        startActivity(view.context, intent, null)
                    }
                    FINISH -> {
                        val intent = Intent(view.context, PengirimanDetailActivity::class.java)
                        intent.putExtra("Model", item!!)
                        intent.putExtra("isFinished", true)
                        startActivity(view.context, intent, null)
                    }
                }

            }
        }


        private fun String.getDateWithServerTimeStamp(): Date? {
            val dateFormat = SimpleDateFormat(
                "yyyy-MM-dd'T'HH:mm:ss'Z'",
                Locale.getDefault()
            )
            dateFormat.timeZone = TimeZone.getTimeZone("GMT")
            return try {
                dateFormat.parse(this)
            } catch (e: ParseException) {
                null
            }
        }

        private fun Date.getStringTimeStampWithDate(): String {
            val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'",
                Locale.getDefault())
            dateFormat.timeZone = TimeZone.getTimeZone("GMT")
            return dateFormat.format(this)
        }

        fun bindLocation(item: ShipmentModel) {
            this.item = item
            var dates : String =item.shipmentDate
            if (item.shipmentDate.endsWith("0")){
                dates = item.shipmentDate.substringBefore("+")
                dates += "Z"
            }
            val serverDate = dates.getDateWithServerTimeStamp()
            val serverDateString = serverDate?.getStringTimeStampWithDate()
            val inputFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault())
            val dateFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
            val timeFormat = SimpleDateFormat("HH:mm", Locale.getDefault())
            val date = inputFormat.parse(serverDateString!!)
            var multipick = ""
            var multidrop = ""

            if (item.multiPick.size > 0){
                for (x in item.multiPick){
                    val numbering = item.multiPick.indexOf(x) + 1
                    multipick = if (item.multiPick.indexOf(x)==0) "Pick $numbering - ${x.locationName}"
                    else multipick+"\n"+ "Pick $numbering - ${x.locationName}"
                }
                view.findViewById<TextView>(R.id.txt_pick_location).text = multipick
            }else{
                view.findViewById<LinearLayout>(R.id.multipick_holder).visibility = View.GONE
            }

            if (item.multiDrop.size > 0){
                for (x in item.multiDrop){
                    val numbering = item.multiDrop.indexOf(x) + 1
                    multidrop = if (item.multiDrop.indexOf(x)==0) "Drop $numbering - ${x.locationName}"
                    else multidrop+"\n"+ "Drop $numbering - ${x.locationName}"
                }
                view.findViewById<TextView>(R.id.txt_drop_location).text = multidrop
            }else {
                view.findViewById<LinearLayout>(R.id.multidrop_holder).visibility = View.GONE
            }

            view.findViewById<TextView>(R.id.txt_no_kargo).text = item.cargoTitle
            view.findViewById<TextView>(R.id.txt_date_pickup).text = dateFormat.format(date!!)
            view.findViewById<TextView>(R.id.txt_time_pickup).text = timeFormat.format(date)
            view.findViewById<TextView>(R.id.txt_initial_location).text = item.originalLocation
            view.findViewById<TextView>(R.id.txt_final_location).text = item.destinationLocation
        }

    }

}