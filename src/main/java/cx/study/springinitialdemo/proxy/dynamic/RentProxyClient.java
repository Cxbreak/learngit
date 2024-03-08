package cx.study.springinitialdemo.proxy.dynamic;

import cx.study.springinitialdemo.proxy.HouseOwner;
import cx.study.springinitialdemo.proxy.IRenter;
import java.lang.reflect.Proxy;

public class RentProxyClient {


    public static void main(String[] args) {
//         Class[] classes = new Class[]{IRenter.class} ;
//
//        Class<? extends Class> aClass = IRenter.class.getClass();

        HouseOwner houseOwner = new HouseOwner();
        IRenter renter = (IRenter)Proxy.newProxyInstance(HouseOwner.class.getClassLoader(), new Class[]{IRenter.class}, new RentProxy(houseOwner));
        renter.rent();
    }
}
