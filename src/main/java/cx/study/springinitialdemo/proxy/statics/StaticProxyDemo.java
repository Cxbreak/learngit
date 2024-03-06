package cx.study.springinitialdemo.proxy.statics;

import cx.study.springinitialdemo.proxy.SubjectImpl;

public class StaticProxyDemo {


    public static void main(String[] args) {
        new SubjectProxy(new SubjectImpl()).request();
    }
}
