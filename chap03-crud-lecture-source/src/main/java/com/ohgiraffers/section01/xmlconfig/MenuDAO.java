package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MenuDAO {
    /* 조회 */
    public List<MenuDTO> selecetAllMenu(SqlSession sqlSession) {
        /* 메소드의 첫번쨰 인자로 어떠한 sql 구문을 수행할 것인지 전달한다.
        *  mapper의 namespace와 id를 통해서 구분한다. */
        return sqlSession.selectList("MenuMapper.selectAllMenu");
    }

    /* 한줄 조회 */
    public MenuDTO selectMenuByMenuCode(SqlSession sqlSession, int menuCode) {
        /* 메소드의 두번째 인자로 sql 구문을 수행할 떄 필요한 값을 전달한다. */
        return sqlSession.selectOne("MenuMapper.selectMenuByMenuCode", menuCode);
    }

    /* 삽입 */
    public int insertMenu(SqlSession sqlSession, MenuDTO menu) {

        return  sqlSession.insert("MenuMapper.insertMenu", menu);
    }

    /* 수정 */
    public int uqdateMenu(SqlSession sqlSession, MenuDTO menu) {

        return sqlSession.update("MenuMapper.uqdateMenu", menu);
    }

    /* 삭제 */
    public int deleteMenu(SqlSession sqlSessionm, int menuCode) {

        return sqlSessionm.delete("MenuMapper.deleteMenu", menuCode);
    }
}
