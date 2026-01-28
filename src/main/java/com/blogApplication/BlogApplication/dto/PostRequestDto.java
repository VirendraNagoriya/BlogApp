package com.blogApplication.BlogApplication.dto;

import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class PostRequestDto {

    @NotBlank
   private String title;

    @NotBlank
    private String content;

    @NotBlank
    private String category ;

    private List<String> tags;

}
