package com.bitchoi.springbootredis.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Getter
@Setter
@RedisHash("post")
public class Post {

    @Id
    private Integer postId;

    private String title;

    private String content;
}
