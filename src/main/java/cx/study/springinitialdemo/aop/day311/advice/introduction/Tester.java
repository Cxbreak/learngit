package cx.study.springinitialdemo.aop.day311.advice.introduction;

public class Tester implements ITester{

    private boolean busyAsTester;

    @Override
    public void testSoftware() {
        System.out.println("working With Tester");
    }

    @Override
    public boolean isBusyAsTester() {
        return busyAsTester;
    }

    public void setBusyAsTester(boolean busyAsTester) {
        this.busyAsTester = busyAsTester;
    }
}
