
/*

(1).使用Lambda表达式作为方法参数：其实就是当函数式接口作为方法参数时，调用该方法时，给该方法参数传递一个Lambda表达式

    例如java.lang.Runnable接口就是一个函数式接口，将Runnable接口作为startThread方法的参数，并在方法内部创建开启一
个线程。那么我们就可以给该方法参数传递一个Lambda表达式，用来代替Runnable接口的实现类对象或者匿名内部类。

 */
package Demo02FunctionalProgram.Demo02LambdaAsMethod;

public class Demo01LambdaAsMethodParameter {
    public static void main(String[] args) {

        // (1).调用startThread方法，方法的参数是一个接口，所以可以传递接口的匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程启动了");
            }
        });

        // (2).调用startThread方法，方法的参数Runnable是一个函数式接口，所以可以传递Lambda表达式
        startThread(() -> {
            System.out.println(Thread.currentThread().getName() + "线程启动了");
        });

        // Lambda表达式的省略格式
        startThread(() -> System.out.println(Thread.currentThread().getName() + "线程启动了"));

    }

    private static void startThread(Runnable r) {
        new Thread(r).start();
    }

}
