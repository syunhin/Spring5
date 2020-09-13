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
public class AUserProxy {

    //前置通知
//    @Before(value = "execution(* aop.User.add(..))")
//    public void before() {
//        System.out.println("do something before");
//    }
//
//    @After(value = "execution(* aop.User.add(..))")
//    public void after(){
//        System.out.println("do something after");
//    }
//
//    @AfterReturning(value = "execution(* aop.User.add(..))")
//    public void afterReturning(){
//        System.out.println("do something afterReturning");
//    }
//
//    @AfterThrowing(value = "execution(* aop.User.add(..))")
//    public void afterThrowing(){
//        System.out.println("do something AfterThrowing");
//    }
//
//    //环绕通知
//    @Around(value = "execution(* aop.User.add(..))")
//    public void around(ProceedingJoinPoint point) throws Throwable {
//        System.out.println("do something around 1");
//        System.out.println(Arrays.toString(point.getArgs()));
//        //被增强的方法
//        point.proceed();
//
//        System.out.println("do something around 2");
//    }

    //切入点抽取
    @Pointcut(value = "execution(* aopxml.User.add(..))")
    public void pointcut(){

    }

    @Before(value = "pointcut()")
    public void pointCutDemo(){
        System.out.println("proxy before");
    }
}
