package com.edguard.socialmetrictracker.soctracker.repository;


import com.edguard.socialmetrictracker.soctracker.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // Additional query methods can be added here if needed
}
