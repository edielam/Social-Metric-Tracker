package com.edguard.socialmetrictracker.soctracker.model;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    // Define other attributes (e.g., profile details) as needed

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<SocialMediaAccount> socialMediaAccounts;

    // Define constructors, getters, setters, and other methods

    // Constructors, getters, setters, and other methods
}
