package com.kiet_chin.KTCourse.Repository;

import com.kiet_chin.KTCourse.Entity.Lesson
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface LessonRepository : JpaRepository<Lesson, String>, JpaSpecificationExecutor<Lesson> {
}