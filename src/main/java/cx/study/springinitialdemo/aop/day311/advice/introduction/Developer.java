package cx.study.springinitialdemo.aop.day311.advice.introduction;

public class Developer implements IDeveloper{

    private String name;
    @Override
    public void developSoftware() {
        System.out.println("working with developer");
    }
}
