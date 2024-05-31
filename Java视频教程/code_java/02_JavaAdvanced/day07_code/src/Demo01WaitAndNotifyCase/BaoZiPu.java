
/*

定义一个包子铺线程类继承Thread，用来生产包子。首先要判断有没有包子：

    true：有包子，包子铺不用生产包子，调用wait方法进入无限等待状态，等待吃货线程吃完这个包子并将包子铺线程唤醒开始生产包子

	false：没有包子，包子铺开始交替生产两种包子，包子铺生产好包子后将包子状态修改为true，并唤醒吃货线程，让吃货开始吃包子

 */
package Demo01WaitAndNotifyCase;

public class BaoZiPu extends Thread {

    private BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    // 设置线程任务：生产包子
    @Override
    public void run() {

        int count = 0;

        while (true) {

            // 因为传递进来的包子对象bz是两个线程共享的同一份数据，所以可以使用包子对象bz作为对象锁
            synchronized (bz) {

                // 判断包子状态，如果有包子，就等待吃货吃完
                if (bz.flag == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 吃货吃完后，包子铺线程被唤醒，开始交替生产两种包子
                if (count % 2 == 0) {
                    bz.Pi = "薄皮";
                    bz.Xian = "三鲜馅";
                } else {
                    bz.Pi = "冰皮";
                    bz.Xian = "牛肉大葱馅";
                }
                count++;

                System.out.println("包子铺正在生产：" + bz.Pi + bz.Xian + "的包子");

                // 花费3秒钟生产包子
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // 生产完包子，将包子状态修改为true
                bz.flag = true;

                // 唤醒吃货线程
                bz.notify();
                System.out.println("包子铺已经生产好" + bz.Pi + bz.Xian + "的包子了，通知吃货可以开始吃了");
            }
        }

    }

}
