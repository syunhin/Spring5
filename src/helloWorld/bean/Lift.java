package helloWorld.bean;

public class Lift {
    private String name;
    private Car car;


//    public Lift(Car car) {
//        this.car = car;
//    }

    public Lift(Car car) {
        this.car = car;
        System.out.println("第一步 执行了构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二步 调用set方法设置属性的值");
    }

    public void initMethod(){
        System.out.println("第三步 执行初始化的方法");
    }

    public void destroyMethod(){
        System.out.println("第五步 执行销毁的方法");
    }
}
