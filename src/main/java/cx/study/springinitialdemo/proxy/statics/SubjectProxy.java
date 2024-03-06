package cx.study.springinitialdemo.proxy.statics;

import cx.study.springinitialdemo.proxy.ISubject;
import org.apache.rocketmq.shaded.com.google.type.TimeOfDay;

import java.time.LocalDateTime;
import java.time.LocalTime;


public class SubjectProxy implements ISubject {

    private ISubject subject;

    public SubjectProxy(ISubject subject) {
        this.subject = subject;
    }

    public ISubject getSubject() {
        return subject;
    }

    public void setSubject(ISubject subject) {
        this.subject = subject;
    }
    @Override
    public void request() {
        LocalTime now = LocalTime.now();
        LocalTime start = LocalTime.of(0, 0, 0);
        LocalTime end = LocalTime.of(6, 59, 59);
        if(now.isBefore(start) || now.isAfter(end)){
            System.out.println("time invalid");
            return;
        }
        subject.request();
    }
}
