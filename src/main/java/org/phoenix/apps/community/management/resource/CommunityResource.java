package org.phoenix.apps.community.management.resource;

import org.phoenix.apps.community.management.model.Community;
import org.phoenix.apps.community.management.service.CommunityManagementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/community")
public class CommunityResource {

    private final CommunityManagementService communityManagementService;

    public CommunityResource(CommunityManagementService communityManagementService) {
        this.communityManagementService = communityManagementService;
    }

    @GetMapping("/{communityId}")
    public ResponseEntity<Community> getCommunityDetailsById(@PathVariable int communityId) {
        return ResponseEntity.ok().body(communityManagementService.getCommunityDetailsByCommunityId(communityId));
    }

    @PostMapping
    public ResponseEntity<Community> addNewCommunity(@RequestBody Community community) {
        return ResponseEntity.ok().body(communityManagementService.createNewCommunity(community));
    }

    @PutMapping
    public ResponseEntity<Community> updateCommunity(@RequestBody Community community) {
        return ResponseEntity.ok().body(communityManagementService.updateCommunity(community));
    }
}
