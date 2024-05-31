
/*

(5).limit方法

                                      Stream<T> limit(long maxSize);

    该方法接收一个long类型的整数，用来截取流中的前几个元素。如果参数长度小于集合当前长度，则截取前maxSize个元素，否则
不进行操作。并且limit方法是一个延迟方法，调用之后可以继续调用Stream流中的其他方法。

 */
package Demo01Stream.Demo02CommonMethod;

import java.util.stream.Stream;

public class Demo05LimitMethod {
    public static void main(String[] args) {

        // 获取一个Stream流
        String[] array = {"美羊羊", "喜洋洋", "懒洋洋", "灰太狼", "红太狼"};
        Stream<String> stream01 = Stream.of(array);

        // 使用limit方法对Stream流中的元素进行截取，只要前3个元素
        Stream<String> stream02 = stream01.limit(3);

        // 遍历stream流
        stream02.forEach(name -> System.out.println(name));

    }
}
