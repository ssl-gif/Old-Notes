
/*

Map集合遍历的第二种方式：使用Entry对象遍历

    在Map接口中有一个内部接口Map.Entry<K, V>，当Map集合创建时，就会在Map集合中
为每一对键、值创建一个Entry对象用来记录键与值的映射关系。

        Set<Map.Entry<K,V>> entrySet()：获取Map集合的Entry对象并放入Set集合中

实现步骤:
1.使用Map集合中的方法entrySet()，把Map集合中多个Entry对象取出来，存储到一个Set集合中
2.遍历Set集合，获取每一个Entry对象
3.使用Entry对象中的方法getKey()和getValue()获取键与值

 */
package MapSet.MapSetCommonMethod;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTraverseMethod02 {
    public static void main(String[] args) {

        // 创建Map集合对象，形成多态
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);

        // 1.使用Map集合中的方法entrySet()，把Map集合中多个Entry对象取出来，存储到一个Set集合中
        Set<Map.Entry<String, Integer>> set = map.entrySet();

        // 2.遍历Set集合，获取每一个Entry对象
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            // 3.使用Entry对象中的方法getKey()和getValue()获取键与值
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        // 也可以使用增强for遍历Set集合，获取每一个Entry对象
        for (Map.Entry<String, Integer> entry : set) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }

    }
}
