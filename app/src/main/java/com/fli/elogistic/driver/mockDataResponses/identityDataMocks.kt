package com.fli.elogistic.driver.mockDataResponses

const val successAuthResponse = """
   {
    "timestamp": "2021-06-14T04:34:09.470736",
    "status": "OK",
    "statusCode": 200,
    "message": "Created",
    "data": {
        "token": "eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiIxMDM3Iiwic3ViIjoiZHJpdmVyLTFAbWFpbC5jb20iLCJhdXRoIjoxNCwiaWF0IjoxNjIzNjQ1MjQ5LCJleHAiOjE2MjQyNTAwNDl9.itKDvCTayzxsTga0JlFlC9dWMjpndFXQIqNkTK3GtJY4TXd4b6QyW5IbxYvCChXwfdyKeaTCEY9wQ8Y-yjvAdg"
    }
}
"""

const val nullObjectResponse = """
    {
"timestamp": "2019-04-15T04:57:44.928+0000",
"status": "OK",
"statusCode": 200,
"message": "OK",
"data": null
}
"""

const val errorAuthResponse = """
    {
"timestamp": "2019-04-15T04:49:09.209+0000",
"status": "Unauthorized",
"statusCode": 401,
"message": "Invalid email/password",
"data": null
}
"""

const val logoutResponse = """
{
    "timestamp": "2019-04-15T11:58:26.648+0000",
    "status": "OK",
    "statusCode": 200,
    "message": "OK",
    "data": null
    }
"""

const val userInfoResponse = """
   {
    "timestamp": "2021-06-14T04:34:25.024368",
    "status": "OK",
    "statusCode": 200,
    "message": "Created",
    "data": {
        "companyUserId": 1037,
        "companyName": "CODEID Shipper",
        "name": "Developer Code Id",
        "roleId": 14,
        "companyId": 296,
        "email": "td6@mail.com",
        "imageUrl": "https://placehold.it/200",
        "roleName": "DRIVER"
    }
}
"""

const val errorInternalResponse = """
    {
"timestamp": "2019-04-15T04:49:09.209+0000",
"status": "Unauthorized",
"statusCode": 500,
"message": "Invalid email/password",
"data": null
}
"""

const val emptyListResponse = """
    {
"timestamp": "2019-04-16T10:53:55.768+0000",
"status": "OK",
"statusCode": 200,
"message": "OK",
"data": {
"totalPages": 0,
"totalElements": 0,
"contents": []
}
}
"""

