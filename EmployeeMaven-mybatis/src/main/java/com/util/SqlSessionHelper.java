package com.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionHelper {
    private final static String RESOURCE = "mybatis-config.xml";
    private static SqlSessionFactory factory = null;

    static {
        try {
            InputStream inputStream = Resources.getResourceAsStream(RESOURCE);
            factory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("读取文件失败",e);
        }
    }

    public static SqlSessionFactory getFactory(){
        return factory;
    }

    public static SqlSession getSqlSession(){
        return factory.openSession(true);
    }

}
