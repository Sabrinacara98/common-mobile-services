package com.hms.lib.commonmobileservices.push.model.mapper

import com.google.firebase.messaging.RemoteMessage
import com.hms.lib.commonmobileservices.push.model.Mapper
import com.hms.lib.commonmobileservices.push.model.PushMessage

class FirebaseMessageMapper : Mapper<RemoteMessage, PushMessage>() {

    private val notificationMapper: FirebaseNotificationMapper = FirebaseNotificationMapper()

    override fun map(from: RemoteMessage): PushMessage =
        PushMessage(
            data = from.data,
            senderId = from.senderId,
            from = from.from,
            to = from.to,
            collapseKey = from.collapseKey,
            messageId = from.messageId,
            messageType = from.messageType,
            sentTime = from.sentTime,
            ttl = from.ttl,
            originalPriority = from.originalPriority,
            priority = from.priority,
            notification = notificationMapper.map(from.notification!!)
        )

}