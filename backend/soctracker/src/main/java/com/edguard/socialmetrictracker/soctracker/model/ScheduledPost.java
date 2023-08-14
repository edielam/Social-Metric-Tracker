package com.edguard.socialmetrictracker.soctracker.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;
@Entity
@Table(name = "scheduled_posts")
public class ScheduledPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private LocalDateTime publicationDateTime;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "social_media_account_id", nullable = false)
    private SocialMediaAccount socialMediaAccount;

    // Define other attributes and relationships as needed

    // Constructors, getters, setters, and other methods
}
