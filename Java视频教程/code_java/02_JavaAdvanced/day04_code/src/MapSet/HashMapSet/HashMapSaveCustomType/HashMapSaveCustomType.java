package MapSet.HashMapSet.HashMapSaveCustomType;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapSaveCustomType {
    public static void main(String[] args) {

        // 创建Map集合对象，形成多态
        Map<Person, String> map = new HashMap<>();
        map.put(new Person("女王", 18), "英国");
        map.put(new Person("秦始皇", 18), "秦国");
        map.put(new Person("普京", 30), "俄罗斯");
        map.put(new Person("女王", 18), "毛里求斯");

        // 未重写 hashCode、equals方法时，使用keySet遍历Map集合
        Set<Person> set01 = map.keySet();
        for (Person key : set01) {
            String value = map.get(key);
            System.out.println(key + "--->" + value); // 输出结果有四条，Key可重复
        }

        // 重写 hashCode、equals方法时，使用entrySet遍历Map集合
        Set<Map.Entry<Person, String>> set02 = map.entrySet();
        for (Map.Entry<Person, String> entry : set02) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "--->" + value); // 输出结果有三条，Key不可重复
        }

    }
}
