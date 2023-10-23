package com.kiet_chin.KTCourse.Entity

import jakarta.persistence.*

@Entity
@Table(name = "\"TopicMedia\"")
open class TopicMedia {
    @Id
    @Column(name = "id", nullable = false)
    open var id: String? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "topic", nullable = false)
    open var topic: DiscussionTopic? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "media", nullable = false)
    open var media: Media? = null
}