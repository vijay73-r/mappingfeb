package com.example.mappingfeb.service;

import com.example.mappingfeb.payload.CommentDto;

public interface CommentService {
    public CommentDto addComment(CommentDto commentDto, long postId);

}
