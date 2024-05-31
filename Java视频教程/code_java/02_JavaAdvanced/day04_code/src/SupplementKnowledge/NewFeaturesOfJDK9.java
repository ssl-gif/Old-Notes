
/*

    当我们使用多个add、put方法往集合中添加元素时，会造成代码的重复。因此JDK9增加了一个
"优化集合元素添加"的新特性：List、Set、Map接口里边增加了一个静态的of()方法，可以一次性
给集合添加多个元素。

                    static <E> List<E> of​(E... elements)

#.注意事项：
(1).of方法是List、Set、Map接口中的静态方法，其父类接口、子类实现并没有这个方法
(2).of方法的返回值是一个不可改变的集合，即集合不能再使用add、put方法添加元素，否则会抛出异常
(3).Set、Map接口在调用of方法的时候，不能有重复的元素，否则会抛出异常

 */
package SupplementKnowledge;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class NewFeaturesOfJDK9 {
    public static void main(String[] args) {

        List<String> list = List.of("a", "b", "a", "c", "d");
        System.out.println(list);
        // list.add("w");  不支持操作异常 UnsupportedOperationException

        Set<String> set = Set.of("a", "b", "c", "d");
        System.out.println(set); //
        // Set.add("w");  不支持操作异常 UnsupportedOperationException
        // Set<String> set = Set.of("a", "b", "a", "c", "d");  非法参数异常 IllegalArgumentException

        Map<String, Integer> map = Map.of("张三", 18, "李四", 19, "王五", 20);
        System.out.println(map);
        // map.put("赵四", 30);  不支持操作异常 UnsupportedOperationException
        // Map<String, Integer> map = Map.of("张三", 18, "张三", 19, "王五", 20);  非法参数异常 IllegalArgumentException

    }
}
