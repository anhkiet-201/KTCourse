package com.kiet_chin.KTCourse.Entity

import jakarta.persistence.*

@Entity
@Table(name = "\"Lesson\"")
open class Lesson {
    @Id
    @Column(name = "lesson_id", nullable = false)
    open var lessonId: String? = null

    @Column(name = "title", nullable = false)
    open var title: String? = null

    @Column(name = "description", nullable = false)
    open var description: String? = null

    @Column(name = "media_url", nullable = false, length = Integer.MAX_VALUE)
    open var mediaUrl: String? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "course", nullable = false)
    open var course: Course? = null
}