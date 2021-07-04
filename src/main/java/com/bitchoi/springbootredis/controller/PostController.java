package com.bitchoi.springbootredis.controller;

import com.bitchoi.springbootredis.model.Post;
import com.bitchoi.springbootredis.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;


    @PostMapping("")
    public void create(@RequestBody Post post){
        postService.createPost(post);
    }

    @GetMapping("/{postId}")
    public Post findById(@PathVariable Integer postId){
        return postService.findById(postId);
    }

    @GetMapping("")
    public List<Post> findAll(){
        return postService.findAll();
    }
}
