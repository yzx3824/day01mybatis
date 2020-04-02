package com.yzx.mybatis.sqlsession;

import com.yzx.mybatis.cfg.Configuration;
import com.yzx.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import com.yzx.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * @program: day01mybatis
 * @description: 用于创建一个SqlSessionFactory对象
 * @author: yanzhixian
 * @create: 2020-03-22 15:48
 */
public class SqlSessionFactoryBuilder {

    /**
     * 根据参数的字节输入流来构建一个SqlSessionFactory工厂
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config) {
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return  new DefaultSqlSessionFactory(cfg);
    }
}
