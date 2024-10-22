package com.revature.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.BlogPost;
import com.revature.repository.BlogPostRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BlogPostService {

    @Autowired
    private BlogPostRepository blogPostRepository;

    public BlogPost createBlogPost(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }

    public BlogPost updateBlogPost(Long id, BlogPost blogPost) {
        Optional<BlogPost> existingBlogPost = blogPostRepository.findById(id);
        if (existingBlogPost.isPresent()) {
            BlogPost postToUpdate = existingBlogPost.get();
            postToUpdate.setTitle(blogPost.getTitle());
            postToUpdate.setContent(blogPost.getContent());
            return blogPostRepository.save(postToUpdate);
        } else {
            return null;
        }
    }

    public void deleteBlogPost(Long id) {
        blogPostRepository.deleteById(id);
    }

    public List<BlogPost> searchBlogPosts(String keyword) {
        return blogPostRepository.findByTitleContaining(keyword);
    }

    public List<BlogPost> getAllBlogPosts() {
        return blogPostRepository.findAll();
    }
}



