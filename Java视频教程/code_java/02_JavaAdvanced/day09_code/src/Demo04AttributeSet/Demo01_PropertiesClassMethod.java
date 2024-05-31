
/*

Properties集合类不仅继承了Hashtable类中的所有方法，自己还拥有一些操作集合元素的特有方法：

        Object setProperty(String key, String value)：将指定键、值的元素添加到集合中(调用了Hashtable的put方法)
        String getProperty(String key)：根据指定的键，在集合中获取对应的Value值(相当于Map集合中的get方法)
        Set<String> stringPropertyNames()：获取集合的所有键值并放入Set集合中(相当于Map集合中的keySet方法)

*stringPropertyNames()、getProperty()方法结合使用可以遍历Properties集合

 */
package Demo04AttributeSet;

import java.util.Properties;
import java.util.Set;

public class Demo01_PropertiesClassMethod {
    public static void main(String[] args) {

        // 创建Properties集合对象，泛型默认是String，所以可省略
        Properties prop = new Properties();

        // 使用setProperty()方法往集合中添加数据
        prop.setProperty("赵丽颖", "168");
        prop.setProperty("迪丽热巴", "165");
        prop.setProperty("古力娜扎", "160");

        // 使用stringPropertyNames()方法把集合中的键取出，存储到一个Set集合中
        Set<String> set = prop.stringPropertyNames();

        // 遍历Set集合，获取Properties集合的每一个键，并使用getProperty()方法通过key获取value
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }

    }
}
