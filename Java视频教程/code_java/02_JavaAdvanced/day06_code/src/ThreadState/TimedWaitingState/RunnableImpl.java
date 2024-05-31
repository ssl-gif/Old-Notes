
/*

    Timed Waiting(计时等待状态)：一个正在限时等待、或者等待另一个线程执行唤醒动作的线程处于这一状态。我们在卖票的案例中，
为了提高线程安全问题出现的概率，使用sleep()方法让当前正在执行的线程休眠(暂停线程)。当我们调用了sleep()方法后，线程就进入
了Timed Waiting(计时等待状态)，等待时间结束后，如果线程能获取到对象锁就会进入可运行状态，反之则会进入锁阻塞状态。

#.使用Object类中带参的wait()方法也可使线程进入计时等待状态。同sleep()方法一样，wait()方法计时结束后，线程就会进入可运行、
锁阻塞状态。但是wait(参数)方法还有以下额外用途：

    若wait()方法时间未结束，其他线程可以调用Object类中的notify()方法将其从计时等待状态唤醒进入可运行、锁阻塞状态，形成
"等待唤醒机制"。具体实现原理与代码，和无限等待状态中的"等待唤醒案例"一样，区别在于：
    进入无限等待状态的线程必须要被其他线程唤醒才能醒来，但是使用wait(参数)方法进入计时等待状态的线程，当计时结束后会自动
醒来，而且计时未结束时也可以被其他线程唤醒。

 */
package ThreadState.TimedWaitingState;

public class RunnableImpl implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
                // new Object().wait(1000); 使用wait(参数)方法使线程进入计时等待状态
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

}
