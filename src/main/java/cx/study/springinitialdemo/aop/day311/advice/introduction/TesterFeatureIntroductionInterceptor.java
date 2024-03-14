package cx.study.springinitialdemo.aop.day311.advice.introduction;

import org.aopalliance.intercept.MethodInvocation;
import org.apache.rocketmq.shaded.commons.lang3.StringUtils;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class TesterFeatureIntroductionInterceptor extends DelegatingIntroductionInterceptor implements ITester {

    private boolean isBusyAsTester;


    public Object invoke(MethodInvocation mi) throws Throwable {
        if(isBusyAsTester() && StringUtils.contains(mi.getMethod().getName(), "developSoftware")){
            throw new RuntimeException("你想累死我呀");
        }
        return super.invoke(mi);
    }


    @Override
    public boolean isBusyAsTester() {
        return isBusyAsTester;
    }

    @Override
    public void testSoftware() {
        System.out.println("I will ensure the quality");
    }

    public void setBusyAsTester(boolean busyAsTester) {
        isBusyAsTester = busyAsTester;
    }
}
