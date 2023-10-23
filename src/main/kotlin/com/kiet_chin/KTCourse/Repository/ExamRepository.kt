package com.kiet_chin.KTCourse.Repository;

import com.kiet_chin.KTCourse.Entity.Exam
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface ExamRepository : JpaRepository<Exam, String>, JpaSpecificationExecutor<Exam> {
}