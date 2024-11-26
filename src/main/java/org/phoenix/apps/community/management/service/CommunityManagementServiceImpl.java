package org.phoenix.apps.community.management.service;

import org.phoenix.apps.community.management.dao.CommunityRepository;
import org.phoenix.apps.community.management.model.Community;
import org.springframework.stereotype.Service;

@Service
public class CommunityManagementServiceImpl implements CommunityManagementService{
    private final CommunityRepository communityRepository;

    public CommunityManagementServiceImpl(CommunityRepository communityRepository) {
        this.communityRepository = communityRepository;
    }

    @Override
    public Community getCommunityDetailsByCommunityId(int communityId) {
        return communityRepository.findById(communityId).orElse(null);
    }

    @Override
    public Community createNewCommunity(Community community) {
        return communityRepository.save(community);
    }

    @Override
    public Community updateCommunity(Community community) {
        return communityRepository.save(community);
    }
}
