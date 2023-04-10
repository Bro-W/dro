package jdbc.service;

import jdbc.dao.UserDao;
import jdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王国梁
 * @date 2023/3/31 20:26
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void userServiceAdd(User user){
        userDao.add(user);
    }

    public void userServiceAlter(User user){
        userDao.alter(user);
    }

    public int serviceSelect(String table1){

        return userDao.select(table1);
    }

    public User selectAll(int id){
        return userDao.selectAll(id);
    }

    public List<User> findAll(){
        return userDao.findAll();
    }

}
