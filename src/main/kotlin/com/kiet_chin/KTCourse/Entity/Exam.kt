package com.kiet_chin.KTCourse.Entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "\"Exams\"")
open class Exam {
    @Id
    @Column(name = "exam_id", nullable = false)
    open var examId: String? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "course", nullable = false)
    open var course: Course? = null

    @Column(name = "title", nullable = false)
    open var title: String? = null

    @Column(name = "description", nullable = false)
    open var description: Long? = null

    @Column(name = "content", nullable = false)
    open var content: Long? = null

    @Column(name = "date_create", nullable = false)
    open var dateCreate: LocalDate? = null

    @Column(name = "start_date", nullable = false)
    open var startDate: LocalDate? = null

    @Column(name = "end_date")
    open var endDate: LocalDate? = null

    @OneToMany(mappedBy = "exam")
    open var examMedia: MutableSet<ExamMedia> = mutableSetOf()
}