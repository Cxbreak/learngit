package cx.study.springinitialdemo.proxy.dynamic;

import cx.study.springinitialdemo.proxy.IRenter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RentProxy implements InvocationHandler {


    /**
     * 注入IRenter，则表示只能实现IRenter子类方法增强，访问控制
     * 注入Object，则可以代理继承了其他接口的实现类
     */
    private IRenter renter;

    public RentProxy(IRenter renter) {
        this.renter = renter;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name = IRenter.class.getMethods()[0].getName();
        if(method.getName().equals(name)){
            System.out.println("帮找房子");
            method.invoke(renter, args);
            System.out.println("出租成功，挣$50");
        }
        return null;
    }

    public IRenter getRenter() {
        return renter;
    }

    public void setRenter(IRenter renter) {
        this.renter = renter;
    }
}
