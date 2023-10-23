package com.kiet_chin.KTCourse.Entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "\"TopicReactDetails\"")
open class TopicReactDetail {
    @Id
    @Column(name = "topic_react_id", nullable = false)
    open var topicReactId: String? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account", nullable = false)
    open var account: Account? = null

    @Column(name = "date_react", nullable = false)
    open var dateReact: LocalDate? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "topic", nullable = false)
    open var topic: DiscussionTopic? = null
}