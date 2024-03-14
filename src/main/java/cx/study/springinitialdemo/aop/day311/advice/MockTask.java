package cx.study.springinitialdemo.aop.day311.advice;


import org.springframework.stereotype.Service;

@Service
public class MockTask implements ITask{
    @Override
    public void execute(String context) {
        System.out.println("context :" + context);
        System.out.println("task execution.");
    }
}
