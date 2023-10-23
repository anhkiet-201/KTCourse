package com.kiet_chin.KTCourse.Repository;

import com.kiet_chin.KTCourse.Entity.DiscussionTopic
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface DiscussionTopicRepository : JpaRepository<DiscussionTopic, String>,
    JpaSpecificationExecutor<DiscussionTopic> {
}