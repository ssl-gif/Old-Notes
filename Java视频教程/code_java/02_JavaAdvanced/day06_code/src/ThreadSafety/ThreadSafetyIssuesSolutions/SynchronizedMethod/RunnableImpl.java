
/*

使用同步方法解决线程安全问题：

先把同步代码块放到一个方法中，调用该方法执行同步代码块：

                        修饰符 返回值类型 方法名(参数列表){
                            synchronized(this){
                                可能会出现线程安全问题的代码(访问了共享数据的代码)
                            }
                        }

以上代码可以使用一个被synchronized修饰的同步方法来代替：

                        修饰符 synchronized 返回值类型 方法名(参数列表){
                            可能会出现线程安全问题的代码(访问了共享数据的代码)
                        }

所以同步方法本质上还是一个SynchronizedCodeBlock，同步方法会把方法内部的代码锁住，只让一个线程执行。

#.注意事项：

(1).同步方法的锁对象是this，即谁调用这个方法谁就是该同步方法的锁对象(实现类对象r)

(2).静态的同步方法也可以实现同步机制，但是此时ticket属性也必须是静态的，因为静态不能访问本类的非静态内容。
    因为静态方法中不能使用this，所以静态同步方法的锁对象不能是this，其锁对象是本类的class属性(反射)

 */
package ThreadSafety.ThreadSafetyIssuesSolutions.SynchronizedMethod;

public class RunnableImpl implements Runnable {

    // 定义一个多线程共享的票源
    private static int ticket = 100;

    // 设置卖票的线程任务
    @Override
    public void run() {
        while (true) {
            sellTicket02();
        }
    }

    // 把同步代码块放到一个方法中
    public void sellTicket01() {
        synchronized (this) {
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

    // 使用同步方法
    public synchronized void sellTicket02() {
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

    // 把同步代码块放到一个静态方法中
    public static void sellTicket03() {
        synchronized (RunnableImpl.class) {
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

    // 使用同步静态方法
    public static synchronized void sellTicket04() {
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


