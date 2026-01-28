package com.blogApplication.BlogApplication.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor

@Entity

@Table(name="users")
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , unique = true)
    private String username;

    @Column(nullable = false , unique = true)
    private  String email;

    @Column(nullable = false)
    private String password ;

@ManyToMany(fetch = FetchType.EAGER)
@JoinTable(
        name = "roles",
        joinColumns = @JoinColumn(name = "user_id") ,
        inverseJoinColumns = @JoinColumn(name = "role_id")
)
    private Set<Role> roles;


}
