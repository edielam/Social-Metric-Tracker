package com.edguard.socialmetrictracker.soctracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
    private String user;
    private int likes;
    private int comments;
    private int shares;
    private LocalDateTime createdAt;

    // Constructors, getters, setters, and other methods (if needed)

    // Default constructor required by JPA
    public Post() {
    }

    public Post(String content, String user, int likes, int comments, int shares, LocalDateTime createdAt) {
        this.content = content;
        this.user = user;
        this.likes = likes;
        this.comments = comments;
        this.shares = shares;
        this.createdAt = createdAt;
    }

    // Getters and setters for all attributes
}



