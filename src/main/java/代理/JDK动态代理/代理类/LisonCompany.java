package 代理.JDK动态代理.代理类;

import 代理.三要素.AaFactory;
import 代理.三要素.ManToolsFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LisonCompany {


    public static void main(String[] args) {

        final Object com2 = new AaFactory();
        ManToolsFactory lison1 = (ManToolsFactory) Proxy.newProxyInstance(com2.getClass().getClassLoader(),com2.getClass().getInterfaces(),new InvocationHandler(){
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                doBefore();
                Object re = method.invoke(com2,args);
                doAfter();
                return re;
            }
            private void doAfter() {
                System.out.println("在之后做些什么");
            }

            private void doBefore() {
                System.out.println("在之前做些什么");
            }

        });
        lison1.saleManTools("10");
    }
}
