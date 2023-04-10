package com.aop;

/**
 * @author 王国梁
 * @date 2023/3/31 17:00
 */
public class UserDaoImpl implements UserDao{

    @Override
    public int add(int a, int b) {
        System.out.println("正在执行UserDaoImpl的add方法！！！");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("正在执行UserDaoImpl的update方法！！！");
        return id;
    }
}
