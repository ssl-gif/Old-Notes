package Demo01_Interface.Demo02_DefaultMethod;

public class InterfaceDefaultImplA implements InterfaceDefault {

    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，AAA");
    }

    /*
    实现类会继承接口中的默认方法
    public default void methodDefault() {
        System.out.println("这是新添加的默认方法");
    }
    */

}
