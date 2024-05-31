
/*

(2).Consumer接口中的默认方法andThen

    当我们需要对数据先进行一个消费操作，再进行另一个消费操作的时候，可以使用两个Consumer接口来实现，具体操作如下：

                        public static void main(String[] args) {
                            ConsumerImpl01 cImpl01 = new ConsumerImpl01();
                            ConsumerImpl02 cImpl02 = new ConsumerImpl02();
                            String s = "Hello";
                            cImpl01.accept(s); // HELLO
                            cImpl02.accept(s); // hello
                        }

    使用两个Consumer接口连续调用accept方法，即可实现这种对数据进行连续两次消费的操作。为了方便使用，Consumer接口中补充了一个
默认方法andThen，用来实现上述功能，所以上述代码可以替换为：

                        public static void main(String[] args) {
                            ConsumerImpl01 cImpl01 = new ConsumerImpl01();
                            ConsumerImpl02 cImpl02 = new ConsumerImpl02();
                            String s = "Hello";
                            cImpl01.andThen(cImpl02).accept(s); // HELLO   hello
                        }

    所以andThen方法相当于是把两个Consumer接口连接到一起，再消费数据，并且谁写前边谁先消费数据。即：cImpl01先消费数据、cImpl02
再消费数据，andThen方法的源码如下：

                        @FunctionalInterface
                        public interface Consumer<T> {
                            void accept(T var1);

                            default Consumer<T> andThen(Consumer<? super T> after) {
                                Objects.requireNonNull(after);
                                return (t) -> {
                                    this.accept(t);
                                    after.accept(t);
                                };
                            }
                        }
    源码分析：andThen方法的返回值和参数都是Consumer接口，所以调用andThen方法返回值是一个Lambda表达式，使用返回的Consumer接口
再次调用accept方法时，就会执行andThen方法内部的Lambda表达式，即this先消费，after后消费。

 */
package Demo03CommonFunctionalInterface.Demo02ConsumerInterface.Demo02ConsumerInterfaceDefaultMethod;

import java.util.function.Consumer;

public class DemoMain {
    public static void main(String[] args) {

        // (1).调用consumeString方法，方法的参数是两个接口，所以可以传递两个接口的实现类对象，形成多态，即：Consumer<String> consumer01 = new ConsumerImpl01();   (含有泛型的接口形成多态)
        ConsumerImpl01 cImpl01 = new ConsumerImpl01();
        ConsumerImpl02 cImpl02 = new ConsumerImpl02();
        consumeString("Stay brave and optimistic!", cImpl01, cImpl02);

        // (2).调用consumeString方法，方法的参数是两个接口，所以可以传递两个接口的匿名内部类，形成多态，即：Consumer<String> consumer01 = new Consumer<String>() {...};   (含有泛型的匿名内部类形成多态)
        consumeString("Stay brave and optimistic!", new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        }, new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toLowerCase());
            }
        });

        // (3).调用consumeString方法，方法的参数Consumer是一个函数式接口，所以可以传递两个Lambda表达式
        consumeString("Stay brave and optimistic!",
                (String s) -> {
                    System.out.println(s.toUpperCase());
                },
                (String s) -> {
                    System.out.println(s.toLowerCase());
                });

        // 使用Lambda表达式的省略格式
        consumeString("Stay brave and optimistic!", s -> System.out.println(s.toUpperCase()), (s) -> System.out.println(s.toLowerCase()));

    }

    // 定义一个方法，参数是一个字符串和两个Consumer<T>接口，泛型是String类型，该方法用来连续两次消费一个String类型的数据
    private static void consumeString(String s, Consumer<String> consumer01, Consumer<String> consumer02) {
        consumer01.andThen(consumer02).accept(s);
    }

}
