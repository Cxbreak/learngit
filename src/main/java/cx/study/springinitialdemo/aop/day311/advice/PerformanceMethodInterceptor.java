package cx.study.springinitialdemo.aop.day311.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.rocketmq.shaded.commons.lang3.time.StopWatch;

import java.util.Date;

public class PerformanceMethodInterceptor implements MethodInterceptor {

    private final static Log log = LogFactory.getLog(PerformanceMethodInterceptor.class);

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        StopWatch watch = new StopWatch();
        try{
            System.out.println("current time" + new Date());
            watch.start();
            return methodInvocation.proceed();
        }
        finally{
            watch.stop();
            if(log.isInfoEnabled()){
                log.info(watch.toString());
            }
        }
    }
}
