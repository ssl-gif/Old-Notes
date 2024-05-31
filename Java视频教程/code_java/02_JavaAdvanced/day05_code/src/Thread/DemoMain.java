
/*

    Java使用 java.lang.Thread 类代表线程，所有的线程对象都必须是Thread类或其子类的实例。即如果我们想在Java
程序中使用多线程，可以定义一个线程类来继承Thread类，通过new这个线程类的对象来创建一个线程实例。在Java中通过继
承Thread类来创建并启动一个线程的步骤如下：

1.定义一个Thread类的子类，并重写Thread类的run()方法，设置线程任务(即开启这个线程是用来做什么的，又叫线程执行体)
2.创建Thread类的子类对象，通过子类对象调用Thread类中的start()方法，启动线程。

    我们在main方法中，使用start()方法启动一个线程后，线程myThread会调用run()方法来执行线程任务，结果是两个线程
(main、MyThread线程)并发地运行

#.注意事项：

(1).java程序的多线程属于抢占式调度，main、MyThread线程每次都抢占式的并发运行，所以下面程序的执行结果每次都不一样

(2).多次启动一个线程是非法的，特别是当线程已经结束执行后，不能再重新启动

#.注意：线程启动后，run()方法是经过对象myThread调用，才进入到线程栈内存空间中的

 */
package Thread;

public class DemoMain {
    public static void main(String[] args) {

        // 创建一个自定义线程类MyThread的对象
        MyThread myThread = new MyThread();

        // 调用Thread类中的start()方法启动该线程
        myThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main线程第" + i + "次执行");
        }

    }
}
