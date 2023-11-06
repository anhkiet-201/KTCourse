package com.kiet_chin.KTCourse.exception

import graphql.GraphQLException
import java.time.Instant
import java.time.LocalDate
import java.util.Date

class BaseException(
    private val timestamp: Long = Date.from(Instant.now()).time,

) : GraphQLException() {

}