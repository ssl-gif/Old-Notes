package Demo01_Interface.Demo01_AbstractMethod;

public class InterfaceAbstractImpl implements InterfaceAbstract{

    // 实现类必须覆盖重写接口的所有抽象方法
    @Override
    public void methodAbs1() {
        System.out.println("这是第一个抽象方法！");
    }

    @Override
    public void methodAbs2() {
        System.out.println("这是第二个抽象方法！");
    }

    @Override
    public void methodAbs3() {
        System.out.println("这是第三个抽象方法！");
    }

    @Override
    public void methodAbs4() {
        System.out.println("这是第四个抽象方法！");
    }

}
