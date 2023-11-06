package com.kiet_chin.KTCourse.controller

import com.kiet_chin.KTCourse.Entity.Account
import com.kiet_chin.KTCourse.Repository.AccountRepository
import com.kiet_chin.KTCourse.model.Auth
import com.kiet_chin.KTCourse.service.TokenService
import graphql.GraphQLException
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.security.crypto.bcrypt.BCrypt
import org.springframework.stereotype.Controller
import java.time.LocalDate
import kotlin.random.Random

@Controller
class AuthController(
    private val accountRepository: AccountRepository,
    private val tokenService: TokenService,
) {
    @MutationMapping
    fun login(@Argument email: String, @Argument password: String): Auth {
        return when(val account = accountRepository.findByEmail(email)) {
            null -> throw GraphQLException("User does not exist!")
            else -> if (!BCrypt.checkpw(password, account.password))
                throw GraphQLException("Password not match!")
            else Auth(
                tokenService.createToken(account.email!!),
                account
            )
        }
    }

    @MutationMapping
    fun register(@Argument email: String, @Argument password: String, @Argument firstName: String, @Argument lastName: String): Auth {
        if (accountRepository.existsByEmail(email))
            throw GraphQLException("User already exists!")
        val account = accountRepository.save(
            Account().apply {
                this.email = email
                this.firstName = firstName
                this.lastName = lastName
                this.password = BCrypt.hashpw(password, BCrypt.gensalt())
                this.dateCreated = LocalDate.now()
                this.birthDay = LocalDate.now()
                this.shortName = "@${firstName}_${lastName}-${Random(999).nextInt(999)}"
            }
        )
        return Auth(
            tokenService.createToken(account.email!!),
            account
        )
    }
}