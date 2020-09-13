package jdbcTemplate.service;

import jdbcTemplate.dao.UserDao;
import jdbcTemplate.domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional()
public class UserService {
    @Resource
    private UserDao userDao;

    public void add(User user){
        userDao.add(user);
    }

    public int selectCount(){
        return userDao.selectCount();
    }

    public User queryUserById(int id){
        return userDao.findUserById(id);
    }

    public List<User> findAllUser() {
        return userDao.findAllUser();
    }
}
