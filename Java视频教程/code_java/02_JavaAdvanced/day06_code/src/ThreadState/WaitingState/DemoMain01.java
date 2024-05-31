
/*

    Waiting(无限等待状态)：一个正在无限期等待另一个线程执行一个唤醒动作的线程处于这一状态。如下等待唤醒案例：
线程A先获取到对象锁，随后使用对象锁调用wait()方法进入无限等待状态并且会释放对象锁。此时线程B就会获取到对象锁，
然后使用对象锁调用notify()方法唤醒线程A并且会释放对象锁，线程A被唤醒后如果能获取到对象锁就会进入可运行状态，
反之则会进入锁阻塞状态。

    线程A、B利用同一个对象锁调用wait()、notify()方法实现了这种"等待唤醒机制"。"等待唤醒机制"是线程之间的一种
协作机制，实现了"线程之间的通信"。由此可见：对象锁是线程之间进行通信的媒介，并且wait()、notify()方法必须由同一
个对象锁调用才能实现线程之间的通信。


#.注意事项：

(1).wait()、notify()方法必须要在同步代码块或者同步函数中使用，因为必须要通过对象锁来调用这两个方法

(2).wait()、notify()方法是Object类中的方法。由于Object是所有类的根类，所以任意对象都可以使用这两个方法(所以锁对象可以是任意对象)

(3).多个线程之间的"等待唤醒机制"：具体实现代码见 "DemoMain02"
    可以有多个线程使用同一个对象锁调用wait()方法，相继进入无限等待状态。此时"用来唤醒的线程"使用该对象锁调用notify()方法时，
会随机唤醒其中一个线程，调用notifyAll()方法会唤醒所有线程。
                            void notify()：唤醒在此对象锁上等待的单个线程
                            void notifyAll()：唤醒在此对象锁上等待的所有线程

 */

package ThreadState.WaitingState;

public class DemoMain01 {

    static Object obj = new Object();

    public static void main(String[] args) {

        // 等待线程A
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        try {
                            System.out.println(Thread.currentThread().getName() + "--- 获取到对象锁，调用wait方法，进入waiting状态并释放对象锁");
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + "--- 从waiting状态中醒来，获取到对象锁，进入可运行状态继续执行");
                }
            }
        }, "等待线程").start();

        // 唤醒线程B
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println(Thread.currentThread().getName() + "--- 等待3秒钟");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + "--- 获取到对象锁，调用notify方法，唤醒线程A并释放对象锁");
                        obj.notify();
                    }
                }
            }
        }, "唤醒线程").start();

    }
}
