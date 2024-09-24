package com.example.mappingfeb.service;

import com.example.mappingfeb.entity.Post;
import com.example.mappingfeb.payload.PostDto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostService{
    public PostDto createPost(PostDto postDto);

    void delete(long postId);
}
