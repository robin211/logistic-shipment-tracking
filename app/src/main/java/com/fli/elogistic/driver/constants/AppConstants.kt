package com.fli.elogistic.driver.constants

//Request Codes
const val SEARCH_LOCATION_REQUEST_CODE = 10001
const val SENDER_PICK_CONTACT = 20001
const val RECEIVER_PICK_CONTACT = 20002
const val CAMERA_REQUEST_CODE = 30001
const val GALLERY_REQUEST_CODE = 30002
const val REORDER_REQUEST_CODE = 40001

const val UPLOAD_POD_CODE = 1
const val UPLOAD_BIAYA_TAMBAHAN_CODE = 2

const val MAX_IMAGE_POD = 3
const val MAX_IMAGE_BIAYA_TAMBAHAN = 1
const val MAX_IMAGE_SURAT_JALAN_DOKUMENTASI = 3

//String Constants
const val APPLICATION_AUTHORITIES = "com.fli.elogistic.driver.provider"
const val IS_SEARCH_ORIGIN = "isSearchOrigin"
const val LOCATION_PARAM = "location"
const val ORDER_TYPE = "orderType"
const val NEED_CONFIRMATION_ORDERS = "needConfirmation"
const val ONGOING_ORDERS = "ongoing"
const val COMPLETED_ORDERS = "completed"
const val ORIGIN_LOCATION_PARAM = "originLocation"
const val DESTINATION_LOCATION_PARAM = "destinationLocation"
val SHIPPER_ROLE = arrayListOf<String>("SHIPPER", "SHIPPER_ADMIN", "SHIPPER_MONITORING", "SHIPPER_SUPER_ADMIN")
const val ORDER_ID_PARAM = "orderId"
const val ORDER_NUMBER_PARAM = "orderNumber"
const val CANCELLATION_REASON_PARAM = "cancellationReason"
const val ORDER_DOCUMENT_TYPE_PARAM = "orderDocumentType"
const val TRANSPORT_TYPE_ID_PARAM = "transportTypeId"
const val ORIGIN_NAME_PARAM = "originName"
const val DESTINATION_NAME_PARAM = "destinationName"
const val ORIGIN_ADDRESS_PARAM = "originAddress"
const val DESTINATION_ADDRESS_PARAM = "destinationAddress"
const val ORIGIN_ID_PARAM = "originId"
const val DESTINATION_ID_PARAM = "destinationId"
const val DOCUMENT_URLS_PARAM = "documentUrls"

const val SENDER_CONTACT_NAME_STRING = "senderContactName"
const val RECEIVER_CONTACT_NAME_STRING = "receiverContactName"
const val SENDER_CONTACT_PHONE_STRING = "senderContactPhone"
const val RECEIVER_CONTACT_PHONE_STRING = "receiverContactPhone"
const val CATEGORY_ID_STRING = "categoryId"
const val CATEGORY_STRING = "category"
const val SUBCATEGORY_STRING = "subcategory"
const val SUBCATEGORY_ID_STRING = "subCategoryId"
const val DATE_STRING = "date"
const val ORIGIN_STRING = "origin"
const val DESTINATION_STRING = "destination"
const val SENDER_INFO_STRING = "senderInfo"
const val RECEIVER_INFO_STRING = "receiverInfo"
const val GOODS_INFO_STRING = "goodsInfo"
const val ADDITIONAL_NOTE_INFO_STRING = "additionalNoteInfo"
const val ORDER_LIST_INDEX_STRING = "orderListIndex"
const val IS_ORIGIN_PARAM = "isOrigin"
const val TRANSPORT_PARAM = "transport"
const val IS_FROM_ACCIDENT_PARAM = "isFromAccident"
const val POD_PARAM = "receiverName"
const val IS_JOIN_SHIPPER_PARAM = "isJoinShipper"
const val JOIN_SHIPMENT_ID = "joinShipmentId"
const val IS_FULL_LOAD = "isFullLoad"

const val PAGE_STRING = "page"
const val IS_ONPROCESS_STRING = "isOnProcess"
const val SEARCH_STRING = "search"

const val SLASH_DATE_FORMAT = "dd/MM/yyyy"
const val MONTH_DATE_FORMAT = "d MMMM yyyy"
const val DASH_DATE_FORMAT = "yyyy-MM-dd"
const val TIME_FORMAT = "HH:mm"

const val STATUS_NEED_CONFIRMATION = "Menunggu Konfirmasi Driver"
const val STATUS_ON_PROCESS = "Dalam Proses"
const val STATUS_FINISH = "Selesai"

const val NEED_CONFIRMATION = 1
const val ON_PROCESS = 2
const val FINISH = 3

/**Shared Preferences Keys*/
const val ACCESS_TOKEN_KEY = "TOKEN"
const val FCM_TOKEN_KEY = "FCM_TOKEN"
const val DEVICE_ID_KEY = "DEVICE_ID"
const val IS_MULTISHIPPER_KEY= "IS_MULTISHIPPER"
const val MAINTENANCE_INFO_SHOWN_KEY= "MAINTENANCE_SHOWN"

//Dashboard code constants
const val NEW_ORDER_DASHBOARD_CODE = 101
const val PICKUP_DASHBOARD_CODE = 102
const val DELIVERY_DASHBOARD_CODE = 103
const val NEED_CONFIRM_DASHBOARD_CODE = 104
const val COMPLETE_DASHBOARD_CODE = 105
const val CLEAR_FILTER_CODE = 199
/*
* Used to store token that is being captured on splash screen and login, will be cleared on logout.
* Created to avoid using shared preferences every network call
* */

var ACTIVE_TOKEN = ""
var DEVICE_ID = ""
const val CAPTCHA_SITE_KEY = "6Le82F8bAAAAAI17KGNRdgH_U33VUoWWSnZm9Z1i"
const val FCM_SERVER_KEY = "key=AAAAXxN5vIk:APA91bH7EbTNmvSk11muEwoCFH95Xj7N-bfaxQFFadrGIROECHYGdB1m1XUcfLbbbbPvY2BSvw4gZ6vYdAyDCQHWENHjnao6ygGFm0Tf31WaPC-tH5nAk6ZexLbUs5MtqHT2LyvI6mtX"
var FCM_TOKEN = ""
var TASK_PER_LOCATION_FINISHED = false
