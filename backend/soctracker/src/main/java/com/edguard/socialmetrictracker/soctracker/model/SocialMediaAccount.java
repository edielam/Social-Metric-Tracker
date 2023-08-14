package com.edguard.socialmetrictracker.soctracker.model;

import jakarta.persistence.*;
@Entity
@Table(name = "social_media_accounts")
public class SocialMediaAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String platform;

    @Column(nullable = false)
    private String username;

    // Define other attributes (e.g., authentication tokens) as needed

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Define constructors, getters, setters, and other methods

    // Constructors, getters, setters, and other methods
}