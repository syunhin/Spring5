package helloWorld.bean.interfaceTest.impl;

import helloWorld.bean.interfaceTest.InterfaceTest;
import org.springframework.stereotype.Repository;

@Repository
public class InterfaceImpl2 implements InterfaceTest {
    @Override
    public void say() {
        System.out.println("I am a InterfaceImpl2");
    }
}
