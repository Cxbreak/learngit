package cx.study.springinitialdemo.aop.day311.advice;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

public class AopWeaveDemo {


    public static void main(String[] args) {
        // targetObject
        MockTask mockTask = new MockTask();
        // 代理对象
        ProxyFactory weaver = new ProxyFactory(mockTask);
        // aspect
        NameMatchMethodPointcutAdvisor advisor = new NameMatchMethodPointcutAdvisor();
        // pointcut
        advisor.setMappedName("execute");
        // advice
        advisor.setAdvice(new PerformanceMethodInterceptor());
        // 织入
        weaver.addAdvisor(advisor);
        ITask proxy = (ITask) weaver.getProxy();
        proxy.execute("cuix");
    }
}
