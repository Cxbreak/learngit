package cx.study.springinitialdemo.proxy.cglib;

import cx.study.springinitialdemo.proxy.HouseOwner;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibRentProxy implements MethodInterceptor {

    private HouseOwner houseOwner;

    public CglibRentProxy(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if(method.getName().equals("rent")){
            System.out.println("cglib找房");
            methodProxy.invokeSuper(o,objects );
            System.out.println("cglib租房代理收取$50手续费");
        }
        return null;
    }

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }
}
