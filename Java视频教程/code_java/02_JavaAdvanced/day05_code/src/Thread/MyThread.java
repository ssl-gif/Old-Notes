package Thread;

public class MyThread extends Thread {

    // 重写run()方法来设置线程任务
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThread线程第" + i + "次执行");
        }
    }

}


