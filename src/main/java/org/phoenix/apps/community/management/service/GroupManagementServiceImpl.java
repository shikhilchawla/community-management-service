package org.phoenix.apps.community.management.service;

import org.phoenix.apps.community.management.dao.GroupRepository;
import org.phoenix.apps.community.management.model.Group;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupManagementServiceImpl implements GroupManagementService {
    private final GroupRepository groupRepository;

    public GroupManagementServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public Group createNewGroup(Group group) {
        return groupRepository.save(group);
    }

    @Override
    public Group updateGroup(Group group) {
        return groupRepository.save(group);
    }

    @Override
    public Group getGroupByGroupId(int groupId) {
        return groupRepository.findById(groupId).orElse(null);
//        assert group != null;
//        group.setGroupPosts(communityOrchestrationService.getAllPostsForGroup(groupId));
//        return group;
    }

    @Override
    public List<Group> getGroupsByCommunityId(int communityId) {
        return groupRepository.findAllGroupsByCommunityId(communityId);

//        return groups.stream()
//                .peek(group -> {group.setGroupPosts(communityOrchestrationService.getAllPostsForGroup(group.getGroupId()));})
//                .collect(Collectors.toList());
    }
}
