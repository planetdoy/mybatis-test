package com.practice.mybatis.repository;

import com.practice.mybatis.domain.Board;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface BoardRepository {
    /*게시판 리스트*/
    List<Map<String, Object>> getBoards();
    /*게시판 생성*/
    Long save(Board board);
}
