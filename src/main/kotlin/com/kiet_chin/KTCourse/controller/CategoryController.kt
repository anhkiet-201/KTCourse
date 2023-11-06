package com.kiet_chin.KTCourse.controller

import com.kiet_chin.KTCourse.Entity.Category
import com.kiet_chin.KTCourse.Repository.CategoryRepository
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class CategoryController(
    private val categoryRepository: CategoryRepository
) {
    @QueryMapping
    fun getKTCourseCategories(): List<Category> {
        return categoryRepository.findAll()
    }
}