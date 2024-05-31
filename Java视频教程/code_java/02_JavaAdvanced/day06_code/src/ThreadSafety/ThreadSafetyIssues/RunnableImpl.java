package ThreadSafety.ThreadSafetyIssues;

public class RunnableImpl implements Runnable {

    // 定义一个多线程共享的票源
    private int ticket = 100;

    // 设置卖票的线程任务
    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                try {
                    Thread.sleep(1000); // 睡眠线程，提高线程安全问题出现的概率
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
}


