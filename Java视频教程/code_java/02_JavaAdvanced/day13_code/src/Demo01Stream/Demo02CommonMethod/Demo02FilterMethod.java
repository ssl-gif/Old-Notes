
/*

(2).filter方法

                                Stream<T> filter(Predicate<? super T> predicate);

    该方法接收一个Predicate接口的实现类对象，当Stream流对象调用该方法时，会将每一个流元素交给"实现类重写后的test方法"
进行判断处理，结果为true会保留该元素，结果为false会舍弃该元素，所以该方法可以用来过滤流中的元素(在重写test的方法体中定
义过滤规则)。由于Predicate接口是一个函数式接口，所以可以传递一个Lambda表达式。并且filter方法是一个延迟方法，调用之后可
以继续调用Stream流中的其他方法。

 */
package Demo01Stream.Demo02CommonMethod;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo02FilterMethod {
    public static void main(String[] args) {

        // 获取一个Stream流
        Stream<String> stream01 = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");

        // (1).使用filter方法对Stream流中的数据进行过滤：传递一个匿名内部类
        Stream<String> stream02 = stream01.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张");
            }
        });

        // (2).使用filter方法对Stream流中的数据进行过滤：传递一个Lambda表达式
        Stream<String> stream03 = stream01.filter((String name) -> {
            return name.startsWith("张");
        });

        // 使用Lambda表达式的省略格式
        Stream<String> stream04 = stream01.filter(name -> name.startsWith("张"));

        // 遍历Stream流
        stream04.forEach(name -> System.out.println(name));

    }
}
