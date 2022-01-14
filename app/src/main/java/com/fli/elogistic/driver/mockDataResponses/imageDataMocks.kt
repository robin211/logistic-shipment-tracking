package com.fli.elogistic.driver.mockDataResponses

val imageUploadResponse = """
{
"timestamp": "2019-05-17T03:48:38.710+0000",
"status": "OK",
"statusCode": 200,
"message": "OK",
"data": {
"url": "http://placehold.it/100"
}
}
"""
val uploadPODResponse = """
{
    "timestamp": "2021-07-30T18:39:04.564703",
    "status": "OK",
    "statusCode": 200,
    "message": "OK",
    "data": [
        {
            "id": 37,
            "documentType": "FOTO_SURAT_JALAN",
            "documentName": "Foto surat jalan gudang 1",
            "imageUrl": "https://elog-shipment-asset-dev.s3.ap-southeast-1.amazonaws.com/v3/shipments/KRG1626372634039/documents/PES001-foto_surat_jalan-1627645143615"
        },
        {
            "id": 38,
            "documentType": "FOTO_SURAT_JALAN",
            "documentName": "Foto surat jalan gudang 1",
            "imageUrl": "https://elog-shipment-asset-dev.s3.ap-southeast-1.amazonaws.com/v3/shipments/KRG1626372634039/documents/PES001-foto_surat_jalan-1627645143615"
        },
        {
            "id": 39,
            "documentType": "FOTO_SURAT_JALAN",
            "documentName": "Foto surat jalan gudang 1",
            "imageUrl": "https://elog-shipment-asset-dev.s3.ap-southeast-1.amazonaws.com/v3/shipments/KRG1626372634039/documents/PES001-foto_surat_jalan-1627645143615"
        }
    ]
}
"""

val uploadBASTResponse = """
{
    "timestamp": "2021-07-30T18:39:04.564703",
    "status": "OK",
    "statusCode": 200,
    "message": "OK"
}
"""