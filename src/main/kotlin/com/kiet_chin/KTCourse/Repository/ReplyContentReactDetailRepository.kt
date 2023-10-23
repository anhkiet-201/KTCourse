package com.kiet_chin.KTCourse.Repository;

import com.kiet_chin.KTCourse.Entity.ReplyContentReactDetail
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface ReplyContentReactDetailRepository : JpaRepository<ReplyContentReactDetail, String>,
    JpaSpecificationExecutor<ReplyContentReactDetail> {
}