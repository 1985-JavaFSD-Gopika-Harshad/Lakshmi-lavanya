package com.revature.repository;

	
import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Comment;

import java.util.List;

	public interface CommentRepository extends JpaRepository<Comment, Long> {
	    List<Comment> findByContentContaining(String keyword);

}
