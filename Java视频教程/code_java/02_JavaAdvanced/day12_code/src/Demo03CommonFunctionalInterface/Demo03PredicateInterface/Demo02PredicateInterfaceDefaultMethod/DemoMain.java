
/*

(2).Predicate接口中的默认方法and、or、then

    当我们需要对数据先进行一个条件判断，再进行另一个条件判断，并且需要将两个判断条件用"与运算符&&"连接起来，判断两个条件是否同时
满足的时候，可以使用两个Predicate接口来实现，具体操作如下：

                        public static void main(String[] args) {
                            PredicateImpl01 pImpl01 = new PredicateImpl01();
                            PredicateImpl02 pImpl02 = new PredicateImpl02();
                            String s = "abcdef";
                            boolean b = pImpl01.test(s) && pImpl02.test(s);
                            System.out.println("字符串的长度是否大于5并且包含字母a" + b);
                        }

    使用两个Predicate接口调用test方法，并且将判断结果使用"与运算符&&"连接起来，即可得到这种两个判断条件的与运算结果。为了方便
使用，Predicate接口中补充了一个默认方法and，用来实现上述功能，所以上述代码可以替换为：

                        public static void main(String[] args) {
                            PredicateImpl01 pImpl01 = new PredicateImpl01();
                            PredicateImpl02 pImpl02 = new PredicateImpl02();
                            String s = "abcdef";
                            boolean b = pImpl01.and(pImpl02).test(s);
                            System.out.println("字符串的长度是否大于5并且包含字母a" + b);
                        }

    所以and方法相当于是把两个Predicate接口连接到一起，再对数据进行条件判断，并且对两个条件判断的结果进行与运算。and方法的源码如下：

                        @FunctionalInterface
                        public interface Predicate<T> {
                            boolean test(T var1);

                            default Predicate<T> and(Predicate<? super T> other) {
                                Objects.requireNonNull(other);
                                return (t) -> {
                                    return this.test(t) && other.test(t);
                                };
                            }
                        }
    源码分析：and的方法的使用和原理与Consumer接口中的andThen方法一样，在此不再赘述。


    在Predicate接口中，默认方法and是对两个判断条件的与运算(判断是否同时满足两个条件)，对两个判断条件的或运算是默认方法or来实现的
(判断是否满足其中一个条件)，对一个判断条件的取反运算是默认方法negate来实现的(对条件判断的结果取反)。or、negate方法的使用和原理与
and方法类似，在此不再赘述，所以and、or、then方法就是用来对两个条件判断的结果进行逻辑运算(与或非运算)的。or、negate方法的源码如下：

                        @FunctionalInterface
                        public interface Predicate<T> {
                            boolean test(T var1);

                            default Predicate<T> or(Predicate<? super T> other) {
                                Objects.requireNonNull(other);
                                return (t) -> {
                                    return this.test(t) || other.test(t);
                                };
                            }

                            default Predicate<T> negate() {
                                return (t) -> {
                                    return !this.test(t);
                                };
                            }
                        }

 */
package Demo03CommonFunctionalInterface.Demo03PredicateInterface.Demo02PredicateInterfaceDefaultMethod;

import java.util.function.Predicate;

public class DemoMain {
    public static void main(String[] args) {

        // (1).调用checkString方法，方法的参数是两个接口，所以可以传递两个接口的实现类对象，形成多态，即：Predicate<String> predicate = new PredicateImpl();   (含有泛型的接口形成多态)
        PredicateImpl01 pImpl01 = new PredicateImpl01();
        PredicateImpl02 pImpl02 = new PredicateImpl02();
        checkString("abcdef", pImpl01, pImpl02);

        // (2).调用checkString方法，方法的参数是两个接口，所以可以传递两个接口的匿名内部类，形成多态，即：Predicate<String> predicate = new Predicate<String>() {...};   (含有泛型的匿名内部类形成多态)
        checkString("abcdef", new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        }, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("a");
            }
        });

        // (3).调用checkString方法，方法的参数Predicate是一个函数式接口，所以可以传递两个Lambda表达式
        checkString("abcdef",
                (String s) -> {
                    return s.length() > 5;
                },
                (String s) -> {
                    return s.contains("a");
                });

        // 使用Lambda表达式的省略格式
        checkString("abcdef", s -> s.length() > 5, s -> s.contains("a"));

    }

    // 定义一个方法，参数是Predicate<T>接口，泛型是String类型，该方法用来对一个String类型的数据，进行两个条件判断，并对判断结果进行与运算
    private static void checkString(String s, Predicate<String> predicate01, Predicate<String> predicate02) {
        boolean b = predicate01.and(predicate02).test(s);
        System.out.println("字符串的长度是否大于5并且包含字母a" + b);

        /*
        // or方法的使用
        boolean b = predicate01.or(predicate02).test(s);
        System.out.println("字符串的长度是否大于5或者包含字母a" + b);

        // negate方法的使用
        boolean b = predicate01.negate().test(s);
        System.out.println("字符串的长度是否小于5" + b);
        */
    }

}
