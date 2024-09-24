package com.example.mappingfeb.respository;

import com.example.mappingfeb.entity.Comment;
import com.example.mappingfeb.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
