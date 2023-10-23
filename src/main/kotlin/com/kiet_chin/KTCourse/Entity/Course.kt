package com.kiet_chin.KTCourse.Entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "\"Course\"")
open class Course {
    @Id
    @Column(name = "course_id", nullable = false)
    open var courseId: String? = null

    @Column(name = "name", nullable = false)
    open var name: String? = null

    @Column(name = "description", nullable = false, length = Integer.MAX_VALUE)
    open var description: String? = null

    @Column(name = "thumbnail_url")
    open var thumbnailUrl: String? = null

    @Column(name = "date_created", nullable = false)
    open var dateCreated: LocalDate? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "owner", nullable = false)
    open var owner: Account? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category", nullable = false)
    open var category: Category? = null

    @OneToMany(mappedBy = "course")
    open var discussionGroups: MutableSet<com.kiet_chin.KTCourse.Entity.DiscussionGroup> = mutableSetOf()

    @OneToMany(mappedBy = "course")
    open var exams: MutableSet<com.kiet_chin.KTCourse.Entity.Exam> = mutableSetOf()

    @OneToMany(mappedBy = "course")
    open var lessons: MutableSet<com.kiet_chin.KTCourse.Entity.Lesson> = mutableSetOf()
}