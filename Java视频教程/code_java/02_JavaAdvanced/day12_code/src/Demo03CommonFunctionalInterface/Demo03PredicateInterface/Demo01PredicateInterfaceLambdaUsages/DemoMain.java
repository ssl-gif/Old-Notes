
// (1).Predicate接口的Lambda用法：以Lambda表达式的方式使用Consumer接口中的test方法
package Demo03CommonFunctionalInterface.Demo03PredicateInterface.Demo01PredicateInterfaceLambdaUsages;

import java.util.function.Predicate;

public class DemoMain {
    public static void main(String[] args) {

        // (1).调用checkString方法，方法的参数是一个接口，所以可以传递接口的实现类对象，形成多态，即：Predicate<String> predicate = new PredicateImpl();   (含有泛型的接口形成多态)
        PredicateImpl pImpl = new PredicateImpl();
        checkString("abcdef", pImpl);

        // (2).调用checkString方法，方法的参数是一个接口，所以可以传递接口的匿名内部类，形成多态，即：Predicate<String> predicate = new Predicate<String>() {...};   (含有泛型的匿名内部类形成多态)
        checkString("abcdef", new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        });

        // (3).调用checkString方法，方法的参数Predicate是一个函数式接口，所以可以传递Lambda表达式
        checkString("abcdef", (String s) -> {
            return s.length() > 5;
        });

        // 使用Lambda表达式的省略格式
        checkString("abcdef", s -> s.length() > 5);

    }

    // 定义一个方法，参数是Consumer<T>接口，泛型是String类型，该方法用来消费一个String类型的数据
    private static void checkString(String s, Predicate<String> predicate) {
        boolean b = predicate.test(s);
        System.out.println("字符串的长度是否大于5：" + b);
    }

}
