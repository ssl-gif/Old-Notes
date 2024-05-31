
/*

(7).concat方法

                static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)

    concat方法是Stream接口中的静态方法，参数传递两个Stream流对象，用于把两个流组合到一起。并且concat方法是一个延迟方法，
调用之后可以继续调用Stream流中的其他方法。

 */
package Demo01Stream.Demo02CommonMethod;

import java.util.stream.Stream;

public class Demo07ConcatMethod {
    public static void main(String[] args) {

        // 获取两个Stream流
        Stream<String> stream01 = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        Stream<String> stream02 = Stream.of("美羊羊", "喜洋洋", "懒洋洋", "灰太狼", "红太狼");

        // 使用concat方法把以上两个流组合为一个流
        Stream<String> stream03 = Stream.concat(stream01, stream02);

        // 遍历stream流
        stream03.forEach(name -> System.out.println(name));

    }
}
