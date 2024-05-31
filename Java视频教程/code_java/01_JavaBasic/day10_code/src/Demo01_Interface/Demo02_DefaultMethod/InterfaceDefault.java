package Demo01_Interface.Demo02_DefaultMethod;

public interface InterfaceDefault {

    // 原有的抽象方法
    public abstract void methodAbs();

    // public abstract void methodAbs2();   新添加了一个抽象方法，所有的实现类都必须覆盖重写这个方法，比较麻烦。

    // 使用默认方法来更新接口
    public default void methodDefault() {
        System.out.println("这是新添加的默认方法");
    }

}
