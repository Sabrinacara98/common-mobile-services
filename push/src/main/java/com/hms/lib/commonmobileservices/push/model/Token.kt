package com.hms.lib.commonmobileservices.push.model

import java.io.Serializable

data class Token(
    val provider: Provider,
    val token: String
): Serializable
