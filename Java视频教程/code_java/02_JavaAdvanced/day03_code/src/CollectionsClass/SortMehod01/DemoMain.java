
/*

public static <T> void sort(List<T> list)：将集合中元素按照默认规则排序

    被排序的集合里边存储的元素数据类型，必须实现Comparable接口，通过重写接口中的compareTo方法来定义排序的规则。
其中Integer、String类已经重写好了compareTo方法，自定义的数据类型一定要实现Comparable接口并重写compareTo方法
来制定对象排序的规则。

 */

package CollectionsClass.SortMehod01;

import java.util.ArrayList;
import java.util.Collections;

public class DemoMain {
    public static void main(String[] args) {

        // Integer类
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01); // [1, 3, 2]
        Collections.sort(list01);
        System.out.println(list01); // [1, 2, 3]

        // String类
        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("c");
        list02.add("b");
        System.out.println(list02); // [a, c, b]
        Collections.sort(list02);
        System.out.println(list02); // [a, b, c]

        // Person类
        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("张三", 18));
        list03.add(new Person("李四", 20));
        list03.add(new Person("王五", 15));
        System.out.println(list03); // [Person{name='张三', age=18}, Person{name='李四', age=20}, Person{name='王五', age=15}]
        Collections.sort(list03);
        System.out.println(list03); // [Person{name='王五', age=15}, Person{name='张三', age=18}, Person{name='李四', age=20}]

    }
}
