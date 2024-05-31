
/*

(1).forEach方法

                                void forEach(Consumer<? super T> var1);

    该方法接收一个Consumer接口的实现类对象，当Stream流对象调用该方法时，会将每一个流元素交给"实现类重写后的accept方法"
进行消费处理，所以该方法可以用来遍历流中的元素(在重写accept的方法体中定义遍历规则)。由于Consumer接口是一个函数式接口，所
以可以传递一个Lambda表达式。并且forEach方法是一个终结方法，调用之后不能继续调用Stream流中的其他方法。

 */
package Demo01Stream.Demo02CommonMethod;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo01ForEachMethod {
    public static void main(String[] args) {

        // 获取一个Stream流
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");

        // (1).使用forEach方法对Stream流中的数据进行遍历：传递一个匿名内部类
        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // (2).使用forEach方法对Stream流中的数据进行遍历：传递一个Lambda表达式
        stream.forEach((String s) -> {
            System.out.println(s);
        });

        // 使用Lambda表达式的省略格式
        stream.forEach(name -> System.out.println(name));

    }
}
