package 代理.三要素;

public class AaFactory implements ManToolsFactory{
    @Override
    public void saleManTools(String size) {
        System.out.println("根据您的需求，为您准备了size为"+ size+ "的衣服");
    }
}
