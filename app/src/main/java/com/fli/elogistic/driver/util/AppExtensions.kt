package com.fli.elogistic.driver.util

import android.content.Context
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.fli.elogistic.driver.models.Resource
import com.fli.elogistic.driver.models.ResponseWrapper
import com.fli.elogistic.driver.models.Status
import android.content.Intent
import android.net.Uri
import android.provider.Settings
import java.text.SimpleDateFormat
import java.util.*
import androidx.appcompat.content.res.AppCompatResources
import androidx.constraintlayout.widget.ConstraintLayout
import com.fli.elogistic.driver.R
import com.fli.elogistic.driver.constants.*
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.internals.AnkoInternals.getContext
import java.lang.Exception
import java.util.concurrent.TimeUnit
import java.util.regex.Pattern


fun EditText.getString(): String{
    return this.text.toString()
}

fun TextView.performCall(context: Context){
    val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", this.text.toString(), null))
    context.startActivity(intent)
}

fun View.setVisible(visible: Boolean){
    if(visible){
        this.visibility = View.VISIBLE
    } else {
        this.visibility = View.GONE
    }
}

fun Resource<ResponseWrapper<*>>.isResponseOk(): Boolean{
    return this.status == Status.SUCCESS && this.response?.statusCode in 200..299
}

fun Resource<ResponseWrapper<*>>.isStatusError(): Boolean{
    return this.status == Status.ERROR || (this.status == Status.SUCCESS && this.response?.statusCode !in 200..299)
}

fun Resource<ResponseWrapper<*>>.isUnauthorized(): Boolean{
    return this.status == Status.ERROR && this.statusCode == 401 && ACTIVE_TOKEN != ""
}

fun createToken(): String{
    return "Bearer $ACTIVE_TOKEN"
//    return ACTIVE_TOKEN
}

fun findDeviceID(): String{
    return DEVICE_ID
}

fun Long.longToDate(): String{
    val df = SimpleDateFormat(MONTH_DATE_FORMAT, Locale("id"))
    val date = Date(this)
    return df.format(date)
}

fun String.parseToDate(): Date{
    val df = SimpleDateFormat(MONTH_DATE_FORMAT, Locale("id"))
    return df.parse(this)
}
fun Long.longToTime(): String{
    val date = Date(this)
    val formatter = SimpleDateFormat(TIME_FORMAT, Locale.getDefault())
    formatter.timeZone = TimeZone.getDefault()
    return formatter.format(date)
}

fun Date.parseToDashFormat(): String{
    val df = SimpleDateFormat(DASH_DATE_FORMAT, Locale("id"))
    return df.format(this)
}

fun Long?.getTimeDifference(compareWith: Long?): String{
    this?.let {
        /* Algorithm: Order completed time will be passed as compareWith, if it is null (not completed),
        * then the time will be compared with current time
        * */
        val compareWithSec= (compareWith ?: System.currentTimeMillis())
        val diffSec = Math.abs(compareWithSec - it) / 1000
        val hours = diffSec / (60*60)
//        hours += hours/5 //Calculate additional hour
        val min = TimeUnit.SECONDS.toMinutes(diffSec) % 60 //remaining minutes after hour is calculated
        val days = hours / 24
        return when {
            days > 0 -> "$days hari ${hours%24} jam"
            hours > 0 -> "$hours jam $min menit"
            else -> "$min menit"
        }
    }
    return ""
}

fun Long?.getShortenedTimeDifference(compareWith: Long?): String{
    val longTimeDiff = this.getTimeDifference(compareWith)
    if(this == null || compareWith == null){
        return ""
    }
    return longTimeDiff.replace("jam", "j").replace("menit", "m")
}

fun Long?.getLongToTimeDetail(): String {
    this?.let {
        var hours = it / (60*60)
        hours += hours / 5 //Calculate additional hour
        val min = TimeUnit.SECONDS.toMinutes(it) % 60 //remaining minutes after hour is calculated
        val days = hours / 24
        return when {
            days > 0 -> "$days hari ${hours % 24} jam"
            hours > 0 -> "$hours jam $min menit"
            else -> "$min menit"
        }   
    }
    return  ""
}

fun EditText.showWarningonEditText(context: Context, parent: ConstraintLayout? = null){
    val drawables = this.compoundDrawables
    var backgroundResource = -1
    when(this.getString().isEmpty()){
        true -> {
            backgroundResource = R.drawable.red_round_background
            drawables[2] = AppCompatResources.getDrawable(context, R.drawable.ic_warning)
        }
        false -> {
            backgroundResource = R.drawable.white_round_background
            drawables[2] = null
        }
    }

    when(parent){
        null -> this.backgroundResource = backgroundResource
        else -> parent.backgroundResource = backgroundResource
    }
    this.setCompoundDrawablesRelativeWithIntrinsicBounds(drawables[0], drawables[1], drawables[2], drawables[3])
}

fun EditText.isEmpty(): Boolean{
    return this.getString().isEmpty()
}

fun String.convertToValidPhoneNum():String{
    val editedPhone = this.replace("+62", "0")
    val pattern = Pattern.compile("[^0-9]")
    val matcher = pattern.matcher(editedPhone)
    return matcher.replaceAll("")
}

fun formatToDisplayPhoneNumber(input: String): String? {
    return input.replace("+62", "")
        .replace(
            "[^0-9\\+]".toRegex(),
            ""
        )        //remove all the non numbers (brackets dashes spaces etc.) except the + signs
        .replace(
            "(^[1-9].+)".toRegex(),
            "$1"
        )         //if the number is starting with no zero and +, its a local number. prepend cc
        .replace(
            "(.)(\\++)(.)".toRegex(),
            "$1$3"
        )         //if there are left out +'s in the middle by mistake, remove them
        .replace(
            "(^0{2}|^\\+)(.+)".toRegex(),
            "$2"
        )       //make 00XXX... numbers and +XXXXX.. numbers into XXXX...
        .replace("^0([1-9])".toRegex(), "$1")

}

fun EditText.getPhoneNumber(): String{
    return  when(this.getString()){
        "" -> ""
        else -> "+62${this.getString()}"
    }
}

fun String.getMillisFromDate(): Long{
    return try {
        val parsedDate = this.parseToDate()
        parsedDate.time
    } catch (error: Exception){
        0L
    }

}