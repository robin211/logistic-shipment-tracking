package com.fli.elogistic.driver.mockDataResponses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b-\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0014\u0010\b\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u0014\u0010\n\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0003\"\u0011\u0010\f\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0003\"\u0014\u0010\u000e\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0003\"\u0014\u0010\u0010\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0003\"\u0014\u0010\u0012\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0003\"\u0014\u0010\u0014\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0003\"\u0014\u0010\u0016\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0003\"\u0014\u0010\u0018\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0003\"\u0014\u0010\u001a\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0003\"\u0011\u0010\u001c\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0003\"\u0014\u0010\u001e\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0003\"\u0011\u0010 \u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0003\"\u0014\u0010\"\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0003\"\u0014\u0010$\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0003\"\u0014\u0010&\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0003\"\u0014\u0010(\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0003\"\u0014\u0010*\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0003\"\u0014\u0010,\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0003\u00a8\u0006."}, d2 = {"cancellationReasonResponse", "", "getCancellationReasonResponse", "()Ljava/lang/String;", "completeList", "getCompleteList", "completeOrderListResponse", "getCompleteOrderListResponse", "continueOrderFailResponse", "getContinueOrderFailResponse", "damagedDetailResponse", "getDamagedDetailResponse", "deliverList", "getDeliverList", "documentImageListResponse", "getDocumentImageListResponse", "driverTrackingResponse", "getDriverTrackingResponse", "maintenanceInfoResponse", "getMaintenanceInfoResponse", "mobileVersionResponse", "getMobileVersionResponse", "needConfirmationOrderListResponse", "getNeedConfirmationOrderListResponse", "newOrderList", "getNewOrderList", "ongoingOrderListResponse", "getOngoingOrderListResponse", "orderDetailResponse", "getOrderDetailResponse", "orderStatusResponse", "getOrderStatusResponse", "pickupList", "getPickupList", "podResponse", "getPodResponse", "shipmentFinishResponse", "getShipmentFinishResponse", "shipmentNeedConfirmationResponse", "getShipmentNeedConfirmationResponse", "shipmentOnProcessResponse", "getShipmentOnProcessResponse", "shipmentSummaryResponse", "getShipmentSummaryResponse", "simplePODResponse", "getSimplePODResponse", "app_mockDebug"})
public final class OrderDetailDataMocksKt {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ongoingOrderListResponse = "\n    {\n  \"timestamp\": \"2019-05-16T03:35:04.214+0000\",\n  \"status\": \"OK\",\n  \"statusCode\": 200,\n  \"message\": \"OK\",\n  \"data\": {\n    \"totalPages\": 1,\n    \"totalElements\": 3,\n    \"contents\": [\n      {\n        \"orderId\": 325,\n        \"orderNumber\": \"PES011557977570459\",\n        \"createdDate\": 1557977570597,\n        \"deliveryDate\": 1547312700000,\n        \"customerName\": \"PT Unilever Indonesia\",\n        \"customerUsername\": \"Suhendro Salin\",\n        \"originName\": \"Kantor Fastrata Buana\",\n        \"originAddress\": \"Jalan Suci No.75,Jakarta Utara\",\n        \"originCity\": \"Jakarta Timur\",\n        \"destinationName\": \"Gudang Fastrata Buana\",\n        \"destinationAddress\": \"Jalan Suci No.75, Jakarta Utaran\",\n        \"destinationCity\": \"Jakarta Utara\",\n        \"transporterCompany\": \"Rekanan 3PL A\",\n        \"transportType\": \"Pickup\",\n        \"vehicleNumber\": \"B1234JKT\",\n        \"driverName\": \"Hardian Gunatama\",\n        \"driverPhone\": \"01234567890\",\n        \"payloadCategory\": \"Kategory A\",\n        \"payloadSubCategory\": \"Sub kategory A\",\n        \"deliveryNote\": \"Catatan Pengiriman\",\n        \"additionalNote\": \"Catatan Tambahan\",\n        \"vehicleLocation\": {\n          \"lat\": -6.208017275823,\n          \"lng\": 106.852580721527,\n          \"lastUpdate\": 1557977570597\n        },\n        \"currentStatus\": \"CONFIRM\",\n        \"previousStatus\": \"PICKUP\"\n      },\n      {\n        \"orderId\": 327,\n        \"orderNumber\": \"PES011557977570457\",\n        \"createdDate\": 1557977570597,\n        \"deliveryDate\": 1547312700000,\n        \"customerName\": \"PT Unilever Indonesia\",\n        \"customerUsername\": \"Suhendro Salin\",\n        \"originName\": \"Kantor Fastrata Buana\",\n        \"originAddress\": \"Jalan Suci No.75,Jakarta Utara\",\n        \"originCity\": \"Jakarta Timur\",\n        \"destinationName\": \"Gudang Fastrata Buana\",\n        \"destinationAddress\": \"Jalan Suci No.75, Jakarta Utaran\",\n        \"destinationCity\": \"Jakarta Utara\",\n        \"transporterCompany\": \"Rekanan 3PL A\",\n        \"transportType\": \"Pickup\",\n        \"vehicleNumber\": \"B1234JKT\",\n        \"driverName\": \"Hardian Gunatama\",\n        \"driverPhone\": \"01234567890\",\n        \"payloadCategory\": \"Kategory A\",\n        \"payloadSubCategory\": \"Sub kategory A\",\n        \"deliveryNote\": \"Catatan Pengiriman\",\n        \"additionalNote\": \"Catatan Tambahan\",\n        \"vehicleLocation\": null,\n        \"currentStatus\": \"LOAD\",\n        \"previousStatus\": \"PICKUP\"\n      },\n      {\n        \"orderId\": 328,\n        \"orderNumber\": \"PES011557977570458\",\n        \"createdDate\": 1557977570597,\n        \"deliveryDate\": 1557312700000,\n        \"customerName\": \"PT Unilever Indonesia\",\n        \"customerUsername\": \"Suhendro Salin\",\n        \"originName\": \"Kantor Fastrata Buana\",\n        \"originAddress\": \"Jalan Suci No.75,Jakarta Utara\",\n        \"originCity\": \"Jakarta Timur\",\n        \"destinationName\": \"Gudang Fastrata Buana\",\n        \"destinationAddress\": \"Jalan Suci No.75, Jakarta Utaran\",\n        \"destinationCity\": \"Jakarta Utara\",\n        \"transporterCompany\": \"Rekanan 3PL A\",\n        \"transportType\": \"Pickup\",\n        \"vehicleNumber\": \"B1234JKT\",\n        \"driverName\": \"Hardian Gunatama\",\n        \"driverPhone\": \"01234567890\",\n        \"payloadCategory\": \"Kategory A\",\n        \"payloadSubCategory\": \"Sub kategory A\",\n        \"deliveryNote\": \"Catatan Pengiriman\",\n        \"additionalNote\": \"Catatan Tambahan\",\n        \"vehicleLocation\": null,\n        \"currentStatus\": \"UNLOAD\",\n        \"previousStatus\": \"PICKUP\",\n        \"eta\": 4740,\n        \"etaTimestamp\": 1568014331000\n      }\n    ]\n  }\n}\n";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String needConfirmationOrderListResponse = "\n    {\n  \"timestamp\": \"2019-05-16T03:35:04.214+0000\",\n  \"status\": \"OK\",\n  \"statusCode\": 200,\n  \"message\": \"OK\",\n  \"data\": {\n    \"totalPages\": 1,\n    \"totalElements\": 1,\n    \"contents\": [\n      {\n        \"orderId\": 326,\n        \"orderNumber\": \"PES011557977570458\",\n        \"createdDate\": 1557977570597,\n        \"deliveryDate\": 1547312700000,\n        \"customerName\": \"PT Unilever Indonesia\",\n        \"customerUsername\": \"Suhendro Salin\",\n        \"originName\": \"Kantor Fastrata Buana\",\n        \"originAddress\": \"Jalan Suci No.75,Jakarta Utara\",\n        \"originCity\": \"Jakarta Timur\",\n        \"destinationName\": \"Gudang Fastrata Buana\",\n        \"destinationAddress\": \"Jalan Suci No.75, Jakarta Utaran\",\n        \"destinationCity\": \"Jakarta Utara\",\n        \"transporterCompany\": \"Rekanan 3PL A\",\n        \"transportType\": \"Pickup\",\n        \"vehicleNumber\": \"B1234JKT\",\n        \"driverName\": \"Hardian Gunatama\",\n        \"driverPhone\": \"01234567890\",\n        \"payloadCategory\": \"Kategory A\",\n        \"payloadSubCategory\": \"Sub kategory A\",\n        \"deliveryNote\": \"Catatan Pengiriman\",\n        \"additionalNote\": \"Catatan Tambahan\",\n        \"vehicleLocation\": {\n          \"lat\": -6.208017275823,\n          \"lng\": 106.852580721527,\n          \"lastUpdate\": 1557977570597\n        },\n        \"currentStatus\": \"NEED_CONFIRM\",\n        \"previousStatus\": \"PICKUP\"\n      },\n      {\n        \"orderId\": 327,\n        \"orderNumber\": \"PES011557977570459\",\n        \"createdDate\": 1557977670597,\n        \"deliveryDate\": 1547313700000,\n        \"customerName\": \"PT Unilever Indonesia\",\n        \"customerUsername\": \"Suhendro Salin\",\n        \"originName\": \"Kantor Fastrata Buana\",\n        \"originAddress\": \"Jalan Suci No.75,Jakarta Utara\",\n        \"originCity\": \"Jakarta Timur\",\n        \"destinationName\": \"Gudang Fastrata Buana\",\n        \"destinationAddress\": \"Jalan Suci No.75, Jakarta Utaran\",\n        \"destinationCity\": \"Jakarta Utara\",\n        \"transporterCompany\": \"Rekanan 3PL A\",\n        \"transportType\": \"Pickup\",\n        \"vehicleNumber\": \"B1234JKT\",\n        \"driverName\": \"Hardian Gunatama\",\n        \"driverPhone\": \"01234567890\",\n        \"payloadCategory\": \"Kategory A\",\n        \"payloadSubCategory\": \"Sub kategory A\",\n        \"deliveryNote\": \"Catatan Pengiriman\",\n        \"additionalNote\": \"Catatan Tambahan\",\n        \"vehicleLocation\": {\n          \"lat\": -6.208017275823,\n          \"lng\": 106.852580721527,\n          \"lastUpdate\": 1557977570597\n        },\n        \"currentStatus\": \"NEED_CONFIRM\",\n        \"previousStatus\": \"PICKUP\"\n      }\n    ]\n  }\n}\n";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String completeOrderListResponse = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String orderDetailResponse = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String cancellationReasonResponse = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String orderStatusResponse = "\n{\n  \"timestamp\": \"2019-06-25T07:07:59.153+0000\",\n  \"status\": \"OK\",\n  \"statusCode\": 200,\n  \"message\": \"OK\",\n  \"data\": {\n    \"totalPages\": 1,\n    \"totalElements\": 3,\n    \"contents\": [\n      {\n        \"createdBy\": \"developer\",\n        \"createdAt\": 1561377983817,\n        \"id\": \"5d10bcbf1138a0004f3e1941\",\n        \"shipmentId\": 10,\n        \"status\": \"ASSIGNING\",\n        \"fcm\": null,\n        \"longitude\": 0,\n        \"latitude\": 0\n      },\n      {\n        \"createdBy\": \"transporter\",\n        \"createdAt\": 1561378065916,\n        \"id\": \"5d10bd111138a0004f3e1944\",\n        \"shipmentId\": 10,\n        \"status\": \"CONFIRM\",\n        \"fcm\": null,\n        \"longitude\": 0,\n        \"latitude\": 0\n      },\n      {\n        \"createdBy\": \"Jajang Driver\",\n        \"createdAt\": 1561378170529,\n        \"id\": \"5d10bd7a1138a0004f3e1945\",\n        \"shipmentId\": 10,\n        \"status\": \"PICKUP\",\n        \"fcm\": null,\n        \"longitude\": 0,\n        \"latitude\": 0\n      }\n\n    ]\n  }\n}\n";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String driverTrackingResponse = "\n   {\n\"timestamp\": \"2019-05-17T03:48:38.710+0000\",\n\"status\": \"OK\",\n\"statusCode\": 200,\n\"message\": \"OK\",\n\"data\": [\n {\n\"createdBy\": \"username\",\n\"createdAt\": 1560947704642,\n\"id\": \"5d0a2bf81138a000595b9b54\",\n\"shipmentId\": 1,\n\"fcm\": null,\n\"longitude\": 106.85258,\n\"latitude\": -6.2080173,\n\"recordTime\": 1556901511000\n},\n {\n\"createdBy\": \"username\",\n\"createdAt\": 1560947704642,\n\"id\": \"5d0a2bf81138a000595b9b54\",\n\"shipmentId\": 1,\n\"fcm\": null,\n\"longitude\": 106.85258,\n\"latitude\": -6.2070173,\n\"recordTime\": 1556901511001\n},\n {\n\"createdBy\": \"username\",\n\"createdAt\": 1560947704642,\n\"id\": \"5d0a2bf81138a000595b9b54\",\n\"shipmentId\": 1,\n\"fcm\": null,\n\"longitude\": 106.85258,\n\"latitude\": -6.2060173,\n\"recordTime\": 1556901511002\n},\n {\n\"createdBy\": \"username\",\n\"createdAt\": 1560947704642,\n\"id\": \"5d0a2bf81138a000595b9b54\",\n\"shipmentId\": 1,\n\"fcm\": null,\n\"longitude\": 106.85258,\n\"latitude\": -6.2050173,\n\"recordTime\": 1556901511003\n},\n {\n\"createdBy\": \"username\",\n\"createdAt\": 1560947704642,\n\"id\": \"5d0a2bf81138a000595b9b54\",\n\"shipmentId\": 1,\n\"fcm\": null,\n\"longitude\": 106.85258,\n\"latitude\": -6.2040173,\n\"recordTime\": 1556901511004\n},\n {\n\"createdBy\": \"username\",\n\"createdAt\": 1560947704642,\n\"id\": \"5d0a2bf81138a000595b9b54\",\n\"shipmentId\": 1,\n\"fcm\": null,\n\"longitude\": 106.85258,\n\"latitude\": -6.2030173,\n\"recordTime\": 1556901511005\n}\n]\n}\n";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String documentImageListResponse = "{\n\"timestamp\": \"2019-05-17T03:48:38.710+0000\",\n\"status\": \"OK\",\n\"statusCode\": 200,\n\"message\": \"OK\",\n\"data\": {\n\"totalPages\": 1,\n\"totalElements\": 4,\n\"contents\": [\n{\n\"_id\": 1,\n\"docType\": \"DELIVERY\",\n\"docName\": \"Nama dokumen\",\n\"url\": \"http://lorempixel.com/400/200/animals\"\n},\n{\n\"_id\": 2,\n\"docType\": \"DELIVERY\",\n\"docName\": \"Nama dokumen\",\n\"url\": \"http://lorempixel.com/400/200/sports\"\n},\n{\n\"_id\": 325,\n\"docType\": \"DELIVERY\",\n\"docName\": \"Nama dokumen\",\n\"url\": \"http://lorempixel.com/400/200/food\"\n},\n{\n\"_id\": 3,\n\"docType\": \"DELIVERY\",\n\"docName\": \"Nama dokumen\",\n\"url\": \"http://placehold.it/200\"\n},\n{\n\"_id\": 4,\n\"docType\": \"DELIVERY\",\n\"docName\": \"Nama dokumen\",\n\"url\": \"http://placehold.it/200\"\n}\n]\n}\n}";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String podResponse = "{\n    \"timestamp\": \"2019-06-25T07:07:59.153+0000\",\n  \"status\": \"OK\",\n  \"statusCode\": 200,\n  \"message\": \"OK\",\n  \"data\": {\n    \"receiverName\": \"Aaasdf\",\n    \"signatureUrl\": \"http://lorempixel.com/400/200/animals\"\n  }\n}";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String damagedDetailResponse = "\n    {\n  \"timestamp\": \"2019-06-25T07:07:59.153+0000\",\n  \"status\": \"OK\",\n  \"statusCode\": 200,\n  \"message\": \"OK\",\n  \"data\": {\n        \"imagesDoc\": [],\n        \"imagesLoad\": []\n  }\n}\n";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String maintenanceInfoResponse = "\n    {\n  \"timestamp\": \"2019-05-29T08:11:46.959+0000\",\n  \"status\": \"OK\",\n  \"statusCode\": 200,\n  \"message\": \"OK\",\n  \"data\": {\n        \"value\": \"Sedang ada pembaruan\",\n        \"description\": \"desc\",\n        \"expiredOn\": 2556118799000\n      }\n}\n";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String mobileVersionResponse = "\n    {\n      \"timestamp\": \"2019-05-29T08:11:46.959+0000\",\n      \"status\": \"OK\",\n      \"statusCode\": 200,\n      \"message\": \"OK\",\n      \"data\": null\n    }\n";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String shipmentSummaryResponse = "\n    {\n        \"timestamp\": \"2020-11-17T08:19:33.416+0000\",\n        \"status\": \"OK\",\n        \"statusCode\": 200,\n        \"message\": \"OK\",\n        \"data\": {\n            \"asDate\": 1605546000000,\n            \"startDate\": 1604941200000,\n            \"toDate\": 1605546000000,\n            \"shipmentScheduled\": 0,\n            \"shipmentWaiting\": 3,\n            \"shipmentProblem\": 1,\n            \"shipmentPickup\": 1,\n            \"shipmentDeliver\": 0,\n            \"shipmentComplete\": 6\n        }\n    }\n";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String shipmentNeedConfirmationResponse = "\n    {\n    \"timestamp\": \"2021-08-17T21:51:21.103169\",\n    \"status\": \"OK\",\n    \"statusCode\": 200,\n    \"message\": \"OK\",\n    \"data\": {\n        \"contents\": [\n            {\n                \"id\": 54,\n                \"shipmentNumber\": \"KRG1629100623527\",\n                \"shipmentDate\": \"2021-08-20T13:18:39+07:00\",\n                \"shipmentStatus\": \"Terkonfirmasi\",\n                \"originLocationId\": 1,\n                \"originalLocation\": \"Kabupaten Karawang (PT. PANTERA BIRU INDONESIA)\",\n                \"originalSequenceStatus\": \"waiting\",\n                \"multiPick\": [\n                    {\n                    \"sequenceNo\": 1,\n                        \"locationId\": 26,\n                        \"locationName\": \"FASTRATA BUANA - KARAWANG\",\n                        \"locationAddress\": \"Jalan Raya Klari KM.1 No.26, Gintungkerta\",\n                        \"sequenceStatus\": \"waiting\",\n                        \"cityId\": 175,\n                        \"cityName\": \"Kabupaten Karawang\"\n                    },\n                    {\n                    \"sequenceNo\": 2,\n                        \"locationId\": 11,\n                        \"locationName\": \"Kawasan Industri Surya Cipta\",\n                        \"locationAddress\": \"Kutamekar\",\n                        \"sequenceStatus\": \"waiting\",\n                        \"cityId\": 175,\n                        \"cityName\": \"Kabupaten Karawang\"\n                    }\n                ],\n                \"destinationLocationId\": 7,\n                \"destinationLocation\": \"Kota Jakarta Barat (Jakarta Selatan)\",\n                \"destinationSequenceStatus\": \"waiting\",\n                \"multiDrop\": [\n                    {\n                    \"sequenceNo\": 1,\n                        \"locationId\": 149,\n                        \"locationName\": \"(KWN) ACE SURABAYA PAKUWON\",\n                        \"locationAddress\": \"Pakuwon Mall Level LG, Jl. Mayjen Yono Suwoyo No.2, Babatan, Kec. Wiyung, Kota SBY, Jawa Timur 60227\",\n                        \"sequenceStatus\": \"waiting\",\n                        \"cityId\": 264,\n                        \"cityName\": \"Kota Surabaya\"\n                    },\n                    {\n                    \"sequenceNo\": 2,\n                        \"locationId\": 128,\n                        \"locationName\": \"(KWN) ACE SURABAYA GALAXY\",\n                        \"locationAddress\": \"Galaxy Mall 1 Surabaya Lt.Dasar No.79-85, Jl. Dharmahusada Indah Timur No.37, Kec. Mulyorejo, Kota SBY, Jawa Timur 60115\",\n                        \"sequenceStatus\": \"waiting\",\n                        \"cityId\": 264,\n                        \"cityName\": \"Kota Surabaya\"\n                    }\n                ]\n            },\n            {\n                \"id\": 53,\n                \"shipmentNumber\": \"KRG1629023981479\",\n                \"shipmentDate\": \"2021-08-20T13:18:39+07:00\",\n                \"shipmentStatus\": \"Terkonfirmasi\",\n                \"originLocationId\": 1,\n                \"originalLocation\": \"Kabupaten Karawang (PT. PANTERA BIRU INDONESIA)\",\n                \"originalSequenceStatus\": \"started\",\n                \"multiPick\": [\n                    {\n                    \"sequenceNo\": 1,\n                        \"locationId\": 26,\n                        \"locationName\": \"FASTRATA BUANA - KARAWANG\",\n                        \"locationAddress\": \"Jalan Raya Klari KM.1 No.26, Gintungkerta\",\n                        \"sequenceStatus\": \"waiting\",\n                        \"cityId\": 175,\n                        \"cityName\": \"Kabupaten Karawang\"\n                    },\n                    {\n                    \"sequenceNo\": 2,\n                        \"locationId\": 11,\n                        \"locationName\": \"Kawasan Industri Surya Cipta\",\n                        \"locationAddress\": \"Kutamekar\",\n                        \"sequenceStatus\": \"waiting\",\n                        \"cityId\": 175,\n                        \"cityName\": \"Kabupaten Karawang\"\n                    }\n                ],\n                \"destinationLocationId\": 7,\n                \"destinationLocation\": \"Kota Jakarta Barat (Jakarta Selatan)\",\n                \"destinationSequenceStatus\": \"waiting\",\n                \"multiDrop\": [\n                    {\n                    \"sequenceNo\": 1,\n                        \"locationId\": 149,\n                        \"locationName\": \"(KWN) ACE SURABAYA PAKUWON\",\n                        \"locationAddress\": \"Pakuwon Mall Level LG, Jl. Mayjen Yono Suwoyo No.2, Babatan, Kec. Wiyung, Kota SBY, Jawa Timur 60227\",\n                        \"sequenceStatus\": \"waiting\",\n                        \"cityId\": 264,\n                        \"cityName\": \"Kota Surabaya\"\n                    },\n                    {\n                    \"sequenceNo\": 2,\n                        \"locationId\": 128,\n                        \"locationName\": \"(KWN) ACE SURABAYA GALAXY\",\n                        \"locationAddress\": \"Galaxy Mall 1 Surabaya Lt.Dasar No.79-85, Jl. Dharmahusada Indah Timur No.37, Kec. Mulyorejo, Kota SBY, Jawa Timur 60115\",\n                        \"sequenceStatus\": \"waiting\",\n                        \"cityId\": 264,\n                        \"cityName\": \"Kota Surabaya\"\n                    }\n                ]\n            },\n            {\n                \"id\": 26,\n                \"shipmentNumber\": \"KRG1626932120438\",\n                \"shipmentDate\": \"2021-07-08T13:18:39+07:00\",\n                \"shipmentStatus\": \"BA Penerimaan - Konfirmasi Shipper\",\n                \"originLocationId\": 2,\n                \"originalLocation\": \"Kabupaten Nagan Raya (PT SANTOS JAYA ABADI KRIAN)\",\n                \"originalSequenceStatus\": \"waiting\",\n                \"multiPick\": [],\n                \"destinationLocationId\": 7,\n                \"destinationLocation\": \"Kota Jakarta Barat (Jakarta Selatan)\",\n                \"destinationSequenceStatus\": \"waiting\",\n                \"multiDrop\": []\n            }\n        ],\n        \"page\": 1,\n        \"rowPerPage\": 5,\n        \"totalData\": 3,\n        \"startRow\": 5,\n        \"totalPage\": 1\n    }\n}\n";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String shipmentOnProcessResponse = "\n    {\n    \"timestamp\": \"2021-08-17T21:51:21.103169\",\n    \"status\": \"OK\",\n    \"statusCode\": 200,\n    \"message\": \"OK\",\n    \"data\": {\n        \"contents\": [\n            {\n                \"id\": 54,\n                \"shipmentNumber\": \"KRG1629100623527\",\n                \"shipmentDate\": \"2021-08-20T13:18:39+07:00\",\n                \"shipmentStatus\": \"Terkonfirmasi\",\n                \"originLocationId\": 1,\n                \"originalLocation\": \"Kabupaten Karawang (PT. PANTERA BIRU INDONESIA)\",\n                \"originalSequenceStatus\": \"started\",\n                \"multiPick\": [\n                    {\n                    \"sequenceNo\": 1,\n                        \"locationId\": 26,\n                        \"locationName\": \"FASTRATA BUANA - KARAWANG\",\n                        \"locationAddress\": \"Jalan Raya Klari KM.1 No.26, Gintungkerta\",\n                        \"sequenceStatus\": \"waiting\",\n                        \"cityId\": 175,\n                        \"cityName\": \"Kabupaten Karawang\"\n                    },\n                    {\n                    \"sequenceNo\": 2,\n                        \"locationId\": 11,\n                        \"locationName\": \"Kawasan Industri Surya Cipta\",\n                        \"locationAddress\": \"Kutamekar\",\n                        \"sequenceStatus\": \"waiting\",\n                        \"cityId\": 175,\n                        \"cityName\": \"Kabupaten Karawang\"\n                    }\n                ],\n                \"destinationLocationId\": 7,\n                \"destinationLocation\": \"Kota Jakarta Barat (Jakarta Selatan)\",\n                \"destinationSequenceStatus\": \"waiting\",\n                \"multiDrop\": [\n                    {\n                    \"sequenceNo\": 1,\n                        \"locationId\": 149,\n                        \"locationName\": \"(KWN) ACE SURABAYA PAKUWON\",\n                        \"locationAddress\": \"Pakuwon Mall Level LG, Jl. Mayjen Yono Suwoyo No.2, Babatan, Kec. Wiyung, Kota SBY, Jawa Timur 60227\",\n                        \"sequenceStatus\": \"waiting\",\n                        \"cityId\": 264,\n                        \"cityName\": \"Kota Surabaya\"\n                    },\n                    {\n                    \"sequenceNo\": 2,\n                        \"locationId\": 128,\n                        \"locationName\": \"(KWN) ACE SURABAYA GALAXY\",\n                        \"locationAddress\": \"Galaxy Mall 1 Surabaya Lt.Dasar No.79-85, Jl. Dharmahusada Indah Timur No.37, Kec. Mulyorejo, Kota SBY, Jawa Timur 60115\",\n                        \"sequenceStatus\": \"waiting\",\n                        \"cityId\": 264,\n                        \"cityName\": \"Kota Surabaya\"\n                    }\n                ]\n            },\n            {\n                \"id\": 53,\n                \"shipmentNumber\": \"KRG1629023981479\",\n                \"shipmentDate\": \"2021-08-20T13:18:39+07:00\",\n                \"shipmentStatus\": \"Terkonfirmasi\",\n                \"originLocationId\": 1,\n                \"originalLocation\": \"Kabupaten Karawang (PT. PANTERA BIRU INDONESIA)\",\n                \"originalSequenceStatus\": \"waiting\",\n                \"multiPick\": [\n                    {\n                    \"sequenceNo\": 1,\n                        \"locationId\": 26,\n                        \"locationName\": \"FASTRATA BUANA - KARAWANG\",\n                        \"locationAddress\": \"Jalan Raya Klari KM.1 No.26, Gintungkerta\",\n                        \"sequenceStatus\": \"waiting\",\n                        \"cityId\": 175,\n                        \"cityName\": \"Kabupaten Karawang\"\n                    },\n                    {\n                    \"sequenceNo\": 2,\n                        \"locationId\": 11,\n                        \"locationName\": \"Kawasan Industri Surya Cipta\",\n                        \"locationAddress\": \"Kutamekar\",\n                        \"sequenceStatus\": \"waiting\",\n                        \"cityId\": 175,\n                        \"cityName\": \"Kabupaten Karawang\"\n                    }\n                ],\n                \"destinationLocationId\": 7,\n                \"destinationLocation\": \"Kota Jakarta Barat (Jakarta Selatan)\",\n                \"destinationSequenceStatus\": \"waiting\",\n                \"multiDrop\": [\n                    {\n                    \"sequenceNo\": 1,\n                        \"locationId\": 149,\n                        \"locationName\": \"(KWN) ACE SURABAYA PAKUWON\",\n                        \"locationAddress\": \"Pakuwon Mall Level LG, Jl. Mayjen Yono Suwoyo No.2, Babatan, Kec. Wiyung, Kota SBY, Jawa Timur 60227\",\n                        \"sequenceStatus\": \"waiting\",\n                        \"cityId\": 264,\n                        \"cityName\": \"Kota Surabaya\"\n                    },\n                    {\n                    \"sequenceNo\": 2,\n                        \"locationId\": 128,\n                        \"locationName\": \"(KWN) ACE SURABAYA GALAXY\",\n                        \"locationAddress\": \"Galaxy Mall 1 Surabaya Lt.Dasar No.79-85, Jl. Dharmahusada Indah Timur No.37, Kec. Mulyorejo, Kota SBY, Jawa Timur 60115\",\n                        \"sequenceStatus\": \"waiting\",\n                        \"cityId\": 264,\n                        \"cityName\": \"Kota Surabaya\"\n                    }\n                ]\n            },\n            {\n                \"id\": 26,\n                \"shipmentNumber\": \"KRG1626932120438\",\n                \"shipmentDate\": \"2021-07-08T13:18:39+07:00\",\n                \"shipmentStatus\": \"BA Penerimaan - Konfirmasi Shipper\",\n                \"originLocationId\": 2,\n                \"originalLocation\": \"Kabupaten Nagan Raya (PT SANTOS JAYA ABADI KRIAN)\",\n                \"originalSequenceStatus\": \"waiting\",\n                \"multiPick\": [],\n                \"destinationLocationId\": 7,\n                \"destinationLocation\": \"Kota Jakarta Barat (Jakarta Selatan)\",\n                \"destinationSequenceStatus\": \"waiting\",\n                \"multiDrop\": []\n            }\n        ],\n        \"page\": 1,\n        \"rowPerPage\": 5,\n        \"totalData\": 3,\n        \"startRow\": 5,\n        \"totalPage\": 1\n    }\n}\n";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String shipmentFinishResponse = "\n    {\n        \"timestamp\": \"2021-07-14T23:52:26.616188400\",\n    \"status\": \"OK\",\n    \"statusCode\": 200,\n    \"message\": \"OK\",\n    \"data\": {\n        \"contents\": [],\n        \"page\": 1,\n        \"rowPerPage\": 5,\n        \"totalData\": 1,\n        \"totalPage\": 1,\n        \"startRow\": 5\n    }\n    }\n";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String simplePODResponse = "\n    {\n        \"timestamp\": \"2021-07-14T23:52:26.616188400\",\n    \"status\": \"OK\",\n    \"statusCode\": 200,\n    \"message\": \"OK\",\n    \"data\": [\n        {\n            \"id\": 26,\n            \"title\": \"KRG1626932120438\",\n            \"pickupDate\": 1625725119000,\n            \"latestStatus\": \"BELUM_KIRIM_DOKUMEN\"\n        }\n    ]\n    }\n";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String newOrderList = "\n    \n";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String pickupList = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String deliverList = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String completeList = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String continueOrderFailResponse = "\n    {\n        \"timestamp\":\"2020-12-17T05:14:40.492+0000\",\n        \"status\":\"Bad Request\",\n        \"statusCode\": 400,\n        \"message\": \"Tes message gagal keluarnya gini\",\n        \"data\": null\n    }\n";
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getOngoingOrderListResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getNeedConfirmationOrderListResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getCompleteOrderListResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getOrderDetailResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getCancellationReasonResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getOrderStatusResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getDriverTrackingResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getDocumentImageListResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getPodResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getDamagedDetailResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getMaintenanceInfoResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getMobileVersionResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getShipmentSummaryResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getShipmentNeedConfirmationResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getShipmentOnProcessResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getShipmentFinishResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getSimplePODResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getNewOrderList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getPickupList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getDeliverList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getCompleteList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getContinueOrderFailResponse() {
        return null;
    }
}