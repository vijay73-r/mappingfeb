package com.example.mappingfeb.payload;

import com.example.mappingfeb.entity.Post;
import lombok.Data;

@Data
public class PostDto {
    private Long id;
    private String title;
    private String description;


}
