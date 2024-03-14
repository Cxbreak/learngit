package cx.study.springinitialdemo.aop.day311;

import org.aopalliance.aop.Advice;

public interface DynamicIntroductionAdvice extends Advice {

    Boolean implementsInterface(Class intf);


}
