package service;

import dao.UserDao;
import org.springframework.stereotype.Service;

/**
 * @author 王国梁
 * @date 2023/3/28 17:15
 */
@Service
public class UserService {
    public UserDao userDao;
    public void add(){
        System.out.println("UserService的add方法！");
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
