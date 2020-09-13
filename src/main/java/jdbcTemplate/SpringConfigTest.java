package jdbcTemplate;

import jdbcTemplate.domain.User;
import jdbcTemplate.service.UserService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Random;

public class SpringConfigTest {
    private static final Logger log = LoggerFactory.getLogger(SpringConfigTest.class);

    public static Random random = new Random();

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        UserService userService = context.getBean("userService",UserService.class);

        User user = new User();
        user.setId(random.nextInt());
        user.setName("HOUJJ"+random.nextInt(10));

        userService.add(user);
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        UserService userService = context.getBean("userService",UserService.class);

        int res = userService.selectCount();
        System.out.println(res);
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        UserService userService = context.getBean("userService",UserService.class);

        int res = 1;
        User u = userService.queryUserById(res);
        System.out.println(u);
    }

    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        UserService userService = context.getBean("userService",UserService.class);

        List<User> users = userService.findAllUser();
        System.out.println(users);
    }

    @Test
    public void test5(){
        log.info("测试日志输出");
    }
}
