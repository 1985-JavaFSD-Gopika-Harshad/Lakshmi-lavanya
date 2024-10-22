package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Comment;
import com.revature.repository.CommentRepository;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public Comment updateComment(Long id, Comment comment) {
        return commentRepository.findById(id).map(existingComment -> {
            existingComment.setContent(comment.getContent());
            return commentRepository.save(existingComment);
        }).orElse(null);
    }

    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }

    public List<Comment> searchComments(String keyword) {
        return commentRepository.findByContentContaining(keyword);
    }

    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }
}
