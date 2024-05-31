
// 上述我们所说的两种创建线程的方式，都可以使用匿名内部类来简化线程的创建
package Thread.CreateThread_AnonymousInnerClass;

public class DemoMain {
    public static void main(String[] args) {

        // 1.使用匿名内部类来简化创建线程的第一种方式
        new Thread("线程1名称") {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" + i);
                }
            }
        }.start();

        // 2.使用匿名内部类来简化创建线程的第二种方式
        Runnable r = new Runnable() { // 多态
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" + i);
                }
            }
        };
        new Thread(r, "线程2名称").start();

        // 上述代码可以简化如下：
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" + i);
                }
            }
        }, "线程3名称").start();

    }
}
