package com.yzx.mybatis.sqlsession;

/**
 * @program: day01mybatis
 * @description: 自定义Mybatis中和数据库交互的核心类
 * 它里面可以创建dao接口的代理对象
 * @author: yanzhixian
 * @create: 2020-03-22 15:52
 */
public interface SqlSession {
    /**
     * 根据参数创建一个代理对象
     * @param daoInterfaceClass dao的接口字节码
     * @param <T>
     * @return
     */
    <T> T getMapper(Class<T> daoInterfaceClass);

    /**
     * 释放资源
     */
    void close();
}
