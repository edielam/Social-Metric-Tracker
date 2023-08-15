package com.edguard.socialmetrictracker.soctracker.repository;

import com.edguard.socialmetrictracker.soctracker.model.Analytics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalyticsRepository extends JpaRepository<Analytics, Long> {
    // Additional query methods can be added here if needed
}
