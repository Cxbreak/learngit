package cx.study.springinitialdemo.proxy;

public class SubjectImpl implements ISubject{
    @Override
    public void request() {
        System.out.println("request is execution");
    }
}
