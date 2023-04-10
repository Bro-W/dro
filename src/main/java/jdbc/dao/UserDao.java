package jdbc.dao;

import jdbc.entity.User;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

/**
 * @author 王国梁
 * @date 2023/3/31 20:26
 */
public interface UserDao {
    void add(User user);

    void alter(User user);

    int select(String table1);

    User selectAll(int id);

    List<User> findAll();
}
