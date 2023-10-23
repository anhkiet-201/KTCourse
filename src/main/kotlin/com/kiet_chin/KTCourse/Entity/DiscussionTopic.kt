package com.kiet_chin.KTCourse.Entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "\"DiscussionTopic\"")
open class DiscussionTopic {
    @Id
    @Column(name = "topic_id", nullable = false)
    open var topicId: String? = null

    @Column(name = "date_created", nullable = false)
    open var dateCreated: LocalDate? = null

    @Column(name = "title", nullable = false)
    open var title: String? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account", nullable = false)
    open var account: Account? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"group\"", nullable = false)
    open var group: DiscussionGroup? = null

    @Column(name = "content", nullable = false, length = Integer.MAX_VALUE)
    open var content: String? = null

    @Column(name = "total_reply", nullable = false)
    open var totalReply: Int? = null

    @Column(name = "total_react", nullable = false)
    open var totalReact: Int? = null

    @OneToMany(mappedBy = "topic")
    open var replyContents: MutableSet<com.kiet_chin.KTCourse.Entity.ReplyContent> = mutableSetOf()

    @OneToMany(mappedBy = "topic")
    open var topicMedia: MutableSet<com.kiet_chin.KTCourse.Entity.TopicMedia> = mutableSetOf()

    @OneToMany(mappedBy = "topic")
    open var topicReactDetails: MutableSet<com.kiet_chin.KTCourse.Entity.TopicReactDetail> = mutableSetOf()
}