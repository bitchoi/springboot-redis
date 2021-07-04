package com.bitchoi.springbootredis.service;

import com.bitchoi.springbootredis.model.Post;
import com.bitchoi.springbootredis.repository.PostRedisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRedisRepository postRedisRepository;


    public void createPost(Post post){
        Post newPost = new Post();
        newPost.setTitle(post.getTitle());
        newPost.setContent(post.getContent());
        postRedisRepository.save(newPost);
    }

    public Post findById(Integer postId){
        var optPost = postRedisRepository.findById(postId);
        if(optPost.isPresent()){
            return optPost.get();
        }else {
            return null;
        }
    }

    public List<Post> findAll(){
        return postRedisRepository.findAll();
    }

}
