
/*

等待唤醒机制的案例：
    吃包子的案例，包子铺生产一个包子，吃货吃一个，生产一个、吃一个 ......，此时包子铺线程就是生产者，
吃货线程就是消费者，包子对象就是这两个线程共享的同一份数据(资源)，这时就需要两个线程的协调通信来实现
对共享资源的灵活处理。(什么叫灵活处理呢？就是生产一个、吃一个，......)

 */
package Demo01WaitAndNotifyCase;

public class DemoMain {
    public static void main(String[] args) {

        BaoZi bz = new BaoZi(); // 创建一个包子对象并传递进线程类，那么这个包子对象bz就是这两个线程的共享数据(同一个资源)

        new BaoZiPu(bz).start(); // 创建包子铺线程并开启，开始生产包子
        new ChiHuo(bz).start();  // 创建吃货线程并开启，开始吃包子

    }
}
