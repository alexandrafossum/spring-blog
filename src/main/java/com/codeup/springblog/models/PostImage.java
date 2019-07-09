package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
public class PostImage {

    @Id @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String path;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

}
