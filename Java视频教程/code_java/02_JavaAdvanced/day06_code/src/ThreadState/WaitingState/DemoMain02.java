
/*

多个线程之间的"等待唤醒机制"：
    假设线程A先获取到对象锁，那么线程B、C...就处于锁阻塞状态。线程A调用wait()方法进入无限等待状态并释放对象锁，
此时线程B、C...就能获取到对象锁，再调用wait()方法进入无限等待状态并释放对象锁。等到线程X获取到对象锁时，调用
notifyAll()方法会唤醒所有线程，同时会释放对象锁再由线程A、B、C...去竞争获取，如此往复下去。

 */
package ThreadState.WaitingState;

public class DemoMain02 {

    static Object obj = new Object();

    public static void main(String[] args) {

        // 等待线程A
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        try {
                            System.out.println(Thread.currentThread().getName() + "--- 获取到锁对象，调用wait方法，进入waiting状态并释放锁对象");
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + "--- 从waiting状态中醒来，获取到锁对象，进入可运行状态继续执行");
                }
            }
        }, "等待线程1").start();

        // 等待线程B
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        try {
                            System.out.println(Thread.currentThread().getName() + "--- 获取到锁对象，调用wait方法，进入waiting状态并释放锁对象");
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + "--- 从waiting状态中醒来，获取到锁对象，进入可运行状态继续执行");
                }
            }
        }, "等待线程2").start();

        // 等待线程C、D ......可以有很多在此对象锁上进入无限等待状态的线程

        // 唤醒线程X
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
                        System.out.println(Thread.currentThread().getName() + "--- 获取到锁对象，调用notify方法，唤醒线程A并释放锁对象");
                        // obj.notify(); 会随机唤醒一个在此对象锁上进入无限等待状态的线程
                        obj.notifyAll(); // 会唤醒所有在此对象锁上进入无限等待状态的线程
                    }
                }
            }
        }, "唤醒线程").start();

    }
}
