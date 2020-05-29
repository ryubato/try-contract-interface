package com.example.contract.comment;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter @EqualsAndHashCode @ToString
public class CommentResponseDto {
    private Long id;
    private String content;
    private String writerName;
    private LocalDateTime createdDate;
    private Long articleId;

    @Builder
    public CommentResponseDto(Long id, String content, String writerName, LocalDateTime createdDate, Long articleId) {
        this.id = id;
        this.content = content;
        this.writerName = writerName;
        this.createdDate = createdDate;
        this.articleId = articleId;
    }

    public static CommentResponseDto of(Long id, String content, String writerName, LocalDateTime createdDate, Long articleId) {
        return new CommentResponseDto(id, content, writerName, createdDate, articleId);
    }
}
