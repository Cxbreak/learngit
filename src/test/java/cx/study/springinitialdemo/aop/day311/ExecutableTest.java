package cx.study.springinitialdemo.aop.day311;

import cx.study.springinitialdemo.aop.day311.advice.Executable;
import cx.study.springinitialdemo.aop.day311.advice.PerformanceMethodInterceptor;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

public class ExecutableTest {

    @Test
    public void execute() {
        Executable executable = new Executable();
        ProxyFactory weaver = new ProxyFactory(executable);
        NameMatchMethodPointcutAdvisor advisor = new NameMatchMethodPointcutAdvisor();
        advisor.setMappedName("execute");
        advisor.setAdvice(new PerformanceMethodInterceptor());
        weaver.addAdvisor(advisor);
        Executable proxy = (Executable) weaver.getProxy();
        proxy.execute();
    }
}