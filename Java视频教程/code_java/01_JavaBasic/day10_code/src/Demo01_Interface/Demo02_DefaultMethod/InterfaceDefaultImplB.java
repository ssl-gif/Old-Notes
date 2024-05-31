package Demo01_Interface.Demo02_DefaultMethod;

public class InterfaceDefaultImplB implements InterfaceDefault {

    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，BBB");
    }

    /*
    实现类会继承接口中的默认方法
    public default void methodDefault() {
        System.out.println("这是新添加的默认方法");
    }
    */

    // 实现类可以对继承下来的默认方法进行覆盖重写
    @Override
    public void methodDefault() {
        System.out.println("这是新添加的默认方法");
        System.out.println("实现类B覆盖重写了接口的默认方法");
    }

}
