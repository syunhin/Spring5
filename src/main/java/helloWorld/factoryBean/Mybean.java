package helloWorld.factoryBean;

import helloWorld.bean.User;
import org.springframework.beans.factory.FactoryBean;

public class Mybean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setUserName("sunxuan");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
