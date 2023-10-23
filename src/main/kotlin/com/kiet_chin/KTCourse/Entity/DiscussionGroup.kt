package com.kiet_chin.KTCourse.Entity

import jakarta.persistence.*

@Entity
@Table(name = "\"DiscussionGroup\"")
open class DiscussionGroup {
    @Id
    @Column(name = "group_id", nullable = false)
    open var groupId: String? = null

    @Column(name = "name", nullable = false)
    open var name: String? = null

    @Column(name = "description", nullable = false, length = Integer.MAX_VALUE)
    open var description: String? = null

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "course", nullable = false)
    open var course: Course? = null

    @OneToMany(mappedBy = "group")
    open var discussionTopics: MutableSet<com.kiet_chin.KTCourse.Entity.DiscussionTopic> = mutableSetOf()
}