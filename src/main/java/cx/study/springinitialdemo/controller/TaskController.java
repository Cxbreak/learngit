package cx.study.springinitialdemo.controller;


import cx.study.springinitialdemo.aop.day311.advice.ITask;
import cx.study.springinitialdemo.aop.day311.advice.MockTask;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {


    private final MockTask mockTask;
    private final ApplicationContext applicationContext;

    public TaskController(MockTask mockTask, ApplicationContext applicationContext) {
        this.mockTask = mockTask;
        this.applicationContext = applicationContext;
    }

    @RequestMapping("/exe")
    public String execute(){
        // 这里强制转化为ITask而不是ProxyFactoryBean，是因为FactoryBean会返回FactoryBean.getObject()，也即是原接口类型的代理对象，而不是本身
        ITask taskProxy = (ITask) applicationContext.getBean("taskProxy");
        taskProxy.execute("cui_cui_proxy");
        mockTask.execute("cui_cui");
        return "task";
    }
}
