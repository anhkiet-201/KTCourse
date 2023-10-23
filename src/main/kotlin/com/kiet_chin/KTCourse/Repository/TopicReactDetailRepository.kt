package com.kiet_chin.KTCourse.Repository;

import com.kiet_chin.KTCourse.Entity.TopicReactDetail
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface TopicReactDetailRepository : JpaRepository<TopicReactDetail, String>,
    JpaSpecificationExecutor<TopicReactDetail> {
}