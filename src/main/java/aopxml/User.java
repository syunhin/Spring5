package aopxml;

import org.springframework.stereotype.Component;

@Component
public class User {
    public void add(String a) {
        System.out.println("user.add()... a: " + a);
//        throw new RuntimeException();
    }
}
