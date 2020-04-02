package com.yzx.dao.impl;

import com.yzx.dao.IUserDao;
import com.yzx.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @program: day01mybatis
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-03-22 10:59
 */
public class UserDaoImpl implements IUserDao {
    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory factory){
        this.factory = factory;
    }


    public List<User> findAll(){
        //1.使用工厂创建SqlSession对象
        SqlSession session = factory.openSession();
        //2.使用session执行查询所有方法
        List<User> users = session.selectList("com.yzx.dao.IUserDao.findAll");
        session.close();
        //3.返回查询结果
        return users;
    }
}
