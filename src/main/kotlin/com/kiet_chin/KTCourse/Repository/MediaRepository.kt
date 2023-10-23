package com.kiet_chin.KTCourse.Repository;

import com.kiet_chin.KTCourse.Entity.Media
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface MediaRepository : JpaRepository<Media, String>, JpaSpecificationExecutor<Media> {
}