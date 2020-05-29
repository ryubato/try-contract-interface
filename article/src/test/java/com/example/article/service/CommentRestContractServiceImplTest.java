package com.example.article.service;

import com.example.contract.comment.CommentResponseDto;
import com.example.contract.comment.stub.CommentRestContractStub;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;
import java.util.List;

@TestPropertySource(properties = {"service.comment.name=comment-stub", "service.comment.url=http://localhost:9999"})
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CommentRestContractServiceImplTest {

    private CommentRestContractServiceImpl commentRestContractService;
    private CommentRestContractStub commentRestContractStub;

    @BeforeAll
    void setup() {
        commentRestContractStub = new CommentRestContractStub();
        commentRestContractService = new CommentRestContractServiceImpl(commentRestContractStub);
    }

    @Test
    void commentRestContractTest() {

        CommentResponseDto expectedCommentResponseDto = CommentResponseDto.builder()
                .id(1L)
                .content("test")
                .writerName("admin")
                .createdDate(LocalDateTime.now())
                .articleId(1L).build();

        List<CommentResponseDto> commentResponseDtos = commentRestContractService.findComments();
        Assertions.assertThat(commentResponseDtos).isNotNull();
        Assertions.assertThat(commentResponseDtos.get(0)).isEqualToIgnoringGivenFields(expectedCommentResponseDto, "createdDate");
    }

}