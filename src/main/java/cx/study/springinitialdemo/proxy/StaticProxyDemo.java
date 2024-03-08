package cx.study.springinitialdemo.proxy;

public class StaticProxyDemo {


    public static void main(String[] args) {
        new RentHouseProxy(new HouseOwner()).rent();
    }
}
