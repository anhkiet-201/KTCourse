package com.kiet_chin.KTCourse.service

import com.kiet_chin.KTCourse.Repository.AccountRepository
import com.kiet_chin.KTCourse.model.Auth
import graphql.GraphQLException
import org.springframework.stereotype.Service

@Service
class AccountService(
    private val accountRepository: AccountRepository
) {

}