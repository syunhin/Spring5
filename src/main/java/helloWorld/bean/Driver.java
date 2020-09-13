package helloWorld.bean;

import java.util.List;

public class Driver {
    private String userName;
    private List<Car> cars;

    public void say() {
        System.out.println(userName + " had "+cars);
    }

    public Driver(String userName) {
        this.userName = userName;
    }

    public Driver() {
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "userName='" + userName + '\'' +
                ", cars=" + cars +
                '}';
    }
}
