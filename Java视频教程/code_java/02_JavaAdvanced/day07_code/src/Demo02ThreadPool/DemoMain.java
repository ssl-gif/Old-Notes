
/*

第一步：创建线程池

    在JDK1.5之后提供了 java.util.concurrent.Executors 线程池工厂类，可以使用Executors类中的静态方法来生成线程池：

            static ExecutorService newFixedThreadPool(int nThreads)：创建一个可重用固定线程数的线程池

    返回值是 java.util.concurrent.ExecutorService 接口的实现类对象，该接口是线程池接口，即该接口的每一个实现类对象
都是一个线程池。那么上述方法返回得就是一个线程池对象。

第二步：从线程池中获取线程，执行线程任务

    ExecutorService接口中有一个 submit(Runnable task) 方法，用来提交一个线程任务到线程池中进行处理。传递进去的参数
就是Runnable接口的实现类对象，通过重写run()方法来设置线程任务。线程任务被提交进去后，线程池会自动分配线程来执行该任务。

第三步：关闭、销毁线程池(不建议使用)
    使用 shutdown() 方法来销毁一个线程池，线程池被销毁后，其中的线程不可再使用。

 */

package Demo02ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoMain {
    public static void main(String[] args) {

        // 创建一个含有2个线程的线程池
        ExecutorService es = Executors.newFixedThreadPool(2);

        // 提交线程任务到线程池中
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());

        // 销毁线程池
        es.shutdown();

        es.submit(new RunnableImpl()); // 线程池被销毁后，其中的线程不能再使用，此时会抛出异常

    }
}
