package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//增强类
@Component
@Aspect
@Order(1)
public class UserProxy2 {

    //切入点抽取
    @Pointcut(value = "execution(* aop.User.add(..))")
    public void pointcut(){

    }

    @Before(value = "pointcut()")
    public void pointCutDemo(){
        System.out.println("proxy2 before");
    }
}
