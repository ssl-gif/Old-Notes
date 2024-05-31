package Demo01_Interface.Demo01_AbstractMethod;

public class DemoMain {
    public static void main(String[] args) {

        // InterfaceAbstract one = new InterfaceAbstract();  不能直接new接口对象使用

        // 只能通过创建接口实现类的对象使用
        InterfaceAbstractImpl one = new InterfaceAbstractImpl();
        one.methodAbs1();
        one.methodAbs2();
        one.methodAbs3();
        one.methodAbs4();

    }
}
