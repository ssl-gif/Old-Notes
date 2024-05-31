
// 函数式接口的使用
package Demo01FunctionalInterface.Demo02FunctionalInterfaceUsages;

public class DemoMain {
    public static void main(String[] args) {

        // (1).调用show方法，方法的参数是一个接口，所以可以传递接口的实现类对象
        DemoFunctionalInterfaceImpl d = new DemoFunctionalInterfaceImpl();
        show(d);

        // (2).调用show方法，方法的参数是一个接口，所以可以传递接口的匿名内部类
        show(new DemoFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用函数式接口的匿名内部类");
            }
        });

        // (3).调用show方法，方法的参数是一个函数式接口，所以可以使用Lambda表达式
        show(() -> {
            System.out.println("使用Lambda表达式");
        });

        // Lambda表达式的省略格式
        show(() -> System.out.println("使用Lambda表达式"));

    }

    // 定义一个方法，参数是函数式接口DemoFunctionalInterface类型
    private static void show(DemoFunctionalInterface functionalInterface) {
        functionalInterface.method();
    }
}