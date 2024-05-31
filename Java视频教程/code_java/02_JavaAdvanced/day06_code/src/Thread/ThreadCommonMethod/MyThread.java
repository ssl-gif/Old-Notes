package Thread.ThreadCommonMethod;

public class MyThread extends Thread{

    // 定义一个有参构造方法，其中调用父类Thread的构造方法，来设置子类线程实例的名称
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
    }

}
