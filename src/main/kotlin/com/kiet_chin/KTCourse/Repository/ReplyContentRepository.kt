package com.kiet_chin.KTCourse.Repository;

import com.kiet_chin.KTCourse.Entity.ReplyContent
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface ReplyContentRepository : JpaRepository<ReplyContent, String>, JpaSpecificationExecutor<ReplyContent> {
}