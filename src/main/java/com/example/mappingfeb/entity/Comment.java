package com.example.mappingfeb.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "content", nullable = false, length = 45)
    private String content;

    @Column(name = "email", nullable = false, length = 45)
    private String email;

    @ManyToOne
    @JoinColumn(name = "post_id")

    private Post post;

}