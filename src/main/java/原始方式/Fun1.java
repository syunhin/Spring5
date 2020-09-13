package 原始方式;

public class Fun1 {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        userDao.add();

        UserDao userDao1 = UserFactory.getUserDao();
        userDao1.add();
    }
}

class UserDao{
    public void add(){
        System.out.println("add a user...");
    }
}

class UserFactory{
    public static UserDao getUserDao(){
        return new UserDao();
    }
}
