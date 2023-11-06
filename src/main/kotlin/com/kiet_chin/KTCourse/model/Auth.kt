package com.kiet_chin.KTCourse.model

import com.kiet_chin.KTCourse.Entity.Account

data class Auth(
    val token: String,
    val account: Account
)
