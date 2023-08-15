package com.edguard.socialmetrictracker.soctracker.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private int likes= 0;

    @Column(nullable = false)
    private int comments= 0;

    @Column(nullable = false)
    private int shares= 0;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    // Define other attributes and relationships as needed

    // Constructors, getters, setters, and other methods
}