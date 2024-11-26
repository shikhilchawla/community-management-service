package org.phoenix.apps.community.management.dao;

import org.phoenix.apps.community.management.model.Group;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GroupRepository extends CrudRepository<Group, Integer> {

    List<Group> findAllGroupsByCommunityId(int communityId);
}
