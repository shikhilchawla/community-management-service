package org.phoenix.apps.community.management.dao;

import org.phoenix.apps.community.management.model.Community;
import org.springframework.data.repository.CrudRepository;

public interface CommunityRepository extends CrudRepository<Community, Integer> {
}
