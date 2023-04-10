package transfer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import transfer.dao.UserDao;

/**
 * @author 王国梁
 * @date 2023/4/4 16:48
 */
@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;

    public void bankMoney(){

            userDao.addMoney();
//            int i = 10/0;
            userDao.reduceMoney();
            System.out.println("执行完成");



    }

}
