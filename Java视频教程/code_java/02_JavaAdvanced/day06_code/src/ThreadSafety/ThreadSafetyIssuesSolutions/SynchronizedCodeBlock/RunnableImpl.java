
/*

使用同步代码块解决线程安全问题，格式如下：

                            synchronized(锁对象){
                                可能会出现线程安全问题的代码(访问了共享数据的代码)
                            }

同步机制的原理：
    假设线程t1先抢夺到CPU的执行权开始执行run方法，此时会检查synchronized代码块是否有锁对象，发现有，则获取到
锁对象obj，进入同步代码块中执行。如果在线程t1执行同步代码块的过程中，线程t2抢夺到了CPU的执行权开始执行run方法，
此时也会检查同步代码块是否有锁对象，发现没有，则进入阻塞状态，会一直等待t1执行完同步代码块归还锁对象，t2才能获
取到锁对象进入到代码块中执行。
    同步中的线程没有执行完毕不会释放锁对象，同步外的线程没有锁对象进不去同步代码块。所以任意时刻只能有一个线程
在访问共享数据，保证了共享数据的线程安全。

#.注意事项：

(1).同步代码块中的锁对象，可以使用任意的对象

(2).但是必须保证多个线程使用的锁对象是同一个，不然无法实现同步机制。例如：将 Object obj = new Object();
放在run()方法内部，则无法保证线程之间的数据同步。

(3).程序频繁的判断、获取、释放锁，程序的效率会降低

 */
package ThreadSafety.ThreadSafetyIssuesSolutions.SynchronizedCodeBlock;

public class RunnableImpl implements Runnable {

    // 定义一个多线程共享的票源
    private int ticket = 100;

    // 创建一个锁对象
    Object obj = new Object();

    // 设置卖票的线程任务
    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
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
}


