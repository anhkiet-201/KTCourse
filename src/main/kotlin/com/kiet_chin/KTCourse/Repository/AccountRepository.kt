package com.kiet_chin.KTCourse.Repository;

import com.kiet_chin.KTCourse.Entity.Account
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface AccountRepository : JpaRepository<Account, String>, JpaSpecificationExecutor<Account> {
    fun findByEmail(email: String): Account?

    fun existsByEmail(email: String): Boolean
}