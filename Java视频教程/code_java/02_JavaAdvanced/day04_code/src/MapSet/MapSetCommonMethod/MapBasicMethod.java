
// Map接口中基本的抽象方法的使用
package MapSet.MapSetCommonMethod;

import java.util.HashMap;
import java.util.Map;

public class MapBasicMethod {
    public static void main(String[] args) {
    }

    /*
        V put(K key, V value)：把指定的键与指定的值添加到Map集合中
        存储键值对的时候，key不重复，返回值是null
        存储键值对的时候，key重复，会使用新的value替换map中重复的value，返回被替换的value值
     */
    private static void demo01() {
        //创建Map集合对象，形成多态
        Map<String, String> map = new HashMap<>();

        // Key不可以重复
        String v1 = map.put("李晨", "范冰冰1");
        System.out.println(v1); // null
        String v2 = map.put("李晨", "范冰冰2");
        System.out.println(v2); // 范冰冰1
        System.out.println(map); // {李晨=范冰冰2}

        // Value可以重复
        map.put("杨过", "小龙女");
        map.put("尹志平", "小龙女");
        System.out.println(map); // {杨过=小龙女, 尹志平=小龙女, 李晨=范冰冰2}
    }

    /*
        V remove(Object key)：把指定的键所对应的"键值对元素"在Map集合中删除，返回被删除元素的Value值
        key存在，返回被删除元素的Value值
        key不存在，返回null
     */
    private static void demo02() {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);
        System.out.println(map); // {林志玲=178, 赵丽颖=168, 杨颖=165}

        Integer v1 = map.remove("林志玲");
        System.out.println(v1); // 178
        System.out.println(map); // {赵丽颖=168, 杨颖=165}

        Integer v2 = map.remove("林志颖");
        System.out.println(v2); // null
        System.out.println(map);//{赵丽颖=168, 杨颖=165}
    }

    /*
        V get(Object key)：根据指定的键，在Map集合中获取对应的Value值
        key存在，返回对应的value值
        key不存在，返回null
     */
    private static void demo03() {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);

        Integer v1 = map.get("杨颖");
        System.out.println(v1); // 165

        Integer v2 = map.get("迪丽热巴");
        System.out.println(v2); // null
    }

    /*
        boolean containsKey(Object key)：判断集合中是否包含指定的键
        包含返回true，不包含返回false
     */
    private static void demo04() {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);

        boolean b1 = map.containsKey("赵丽颖");
        System.out.println(b1); // true

        boolean b2 = map.containsKey("赵颖");
        System.out.println(b2); // false
    }

}
