package com.hms.lib.commonmobileservices.push

import android.content.Context
import com.hms.lib.commonmobileservices.core.Device
import com.hms.lib.commonmobileservices.core.MobileServiceType
import com.hms.lib.commonmobileservices.core.Work
import com.hms.lib.commonmobileservices.push.model.Token
import com.hms.lib.commonmobileservices.push.services.GooglePushServiceImpl
import com.hms.lib.commonmobileservices.push.services.HuaweiPushServiceImpl

private lateinit var INSTANCE: PushService

abstract class PushService(private val context: Context) {
    fun initialize(autoInitEnabled: Boolean = false) {
        autoInitEnabled(autoInitEnabled)
    }

    abstract fun autoInitEnabled(enable: Boolean)
    abstract fun getToken(): Work<Token>
    abstract fun subscribeToTopic(topic: String): Work<Unit>
    abstract fun unsubscribeFromTopic(topic: String): Work<Unit>

    companion object {
        fun getInstance(context: Context): PushService {
            synchronized(PushService::class.java) {
                if (!::INSTANCE.isInitialized) {
                    INSTANCE = if (Device.getMobileServiceType(context) == MobileServiceType.GMS) {
                        GooglePushServiceImpl(context)
                    } else {
                        HuaweiPushServiceImpl(context)
                    }
                }
                return INSTANCE
            }
        }
    }
}