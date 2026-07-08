package com.restdemo.postcomments.service;

import com.restdemo.postcomments.model.Post;
import com.restdemo.postcomments.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    PostRepository repository;

    public PostService(PostRepository repository){
        this.repository = repository;
    }

    public void addPost(Post post){
        repository.save(post);
    }

    public List getAllPosts(){
        return repository.findAll();
    }

    public Optional<Post> findById(Long id){
        return repository.findById(id);
    }

    public List getAllComments(Long id){
        Optional<Post> post = repository.findById(id);

        if(post.isPresent()){
            return post.get().getComments();
        }
        return null;
    }
}
