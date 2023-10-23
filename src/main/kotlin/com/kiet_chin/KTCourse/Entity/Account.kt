package com.kiet_chin.KTCourse.Entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "\"Account\"")
open class Account {
    @Id
    @Column(name = "uid", nullable = false)
    open var uid: String? = null

    @Column(name = "email", nullable = false)
    open var email: String? = null

    @Column(name = "first_name", nullable = false)
    open var firstName: String? = null

    @Column(name = "last_lame", nullable = false)
    open var lastLame: String? = null

    @Column(name = "date_created", nullable = false)
    open var dateCreated: LocalDate? = null

    @Column(name = "avatar_url")
    open var avatarUrl: String? = null

    @Column(name = "short_name", nullable = false)
    open var shortName: String? = null

    @Column(name = "birth_day", nullable = false)
    open var birthDay: LocalDate? = null

    @Column(name = "password", nullable = false)
    open var password: String? = null

    @OneToMany(mappedBy = "owner")
    open var courses: MutableSet<com.kiet_chin.KTCourse.Entity.Course> = mutableSetOf()

    @OneToMany(mappedBy = "account")
    open var discussionTopics: MutableSet<com.kiet_chin.KTCourse.Entity.DiscussionTopic> = mutableSetOf()

    @OneToMany(mappedBy = "account")
    open var replyContents: MutableSet<com.kiet_chin.KTCourse.Entity.ReplyContent> = mutableSetOf()

    @OneToMany(mappedBy = "account")
    open var replyContentReactDetails: MutableSet<com.kiet_chin.KTCourse.Entity.ReplyContentReactDetail> =
        mutableSetOf()

    @OneToMany(mappedBy = "account")
    open var topicReactDetails: MutableSet<com.kiet_chin.KTCourse.Entity.TopicReactDetail> = mutableSetOf()
}