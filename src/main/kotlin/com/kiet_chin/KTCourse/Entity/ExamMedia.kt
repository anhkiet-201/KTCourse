package com.kiet_chin.KTCourse.Entity

import jakarta.persistence.*

@Entity
@Table(name = "\"ExamMedia\"")
open class ExamMedia {
    @Id
    @Column(name = "id", nullable = false)
    open var id: String? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "exam", nullable = false)
    open var exam: Exam? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "media", nullable = false)
    open var media: com.kiet_chin.KTCourse.Entity.Media? = null
}