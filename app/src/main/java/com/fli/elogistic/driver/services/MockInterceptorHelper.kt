package com.fli.elogistic.driver.services

import com.fli.elogistic.driver.*
import com.fli.elogistic.driver.constants.*
import okhttp3.*
import okio.Buffer
import com.fli.elogistic.driver.mockDataResponses.*
import com.fli.elogistic.driver.util.RequestMethod
import okhttp3.ResponseBody
import timber.log.Timber

/*
* Create mock interceptor if build config is debug (later will be changed to mock)
* */

class MockInterceptorHelper() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        if (BuildConfig.FLAVOR.equals("mock")) {
            val request = createCustomRequest(chain.request())
            val uri = request.url().uri().toString()
            val method = request.method()
            Timber.d("Uri: $uri \nMethod: $method")
            Timber.d("Uri substring: ${uri.substring(uri.lastIndexOf("page=") + 1)}")
            val reqBody = request.body()?: RequestBody.create(MediaType.parse("application/json"),"")
            val responseString = when {
                uri.endsWith("login") && reqBody.checkInBuffer("td6@gmail.com") -> successAuthResponse
                uri.matchRegex(".*verify.*email=td6%40gmail.com") -> nullObjectResponse
                uri.endsWith("activate") && reqBody.checkInBuffer("td6@gmail.com") -> successAuthResponse
                uri.endsWith("logout") -> logoutResponse
                uri.endsWith("whoami") -> userInfoResponse
                uri.contains("/orders/contracts/location") -> getLocationListResponse(
                    uri.substring(uri.lastIndexOf("page=") + 5)[0]
                )
                uri.contains("vehicle") -> getTransportListResponse( uri.substring(
                    uri.lastIndexOf( "page=" ) + 5 )[0].toString().toInt())

                uri.contains("filter/NEED_CONFIRMATION") -> shipmentNeedConfirmationResponse
                uri.contains("filter/ON_PROCESS") -> shipmentOnProcessResponse
                uri.contains("filter/FINISH") -> shipmentFinishResponse

                uri.endsWith("document-pod/upload") -> uploadPODResponse
                uri.endsWith("driver/status/bast") -> uploadBASTResponse

                uri.endsWith("filter/document-pod") -> simplePODResponse

                uri.matchRegex(".*categories/filter.*") -> getIdNameResponse("categories")
                uri.matchRegex(".*/categories.*sub") -> getIdNameResponse("subCategory")
                uri.matchRegex(".*selection-info.*$ORIGIN_INFO_PARAM.*") -> getAdditionalInfoResponse("origin")
                uri.matchRegex(".*selection-info.*$DESTINATION_INFO_PARAM.*") -> getAdditionalInfoResponse("destination")
                uri.matchRegex(".*selection-info.*$PICKUP_INFO_PARAM.*") -> getAdditionalInfoResponse("pickup")
                uri.matchRegex(".*shipments") && request.method() == RequestMethod.POST.name -> nullObjectResponse
                uri.matchRegex(".*shipments/filter.*status=PICKUP.*") -> ongoingOrderListResponse
                uri.matchRegex(".*shipments/filter.*status=COMPLETE.*") -> completeOrderListResponse
                uri.matchRegex(".*shipments/filter.*status=NEED_CONFIRM.*") -> needConfirmationOrderListResponse
                uri.matchRegex(".*shipments/[0-9]+") -> orderDetailResponse
                uri.matchRegex(".*selection-info.*$CANCELLATION_INFO_PARAM.*") -> cancellationReasonResponse
                uri.matchRegex(".*shipments/[0-9]+/status-history") -> orderStatusResponse
                uri.matchRegex(".*/shipments/action/cancel") && request.method() == RequestMethod.POST.name-> nullObjectResponse
                uri.matchRegex(".*/delivery/shipments/[0-9]+/positions.*") -> driverTrackingResponse
                uri.matchRegex(".*/shipments/action/rate") -> nullObjectResponse
                uri.matchRegex(".*/shipments/[0-9]+/document/.*") -> documentImageListResponse
                uri.matchRegex(".*$IMAGE_UPLOAD_URL") && method == "POST" -> imageUploadResponse
                uri.matchRegex(".*$IMAGE_UPLOAD_URL") && method == "DELETE" -> nullObjectResponse
                uri.matchRegex(".*/$IDENTITY_URL/users/[0-9]+") && method == "PUT" -> nullObjectResponse
                uri.matchRegex(".*/api/v1/orders/transport-types/.*") -> transportTypeResponse
                uri.matchRegex(".*/shipments/continues") -> nullObjectResponse
                uri.matchRegex(".*/shipments/action/pod.*") -> podResponse
                uri.matchRegex(".*/shipments/damage/detail.*")  -> damagedDetailResponse
                uri.matchRegex(".*/shipments/unassigned?.*") -> unassignedMultishipperListResponse
                uri.matchRegex(".*/shipments/shipper/confirm") -> nullObjectResponse
                uri.matchRegex(".*/version/mobile/shipper") -> mobileVersionResponse
                uri.matchRegex(".*/version/maintenance") -> maintenanceInfoResponse
                uri.matchRegex(".*/orders/shipments/summary.*") -> shipmentSummaryResponse
                else -> errorAuthResponse
            }

            val builder = Response.Builder()
            builder.request(request)
            builder.protocol(Protocol.HTTP_1_0)
            builder.addHeader("content-type", "application/json;charset=UTF-8")

            builder.body(
                ResponseBody.create(
                    MediaType.parse("application/json"),
                    responseString
                )
            )
            builder.code(200)
            builder.message(responseString)

            return builder.build()
        } else {
            return chain.proceed(chain.request())
        }
    }

    private fun RequestBody.checkInBuffer(containKey: String): Boolean{
        val buffer = Buffer()
        this.writeTo(buffer)
        val body = buffer.readUtf8()

        return body.contains(containKey)
    }

    private fun createCustomRequest(original: Request): Request{
        return original.newBuilder()
            .header("Accept", "application/pyur.v1")
            .header("Authorization", ACTIVE_TOKEN)
            .header("Content-Type", "application/json")
            .method(original.method(),original.body())
            .build()
    }

    private fun String.matchRegex(pattern: String): Boolean{
        return this.matches(Regex(pattern))
    }

}