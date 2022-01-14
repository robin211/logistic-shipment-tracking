package com.fli.elogistic.driver.constants

import android.location.Location

const val IDENTITY_URL = "api/v3/auth/driver"
const val SHIPMENT_URL = "api/v3/driver/shipment"
const val MASTER_URL = "api/v3/master"
const val ORDERS_URL = "api/v1/orders"
const val DELIVERY_URL = "api/v1/delivery"
const val TRANSPORTER_URL = "api/v3/transporter"
const val IMAGE_UPLOAD_URL = "api/v1/image-upload"
const val AUTO_ASSIGN_URL = "api/v3/auto-assign"
const val SEND_LOCATION_URL = "tracking/api/v3/position"

const val BASE = "https://api-dev.fastlog.id/"
//const val BASE = "https://api-betav3.fastlog.id/"
//const val BASE = "http://192.168.1.10:8003"

const val FCM_URL = "iid.googleapis.com"

const val NEED_CONFIRMATION_SHIPMENT_STATUS = "NEED_CONFIRMATION"
const val ON_PROCESS_SHIPMENT_STATUS = "ON_PROCESS"
const val FINISH_SHIPMENT_STATUS = "FINISH"

const val LOCATION_PAGE_SIZE = 10
const val VEHICLE_PAGE_SIZE = 100
const val CATEGORY_PAGE_SIZE = 100
const val ADDITIONAL_INFO_PAGE_SIZE = 100
const val ORDER_LIST_PAGE_SIZE = 10
const val DRIVER_LOCATION_SIZE = 6
const val DOCUMENT_PAGE_SIZE = 10
const val NOTIFICATION_LIST_PAGE_SIZE = 10

var CURRENT_SHIPMENT_CARGO_ID = 1L
var CURRENT_LOCATION_ID = 1L
var CURRENT_SHIPMENT_ID = 1L
var COMPANY_ID = 1
var DRIVER_ID = 1
var SHIPMENT_GROUP_ID = 1L

var CURRENT_LOCATION : Location? = null

var TOPIC_TO_SUBSCRIBE = "driver"

const val ORIGIN_INFO_PARAM = "ORIGIN"
const val DESTINATION_INFO_PARAM = "DESTINATION"
const val PICKUP_INFO_PARAM = "PICKUP"
const val CANCELLATION_INFO_PARAM = "CANCELLATION"

const val TYPE_DELIVERY = "DELIVERY"
const val TYPE_RECEIPT = "RECEIPT"
const val TYPE_LOAD = "LOAD"
const val TYPE_UNLOAD = "UNLOAD"
const val TYPE_BASP = "BASP"
const val TYPE_BASP_LOAD = "BASPLOAD"

const val STATUS_TERKONFIRMASI = "TERKONFIRMASI"
const val STATUS_DI_LOKASI_PENJEMPUTAN = "DI_LOKASI_PENJEMPUTAN"
const val STATUS_DI_LOKASI_TUJUAN = "DI_LOKASI_TUJUAN"
const val STATUS_PENJEMPUTAN = "PENJEMPUTAN"
const val STATUS_PENGIRIMAN = "PENGIRIMAN"

const val BASE_URL_UAT = "https://api-betav3.fastlog.id/"