package com.kiet_chin.KTCourse.service

import com.kiet_chin.KTCourse.Entity.Account
import com.kiet_chin.KTCourse.Repository.AccountRepository
import org.springframework.beans.factory.annotation.Value
import org.springframework.security.oauth2.jwt.JwsHeader
import org.springframework.security.oauth2.jwt.JwtClaimsSet
import org.springframework.security.oauth2.jwt.JwtDecoder
import org.springframework.security.oauth2.jwt.JwtEncoder
import org.springframework.security.oauth2.jwt.JwtEncoderParameters
import org.springframework.stereotype.Service
import java.lang.Exception
import java.time.Instant
import java.time.temporal.ChronoUnit

@Service
class TokenService(
    private val jwtDecoder: JwtDecoder,
    private val jwtEncoder: JwtEncoder,
    private val accountRepository: AccountRepository
) {

    @Value("\${jwt.algorithm}")
    private lateinit var algorithm: String
    fun createToken(email: String): String {
        val jwsHeader = JwsHeader.with { algorithm }.build()
        val claims = JwtClaimsSet.builder()
            .issuedAt(Instant.now())
            .expiresAt(Instant.now().plus(30L, ChronoUnit.DAYS))
            .subject(email)
            .claim("email", email)
            .build()
        return jwtEncoder.encode(JwtEncoderParameters.from(jwsHeader, claims)).tokenValue
    }
    fun parseToken(token: String): String? {
        return try {
            val jwt = jwtDecoder.decode(token)
            return jwt.claims["email"] as String
        } catch (e: Exception) {
            null
        }
    }
}