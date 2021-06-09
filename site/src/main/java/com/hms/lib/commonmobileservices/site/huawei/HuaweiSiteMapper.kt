package com.hms.lib.commonmobileservices.site.huawei

import com.hms.lib.commonmobileservices.site.SiteServiceReturn
import com.hms.lib.commonmobileservices.site.common.Mapper
import com.huawei.hms.site.api.model.Site

class HuaweiSiteMapper : Mapper<SiteServiceReturn, Site>(){
    override fun mapToEntity(from: Site): SiteServiceReturn = SiteServiceReturn(
        id = from.siteId,
        name = from.name,
        locationLat = from.location.lat,
        locationLong = from.location.lng,
        phoneNumber =  from.poi.internationalPhone,
        formatAddress = from.formatAddress,
        distance = from.distance,
        image = ArrayList(),
        averagePrice = from.poi.priceLevel.toDouble(),
        point = from.poi.rating
    )
}