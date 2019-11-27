package com.util;

import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;

public class MapperFactory2 {
    //现在的写法是有bug的，因为sqlSession没有关闭，是必须关闭的
    public static <T> T generateMapper(Class<? extends T> clz){
        SqlSession session = SqlSessionHelper.getSqlSession();
        return session.getMapper(clz);
    }
}
