package cx.study.springinitialdemo.event;

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
}
