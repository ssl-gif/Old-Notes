
// (1).Function接口的Lambda用法：以Lambda表达式的方式使用Function接口中的apply方法
package Demo03CommonFunctionalInterface.Demo04FunctionInterface.Demo01FunctionInterfaceLambdaUsages;

import java.util.function.Function;

public class DemoMain {
    public static void main(String[] args) {

        // (1).调用changeString方法，方法的参数是一个接口，所以可以传递接口的实现类对象，形成多态，即：Function<String, Integer> function = new FunctionImpl();   (含有泛型的接口形成多态)
        FunctionImpl fImpl = new FunctionImpl();
        changeString("123456", fImpl);

        // (2).调用changeString方法，方法的参数是一个接口，所以可以传递接口的匿名内部类，形成多态，即：Function<String, Integer> function = new Function<String, Integer>() {...};   (含有泛型的匿名内部类形成多态)
        changeString("123456", new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        });

        // (3).调用changeString方法，方法的参数Consumer是一个函数式接口，所以可以传递Lambda表达式
        changeString("123456", (String s) -> {
            return Integer.parseInt(s);
        });

        // 使用Lambda表达式的省略格式
        changeString("123456", s -> Integer.parseInt(s));

    }

    // 定义一个方法，参数是Function<String, Integer>接口，该方法用来将一个String类型的数据转换成int类型数据并输出
    private static void changeString(String s, Function<String, Integer> function) {
        int i = function.apply(s);
        System.out.println(i);
    }

}

