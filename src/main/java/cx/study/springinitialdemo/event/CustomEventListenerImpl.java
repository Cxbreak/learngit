package cx.study.springinitialdemo.event;


import org.springframework.stereotype.Service;

@Service
public class CustomEventListenerImpl implements CustomEventListener {
    @Override
    public void doEventBegin(CustomEvent event) {
        System.out.println("event begin"+event.getMethodName());
        // do something
    }

    @Override
    public void doEventEnd(CustomEvent event) {
        // do something
        System.out.println("event end"+ event.getMethodName());
    }


//    for(bean in IocContainer){
//        if(是否符合拦截条件){
//            Object proxy = createProxyFor(bean);
//            return proxy;
//        }else {
//            Object instance = createInstance(bean);
//            return instance;
//        }
//    }
}
