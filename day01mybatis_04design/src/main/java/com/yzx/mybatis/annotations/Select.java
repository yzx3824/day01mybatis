package com.yzx.mybatis.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: day01mybatis
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-03-22 17:52
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Select {
    /**
     * 配置SQL语句的
     * @return
     */
    String value();
}
