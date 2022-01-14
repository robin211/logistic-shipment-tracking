package com.fli.elogistic.driver.mockDataResponses;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"emptyListResponse", "", "errorAuthResponse", "errorInternalResponse", "logoutResponse", "nullObjectResponse", "successAuthResponse", "userInfoResponse", "app_stagingDebug"})
public final class IdentityDataMocksKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String successAuthResponse = "\n   {\n    \"timestamp\": \"2021-06-14T04:34:09.470736\",\n    \"status\": \"OK\",\n    \"statusCode\": 200,\n    \"message\": \"Created\",\n    \"data\": {\n        \"token\": \"eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiIxMDM3Iiwic3ViIjoiZHJpdmVyLTFAbWFpbC5jb20iLCJhdXRoIjoxNCwiaWF0IjoxNjIzNjQ1MjQ5LCJleHAiOjE2MjQyNTAwNDl9.itKDvCTayzxsTga0JlFlC9dWMjpndFXQIqNkTK3GtJY4TXd4b6QyW5IbxYvCChXwfdyKeaTCEY9wQ8Y-yjvAdg\"\n    }\n}\n";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String nullObjectResponse = "\n    {\n\"timestamp\": \"2019-04-15T04:57:44.928+0000\",\n\"status\": \"OK\",\n\"statusCode\": 200,\n\"message\": \"OK\",\n\"data\": null\n}\n";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String errorAuthResponse = "\n    {\n\"timestamp\": \"2019-04-15T04:49:09.209+0000\",\n\"status\": \"Unauthorized\",\n\"statusCode\": 401,\n\"message\": \"Invalid email/password\",\n\"data\": null\n}\n";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String logoutResponse = "\n{\n    \"timestamp\": \"2019-04-15T11:58:26.648+0000\",\n    \"status\": \"OK\",\n    \"statusCode\": 200,\n    \"message\": \"OK\",\n    \"data\": null\n    }\n";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String userInfoResponse = "\n   {\n    \"timestamp\": \"2021-06-14T04:34:25.024368\",\n    \"status\": \"OK\",\n    \"statusCode\": 200,\n    \"message\": \"Created\",\n    \"data\": {\n        \"companyUserId\": 1037,\n        \"companyName\": \"CODEID Shipper\",\n        \"name\": \"Developer Code Id\",\n        \"roleId\": 14,\n        \"companyId\": 296,\n        \"email\": \"td6@mail.com\",\n        \"imageUrl\": \"https://placehold.it/200\",\n        \"roleName\": \"DRIVER\"\n    }\n}\n";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String errorInternalResponse = "\n    {\n\"timestamp\": \"2019-04-15T04:49:09.209+0000\",\n\"status\": \"Unauthorized\",\n\"statusCode\": 500,\n\"message\": \"Invalid email/password\",\n\"data\": null\n}\n";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String emptyListResponse = "\n    {\n\"timestamp\": \"2019-04-16T10:53:55.768+0000\",\n\"status\": \"OK\",\n\"statusCode\": 200,\n\"message\": \"OK\",\n\"data\": {\n\"totalPages\": 0,\n\"totalElements\": 0,\n\"contents\": []\n}\n}\n";
}