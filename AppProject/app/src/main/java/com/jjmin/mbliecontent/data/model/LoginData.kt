package com.jjmin.mbliecontent.data.model

import com.google.gson.annotations.SerializedName

data class LoginData(
    @SerializedName("success")
    var success: Boolean? = null,

    @SerializedName("message")
    var message: String? = null,

    @SerializedName("user")
    var user: UserInfo? = null
)