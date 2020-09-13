package 代理.三要素;

public class Lison implements ManToolsFactory{

    public ManToolsFactory factory;

    public Lison(ManToolsFactory factory) {
        this.factory = factory;
    }

    @Override
    public void saleManTools(String size) {
//        dosomething();//前置增强
        factory.saleManTools(size);
//        dosomething();//后置增强
    }
}
