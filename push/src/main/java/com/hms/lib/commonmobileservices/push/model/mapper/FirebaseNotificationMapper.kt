package com.hms.lib.commonmobileservices.push.model.mapper

import com.google.firebase.messaging.RemoteMessage
import com.hms.lib.commonmobileservices.push.model.Mapper
import com.hms.lib.commonmobileservices.push.model.PushMessage

class FirebaseNotificationMapper : Mapper<RemoteMessage.Notification, PushMessage.Notification>() {
    override fun map(from: RemoteMessage.Notification): PushMessage.Notification =
        PushMessage.Notification(
            title = from.title,
            titleLocalizationKey = from.titleLocalizationKey,
            titleLocalizationArgs = from.titleLocalizationArgs,
            body = from.body,
            bodyLocalizationKey = from.bodyLocalizationKey,
            bodyLocalizationArgs = from.bodyLocalizationArgs,
            icon = from.icon,
            imageUrl = from.imageUrl,
            sound = from.sound,
            tag = from.tag,
            color = from.color,
            clickAction = from.clickAction,
            channelId = from.channelId,
            link = from.link,
            ticker = from.ticker,
            notificationPriority = from.notificationPriority,
            visibility = from.visibility,
            notificationCount = from.notificationCount,
            lightSettings = from.lightSettings,
            eventTime = from.eventTime,
            sticky = from.sticky,
            localOnly = from.localOnly,
            defaultSound = from.defaultSound,
            defaultVibrateSettings = from.defaultVibrateSettings,
            defaultLightSettings = from.defaultLightSettings,
            vibrateTimings = from.vibrateTimings
        )
}