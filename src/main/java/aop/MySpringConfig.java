package aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan(basePackages = {"aop"})
@EnableAspectJAutoProxy
public class MySpringConfig {

    @Test
    public void test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfig.class);
        User user = context.getBean("user",User.class);
        user.add("A");
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        User user = context.getBean("user",User.class);
        user.add("A");
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        User user = context.getBean("user",User.class);
        user.add("A");
    }

}
