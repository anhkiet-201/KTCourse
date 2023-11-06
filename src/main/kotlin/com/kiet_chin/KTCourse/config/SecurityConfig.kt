package com.kiet_chin.KTCourse.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.kiet_chin.KTCourse.Repository.AccountRepository
import com.kiet_chin.KTCourse.service.TokenService
import graphql.GraphQLException
import jakarta.servlet.FilterChain
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.web.SecurityFilterChain
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.CorsConfigurationSource
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import org.springframework.web.filter.OncePerRequestFilter
import java.util.*

@Configuration
@EnableWebSecurity
class SecurityConfig(
    private val tokenService: TokenService,
    private val accountRepository: AccountRepository
) {
    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        // Define public and private routes
        http.authorizeHttpRequests {
            it.anyRequest().permitAll()
        }
        // Configure JWT
//        http.oauth2ResourceServer {
//            it.jwt {}.authenticationEntryPoint { request, response, authException ->
//                response.status = 401
//                response.outputStream.println(
//                    ObjectMapper().writeValueAsString(
//                        mapOf(
//                            "timestamp" to Date().time,
//                            "error" to authException.localizedMessage,
//                            "message" to authException.message,
//                            "path" to request.servletPath
//                        )
//                    )
//                )
//            }
//        }
//        http.authenticationManager { auth ->
//            val jwt = auth as BearerTokenAuthenticationToken
//            val email = tokenService.parseToken(jwt.token) ?: throw InvalidBearerTokenException("Invalid token")
//            val user = accountRepository.findByEmail(email)
//            UsernamePasswordAuthenticationToken(user, "", listOf(SimpleGrantedAuthority("USER")))
//        }
        // Other configuration
        http.cors {

        }
        http.sessionManagement {
            it.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        }
        http.csrf {
            it.disable()
        }
        http.headers {
            it.frameOptions {
                it.disable()
            }
            it.xssProtection {
                it.disable()
            }
        }
//        http.headers().frameOptions().disable()
//        http.headers().xssProtection().disable()
        return http.build()
    }


    @Bean
    fun corsConfigurationSource(): CorsConfigurationSource {
        // allow localhost for dev purposes
        val configuration = CorsConfiguration()
        configuration.allowedOrigins = listOf("http://localhost:8080", "http://localhost:80", "http://localhost:3000")
        configuration.allowedMethods = listOf("GET", "POST", "PUT", "DELETE")
        configuration.allowedHeaders = listOf("authorization", "content-type")
        val source = UrlBasedCorsConfigurationSource()
        source.registerCorsConfiguration("/**", configuration)
        return source
    }
}
