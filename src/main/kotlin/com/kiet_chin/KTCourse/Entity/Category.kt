package com.kiet_chin.KTCourse.Entity

import jakarta.persistence.*

@Entity
@Table(name = "\"Categories\"")
open class Category {
    @Id
    @Column(name = "category_id", nullable = false)
    open var categoryId: String? = null

    @Column(name = "name", nullable = false)
    open var name: String? = null

    @Column(name = "descrition")
    open var descrition: String? = null

    @OneToMany(mappedBy = "category")
    open var courses: MutableSet<com.kiet_chin.KTCourse.Entity.Course> = mutableSetOf()
}