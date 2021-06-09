package com.hms.lib.commonmobileservices.push.model

enum class MessageType(val value: Int) {
    MessageReceived(0),
    DeletedMessages(1),
    MessageSent(2),
    SendError(3),
    NewToken(4),
}