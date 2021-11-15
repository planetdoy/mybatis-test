package com.practice.mybatis.controller;

import com.practice.mybatis.application.BoardService;
import com.practice.mybatis.domain.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping("/v1/board")
    public List<Map<String, Object>> getBoards() {
        return boardService.getBoards();
    }

    @PostMapping("/v1/board")
    public Long save(Board board) {

        return boardService.save(board);
    }
}