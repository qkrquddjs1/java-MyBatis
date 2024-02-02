package com.ohgiraffers;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.Template.getSqlSession;

public class MenuService {
    private MenuMapper menuMapper;
    public List<MenuDTO> selectAllMenu() {

        SqlSession sqlSession = getSqlSession();

        menuMapper = sqlSession.getMapper(MenuMapper.class);
    }

    public MenuDTO selectMenuCode(int menuCode) {
    }
}
