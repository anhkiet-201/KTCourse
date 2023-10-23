package com.kiet_chin.KTCourse.Entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "\"Media\"")
open class Media {
    @Id
    @Column(name = "media_id", nullable = false)
    open var mediaId: String? = null

    @Column(name = "date_create", nullable = false)
    open var dateCreate: LocalDate? = null

    @Column(name = "type", nullable = false)
    open var type: String? = null

    @Column(name = "description", length = Integer.MAX_VALUE)
    open var description: String? = null

    @Column(name = "media_url", nullable = false, length = Integer.MAX_VALUE)
    open var mediaUrl: String? = null

    @OneToMany(mappedBy = "media")
    open var examMedia: MutableSet<ExamMedia> = mutableSetOf()

    @OneToMany(mappedBy = "media")
    open var topicMedia: MutableSet<com.kiet_chin.KTCourse.Entity.TopicMedia> = mutableSetOf()
}