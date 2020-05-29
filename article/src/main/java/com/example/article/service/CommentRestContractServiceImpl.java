package com.example.article.service;

import com.example.contract.comment.CommentResponseDto;
import com.example.contract.comment.CommentRestContract;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentRestContractServiceImpl implements CommentRestContractService {

    private final CommentRestContract commentRestContract;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    public CommentRestContractServiceImpl(CommentRestContract commentRestContract) {
        this.commentRestContract = commentRestContract;
    }

    @Override
    public List<CommentResponseDto> findComments() {
        return commentRestContract.findComments();
    }
}
