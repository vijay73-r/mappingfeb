package com.example.mappingfeb.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "post")
public class Post {
    @OneToMany(mappedBy = "post", orphanRemoval = true,cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Comment> comments = new LinkedList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "description", nullable = false, length = 45)
    private String description;

    @Column(name = "title", nullable = false, length = 45)
    private String title;

}