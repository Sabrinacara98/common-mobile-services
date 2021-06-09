package com.hms.lib.commonmobileservices.push.model

abstract class Mapper<From, To> {
    abstract fun map(from: From): To
}