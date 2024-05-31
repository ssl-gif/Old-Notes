
/*

(1).所有的Collection集合都可以通过 stream 默认方法获取流

     java.util.Collection<E>接口中加入了默认方法stream()，用来获取Collection集合的Stream流对象，所以其所有实现类对象
都会继承该默认方法，并可以调用该方法来获取一个Stream流对象。方法源码如下：

                         default Stream<E> stream() {
                            return StreamSupport.stream(this.spliterator(), false);
                         }

(2).Stream接口中的静态方法of可以获取数组对应的流

                        static <T> Stream<T> of(T... values) {
                            return Arrays.stream(values);
                         }

    of方法的参数是一个可变参数，那么我们就可以传递多个数据，或者直接传递一个数组


#.注意：Map集合是无法获取相应的Stream流对象的，因为其K-V型数据结构不符合流元素的单一特征，但是可以获取"用来存储键、存储值、
存储键值对的Collection集合"的Stream流对象

 */
package Demo01Stream.Demo01GetStream;

import java.util.*;
import java.util.stream.Stream;

public class DemoMain {
    public static void main(String[] args) {

        // (1).获取Collection集合的Stream流对象
        List<String> list = new ArrayList<>();
        Stream<String> stream01 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream02 = set.stream();


        // (2).获取数组的Stream流对象
        Stream<Integer> stream03 = Stream.of(1, 2, 3, 4, 5);

        Integer[] array1 = {1, 2, 3, 4, 5};
        Stream<Integer> stream04 = Stream.of(array1);

        String[] array2 = {"a", "bb", "ccc"};
        Stream<String> stream05 = Stream.of(array2);


        // 获取Map集合的Stream流对象
        Map<String, String> map = new HashMap<>();

        // 将集合map的key值存放到Collection集合keySet中，并获取集合keySet的Stream流
        Set<String> keySet = map.keySet();
        Stream<String> stream06 = keySet.stream();

        // 将集合map的value值存放到Collection集合values中，并获取集合values的Stream流
        Collection<String> values = map.values();
        Stream<String> stream07 = values.stream();

        // 将集合map的entrySet对象存放到Collection集合entrySet中，并获取集合entrySet的Stream流
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Stream<Map.Entry<String, String>> stream08 = entrySet.stream();

    }
}
