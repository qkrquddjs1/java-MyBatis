package com.ohgiraffers.section01.common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class a {

    private static SqlSessionFactory sqlSessionFactory;
    public static SqlSession getSqlSession() {

        if (sqlSessionFactory == null) {
            String resources = "mybatis-config.xml";

            try {
                InputStream inputStream = Resources.getResourceAsStream(resources);
                SqlSessionFactory SqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return sqlSessionFactory.openSession(false);
    }
}
