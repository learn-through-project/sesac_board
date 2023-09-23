package com.hypeboy.hypeBoard.service;


import com.hypeboy.hypeBoard.dto.CommentDto;
import com.hypeboy.hypeBoard.dto.ServiceDto;
import com.hypeboy.hypeBoard.entity.Comment;
import com.hypeboy.hypeBoard.repository.CommentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;

    @Autowired
    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public ServiceDto<List<Comment>> getCommentList(Integer postId, Integer lastId, Integer count) {
        ServiceDto<List<Comment>> resDto = new ServiceDto<>();

        try {
            List<Comment> result = commentRepository.findByPostId(postId, lastId, count);
            resDto.setData(result);
        } catch (Exception ex) {
            resDto.setError(ex.getMessage());
        }

        return resDto;
    }

    @Override
    public  ServiceDto<List<Comment>> getCommentByPostId(Integer postId, Integer count) {
        Integer defaultLastId = 0;

        ServiceDto<List<Comment>> resDto = new ServiceDto<>();

        try {
            List<Comment> result = commentRepository.findByPostId(postId, defaultLastId, count);
            resDto.setData(result);
        } catch (Exception ex) {
            resDto.setError(ex.getMessage());
        }

        return resDto;
    }




}