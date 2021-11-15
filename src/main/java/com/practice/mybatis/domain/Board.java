package com.practice.mybatis.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class Board {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdTime;

    public void createTime() {
        this.createdTime = LocalDateTime.now();
    }
}
