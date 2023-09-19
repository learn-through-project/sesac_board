package com.hypeboy.hypeBoard.repository;

import com.hypeboy.hypeBoard.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    Optional<Comment> findByPostId(Long postId);
}