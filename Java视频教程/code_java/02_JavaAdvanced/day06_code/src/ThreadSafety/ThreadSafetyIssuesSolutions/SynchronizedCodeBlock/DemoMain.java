package ThreadSafety.ThreadSafetyIssuesSolutions.SynchronizedCodeBlock;

public class DemoMain {
    public static void main(String[] args) {

        RunnableImpl r = new RunnableImpl();

        // 创建三个线程代表三个售票窗口在同时卖票
        Thread t1 = new Thread(r, "线程1");
        Thread t2 = new Thread(r, "线程2");
        Thread t3 = new Thread(r, "线程3");

        // 同时开启三个线程，执行run方法中的卖票任务
        t1.start();
        t2.start();
        t3.start();

    }
}


