package com.edguard.socialmetrictracker.soctracker.repository;

import com.edguard.socialmetrictracker.soctracker.model.SocialMediaAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialMediaAccountRepository extends JpaRepository<SocialMediaAccount, Long> {
    // Additional query methods can be added here if needed
}