
/*

(2).Function接口中的默认方法andThen

    当我们需要对数据先进行一个转换操作，再进行另一个转换操作的时候，可以使用两个Function接口来实现，具体操作如下：

                        public static void main(String[] args) {
                            FunctionImpl01 fImpl01 = new FunctionImpl01();
                            FunctionImpl02 fImpl02 = new FunctionImpl02();
                            String s = "123";
                            fImpl01.apply(s);
                            fImpl02.apply(s);
                        }

    使用两个Function接口连续调用apply方法，即可实现这种对数据进行连续两次转换的操作。为了方便使用，Function接口中补充了一个
默认方法andThen，用来实现上述功能，所以上述代码可以替换为：

                        public static void main(String[] args) {
                            FunctionImpl01 fImpl01 = new FunctionImpl01();
                            FunctionImpl02 fImpl02 = new FunctionImpl02();
                            String s = "123";
                            fImpl01.andThen(fImpl02).apply(s);
                        }

    所以andThen方法相当于是把两个Function接口连接到一起，再转换数据，并且谁写前边谁先转换数据。即：fImpl01先消费数据、fImpl02
再消费数据，andThen方法的源码如下：

                        @FunctionalInterface
                        public interface Function<T, R> {
                            R apply(T var1);

                            default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
                                Objects.requireNonNull(after);
                                return (t) -> {
                                    return after.apply(this.apply(t));
                                };
                            }
                        }
源码分析：andThen的方法的使用和原理与Consumer接口中的andThen方法一样，在此不再赘述。

 */
package Demo03CommonFunctionalInterface.Demo04FunctionInterface.Demo02FunctionInterfaceDefaultMethod;

import java.util.function.Function;

public class DemoMain {
    public static void main(String[] args) {

        // (1).调用changeString方法，方法的参数是两个接口，所以可以传递两个接口的实现类对象，形成多态，即：Function<String, Integer> function01 = new FunctionImpl01();   (含有泛型的接口形成多态)
        FunctionImpl01 fImpl01 = new FunctionImpl01();
        FunctionImpl02 fImpl02 = new FunctionImpl02();
        changeString("123", fImpl01, fImpl02);

        // (2).调用changeString方法，方法的参数是两个接口，所以可以传递两个接口的匿名内部类，形成多态，即：Function<String, Integer> function01 = new Function<String, Integer>() {...};   (含有泛型的匿名内部类形成多态)
        changeString("123", new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s) + 10;
            }
        }, new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer + "";
            }
        });

        // (3).调用changeString方法，方法的参数Function是一个函数式接口，所以可以传递两个Lambda表达式
        changeString("123",
                (String s) -> {
                    return Integer.parseInt(s) + 10;
                },
                (Integer integer) -> {
                    return integer + "";
                });

        // 使用Lambda表达式的省略格式
        changeString("123", s -> Integer.parseInt(s) + 10, integer -> integer + "");

    }

    // 定义一个方法，参数是一个字符串和两个Function接口，该方法用来将一个String类型的数据转换成Integer类型，再将Integer类型转换成String类型
    private static void changeString(String s, Function<String, Integer> function01, Function<Integer, String> function02) {
        String str = function01.andThen(function02).apply(s);
        System.out.println(str);
    }

}
