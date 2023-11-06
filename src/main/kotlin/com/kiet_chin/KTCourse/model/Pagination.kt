package com.kiet_chin.KTCourse.model

import org.springframework.data.domain.Page

class Pagination<T> {
    val totalPage: Int
    val currentPage: Int
    val totalItem: Long
    val hasNext: Boolean
    val items: List<T>

    constructor(totalPage: Int, currentPage: Int, totalItem: Long, hasNext: Boolean, items: List<T>) {
        this.totalPage = totalPage
        this.currentPage = currentPage
        this.totalItem = totalItem
        this.hasNext = hasNext
        this.items = items
    }

    constructor(page: Page<T>) : this(
        page.totalPages,
        page.number,
        page.totalElements,
        page.hasNext(),
        page.content
    )


}