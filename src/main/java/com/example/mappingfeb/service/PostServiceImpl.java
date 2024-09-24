package com.example.mappingfeb.service;

import com.example.mappingfeb.entity.Post;
import com.example.mappingfeb.payload.PostDto;
import com.example.mappingfeb.respository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = mapToEntity(postDto);
        Post savedEntity = postRepository.save(post);
        PostDto dto = mapToDto(savedEntity);
        return dto;

    }

    @Override
    public void delete(long postId) {

    }


    public Post mapToEntity(PostDto postDto) {
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        return post;

    }

    public PostDto mapToDto(Post post) {
        PostDto dto = new PostDto();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setDescription(post.getDescription());
        return  dto;
    }




}
