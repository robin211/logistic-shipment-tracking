package com.fli.elogistic.driver.mockDataResponses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\u00a8\u0006\b"}, d2 = {"imageUploadResponse", "", "getImageUploadResponse", "()Ljava/lang/String;", "uploadBASTResponse", "getUploadBASTResponse", "uploadPODResponse", "getUploadPODResponse", "app_mockDebug"})
public final class ImageDataMocksKt {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String imageUploadResponse = "\n{\n\"timestamp\": \"2019-05-17T03:48:38.710+0000\",\n\"status\": \"OK\",\n\"statusCode\": 200,\n\"message\": \"OK\",\n\"data\": {\n\"url\": \"http://placehold.it/100\"\n}\n}\n";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String uploadPODResponse = "\n{\n    \"timestamp\": \"2021-07-30T18:39:04.564703\",\n    \"status\": \"OK\",\n    \"statusCode\": 200,\n    \"message\": \"OK\",\n    \"data\": [\n        {\n            \"id\": 37,\n            \"documentType\": \"FOTO_SURAT_JALAN\",\n            \"documentName\": \"Foto surat jalan gudang 1\",\n            \"imageUrl\": \"https://elog-shipment-asset-dev.s3.ap-southeast-1.amazonaws.com/v3/shipments/KRG1626372634039/documents/PES001-foto_surat_jalan-1627645143615\"\n        },\n        {\n            \"id\": 38,\n            \"documentType\": \"FOTO_SURAT_JALAN\",\n            \"documentName\": \"Foto surat jalan gudang 1\",\n            \"imageUrl\": \"https://elog-shipment-asset-dev.s3.ap-southeast-1.amazonaws.com/v3/shipments/KRG1626372634039/documents/PES001-foto_surat_jalan-1627645143615\"\n        },\n        {\n            \"id\": 39,\n            \"documentType\": \"FOTO_SURAT_JALAN\",\n            \"documentName\": \"Foto surat jalan gudang 1\",\n            \"imageUrl\": \"https://elog-shipment-asset-dev.s3.ap-southeast-1.amazonaws.com/v3/shipments/KRG1626372634039/documents/PES001-foto_surat_jalan-1627645143615\"\n        }\n    ]\n}\n";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String uploadBASTResponse = "\n{\n    \"timestamp\": \"2021-07-30T18:39:04.564703\",\n    \"status\": \"OK\",\n    \"statusCode\": 200,\n    \"message\": \"OK\"\n}\n";
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getImageUploadResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getUploadPODResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getUploadBASTResponse() {
        return null;
    }
}