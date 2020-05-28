package com.example.article.service;

import com.example.contract.comment.CommentResponseDto;

import java.util.List;

public interface ArticleRestContractService {
    List<CommentResponseDto> findComments();
}
