package com.example.mappingfeb.controller;

import com.example.mappingfeb.entity.Comment;
import com.example.mappingfeb.entity.Post;
import com.example.mappingfeb.payload.CommentDto;
import com.example.mappingfeb.respository.PostRepository;
import com.example.mappingfeb.service.CommentService;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {
    private CommentService commentService;
    private final PostRepository postRepository;

    public CommentController(CommentService commentService,
                             PostRepository postRepository) {
        this.commentService = commentService;
        this.postRepository = postRepository;
    }
    @PostMapping
    public ResponseEntity<CommentDto> addComment(@RequestBody CommentDto commentDto, @RequestParam long postId) {

        CommentDto commentDto1 = commentService.addComment(commentDto, postId);


        return new ResponseEntity<>(commentDto1, HttpStatus.CREATED);
    }




}
