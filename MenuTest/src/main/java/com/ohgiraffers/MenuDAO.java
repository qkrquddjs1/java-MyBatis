package com.ohgiraffers;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MenuDAO {
    /* 전제 조회 하는 문구*/
    public List<MenuDTO> selecetAllMenu(SqlSession sqlSession){
        return sqlSession.selectList("MenuMapper.selectAllMenu");

    }




}
