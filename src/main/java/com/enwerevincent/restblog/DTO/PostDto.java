package com.enwerevincent.restblog.DTO;

import lombok.Data;

@Data
public class PostDto {
    private String title ;
    private String description;
    private String featuredImage;
    private int user_id;

    public PostDto(String title_of_post, String small_description, String s, int i) {
    }
}
