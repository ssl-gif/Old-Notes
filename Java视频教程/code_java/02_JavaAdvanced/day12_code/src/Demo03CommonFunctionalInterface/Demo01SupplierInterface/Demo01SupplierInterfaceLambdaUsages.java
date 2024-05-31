
// (1).Supplier接口的Lambda用法：以Lambda表达式的方式使用Supplier接口
package Demo03CommonFunctionalInterface.Demo01SupplierInterface;

import java.util.function.Supplier;

public class Demo01SupplierInterfaceLambdaUsages {
    public static void main(String[] args) {

        // (1).调用getString方法，方法的参数是一个接口，所以可以传递接口的实现类对象，形成多态，即：Supplier<String> supplier = new SupplierImpl();   (含有泛型的接口形成多态)
        SupplierImpl sImpl = new SupplierImpl();
        String str1 = getString(sImpl);
        System.out.println(str1);

        // (2).调用getString方法，方法的参数是一个接口，所以可以传递接口的匿名内部类，形成多态，即：Supplier<String> supplier = new Supplier<String>() {...};   (含有泛型的匿名内部类形成多态)
        String str2 = getString(new Supplier<String>() {
            @Override
            public String get() {
                return "Don't be afraid to fail!";
            }
        });
        System.out.println(str2);

        // (3).调用getString方法，方法的参数Supplier是一个函数式接口，所以可以传递Lambda表达式
        String str3 = getString(() -> {
            return "Don't be afraid to fail!";
        });
        System.out.println(str3);

        // Lambda表达式的省略格式
        String str4 = getString(() -> "Don't be afraid to fail!");
        System.out.println(str4);

    }

    // 定义一个方法，参数是Supplier<T>接口，泛型是String类型，该方法用来返回一个String类型的数据
    private static String getString(Supplier<String> supplier) {
        return supplier.get();
    }

}
