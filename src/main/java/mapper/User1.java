package mapper;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author 王国梁
 * @date 2023/3/30 11:45
 */
@Component
public class User1 {
    @Autowired
    @Qualifier(value = "userDaoImpl111")
    private UserDao userDao;
    public void add(){
        System.out.println("mapper User1 add方法！！！");
    }

    public UserDao getUserDao() {
        return userDao;
    }
}
