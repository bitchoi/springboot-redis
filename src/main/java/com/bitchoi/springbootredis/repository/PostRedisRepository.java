package com.bitchoi.springbootredis.repository;

import com.bitchoi.springbootredis.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRedisRepository extends CrudRepository<Post, Integer> {

    List<Post> findAll();
}
