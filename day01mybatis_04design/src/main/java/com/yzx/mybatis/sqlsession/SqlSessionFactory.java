package com.yzx.mybatis.sqlsession;

/**
 * @program: day01mybatis
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-03-22 15:50
 */
public interface SqlSessionFactory {
    /**
     * 用于打开一个新的SqlSession对象
     * @return
     */
    SqlSession openSession();
}
