package jdbcTemplate.dao;

import jdbcTemplate.domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public void add(User user) {
        String sql = "insert into user1 values(?,?)";
        int res = jdbcTemplate.update(sql, user.getId(), user.getName());
        System.out.println(res);
        throw new RuntimeException();
    }

    public int selectCount() {
        String sql = "select count(*) from user1";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    public User findUserById(int id) {
        String sql = "select * from user1 where id = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
        return user;
    }

    public List<User> findAllUser() {
        String sql = "select * from user1";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<User>(User.class));
    }
}
