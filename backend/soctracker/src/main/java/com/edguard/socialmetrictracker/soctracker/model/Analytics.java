package com.edguard.socialmetrictracker.soctracker.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;
@Entity
@Table(name = "analytics")
public class Analytics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @Column(nullable = false)
    private int likes;

    @Column(nullable = false)
    private int comments;

    @Column(nullable = false)
    private int shares;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    // Define other attributes and relationships as needed

    // Constructors, getters, setters, and other methods
}
