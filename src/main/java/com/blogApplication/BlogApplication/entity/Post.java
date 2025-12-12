package com.blogApplication.BlogApplication.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.extern.apachecommons.CommonsLog;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity

@Table(name = "posts")
public class Post {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private  Long Id ;

    @Column(nullable = false)
private String title;


    @Column(nullable = false , columnDefinition = "TEXT")
private String content ;

private String category;

@ElementCollection
    @CollectionTable(name = "post_tags" , joinColumns = @JoinColumn(name = "post_id"))
    @Column(name = "tags")

    private List<String> tags;




}
