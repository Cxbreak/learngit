package cx.study.springinitialdemo.aop.day311;

import org.aopalliance.aop.Advice;
import org.springframework.aop.DynamicIntroductionAdvice;
import org.springframework.aop.framework.AopProxyFactory;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;
import org.springframework.cglib.proxy.MethodInterceptor;

public interface IntroductionInterceptor extends MethodInterceptor, DynamicIntroductionAdvice {

}



