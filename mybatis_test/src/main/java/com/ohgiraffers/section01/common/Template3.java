package com.ohgiraffers.section01.common;

import com.mysql.cj.protocol.ReadAheadInputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;

public class Template3 {
    private static SqlSessionFactory SqlSessionFactiory;
    public static SqlSession getSqlSession() {

        if (SqlSessionFactiory == null){
            String resources = "mybatis-config.xml";

            try {
                InputStream inputStream = Resources.getResourceAsStream(resources);
                SqlSessionFactiory  = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return SqlSessionFactiory.openSession(false );
    }

}
