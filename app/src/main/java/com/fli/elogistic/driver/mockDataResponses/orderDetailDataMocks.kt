package com.fli.elogistic.driver.mockDataResponses

val ongoingOrderListResponse = """
    {
  "timestamp": "2019-05-16T03:35:04.214+0000",
  "status": "OK",
  "statusCode": 200,
  "message": "OK",
  "data": {
    "totalPages": 1,
    "totalElements": 3,
    "contents": [
      {
        "orderId": 325,
        "orderNumber": "PES011557977570459",
        "createdDate": 1557977570597,
        "deliveryDate": 1547312700000,
        "customerName": "PT Unilever Indonesia",
        "customerUsername": "Suhendro Salin",
        "originName": "Kantor Fastrata Buana",
        "originAddress": "Jalan Suci No.75,Jakarta Utara",
        "originCity": "Jakarta Timur",
        "destinationName": "Gudang Fastrata Buana",
        "destinationAddress": "Jalan Suci No.75, Jakarta Utaran",
        "destinationCity": "Jakarta Utara",
        "transporterCompany": "Rekanan 3PL A",
        "transportType": "Pickup",
        "vehicleNumber": "B1234JKT",
        "driverName": "Hardian Gunatama",
        "driverPhone": "01234567890",
        "payloadCategory": "Kategory A",
        "payloadSubCategory": "Sub kategory A",
        "deliveryNote": "Catatan Pengiriman",
        "additionalNote": "Catatan Tambahan",
        "vehicleLocation": {
          "lat": -6.208017275823,
          "lng": 106.852580721527,
          "lastUpdate": 1557977570597
        },
        "currentStatus": "CONFIRM",
        "previousStatus": "PICKUP"
      },
      {
        "orderId": 327,
        "orderNumber": "PES011557977570457",
        "createdDate": 1557977570597,
        "deliveryDate": 1547312700000,
        "customerName": "PT Unilever Indonesia",
        "customerUsername": "Suhendro Salin",
        "originName": "Kantor Fastrata Buana",
        "originAddress": "Jalan Suci No.75,Jakarta Utara",
        "originCity": "Jakarta Timur",
        "destinationName": "Gudang Fastrata Buana",
        "destinationAddress": "Jalan Suci No.75, Jakarta Utaran",
        "destinationCity": "Jakarta Utara",
        "transporterCompany": "Rekanan 3PL A",
        "transportType": "Pickup",
        "vehicleNumber": "B1234JKT",
        "driverName": "Hardian Gunatama",
        "driverPhone": "01234567890",
        "payloadCategory": "Kategory A",
        "payloadSubCategory": "Sub kategory A",
        "deliveryNote": "Catatan Pengiriman",
        "additionalNote": "Catatan Tambahan",
        "vehicleLocation": null,
        "currentStatus": "LOAD",
        "previousStatus": "PICKUP"
      },
      {
        "orderId": 328,
        "orderNumber": "PES011557977570458",
        "createdDate": 1557977570597,
        "deliveryDate": 1557312700000,
        "customerName": "PT Unilever Indonesia",
        "customerUsername": "Suhendro Salin",
        "originName": "Kantor Fastrata Buana",
        "originAddress": "Jalan Suci No.75,Jakarta Utara",
        "originCity": "Jakarta Timur",
        "destinationName": "Gudang Fastrata Buana",
        "destinationAddress": "Jalan Suci No.75, Jakarta Utaran",
        "destinationCity": "Jakarta Utara",
        "transporterCompany": "Rekanan 3PL A",
        "transportType": "Pickup",
        "vehicleNumber": "B1234JKT",
        "driverName": "Hardian Gunatama",
        "driverPhone": "01234567890",
        "payloadCategory": "Kategory A",
        "payloadSubCategory": "Sub kategory A",
        "deliveryNote": "Catatan Pengiriman",
        "additionalNote": "Catatan Tambahan",
        "vehicleLocation": null,
        "currentStatus": "UNLOAD",
        "previousStatus": "PICKUP",
        "eta": 4740,
        "etaTimestamp": 1568014331000
      }
    ]
  }
}
"""

val needConfirmationOrderListResponse = """
    {
  "timestamp": "2019-05-16T03:35:04.214+0000",
  "status": "OK",
  "statusCode": 200,
  "message": "OK",
  "data": {
    "totalPages": 1,
    "totalElements": 1,
    "contents": [
      {
        "orderId": 326,
        "orderNumber": "PES011557977570458",
        "createdDate": 1557977570597,
        "deliveryDate": 1547312700000,
        "customerName": "PT Unilever Indonesia",
        "customerUsername": "Suhendro Salin",
        "originName": "Kantor Fastrata Buana",
        "originAddress": "Jalan Suci No.75,Jakarta Utara",
        "originCity": "Jakarta Timur",
        "destinationName": "Gudang Fastrata Buana",
        "destinationAddress": "Jalan Suci No.75, Jakarta Utaran",
        "destinationCity": "Jakarta Utara",
        "transporterCompany": "Rekanan 3PL A",
        "transportType": "Pickup",
        "vehicleNumber": "B1234JKT",
        "driverName": "Hardian Gunatama",
        "driverPhone": "01234567890",
        "payloadCategory": "Kategory A",
        "payloadSubCategory": "Sub kategory A",
        "deliveryNote": "Catatan Pengiriman",
        "additionalNote": "Catatan Tambahan",
        "vehicleLocation": {
          "lat": -6.208017275823,
          "lng": 106.852580721527,
          "lastUpdate": 1557977570597
        },
        "currentStatus": "NEED_CONFIRM",
        "previousStatus": "PICKUP"
      },
      {
        "orderId": 327,
        "orderNumber": "PES011557977570459",
        "createdDate": 1557977670597,
        "deliveryDate": 1547313700000,
        "customerName": "PT Unilever Indonesia",
        "customerUsername": "Suhendro Salin",
        "originName": "Kantor Fastrata Buana",
        "originAddress": "Jalan Suci No.75,Jakarta Utara",
        "originCity": "Jakarta Timur",
        "destinationName": "Gudang Fastrata Buana",
        "destinationAddress": "Jalan Suci No.75, Jakarta Utaran",
        "destinationCity": "Jakarta Utara",
        "transporterCompany": "Rekanan 3PL A",
        "transportType": "Pickup",
        "vehicleNumber": "B1234JKT",
        "driverName": "Hardian Gunatama",
        "driverPhone": "01234567890",
        "payloadCategory": "Kategory A",
        "payloadSubCategory": "Sub kategory A",
        "deliveryNote": "Catatan Pengiriman",
        "additionalNote": "Catatan Tambahan",
        "vehicleLocation": {
          "lat": -6.208017275823,
          "lng": 106.852580721527,
          "lastUpdate": 1557977570597
        },
        "currentStatus": "NEED_CONFIRM",
        "previousStatus": "PICKUP"
      }
    ]
  }
}
"""

val completeOrderListResponse = """
{
  "timestamp": "2019-05-16T03:35:04.214+0000",
  "status": "OK",
  "statusCode": 200,
  "message": "OK",
  "data": {
    "totalPages": 1,
    "totalElements": 2,
    "contents": [
      {
        "orderId": 328,
        "orderNumber": "PES011557977570456",
        "createdDate": 1557977570597,
        "deliveryDate": ${System.currentTimeMillis()},
        "rating": 4,
        "customerName": "PT Unilever Indonesia",
        "customerUsername": "Suhendro Salin",
        "originName": "Kantor Fastrata Buana",
        "originAddress": "Jalan Suci No.75,Jakarta Utara",
        "originCity": "Jakarta Timur",
        "destinationName": "Gudang Fastrata Buana",
        "destinationAddress": "Jalan Suci No.75, Jakarta Utaran",
        "destinationCity": "Jakarta Utara",
        "transporterCompany": "Rekanan 3PL A",
        "transportType": "Pickup",
        "vehicleNumber": "B1234JKT",
        "driverName": "Hardian Gunatama",
        "driverPhone": "01234567890",
        "payloadCategory": "Kategory A",
        "payloadSubCategory": "Sub kategory A",
        "deliveryNote": "Catatan Pengiriman",
        "additionalNote": "Catatan Tambahan",
        "vehicleLocation": {
          "lat": -6.208017275823,
          "lng": 106.852580721527,
          "lastUpdate": 1557977570597
        },
        "currentStatus": "COMPLETE_FULL",
        "eta": 4740,
        "etaTimestamp": 1568014331000,
        "completeDate": 1568016331000
      },
      {
        "orderId": 329,
        "orderNumber": "PES011557977570455",
        "createdDate": 1557977570597,
        "deliveryDate": 1547312700000,
        "customerName": "PT Unilever Indonesia",
        "customerUsername": "Suhendro Salin",
        "originName": "Kantor Fastrata Buana",
        "originAddress": "Jalan Suci No.75,Jakarta Utara",
        "originCity": "Jakarta Timur",
        "destinationName": "Gudang Fastrata Buana",
        "destinationAddress": "Jalan Suci No.75, Jakarta Utaran",
        "destinationCity": "Jakarta Utara",
        "transporterCompany": "Rekanan 3PL A",
        "transportType": "Pickup",
        "vehicleNumber": "B1234JKT",
        "driverName": "Hardian Gunatama",
        "driverPhone": "01234567890",
        "payloadCategory": "Kategory A",
        "payloadSubCategory": "Sub kategory A",
        "deliveryNote": "Catatan Pengiriman",
        "additionalNote": "Catatan Tambahan",
        "rating": 4,
        "vehicleLocation": {
          "lat": -6.208017275823,
          "lng": 106.852580721527,
          "lastUpdate": 1557977570597
        },
        "currentStatus": "CANCEL",
        "eta": 47400,
        "etaTimestamp": 1568013331000,
        "completeDate": 1568014331000
      }
    ]
  }
}
"""

val orderDetailResponse = """
{
    "timestamp": "2019-07-29T08:09:21.371+0000",
    "status": "OK",
    "statusCode": 200,
    "message": "OK",
    "data": {
        "orderId": 1234234,
        "orderNumber": "PES011563884026268",
        "createdDate": 1563884026315,
        "customerName": "SHIPPER",
        "customerUsername": "shipper",
        "originCoordinate": {
            "lat": -6.1879315,
            "lng": 106.814545,
            "radius": 200
        },
        "originId": "1",
        "originName": "Pasar Tanah Abang Blok A",
        "originAddress": "Jalan Pasar Tanah Abang No.7 A, Kampung Bali",
        "originNote": "2",
        "senderName": "Nama Pengirim",
        "senderPhone": "Nomor Telepon Pengirim",
        "destinationCoordinate": {
            "lat": -6.188005,
            "lng": 106.81452,
            "radius": 200
        },
        "destinationId": 4,
        "destinationName": "Pasar Tanah Abang Blok B",
        "destinationAddress": "Jalan Fachrudin No.78, 80, 82, Kampung Bali",
        "destinationNote": "3",
        "recipientName": "Nama Penerima",
        "recipientPhone": "Nomor Telepon Penerima",
        "categoryId": 1,
        "payloadCategory": "Raw Material",
        "subCategoryId": 1,
        "payloadSubCategory": "Raw Material 1",
        "transporterUsername": "transporter",
        "deliveryDate": 1563814800000,
        "deliveryNote": "Tambahan informasi Barang yang diantar",
        "transportTypeId": 1,
        "transportType": "PICKUP",
        "vehicleNumber": "No Kendaraan",
        "driverName": "DRIVER 1-1",
        "driverPhone": "Nomor Telepon",
        "driverImageUrl": null,
        "vehicleLocation": null,
        "accidentLocation": {
            "status": "",
            "lat": -6.2080173,
            "long": 106.85258,
            "note": "Sudah dalam penanganan",
            "reason": null,
            "driverResolve": null
        },
        "currentStatus": "NEED_CONFIRM",
        "previousStatus": "ASSIGNING",
        "rating": null,
        "hasAccident": true,
        "hasDamagedItem": true,
        "isReturnShipment": false,
        "isOnHold": false,
        "reffShipmentId" : null,
        "completeDate" : ${System.currentTimeMillis()},
        "pickupNote": "Jam 12-1 karyawannya makan siang",
        "nextShipmentId" : null,
        "eta": 4740,
        "etaTimestamp": 1568014331000
    }
}
"""

val cancellationReasonResponse = """
       {
"timestamp": "2019-04-16T10:49:20.948+0000",
"status": "OK",
"statusCode": 200,
"message": "OK",
"data": {
"totalPages": 1,
"totalElements": 3,
"contents": [
{
"id": 1,
"value": "Alasan A",
"type": "CANCELLATION"
},
{
"id": 2,
"value": "Alasan B",
"type": "CANCELLATION"
},
{
"id": 3,
"value": "Alasan C",
"type": "CANCELLATION"
}
]
}
}
""".trimIndent()

val orderStatusResponse = """
{
  "timestamp": "2019-06-25T07:07:59.153+0000",
  "status": "OK",
  "statusCode": 200,
  "message": "OK",
  "data": {
    "totalPages": 1,
    "totalElements": 3,
    "contents": [
      {
        "createdBy": "developer",
        "createdAt": 1561377983817,
        "id": "5d10bcbf1138a0004f3e1941",
        "shipmentId": 10,
        "status": "ASSIGNING",
        "fcm": null,
        "longitude": 0,
        "latitude": 0
      },
      {
        "createdBy": "transporter",
        "createdAt": 1561378065916,
        "id": "5d10bd111138a0004f3e1944",
        "shipmentId": 10,
        "status": "CONFIRM",
        "fcm": null,
        "longitude": 0,
        "latitude": 0
      },
      {
        "createdBy": "Jajang Driver",
        "createdAt": 1561378170529,
        "id": "5d10bd7a1138a0004f3e1945",
        "shipmentId": 10,
        "status": "PICKUP",
        "fcm": null,
        "longitude": 0,
        "latitude": 0
      }

    ]
  }
}
"""

val driverTrackingResponse = """
   {
"timestamp": "2019-05-17T03:48:38.710+0000",
"status": "OK",
"statusCode": 200,
"message": "OK",
"data": [
 {
"createdBy": "username",
"createdAt": 1560947704642,
"id": "5d0a2bf81138a000595b9b54",
"shipmentId": 1,
"fcm": null,
"longitude": 106.85258,
"latitude": -6.2080173,
"recordTime": 1556901511000
},
 {
"createdBy": "username",
"createdAt": 1560947704642,
"id": "5d0a2bf81138a000595b9b54",
"shipmentId": 1,
"fcm": null,
"longitude": 106.85258,
"latitude": -6.2070173,
"recordTime": 1556901511001
},
 {
"createdBy": "username",
"createdAt": 1560947704642,
"id": "5d0a2bf81138a000595b9b54",
"shipmentId": 1,
"fcm": null,
"longitude": 106.85258,
"latitude": -6.2060173,
"recordTime": 1556901511002
},
 {
"createdBy": "username",
"createdAt": 1560947704642,
"id": "5d0a2bf81138a000595b9b54",
"shipmentId": 1,
"fcm": null,
"longitude": 106.85258,
"latitude": -6.2050173,
"recordTime": 1556901511003
},
 {
"createdBy": "username",
"createdAt": 1560947704642,
"id": "5d0a2bf81138a000595b9b54",
"shipmentId": 1,
"fcm": null,
"longitude": 106.85258,
"latitude": -6.2040173,
"recordTime": 1556901511004
},
 {
"createdBy": "username",
"createdAt": 1560947704642,
"id": "5d0a2bf81138a000595b9b54",
"shipmentId": 1,
"fcm": null,
"longitude": 106.85258,
"latitude": -6.2030173,
"recordTime": 1556901511005
}
]
}
"""

val documentImageListResponse = """{
"timestamp": "2019-05-17T03:48:38.710+0000",
"status": "OK",
"statusCode": 200,
"message": "OK",
"data": {
"totalPages": 1,
"totalElements": 4,
"contents": [
{
"_id": 1,
"docType": "DELIVERY",
"docName": "Nama dokumen",
"url": "http://lorempixel.com/400/200/animals"
},
{
"_id": 2,
"docType": "DELIVERY",
"docName": "Nama dokumen",
"url": "http://lorempixel.com/400/200/sports"
},
{
"_id": 325,
"docType": "DELIVERY",
"docName": "Nama dokumen",
"url": "http://lorempixel.com/400/200/food"
},
{
"_id": 3,
"docType": "DELIVERY",
"docName": "Nama dokumen",
"url": "http://placehold.it/200"
},
{
"_id": 4,
"docType": "DELIVERY",
"docName": "Nama dokumen",
"url": "http://placehold.it/200"
}
]
}
}"""

val podResponse = """{
    "timestamp": "2019-06-25T07:07:59.153+0000",
  "status": "OK",
  "statusCode": 200,
  "message": "OK",
  "data": {
    "receiverName": "Aaasdf",
    "signatureUrl": "http://lorempixel.com/400/200/animals"
  }
}"""

val damagedDetailResponse = """
    {
  "timestamp": "2019-06-25T07:07:59.153+0000",
  "status": "OK",
  "statusCode": 200,
  "message": "OK",
  "data": {
        "imagesDoc": [],
        "imagesLoad": []
  }
}
"""

val maintenanceInfoResponse = """
    {
  "timestamp": "2019-05-29T08:11:46.959+0000",
  "status": "OK",
  "statusCode": 200,
  "message": "OK",
  "data": {
        "value": "Sedang ada pembaruan",
        "description": "desc",
        "expiredOn": 2556118799000
      }
}
"""

val mobileVersionResponse = """
    {
      "timestamp": "2019-05-29T08:11:46.959+0000",
      "status": "OK",
      "statusCode": 200,
      "message": "OK",
      "data": null
    }
"""

val shipmentSummaryResponse = """
    {
        "timestamp": "2020-11-17T08:19:33.416+0000",
        "status": "OK",
        "statusCode": 200,
        "message": "OK",
        "data": {
            "asDate": 1605546000000,
            "startDate": 1604941200000,
            "toDate": 1605546000000,
            "shipmentScheduled": 0,
            "shipmentWaiting": 3,
            "shipmentProblem": 1,
            "shipmentPickup": 1,
            "shipmentDeliver": 0,
            "shipmentComplete": 6
        }
    }
"""
val shipmentNeedConfirmationResponse = """
    {
    "timestamp": "2021-08-17T21:51:21.103169",
    "status": "OK",
    "statusCode": 200,
    "message": "OK",
    "data": {
        "contents": [
            {
                "id": 54,
                "shipmentNumber": "KRG1629100623527",
                "shipmentDate": "2021-08-20T13:18:39+07:00",
                "shipmentStatus": "Terkonfirmasi",
                "originLocationId": 1,
                "originalLocation": "Kabupaten Karawang (PT. PANTERA BIRU INDONESIA)",
                "originalSequenceStatus": "waiting",
                "multiPick": [
                    {
                    "sequenceNo": 1,
                        "locationId": 26,
                        "locationName": "FASTRATA BUANA - KARAWANG",
                        "locationAddress": "Jalan Raya Klari KM.1 No.26, Gintungkerta",
                        "sequenceStatus": "waiting",
                        "cityId": 175,
                        "cityName": "Kabupaten Karawang"
                    },
                    {
                    "sequenceNo": 2,
                        "locationId": 11,
                        "locationName": "Kawasan Industri Surya Cipta",
                        "locationAddress": "Kutamekar",
                        "sequenceStatus": "waiting",
                        "cityId": 175,
                        "cityName": "Kabupaten Karawang"
                    }
                ],
                "destinationLocationId": 7,
                "destinationLocation": "Kota Jakarta Barat (Jakarta Selatan)",
                "destinationSequenceStatus": "waiting",
                "multiDrop": [
                    {
                    "sequenceNo": 1,
                        "locationId": 149,
                        "locationName": "(KWN) ACE SURABAYA PAKUWON",
                        "locationAddress": "Pakuwon Mall Level LG, Jl. Mayjen Yono Suwoyo No.2, Babatan, Kec. Wiyung, Kota SBY, Jawa Timur 60227",
                        "sequenceStatus": "waiting",
                        "cityId": 264,
                        "cityName": "Kota Surabaya"
                    },
                    {
                    "sequenceNo": 2,
                        "locationId": 128,
                        "locationName": "(KWN) ACE SURABAYA GALAXY",
                        "locationAddress": "Galaxy Mall 1 Surabaya Lt.Dasar No.79-85, Jl. Dharmahusada Indah Timur No.37, Kec. Mulyorejo, Kota SBY, Jawa Timur 60115",
                        "sequenceStatus": "waiting",
                        "cityId": 264,
                        "cityName": "Kota Surabaya"
                    }
                ]
            },
            {
                "id": 53,
                "shipmentNumber": "KRG1629023981479",
                "shipmentDate": "2021-08-20T13:18:39+07:00",
                "shipmentStatus": "Terkonfirmasi",
                "originLocationId": 1,
                "originalLocation": "Kabupaten Karawang (PT. PANTERA BIRU INDONESIA)",
                "originalSequenceStatus": "started",
                "multiPick": [
                    {
                    "sequenceNo": 1,
                        "locationId": 26,
                        "locationName": "FASTRATA BUANA - KARAWANG",
                        "locationAddress": "Jalan Raya Klari KM.1 No.26, Gintungkerta",
                        "sequenceStatus": "waiting",
                        "cityId": 175,
                        "cityName": "Kabupaten Karawang"
                    },
                    {
                    "sequenceNo": 2,
                        "locationId": 11,
                        "locationName": "Kawasan Industri Surya Cipta",
                        "locationAddress": "Kutamekar",
                        "sequenceStatus": "waiting",
                        "cityId": 175,
                        "cityName": "Kabupaten Karawang"
                    }
                ],
                "destinationLocationId": 7,
                "destinationLocation": "Kota Jakarta Barat (Jakarta Selatan)",
                "destinationSequenceStatus": "waiting",
                "multiDrop": [
                    {
                    "sequenceNo": 1,
                        "locationId": 149,
                        "locationName": "(KWN) ACE SURABAYA PAKUWON",
                        "locationAddress": "Pakuwon Mall Level LG, Jl. Mayjen Yono Suwoyo No.2, Babatan, Kec. Wiyung, Kota SBY, Jawa Timur 60227",
                        "sequenceStatus": "waiting",
                        "cityId": 264,
                        "cityName": "Kota Surabaya"
                    },
                    {
                    "sequenceNo": 2,
                        "locationId": 128,
                        "locationName": "(KWN) ACE SURABAYA GALAXY",
                        "locationAddress": "Galaxy Mall 1 Surabaya Lt.Dasar No.79-85, Jl. Dharmahusada Indah Timur No.37, Kec. Mulyorejo, Kota SBY, Jawa Timur 60115",
                        "sequenceStatus": "waiting",
                        "cityId": 264,
                        "cityName": "Kota Surabaya"
                    }
                ]
            },
            {
                "id": 26,
                "shipmentNumber": "KRG1626932120438",
                "shipmentDate": "2021-07-08T13:18:39+07:00",
                "shipmentStatus": "BA Penerimaan - Konfirmasi Shipper",
                "originLocationId": 2,
                "originalLocation": "Kabupaten Nagan Raya (PT SANTOS JAYA ABADI KRIAN)",
                "originalSequenceStatus": "waiting",
                "multiPick": [],
                "destinationLocationId": 7,
                "destinationLocation": "Kota Jakarta Barat (Jakarta Selatan)",
                "destinationSequenceStatus": "waiting",
                "multiDrop": []
            }
        ],
        "page": 1,
        "rowPerPage": 5,
        "totalData": 3,
        "startRow": 5,
        "totalPage": 1
    }
}
"""


val shipmentOnProcessResponse = """
    {
    "timestamp": "2021-08-17T21:51:21.103169",
    "status": "OK",
    "statusCode": 200,
    "message": "OK",
    "data": {
        "contents": [
            {
                "id": 54,
                "shipmentNumber": "KRG1629100623527",
                "shipmentDate": "2021-08-20T13:18:39+07:00",
                "shipmentStatus": "Terkonfirmasi",
                "originLocationId": 1,
                "originalLocation": "Kabupaten Karawang (PT. PANTERA BIRU INDONESIA)",
                "originalSequenceStatus": "started",
                "multiPick": [
                    {
                    "sequenceNo": 1,
                        "locationId": 26,
                        "locationName": "FASTRATA BUANA - KARAWANG",
                        "locationAddress": "Jalan Raya Klari KM.1 No.26, Gintungkerta",
                        "sequenceStatus": "waiting",
                        "cityId": 175,
                        "cityName": "Kabupaten Karawang"
                    },
                    {
                    "sequenceNo": 2,
                        "locationId": 11,
                        "locationName": "Kawasan Industri Surya Cipta",
                        "locationAddress": "Kutamekar",
                        "sequenceStatus": "waiting",
                        "cityId": 175,
                        "cityName": "Kabupaten Karawang"
                    }
                ],
                "destinationLocationId": 7,
                "destinationLocation": "Kota Jakarta Barat (Jakarta Selatan)",
                "destinationSequenceStatus": "waiting",
                "multiDrop": [
                    {
                    "sequenceNo": 1,
                        "locationId": 149,
                        "locationName": "(KWN) ACE SURABAYA PAKUWON",
                        "locationAddress": "Pakuwon Mall Level LG, Jl. Mayjen Yono Suwoyo No.2, Babatan, Kec. Wiyung, Kota SBY, Jawa Timur 60227",
                        "sequenceStatus": "waiting",
                        "cityId": 264,
                        "cityName": "Kota Surabaya"
                    },
                    {
                    "sequenceNo": 2,
                        "locationId": 128,
                        "locationName": "(KWN) ACE SURABAYA GALAXY",
                        "locationAddress": "Galaxy Mall 1 Surabaya Lt.Dasar No.79-85, Jl. Dharmahusada Indah Timur No.37, Kec. Mulyorejo, Kota SBY, Jawa Timur 60115",
                        "sequenceStatus": "waiting",
                        "cityId": 264,
                        "cityName": "Kota Surabaya"
                    }
                ]
            },
            {
                "id": 53,
                "shipmentNumber": "KRG1629023981479",
                "shipmentDate": "2021-08-20T13:18:39+07:00",
                "shipmentStatus": "Terkonfirmasi",
                "originLocationId": 1,
                "originalLocation": "Kabupaten Karawang (PT. PANTERA BIRU INDONESIA)",
                "originalSequenceStatus": "waiting",
                "multiPick": [
                    {
                    "sequenceNo": 1,
                        "locationId": 26,
                        "locationName": "FASTRATA BUANA - KARAWANG",
                        "locationAddress": "Jalan Raya Klari KM.1 No.26, Gintungkerta",
                        "sequenceStatus": "waiting",
                        "cityId": 175,
                        "cityName": "Kabupaten Karawang"
                    },
                    {
                    "sequenceNo": 2,
                        "locationId": 11,
                        "locationName": "Kawasan Industri Surya Cipta",
                        "locationAddress": "Kutamekar",
                        "sequenceStatus": "waiting",
                        "cityId": 175,
                        "cityName": "Kabupaten Karawang"
                    }
                ],
                "destinationLocationId": 7,
                "destinationLocation": "Kota Jakarta Barat (Jakarta Selatan)",
                "destinationSequenceStatus": "waiting",
                "multiDrop": [
                    {
                    "sequenceNo": 1,
                        "locationId": 149,
                        "locationName": "(KWN) ACE SURABAYA PAKUWON",
                        "locationAddress": "Pakuwon Mall Level LG, Jl. Mayjen Yono Suwoyo No.2, Babatan, Kec. Wiyung, Kota SBY, Jawa Timur 60227",
                        "sequenceStatus": "waiting",
                        "cityId": 264,
                        "cityName": "Kota Surabaya"
                    },
                    {
                    "sequenceNo": 2,
                        "locationId": 128,
                        "locationName": "(KWN) ACE SURABAYA GALAXY",
                        "locationAddress": "Galaxy Mall 1 Surabaya Lt.Dasar No.79-85, Jl. Dharmahusada Indah Timur No.37, Kec. Mulyorejo, Kota SBY, Jawa Timur 60115",
                        "sequenceStatus": "waiting",
                        "cityId": 264,
                        "cityName": "Kota Surabaya"
                    }
                ]
            },
            {
                "id": 26,
                "shipmentNumber": "KRG1626932120438",
                "shipmentDate": "2021-07-08T13:18:39+07:00",
                "shipmentStatus": "BA Penerimaan - Konfirmasi Shipper",
                "originLocationId": 2,
                "originalLocation": "Kabupaten Nagan Raya (PT SANTOS JAYA ABADI KRIAN)",
                "originalSequenceStatus": "waiting",
                "multiPick": [],
                "destinationLocationId": 7,
                "destinationLocation": "Kota Jakarta Barat (Jakarta Selatan)",
                "destinationSequenceStatus": "waiting",
                "multiDrop": []
            }
        ],
        "page": 1,
        "rowPerPage": 5,
        "totalData": 3,
        "startRow": 5,
        "totalPage": 1
    }
}
"""

val shipmentFinishResponse = """
    {
        "timestamp": "2021-07-14T23:52:26.616188400",
    "status": "OK",
    "statusCode": 200,
    "message": "OK",
    "data": {
        "contents": [],
        "page": 1,
        "rowPerPage": 5,
        "totalData": 1,
        "totalPage": 1,
        "startRow": 5
    }
    }
"""

val simplePODResponse = """
    {
        "timestamp": "2021-07-14T23:52:26.616188400",
    "status": "OK",
    "statusCode": 200,
    "message": "OK",
    "data": [
        {
            "id": 26,
            "title": "KRG1626932120438",
            "pickupDate": 1625725119000,
            "latestStatus": "BELUM_KIRIM_DOKUMEN"
        }
    ]
    }
"""

//https://api-dev.fastlog.id/api/v1/orders/shipments/filter?page=0&shipmentNo=&status=WAITING&status=ASSIGNING&status=CONFIRM&selfOrder=1&size=10
val newOrderList = """
    
"""

//https://api-dev.fastlog.id/api/v1/orders/shipments/filter?page=0&shipmentNo=&status=PICKUP&dateFrom=1605200400000&selfOrder=1&size=10
val pickupList = """
    
""".trimIndent()

//https://api-dev.fastlog.id/api/v1/orders/shipments/filter?page=0&shipmentNo=&status=LOAD&status=DELIVER&status=UNLOAD&dateFrom=1605200400000&selfOrder=1&size=10
val deliverList = """
    
""".trimIndent()

//https://api-dev.fastlog.id/api/v1/orders/shipments/filter?page=0&shipmentNo=&status=COMPLETE_FULL&status=COMPLETE_HALF&status=COMPLETE_REJECT&status=COMPLETE_IN_STORE&status=CANCEL&dateFrom=1605200400000&selfOrder=1&size=10
val completeList = """
    
""".trimIndent()

val continueOrderFailResponse="""
    {
        "timestamp":"2020-12-17T05:14:40.492+0000",
        "status":"Bad Request",
        "statusCode": 400,
        "message": "Tes message gagal keluarnya gini",
        "data": null
    }
"""