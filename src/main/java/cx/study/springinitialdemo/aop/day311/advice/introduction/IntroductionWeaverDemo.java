package cx.study.springinitialdemo.aop.day311.advice.introduction;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class IntroductionWeaverDemo {


    public static void main2(String[] args) {

        ProxyFactory weaver = new ProxyFactory(new Developer());
        Tester tester = new Tester();
        tester.setBusyAsTester(true);
        weaver.setProxyTargetClass(true);
        weaver.setInterfaces(IDeveloper.class, ITester.class);
//        TesterFeatureIntroductionInterceptor advice = new TesterFeatureIntroductionInterceptor();
        DelegatingIntroductionInterceptor advice = new DelegatingIntroductionInterceptor(tester);
//        advice.setBusyAsTester(true);
        weaver.addAdvice(advice);
        Object proxy = weaver.getProxy();
        ((IDeveloper)proxy).developSoftware();
        ((ITester)proxy).isBusyAsTester();
    }


    public static void main(String[] args) {

        ProxyFactory weaver = new ProxyFactory(new Developer());
        Tester tester = new Tester();
        tester.setBusyAsTester(true);
        weaver.setProxyTargetClass(true);
        weaver.setInterfaces(IDeveloper.class, ITester.class);
//        TesterFeatureIntroductionInterceptor advice = new TesterFeatureIntroductionInterceptor();
        DelegatingIntroductionInterceptor advice = new DelegatingIntroductionInterceptor(tester);
//        advice.setBusyAsTester(true);
        weaver.addAdvice(advice);
        Object proxy = weaver.getProxy();
        ((IDeveloper)proxy).developSoftware();
        ((ITester)proxy).isBusyAsTester();
    }
}
