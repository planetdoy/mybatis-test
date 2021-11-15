package com.practice.mybatis.application;

import com.practice.mybatis.domain.Board;

import java.util.List;
import java.util.Map;

public interface BoardService {
    List<Map<String, Object>> getBoards();

    Long save(Board board);
}
