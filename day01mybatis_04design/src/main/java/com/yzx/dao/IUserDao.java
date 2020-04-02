package com.yzx.dao;

import com.yzx.domain.User;
import com.yzx.mybatis.annotations.Select;

import java.util.List;

/**
 * @program: day01mybatis
 * @description: 用户的持久层接口
 * @author: yanzhixian
 * @create: 2020-03-18 21:48
 */
public interface IUserDao {
    @Select("select * from user")
    List<User> findAll();
}
