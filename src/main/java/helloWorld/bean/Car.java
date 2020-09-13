package helloWorld.bean;

public class Car {
    private String id;
    private Driver driver;

    public void say() {
        System.out.println(this+" driver "+driver);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
