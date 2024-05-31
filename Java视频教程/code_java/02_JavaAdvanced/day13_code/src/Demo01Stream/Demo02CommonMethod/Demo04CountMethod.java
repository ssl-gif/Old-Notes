
/*

(4).count方法

                                        long count();

    该方法的返回值是一个long类型整数，用来统计Stream流中元素的个数。并且count方法是一个终结方法，调用之后不能继续
调用Stream流中的其他方法。

 */
package Demo01Stream.Demo02CommonMethod;

import java.util.stream.Stream;

public class Demo04CountMethod {
    public static void main(String[] args) {

        // 获取一个Stream流
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7);

        // 使用count方法统计Stream流中元素的个数
        long count = stream.count();
        System.out.println(count); // 7

    }
}
