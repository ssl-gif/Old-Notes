
/*

(6).skip方法

                                     Stream<T> skip(long n);

    该方法接收一个long类型的整数，用来跳过流中的前几个元素。如果参数长度小于集合当前长度，则会跳过前n个元素(相当于是截取
后面的元素)，否则将会得到一个长度为0的空流。并且skip方法是一个延迟方法，调用之后可以继续调用Stream流中的其他方法。

 */
package Demo01Stream.Demo02CommonMethod;

import java.util.stream.Stream;

public class Demo06SkipMethod {
    public static void main(String[] args) {

        //获取一个Stream流
        String[] array = {"美羊羊", "喜洋洋", "懒洋洋", "灰太狼", "红太狼"};
        Stream<String> stream01 = Stream.of(array);

        // 使用skip方法对Stream流中的元素进行跳过，跳过前3个元素，只保留后2个元素
        Stream<String> stream02 = stream01.skip(3);

        // 遍历stream流
        stream02.forEach(name -> System.out.println(name));

    }
}
