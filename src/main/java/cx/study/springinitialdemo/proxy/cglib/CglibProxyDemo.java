package cx.study.springinitialdemo.proxy.cglib;

import cx.study.springinitialdemo.proxy.HouseOwner;
import org.springframework.cglib.proxy.Enhancer;

public class CglibProxyDemo {


    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HouseOwner.class);
        enhancer.setCallback(new CglibRentProxy(new HouseOwner()));

        HouseOwner houseOwner = (HouseOwner) enhancer.create();
        houseOwner.rent();
    }
}
