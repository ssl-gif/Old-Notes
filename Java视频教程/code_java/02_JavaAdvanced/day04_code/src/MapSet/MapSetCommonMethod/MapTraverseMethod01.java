
/*

Map集合的第一种遍历方式：通过键找值的方式

              Set<K> keySet()：获取Map集合的所有键值并放入Set集合中

实现步骤:
1.使用Map集合中的方法keySet()，把Map集合所有的key取出来，存储到一个Set集合中
2.遍历set集合，获取Map集合中的每一个key
3.通过Map集合中的方法get(key)获取所有value

 */
package MapSet.MapSetCommonMethod;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTraverseMethod01 {
    public static void main(String[] args) {

        // 创建Map集合对象，形成多态
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);

        // 1.使用Map集合中的方法keySet()，把Map集合所有的key取出来，存储到一个Set集合中
        Set<String> set = map.keySet();

        // 2.使用迭代器遍历Set集合，获取Map集合中的每一个key
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            // 3.通过Map集合中的方法get(key)获取value
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }

        // 也可以使用增强for遍历Set集合，获取Map集合中的每一个key
        for (String key : set) {
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }

    }
}
