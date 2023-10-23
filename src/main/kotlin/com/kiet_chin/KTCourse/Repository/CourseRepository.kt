package com.kiet_chin.KTCourse.Repository;

import com.kiet_chin.KTCourse.Entity.Course
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface CourseRepository : JpaRepository<Course, String>, JpaSpecificationExecutor<Course> {
}