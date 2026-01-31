package com.blogApplication.BlogApplication.dto;

import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
public class PostResponseDto {

    private Long id;
    private String title;
    private String content;
    private String category;
    private List<String> tags;
    private Instant createdAt;
    private Instant UpdateAt;
    private  String authorUsername;

}
