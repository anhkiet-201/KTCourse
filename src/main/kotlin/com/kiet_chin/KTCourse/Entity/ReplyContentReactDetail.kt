package com.kiet_chin.KTCourse.Entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "\"ReplyContentReactDetails\"")
open class ReplyContentReactDetail {
    @Id
    @Column(name = "reply_content_react_id", nullable = false)
    open var replyContentReactId: String? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account", nullable = false)
    open var account: Account? = null

    @Column(name = "date_react", nullable = false)
    open var dateReact: LocalDate? = null

    @OneToOne(mappedBy = "replyContentReactDetails")
    open var replyContent: ReplyContent? = null
}