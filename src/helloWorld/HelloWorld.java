package helloWorld;

import helloWorld.bean.Car;
import helloWorld.bean.Driver;
import helloWorld.bean.Lift;
import helloWorld.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloWorld {

    @Test
    public void testSay(){

        ApplicationContext context2 = new ClassPathXmlApplicationContext("helloWorld/bean2.xml");
        Lift lift = context2.getBean("lift", Lift.class);
        System.out.println("第四步 获取了bean对象");
        ((ClassPathXmlApplicationContext)context2).close();

        //加载spring配置文件
        //ApplicationContext context = new ClassPathXmlApplicationContext("classpath:helloWorld/bean1.xml");

        //ApplicationContext context2 = new FileSystemXmlApplicationContext("classpath:helloWorld/bean1.xml");
        //获取配置创建的对象

//        User user = context.getBean("user", User.class);
//
//        System.out.println(user);
//        user.say();

//        ApplicationContext context2 = new ClassPathXmlApplicationContext("helloWorld/bean1.xml");
//        Driver driver = context2.getBean("driver",Driver.class);
//        driver.say();

//        Car car = context2.getBean("car",Car.class);
//        car.say();
    }

    public static void main(String[] args) {
        System.out.println("helloWorld");
    }
}
