
/*

定义一个吃货线程类继承Thread，用来吃包子。首先要判断有没有包子：

	false：没有包子，吃货就调用wait方法进入等待状态，等待包子铺生产包子

	true：有包子，吃货就开始吃包子，吃完后就修改包子状态为false，然后唤醒包子铺线程开始生产包子

 */
package Demo01WaitAndNotifyCase;

public class ChiHuo extends Thread {

    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    // 设置线程任务：吃包子
    @Override
    public void run() {

        while (true) {

            synchronized (bz) {

                // 判断包子状态，没有包子就等待包子铺生产
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 包子铺生产完包子，唤醒吃货线程开始吃包子
                System.out.println("吃货正在吃:" + bz.Pi + bz.Xian + "的包子");

                // 吃完包子后，修改包子状态为false
                bz.flag = false;

                // 唤醒包子铺线程，生产包子
                bz.notify();
                System.out.println("吃货已经把:" + bz.Pi + bz.Xian + "的包子吃完了，通知包子铺开始生产包子");
                System.out.println("====================================================================");
            }
        }

    }

}
