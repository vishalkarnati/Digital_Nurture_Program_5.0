package com.restdemo.postcomments.controller;

import com.restdemo.postcomments.model.Comment;
import com.restdemo.postcomments.model.Post;
import com.restdemo.postcomments.service.CommentService;
import com.restdemo.postcomments.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posts")
public class Controller {

    PostService service;
    CommentService commentService;

    public Controller(PostService service, CommentService commentService){
        this.service = service;
        this.commentService = commentService;
    }

    @GetMapping
    public List getAllPosts(){
        List posts = service.getAllPosts();
        return posts;
    }

    @GetMapping("/{id}")
    public Optional<Post> findById( @PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping("/addPost")
    public void addPost(@RequestBody Post post){
        service.addPost(post);
    }

    @PostMapping("{post_id}/addComment")
    public void addComment(@RequestBody Comment comment, @PathVariable Long post_id){
        commentService.addComment(comment, post_id);
    }

    @GetMapping("/{id}/getComments")
    public List getAllComments(@PathVariable Long id){
        List comments = service.getAllComments(id);
        return comments;
    }
}
