package Demo02_InnerClass.Demo03_AnonymousInnerClass;

public class DemoMain {
    public static void main(String[] args) {

        new InterfaceA() {
            @Override
            public void method1() {
                System.out.println("实现类覆盖重写了抽象方法1");
            }
            @Override
            public void method2() {
                System.out.println("实现类覆盖重写了抽象方法2");
            }
        }.method1(); // 匿名内部类的对象只能使用一次。

        new InterfaceA() {
            @Override
            public void method1() {
                System.out.println("实现类覆盖重写了抽象方法1");
            }
            @Override
            public void method2() {
                System.out.println("实现类覆盖重写了抽象方法2");
            }
        }.method2();

        InterfaceA obj = new InterfaceA() {
            @Override
            public void method1() {
                System.out.println("实现类覆盖重写了抽象方法1");
            }
            @Override
            public void method2() {
                System.out.println("实现类覆盖重写了抽象方法2");
            }
        };
        obj.method1();
        obj.method2();

    }
}
