package com.kiet_chin.KTCourse.Entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "\"ReplyContent\"")
open class ReplyContent {
    @Id
    @Column(name = "reply_content_id", nullable = false)
    open var replyContentId: String? = null

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "reply_content_id", nullable = false)
    open var replyContentReactDetails: com.kiet_chin.KTCourse.Entity.ReplyContentReactDetail? = null

    @Column(name = "date_created", nullable = false)
    open var dateCreated: LocalDate? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account", nullable = false)
    open var account: Account? = null

    @Column(name = "reply_content_other_id")
    open var replyContentOtherId: String? = null

    @Column(name = "content", nullable = false, length = Integer.MAX_VALUE)
    open var content: String? = null

    @Column(name = "total_react", nullable = false)
    open var totalReact: Int? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "topic", nullable = false)
    open var topic: DiscussionTopic? = null
}