package com.fli.elogistic.driver.mockDataResponses

import timber.log.Timber


fun getLocationListResponse(page: Char): String {
    Timber.d("mock for page $page")
    val intPage  = page.toString().toInt()
    Timber.d("intPage = $intPage")
    return if(intPage < 3){"""
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
"name": "Kantor Fastrata Buana Yang diambil dari page $page",
"address": "Jalan Suci No.75,Susukan,Ciracas,Jakarta Timur",
"latitude": "-6.315070",
"longitude": "106.867740",
"province": {
"id": 1,
"name": "DKI Jakarta",
"countryCode": "IDN"
},
"city": {
"id": 100,
"name": "Jakarta Timur"
},
"district": {
"id": 101,
"name": "Ciracas"
},
"subDistrict": {
"id": 201,
"name": "Susukan"
},
"urbanVillage": {
"id": 1,
"name": "Susukan"
}
},
{
"id": 2,
"name": "Gudang Fastrata Buana I",
"address": "Jl. Kamal Muara III,Kamal Muara,Penjaringan,Jakarta Utara",
"latitude": "-6.110470",
"longitude": "106.732390",
"province": {
"id": 1,
"name": "DKI Jakarta",
"countryCode": "IDN"
},
"city": {
"id": 102,
"name": "Jakarta Utara"
},
"district": {
"id": 99,
"name": "Penjaringan"
},
"subDistrict": {
"id": 20,
"name": "Kamal Muara"
},
"urbanVillage": {
"id": 5,
"name": "Kamal Muara"
}
},
{
"id": 3,
"name": "Gudang Fastrata Buana II",
"address": "Jl. Kamal Muara III,Kamal Muara,Penjaringan,Jakarta Utara",
"latitude": "-6.110470",
"longitude": "106.732390",
"province": {
"id": 1,
"name": "DKI Jakarta",
"countryCode": "IDN"
},
"city": {
"id": 102,
"name": "Jakarta Utara"
},
"district": {
"id": 99,
"name": "Penjaringan"
},
"subDistrict": {
"id": 20,
"name": "Kamal Muara"
},
"urbanVillage": {
"id": 5,
"name": "Kamal Muara"
}
},
{
"id": 2,
"name": "Gudang Fastrata Buana I",
"address": "Jl. Kamal Muara III,Kamal Muara,Penjaringan,Jakarta Utara",
"latitude": "-6.110470",
"longitude": "106.732390",
"province": {
"id": 1,
"name": "DKI Jakarta",
"countryCode": "IDN"
},
"city": {
"id": 102,
"name": "Jakarta Utara"
},
"district": {
"id": 99,
"name": "Penjaringan"
},
"subDistrict": {
"id": 20,
"name": "Kamal Muara"
},
"urbanVillage": {
"id": 5,
"name": "Kamal Muara"
}
},
{
"id": 4,
"name": "Gudang Fastrata Buana II",
"address": "Jl. Kamal Muara III,Kamal Muara,Penjaringan,Jakarta Utara",
"latitude": "-6.110470",
"longitude": "106.732390",
"province": {
"id": 1,
"name": "DKI Jakarta",
"countryCode": "IDN"
},
"city": {
"id": 102,
"name": "Jakarta Utara"
},
"district": {
"id": 99,
"name": "Penjaringan"
},
"subDistrict": {
"id": 20,
"name": "Kamal Muara"
},
"urbanVillage": {
"id": 5,
"name": "Kamal Muara"
}
},
{
"id": 2,
"name": "Gudang Fastrata Buana I",
"address": "Jl. Kamal Muara III,Kamal Muara,Penjaringan,Jakarta Utara",
"latitude": "-6.110470",
"longitude": "106.732390",
"province": {
"id": 1,
"name": "DKI Jakarta",
"countryCode": "IDN"
},
"city": {
"id": 102,
"name": "Jakarta Utara"
},
"district": {
"id": 99,
"name": "Penjaringan"
},
"subDistrict": {
"id": 20,
"name": "Kamal Muara"
},
"urbanVillage": {
"id": 5,
"name": "Kamal Muara"
}
},
{
"id": 5,
"name": "Gudang Fastrata Buana II",
"address": "Jl. Kamal Muara III,Kamal Muara,Penjaringan,Jakarta Utara",
"latitude": "-6.110470",
"longitude": "106.732390",
"province": {
"id": 1,
"name": "DKI Jakarta",
"countryCode": "IDN"
},
"city": {
"id": 102,
"name": "Jakarta Utara"
},
"district": {
"id": 99,
"name": "Penjaringan"
},
"subDistrict": {
"id": 20,
"name": "Kamal Muara"
},
"urbanVillage": {
"id": 5,
"name": "Kamal Muara"
}
},
{
"id": 2,
"name": "Gudang Fastrata Buana I",
"address": "Jl. Kamal Muara III,Kamal Muara,Penjaringan,Jakarta Utara",
"latitude": "-6.110470",
"longitude": "106.732390",
"province": {
"id": 1,
"name": "DKI Jakarta",
"countryCode": "IDN"
},
"city": {
"id": 102,
"name": "Jakarta Utara"
},
"district": {
"id": 99,
"name": "Penjaringan"
},
"subDistrict": {
"id": 20,
"name": "Kamal Muara"
},
"urbanVillage": {
"id": 5,
"name": "Kamal Muara"
}
},
{
"id": 6,
"name": "Gudang Fastrata Buana II",
"address": "Jl. Kamal Muara III,Kamal Muara,Penjaringan,Jakarta Utara",
"latitude": "-6.110470",
"longitude": "106.732390",
"province": {
"id": 1,
"name": "DKI Jakarta",
"countryCode": "IDN"
},
"city": {
"id": 102,
"name": "Jakarta Utara"
},
"district": {
"id": 99,
"name": "Penjaringan"
},
"subDistrict": {
"id": 20,
"name": "Kamal Muara"
},
"urbanVillage": {
"id": 5,
"name": "Kamal Muara"
}
},
{
"id": 2,
"name": "Gudang Fastrata Buana I",
"address": "Jl. Kamal Muara III,Kamal Muara,Penjaringan,Jakarta Utara",
"latitude": "-6.110470",
"longitude": "106.732390",
"province": {
"id": 1,
"name": "DKI Jakarta",
"countryCode": "IDN"
},
"city": {
"id": 102,
"name": "Jakarta Utara"
},
"district": {
"id": 99,
"name": "Penjaringan"
},
"subDistrict": {
"id": 20,
"name": "Kamal Muara"
},
"urbanVillage": {
"id": 5,
"name": "Kamal Muara"
}
},
{
"id": 7,
"name": "Gudang Fastrata Buana II",
"address": "Jl. Kamal Muara III,Kamal Muara,Penjaringan,Jakarta Utara",
"latitude": "-6.110470",
"longitude": "106.732390",
"province": {
"id": 1,
"name": "DKI Jakarta",
"countryCode": "IDN"
},
"city": {
"id": 102,
"name": "Jakarta Utara"
},
"district": {
"id": 99,
"name": "Penjaringan"
},
"subDistrict": {
"id": 20,
"name": "Kamal Muara"
},
"urbanVillage": {
"id": 5,
"name": "Kamal Muara"
}
},
{
"id": 2,
"name": "Gudang Fastrata Buana I",
"address": "Jl. Kamal Muara III,Kamal Muara,Penjaringan,Jakarta Utara",
"latitude": "-6.110470",
"longitude": "106.732390",
"province": {
"id": 1,
"name": "DKI Jakarta",
"countryCode": "IDN"
},
"city": {
"id": 102,
"name": "Jakarta Utara"
},
"district": {
"id": 99,
"name": "Penjaringan"
},
"subDistrict": {
"id": 20,
"name": "Kamal Muara"
},
"urbanVillage": {
"id": 5,
"name": "Kamal Muara"
}
},
{
"id": 8,
"name": "Gudang Fastrata Buana II",
"address": "Jl. Kamal Muara III,Kamal Muara,Penjaringan,Jakarta Utara",
"latitude": "-6.110470",
"longitude": "106.732390",
"province": {
"id": 1,
"name": "DKI Jakarta",
"countryCode": "IDN"
},
"city": {
"id": 102,
"name": "Jakarta Utara"
},
"district": {
"id": 99,
"name": "Penjaringan"
},
"subDistrict": {
"id": 20,
"name": "Kamal Muara"
},
"urbanVillage": {
"id": 5,
"name": "Kamal Muara"
}
},
{
"id": 2,
"name": "Gudang Fastrata Buana I",
"address": "Jl. Kamal Muara III,Kamal Muara,Penjaringan,Jakarta Utara",
"latitude": "-6.110470",
"longitude": "106.732390",
"province": {
"id": 1,
"name": "DKI Jakarta",
"countryCode": "IDN"
},
"city": {
"id": 102,
"name": "Jakarta Utara"
},
"district": {
"id": 99,
"name": "Penjaringan"
},
"subDistrict": {
"id": 20,
"name": "Kamal Muara"
},
"urbanVillage": {
"id": 5,
"name": "Kamal Muara"
}
},
{
"id": 9,
"name": "Gudang Fastrata Buana II",
"address": "Jl. Kamal Muara III,Kamal Muara,Penjaringan,Jakarta Utara",
"latitude": "-6.110470",
"longitude": "106.732390",
"province": {
"id": 1,
"name": "DKI Jakarta",
"countryCode": "IDN"
},
"city": {
"id": 102,
"name": "Jakarta Utara"
},
"district": {
"id": 99,
"name": "Penjaringan"
},
"subDistrict": {
"id": 20,
"name": "Kamal Muara"
},
"urbanVillage": {
"id": 5,
"name": "Kamal Muara"
}
},
{
"id": 2,
"name": "Gudang Fastrata Buana I",
"address": "Jl. Kamal Muara III,Kamal Muara,Penjaringan,Jakarta Utara",
"latitude": "-6.110470",
"longitude": "106.732390",
"province": {
"id": 1,
"name": "DKI Jakarta",
"countryCode": "IDN"
},
"city": {
"id": 102,
"name": "Jakarta Utara"
},
"district": {
"id": 99,
"name": "Penjaringan"
},
"subDistrict": {
"id": 20,
"name": "Kamal Muara"
},
"urbanVillage": {
"id": 5,
"name": "Kamal Muara"
}
},
{
"id": 10,
"name": "Gudang Fastrata Buana II",
"address": "Jl. Kamal Muara III,Kamal Muara,Penjaringan,Jakarta Utara",
"latitude": "-6.110470",
"longitude": "106.732390",
"province": {
"id": 1,
"name": "DKI Jakarta",
"countryCode": "IDN"
},
"city": {
"id": 102,
"name": "Jakarta Utara"
},
"district": {
"id": 99,
"name": "Penjaringan"
},
"subDistrict": {
"id": 20,
"name": "Kamal Muara"
},
"urbanVillage": {
"id": 5,
"name": "Kamal Muara"
}
}
]
}
}
"""} else emptyListResponse
}

fun getTransportListResponse(page: Int): String{
    return if(page <2){
        """
{
"timestamp": "2019-04-16T10:53:55.768+0000",
"status": "OK",
"statusCode": 200,
"message": "OK",
"data": {
"totalPages": 0,
"totalElements": 0,
"contents": [
  {
    "id": 91,
    "name": "Bush Harrison page $page",
    "length": 127,
    "width": 114,
    "height": 121,
    "volume": 9.7738,
    "maxWeight": 0.733,
    "imageUrl": "https://www.deliveree.com/id/wp-content/uploads/sites/34/2018/03/Vehicle-website_Pickup.png"
  },
  {
    "id": 59,
    "name": "Schneider Glenn",
    "length": 120,
    "width": 130,
    "height": 144,
    "volume": 3.1123,
    "maxWeight": 0.726,
    "imageUrl": "https://www.deliveree.com/id/wp-content/uploads/sites/34/2018/03/Vehicle-website_Pickup.png"
  },
  {
    "id": 82,
    "name": "Conner Meadows",
    "length": 134,
    "width": 104,
    "height": 128,
    "volume": 0.8047,
    "maxWeight": 666,
    "imageUrl": "https://www.deliveree.com/id/wp-content/uploads/sites/34/2018/03/Vehicle-website_Pickup.png"
  },
  {
    "id": 42,
    "name": "Moss Knapp",
    "length": 109,
    "width": 119,
    "height": 110,
    "volume": 0.0431,
    "maxWeight": 682,
    "imageUrl": "https://www.deliveree.com/id/wp-content/uploads/sites/34/2018/03/Vehicle-website_Pickup.png"
  },
  {
    "id": 3,
    "name": "Vang Lang",
    "length": 116,
    "width": 113,
    "height": 140,
    "volume": 4.1283,
    "maxWeight": 673,
    "imageUrl": "https://www.deliveree.com/id/wp-content/uploads/sites/34/2018/03/Vehicle-website_Pickup.png"
  },
  {
    "id": 93,
    "name": "Andrews Branch",
    "length": 143,
    "width": 149,
    "height": 120,
    "volume": 7.7521,
    "maxWeight": 673,
    "imageUrl": "https://www.deliveree.com/id/wp-content/uploads/sites/34/2018/03/Vehicle-website_Pickup.png"
  },
  {
    "id": 85,
    "name": "Howell Clayton",
    "length": 144,
    "width": 107,
    "height": 143,
    "volume": 0.9783,
    "maxWeight": 819,
    "imageUrl": "https://www.deliveree.com/id/wp-content/uploads/sites/34/2018/03/Vehicle-website_Pickup.png"
  },
  {
    "id": 68,
    "name": "Ball Gaines",
    "length": 142,
    "width": 132,
    "height": 129,
    "volume": 6.6782,
    "maxWeight": 776,
    "imageUrl": "https://www.deliveree.com/id/wp-content/uploads/sites/34/2018/03/Vehicle-website_Pickup.png"
  },
  {
    "id": 71,
    "name": "Kelli Chambers",
    "length": 119,
    "width": 110,
    "height": 108,
    "volume": 9.0548,
    "maxWeight": 675,
    "imageUrl": "https://www.deliveree.com/id/wp-content/uploads/sites/34/2018/03/Vehicle-website_Pickup.png"
  },
  {
    "id": 94,
    "name": "Jeannine Spears",
    "length": 148,
    "width": 116,
    "height": 109,
    "volume": 2.5102,
    "maxWeight": 782,
    "imageUrl": "https://www.deliveree.com/id/wp-content/uploads/sites/34/2018/03/Vehicle-website_Pickup.png"
  }
]
}
}
        """
    } else emptyListResponse
}

fun getIdNameResponse(type: String): String {
    return """
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
                "name": "$type Name 1"
            },
            {
                "id": 2,
                "name": "$type Name 2"
            },
            {
                "id": 3,
                "name": "$type Name 3"
            }
        ]
    }
}
    """
}

fun getAdditionalInfoResponse(type: String): String = """
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
"value": "Pengiriman diatas jam 12 siang $type",
"type": "$type"
},
{
"id": 2,
"value": "Pengiriman diatas jam 11 siang $type",
"type": "$type"
},
{
"id": 3,
"value": "Pengiriman diatas jam 10 pagi $type",
"type": "$type"
}
]
}
}
"""

val transportTypeResponse = """
{
    "timestamp": "2019-07-03T07:19:01.295+0000",
    "status": "OK",
    "statusCode": 200,
    "message": "deleted",
    "data": {
        "createdBy": "username",
        "createdAt": 1560790800000,
        "id": 1,
        "name": "Pickup",
        "length": 200,
        "width": 120,
        "height": 156,
        "volume": 3.7,
        "maxWeight": 800,
        "imageUrl": "https://www.deliveree.com/id/wp-content/uploads/sites/34/2018/03/Vehicle-website_Pickup.png"
    }
}
"""

val unassignedMultishipperListResponse = """
   {
    "timestamp": "2019-05-29T08:11:46.959+0000",
    "status": "OK",
    "statusCode": 200,
    "message": "CREATED",
    "data": [
        {
            "shipmentId": 1,
            "shipmentNo": "PES1234567890",
            "shipperAlias": "SJA"
        },
        {
            "shipmentId": 2,
            "shipmentNo": "PES0987654321",
            "shipperAlias": "SJA"
        }
    ]
} 
"""