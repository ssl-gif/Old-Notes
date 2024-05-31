
/*

使用Lock锁解决线程安全问题：

    java.util.concurrent.locks.Lock接口中提供了操作锁的方法，java.util.concurrent.locks.ReentrantLock是Lock接口的一个实现类
    void lock()：获取锁
    void unlock()：释放锁

1.在成员位置创建一个ReentrantLock对象
2.在可能会出现安全问题的代码前，调用lock()方法获取锁
3.在可能会出现安全问题的代码后，调用unlock()方法释放锁

#.注意事项：有时异常会引起程序的跳转，导致不能及时地释放锁。所以我们一般将unlock方法调用放在finally代码块中，这样无论程序是否异常，都会释放锁

 */
package ThreadSafety.ThreadSafetyIssuesSolutions.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable {

    // 定义一个多线程共享的票源
    private int ticket = 100;

    // 在成员位置创建一个ReentrantLock对象，形成多态
    Lock l = new ReentrantLock();

    // 设置卖票的线程任务
    @Override
    public void run() {
        while (true) {

            // 获取锁
            l.lock();

            if (ticket > 0) {
                try {
                    Thread.sleep(1000); // 睡眠线程，提高线程安全问题出现的概率
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                ticket--;
            }

            // 释放锁
            l.unlock();

        }
    }

    // 将unlock方法调用放在finally代码块中
    /*public void run() {
        while (true) {
            // 获取锁
            l.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(1000); // 睡眠线程，提高线程安全问题出现的概率
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // 释放锁
                    l.unlock();
                }
            }
        }
    }*/

}


