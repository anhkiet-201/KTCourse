package com.kiet_chin.KTCourse.Repository;

import com.kiet_chin.KTCourse.Entity.DiscussionGroup
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface DiscussionGroupRepository : JpaRepository<DiscussionGroup, String>,
    JpaSpecificationExecutor<DiscussionGroup> {
}