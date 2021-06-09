package com.hms.lib.commonmobileservices.site

data class SiteServiceReturn (
    val id : String?,
    val name : String?,
    val locationLat : Double?,
    val locationLong : Double?,
    val phoneNumber : String?,
    val formatAddress : String?,
    val distance : Double?,
    val image : ArrayList<String>?,
    val averagePrice : Double?,
    val point : Double?,
)
