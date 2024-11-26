package org.phoenix.apps.community.management.service;

import org.phoenix.apps.community.management.model.Community;

public interface CommunityManagementService {
    Community getCommunityDetailsByCommunityId(int communityId);

    Community createNewCommunity(Community community);

    Community updateCommunity(Community community);
}
