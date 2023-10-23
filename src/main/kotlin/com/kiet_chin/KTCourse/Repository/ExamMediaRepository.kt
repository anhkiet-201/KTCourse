package com.kiet_chin.KTCourse.Repository;

import com.kiet_chin.KTCourse.Entity.ExamMedia
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface ExamMediaRepository : JpaRepository<ExamMedia, String>, JpaSpecificationExecutor<ExamMedia> {
}