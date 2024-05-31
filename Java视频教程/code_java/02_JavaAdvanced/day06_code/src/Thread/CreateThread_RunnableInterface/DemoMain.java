
/*

    创建线程的第二种方式：利用Runnable接口的实现类对象创建线程。实现步骤如下：

1.定义一个Runnable接口的实现类，并重写Runnable接口中的run()方法，设置线程任务
2.创建一个Runnable接口的实现类对象
3.使用Thread类的构造方法，创建一个线程实例。使用此Thread类对象调用Thread类中的start方法启动线程。
public Thread(Runnable target)：参数target为Runnable接口的实现类对象
public Thread(Runnable target, String name)：参数name是创建的线程实例的名称

(2).利用Runnable接口的实现类创建线程的好处：
a.避免了单继承的局限性：一个类继承了Thread类之后就不能继承其他类了，但是实现了Runnable接口的类，还可以继承其他的类、实现其他的接口
b.增强了程序的扩展性，降低了程序的耦合性(解耦)：把设置线程任务和开启新线程进行了分离(解耦)

#.注意：线程启动后，run()方法是经过实现类对象r调用，才进入到线程栈内存空间中的

 */
package Thread.CreateThread_RunnableInterface;

public class DemoMain {
    public static void main(String[] args) {

        RunnableImpl r = new RunnableImpl();

        Thread thread = new Thread(r, "线程名称");

        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }

    }
}
