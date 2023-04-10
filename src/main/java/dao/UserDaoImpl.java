package dao;

import org.springframework.stereotype.Service;

/**
 * @author 王国梁
 * @date 2023/3/28 17:13
 */
@Service(value = "userDaoImpl111")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("UserDao实现类add方法！");
    }
}
