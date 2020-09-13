package helloWorld.bean;

import helloWorld.bean.interfaceTest.InterfaceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("componentTest")
public class ComponentTest {

//    @Autowired
//    @Qualifier(value = "interfaceImpl2")
//    private InterfaceTest interfaceTest;

    @Resource(name = "interfaceImpl2")
    private InterfaceTest interfaceTest;
    
    @Value("abc")
    private String string;
    
    public void say() {
        System.out.println(this);
        interfaceTest.say();
    }

    @Override
    public String toString() {
        return "ComponentTest{" +
                "string='" + string + '\'' +
                '}';
    }

    //    @Autowired
//    public ComponentTest(InterfaceTest interfaceTest) {
//        this.interfaceTest = interfaceTest;
//    }


//    @Autowired
//    public void setInterfaceTest(InterfaceTest interfaceTest) {
//        this.interfaceTest = interfaceTest;
//    }
}
