package com.yzx.mybatis.sqlsession.defaults;

import com.yzx.mybatis.cfg.Configuration;
import com.yzx.mybatis.sqlsession.SqlSession;
import com.yzx.mybatis.sqlsession.SqlSessionFactory;

/**
 * @program: day01mybatis
 * @description: SqlSessionFactory接口的实现类
 * @author: yanzhixian
 * @create: 2020-03-22 16:22
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg){
        this.cfg = cfg;
    }

    /**
     * 用于创建一个新的操作数据库对象
     * @return
     */
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
