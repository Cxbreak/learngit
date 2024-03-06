package cx.study.springinitialdemo.event;

import java.util.EventListener;

public interface CustomEventListener extends EventListener {

    void doEventBegin(CustomEvent event);

    void doEventEnd(CustomEvent event);
}
