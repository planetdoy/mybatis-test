package com.practice.mybatis.application;

import com.practice.mybatis.domain.Board;
import com.practice.mybatis.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    private BoardRepository boardRepository;

    @Override
    public List<Map<String, Object>> getBoards() {
        return boardRepository.getBoards();
    }

    @Override
    public Long save(Board board) {
        board.createTime();
        return boardRepository.save(board);
    }
}
