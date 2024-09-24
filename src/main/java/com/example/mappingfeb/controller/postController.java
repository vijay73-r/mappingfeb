package com.example.mappingfeb.controller;

import com.example.mappingfeb.payload.PostDto;
import com.example.mappingfeb.service.PostService;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/posts")
public class postController {

    private PostService postService;

    public postController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/create")
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto) {
        PostDto savedPost = postService.createPost(postDto);

        return new ResponseEntity<>(savedPost, HttpStatus.CREATED);
    }
    @DeleteMapping
    @Transactional
    public ResponseEntity<Void> deleteById(@RequestParam long postId) {
        postService.delete(postId);
        return null;
    }


}
