package com.restdemo.postcomments.service;

import com.restdemo.postcomments.model.Comment;
import com.restdemo.postcomments.model.Post;
import com.restdemo.postcomments.repository.CommentRepository;
import com.restdemo.postcomments.repository.PostRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    CommentRepository commentRepository;
    PostRepository postRepository;

    public CommentService(CommentRepository commentRepository, PostRepository postRepository){
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }

    public void addComment(Comment comment, Long post_id){
        Post post = postRepository.findById(post_id).orElseThrow();

        comment.setPost(post);
        commentRepository.save(comment);
    }
}
