package com.fli.elogistic.driver.mockDataResponses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u000e\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u000e\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\u001a\u000e\u0010\f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\r\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\u00a8\u0006\u000e"}, d2 = {"transportTypeResponse", "", "getTransportTypeResponse", "()Ljava/lang/String;", "unassignedMultishipperListResponse", "getUnassignedMultishipperListResponse", "getAdditionalInfoResponse", "type", "getIdNameResponse", "getLocationListResponse", "page", "", "getTransportListResponse", "", "app_stagingDebug"})
public final class CreateOrderDataMocksKt {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String transportTypeResponse = "\n{\n    \"timestamp\": \"2019-07-03T07:19:01.295+0000\",\n    \"status\": \"OK\",\n    \"statusCode\": 200,\n    \"message\": \"deleted\",\n    \"data\": {\n        \"createdBy\": \"username\",\n        \"createdAt\": 1560790800000,\n        \"id\": 1,\n        \"name\": \"Pickup\",\n        \"length\": 200,\n        \"width\": 120,\n        \"height\": 156,\n        \"volume\": 3.7,\n        \"maxWeight\": 800,\n        \"imageUrl\": \"https://www.deliveree.com/id/wp-content/uploads/sites/34/2018/03/Vehicle-website_Pickup.png\"\n    }\n}\n";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String unassignedMultishipperListResponse = "\n   {\n    \"timestamp\": \"2019-05-29T08:11:46.959+0000\",\n    \"status\": \"OK\",\n    \"statusCode\": 200,\n    \"message\": \"CREATED\",\n    \"data\": [\n        {\n            \"shipmentId\": 1,\n            \"shipmentNo\": \"PES1234567890\",\n            \"shipperAlias\": \"SJA\"\n        },\n        {\n            \"shipmentId\": 2,\n            \"shipmentNo\": \"PES0987654321\",\n            \"shipperAlias\": \"SJA\"\n        }\n    ]\n} \n";
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getLocationListResponse(char page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getTransportListResponse(int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getIdNameResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getAdditionalInfoResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getTransportTypeResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getUnassignedMultishipperListResponse() {
        return null;
    }
}