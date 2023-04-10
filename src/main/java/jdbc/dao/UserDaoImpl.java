package jdbc.dao;

import jdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 王国梁
 * @date 2023/3/31 20:27
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void add(User user){
        String sql1="insert into t_user values(?,?,?)";
        Object[] args = {user.getUserId(),user.getUserName(),user.getUstatus()};
        int update = jdbcTemplate.update(sql1, args);
        System.out.println("影响行数为：" + update);
    }

    @Override
    public void alter(User user) {
        String sql = "update t_user set username = ? , ustatus = ? where user_Id = ?";
        Object[] args = {user.getUserName(),user.getUstatus(),user.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println("影响行数："+ update);
    }

    @Override
    public int select(String table1) {
        String sql = "select count(*) from " + table1;
        return jdbcTemplate.queryForObject(sql,Integer.class);

    }

    @Override
    public User selectAll(int id) {
        String sql = "select * from t_user where user_id = ?";

        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class),id);
    }

    @Override
    public List<User> findAll() {
        String sql = "select * from t_user";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));

    }

}
