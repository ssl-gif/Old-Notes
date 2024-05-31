
/*

(3).map方法

                        <R> Stream<R> map(Function<? super T, ? extends R> mapper);

    该方法接收一个Function接口的实现类对象，当Stream流对象调用该方法时，会将每一个流元素交给"实现类重写后的apply方法"
进行转换处理，将元素由T类型转换为R类型，所以该方法可以用来转换流中的元素(在重写apply的方法体中定义转换规则)。由于Function
接口是一个函数式接口，所以可以传递一个Lambda表达式。并且map方法是一个延迟方法，调用之后可以继续调用Stream流中的其他方法。

 */
package Demo01Stream.Demo02CommonMethod;

import java.util.function.Function;
import java.util.stream.Stream;

public class Demo03MapMethod {
    public static void main(String[] args) {

        // 获取一个Stream流
        Stream<String> stream01 = Stream.of("1", "2", "3", "4");

        // (1).使用map方法对Stream流中的数据进行转换：传递一个匿名内部类
        Stream<Integer> stream02 = stream01.map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        });

        // (2).使用map方法对Stream流中的数据进行转换：传递一个Lambda表达式
        Stream<Integer> stream03 = stream01.map((String s) -> {
            return Integer.parseInt(s);
        });

        // 使用Lambda表达式的省略格式
        Stream<Integer> stream04 = stream01.map(s -> Integer.parseInt(s));

        // 遍历Stream流
        stream04.forEach(i -> System.out.println(i));

    }
}
