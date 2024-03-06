package cx.study.springinitialdemo.event;

import java.util.EventObject;

public class CustomEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public CustomEvent(Object source) {
        super(source);
    }



    private String methodName;

    public String getMethodName(){
        return this.methodName;
    }

    public void setMethodName(String methodName){
        this.methodName = methodName;
    }
}
