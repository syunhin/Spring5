package helloWorld.bean;

public class User {
    private String userName;

    public void say() {
        System.out.println(userName + " hello!");
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User() {
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
