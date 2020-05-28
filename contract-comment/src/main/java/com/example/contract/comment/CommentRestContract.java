package com.example.contract.comment;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "comment", url = "localhost:8881")
public interface CommentRestContract {

    @GetMapping("/comments")
    List<CommentResponseDto> findComments();
}
