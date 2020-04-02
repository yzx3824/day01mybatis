package com.yzx.dao;

import com.yzx.domain.User;

import java.util.List;

/**
 * @program: day01mybatis
 * @description: 用户的持久层接口
 * @author: yanzhixian
 * @create: 2020-03-18 21:48
 */
public interface IUserDao {
    List<User> findAll();
}
