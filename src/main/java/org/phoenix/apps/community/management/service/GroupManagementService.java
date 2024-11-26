package org.phoenix.apps.community.management.service;

import org.phoenix.apps.community.management.model.Group;

import java.util.List;

public interface GroupManagementService {

    Group createNewGroup(Group group);

    Group updateGroup(Group group);

    Group getGroupByGroupId(int groupId);

    List<Group> getGroupsByCommunityId(int communityId);
}
