package aopxml;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强类
@Component
@Aspect
@Order(1)
public class UserProxy2 {

    //切入点抽取
    @Pointcut(value = "execution(* aopxml.User.add(..))")
    public void pointcut(){

    }

    @Before(value = "pointcut()")
    public void pointCutDemo(){
        System.out.println("proxy2 before");
    }
}
