package com.kiet_chin.KTCourse.Repository;

import com.kiet_chin.KTCourse.Entity.TopicMedia
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface TopicMediaRepository : JpaRepository<TopicMedia, String>, JpaSpecificationExecutor<TopicMedia> {
}