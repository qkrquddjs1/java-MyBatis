package com.ohgiraffers.section01.common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.io.InputStream;

public class b {
    private static SqlSessionFactory sqlSessionFactory;
    public static SqlSession getSqlSession() {

        if(sqlSessionFactory == null) {
            String resources = "mybatis-config.xml";

            try {
                InputStream inputStream = Resources.getResourceAsStream(resources);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
