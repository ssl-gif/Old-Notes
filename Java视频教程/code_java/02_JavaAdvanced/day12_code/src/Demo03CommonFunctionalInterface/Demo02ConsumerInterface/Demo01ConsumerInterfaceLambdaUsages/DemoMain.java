
// (1).Consumer接口的Lambda用法：以Lambda表达式的方式使用Consumer接口中的accept方法
package Demo03CommonFunctionalInterface.Demo02ConsumerInterface.Demo01ConsumerInterfaceLambdaUsages;

import java.util.function.Consumer;

public class DemoMain {
    public static void main(String[] args) {

        // (1).调用consumeString方法，方法的参数是一个接口，所以可以传递接口的实现类对象，形成多态，即：Consumer<String> consumer = new ConsumerImpl();   (含有泛型的接口形成多态)
        ConsumerImpl cImpl = new ConsumerImpl();
        consumeString("Stay brave and optimistic!", cImpl);

        // (2).调用consumeString方法，方法的参数是一个接口，所以可以传递接口的匿名内部类，形成多态，即：Consumer<String> consumer = new Consumer<String>() {...};   (含有泛型的匿名内部类形成多态)
        consumeString("Stay brave and optimistic!", new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        });

        // (3).调用consumeString方法，方法的参数Consumer是一个函数式接口，所以可以传递Lambda表达式
        consumeString("Stay brave and optimistic!", (String s) -> {
            System.out.println(s.toUpperCase());
        });

        // 使用Lambda表达式的省略格式
        consumeString("Stay brave and optimistic!", s -> System.out.println(s.toUpperCase()));

    }

    // 定义一个方法，参数是Consumer<T>接口，泛型是String类型，该方法用来消费一个String类型的数据
    private static void consumeString(String s, Consumer<String> consumer) {
        consumer.accept(s);
    }

}

