package com.kiet_chin.KTCourse.Repository;

import com.kiet_chin.KTCourse.Entity.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface CategoryRepository : JpaRepository<Category, String>, JpaSpecificationExecutor<Category> {
}