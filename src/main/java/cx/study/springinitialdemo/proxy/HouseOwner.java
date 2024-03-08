package cx.study.springinitialdemo.proxy;

public class HouseOwner implements IRenter{
    @Override
    public void rent() {
        System.out.println("有一套房子挂牌$200出租");
    }
}
