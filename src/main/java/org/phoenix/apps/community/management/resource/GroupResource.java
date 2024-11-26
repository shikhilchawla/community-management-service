package org.phoenix.apps.community.management.resource;

import org.phoenix.apps.community.management.model.Group;
import org.phoenix.apps.community.management.service.GroupManagementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/groups")
public class GroupResource {

    private final GroupManagementService groupManagementService;

    public GroupResource(GroupManagementService groupManagementService) {
        this.groupManagementService = groupManagementService;
    }

    @PostMapping
    public ResponseEntity<Group> createNewGroup(@RequestBody Group group){
        return ResponseEntity.ok().body(groupManagementService.createNewGroup(group));
    }

    @PutMapping
    public ResponseEntity<Group> updateGroup(@RequestBody Group group){
        return ResponseEntity.ok().body(groupManagementService.updateGroup(group));
    }

    @GetMapping("/{groupId}")
    public ResponseEntity<Group> getGroupById(int groupId) {
        return ResponseEntity.ok().body(groupManagementService.getGroupByGroupId(groupId));
    }

    @GetMapping("/community/{communityId}")
    public ResponseEntity<List<Group>> getGroupsByCommunityId(int communityId){
        return ResponseEntity.ok().body(groupManagementService.getGroupsByCommunityId(communityId));
    }
}
