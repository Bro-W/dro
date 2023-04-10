package transfer.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author 王国梁
 * @date 2023/4/4 17:29
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "update bank set money = money+? where user_name = ?";
        jdbcTemplate.update(sql, 100,"jack");
    }

    @Override
    public void reduceMoney() {
        String sql = "update bank set money = money-? where user_name = ?";
        jdbcTemplate.update(sql, 100,"mary");
    }
}
