
/*

Thread类的常用方法：

1.设置线程名称：

法一：为线程类定义一个有参构造方法，用来设置线程实例的名称
法二：使用Thread类中的setName()方法来设置线程实例的名称

2.获取线程名称：

法一：使用Thread类中的方法getName()获取线程实例的名称
法二：先使用Thread类中的静态方法currentThread()获取当前正在执行的线程实例，再使用getName()方法获取该线程的名称
        static Thread currentThread()：返回当前正在执行的线程对象的引用

#.name为Thread类的一个私有属性，用来描述线程的名称。其子类会继承该属性和相应的get、set方法，即：getName、setName方法

3.sleep()方法暂停线程：
        public static void sleep(long millis)：使当前正在执行的线程以指定的毫秒数暂停，毫秒数结束之后，线程继续执行
sleep方法在使用时会产生一个编译器异常 InterruptedException，当线程被中断时会抛出该异常

 */
package Thread.ThreadCommonMethod;

public class DemoMain {
    public static void main(String[] args) {

        // 设置线程名称
        MyThread myThread = new MyThread("线程名称");
        myThread.setName("重命名的线程名称");

        // 获取线程名称
        System.out.println(myThread.getName()); // 重命名的线程名称
        System.out.println(Thread.currentThread().getName()); // main   当前执行的线程为main线程

        // sleep方法暂停main线程：每隔一秒输出一个数字
        for (int i = 0; i < 60; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
