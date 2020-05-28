package com.example.comment.web;

import com.example.contract.comment.CommentResponseDto;
import com.example.contract.comment.CommentRestContract;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@RestController
public class CommentRestController implements CommentRestContract {

    @Override
    @GetMapping("/comments")
    public List<CommentResponseDto> findComments() {

        CommentResponseDto commentResponseDto = CommentResponseDto.builder()
                .id(1L)
                .content("test")
                .writerName("admin")
                .createdDate(LocalDateTime.now()).build();

        return Collections.singletonList(commentResponseDto);
    }
}
