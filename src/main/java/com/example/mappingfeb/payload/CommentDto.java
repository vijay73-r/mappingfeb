package com.example.mappingfeb.payload;

import com.example.mappingfeb.entity.Post;
import lombok.Data;

@Data
public class CommentDto {

    private Long id;
    private String content;
    private String email;

    private Long postId;


}
