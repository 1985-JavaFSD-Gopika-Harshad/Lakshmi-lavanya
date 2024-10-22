package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.BlogPost;

import java.util.List;

	public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
	    List<BlogPost> findByTitleContaining(String keyword);

}
