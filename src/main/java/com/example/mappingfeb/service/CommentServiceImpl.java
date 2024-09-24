package com.example.mappingfeb.service;

import com.example.mappingfeb.entity.Comment;
import com.example.mappingfeb.entity.Post;
import com.example.mappingfeb.payload.CommentDto;
import com.example.mappingfeb.respository.CommentRepository;
import com.example.mappingfeb.respository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CommentServiceImpl implements CommentService{

    private CommentRepository commentRepository;

    private PostRepository postRepository;

    public CommentServiceImpl(CommentRepository commentRepository, PostRepository postRepository){
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    @Override
    public CommentDto addComment(CommentDto commentDto, long postId) {
        Post post = postRepository.findById(postId).get();

        Comment comment = mapTOEntity(commentDto);
        comment.setPost(post);
        commentRepository.save(comment);


        return mapToDto(comment);
    }


    public Comment mapTOEntity(CommentDto commentDto){
        Comment comment = new Comment();
        comment.setContent(commentDto.getContent());
        comment.setEmail(commentDto.getEmail());
        // Do not set post here, it will be set in addComment method
        return comment;
    }

    public CommentDto mapToDto(Comment comment){
        CommentDto commentDto = new CommentDto();
        commentDto.setId(comment.getId());
        commentDto.setContent(comment.getContent());
        commentDto.setEmail(comment.getEmail());
        commentDto.setPostId(comment.getPost().getId());
        //getId() extracts the unique identifier (id) of the Post.

        return commentDto;
    }



}
