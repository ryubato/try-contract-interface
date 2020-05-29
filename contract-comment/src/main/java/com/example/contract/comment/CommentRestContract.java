package com.example.contract.comment;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "${service.comment.name}", url = "${service.comment.url}")
public interface CommentRestContract {

    @GetMapping("/comments")
    List<CommentResponseDto> findComments();
    
}
