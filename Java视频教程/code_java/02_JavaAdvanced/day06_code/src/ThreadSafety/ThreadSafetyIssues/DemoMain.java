
/*

线程安全问题案例：模拟电影院售票

    由于是同一个实现类对象r调用的run方法，所以run方法中的ticket是对象r的属性："r.ticket"。所以三个线程
在共享同一份数据 "r.ticket"，而且这三个线程是并发执行的，所以会出现"卖出重复的票"、"卖出不存在的票"的情
况，产生"此共享数据的线程不安全问题"。

    线程安全问题都是由全局变量引起的。若每个线程对全局变量只有读的操作，而无写的操作，一般来说，这个全局
变量是线程安全的。但是若有多个线程同时执行写的操作，一般都需要考虑线程同步，否则的话就可能影响线程安全。

 */


package ThreadSafety.ThreadSafetyIssues;

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


