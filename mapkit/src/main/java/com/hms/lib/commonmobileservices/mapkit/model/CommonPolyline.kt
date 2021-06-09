package com.hms.lib.commonmobileservices.mapkit.model

import com.huawei.hms.maps.model.Polyline
import java.lang.Exception

class CommonPolyline(val polylineImpl : Any) {
    fun hide(){
        when (polylineImpl){
            is Polyline -> polylineImpl.isVisible=false
            is com.google.android.gms.maps.model.Polyline -> polylineImpl.isVisible=false
        }
    }

    fun show(){
        when (polylineImpl){
            is Polyline -> polylineImpl.isVisible=true
            is com.google.android.gms.maps.model.Polyline -> polylineImpl.isVisible=true
        }
    }

    fun remove() :Boolean{
        return try {
            when (polylineImpl){
                is Polyline -> polylineImpl.remove()
                is com.google.android.gms.maps.model.Polyline -> polylineImpl.remove()
            }
            true
        }
        catch (e: Exception){
            e.printStackTrace()
            false
        }
    }

}