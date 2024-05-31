
/*

    java.utils.Collections 是集合工具类，里面有大量的静态方法用来对集合进行操作。部分方法如下：

public static <T> boolean addAll(Collection<T> c, T... elements)：往集合中添加多个元素
public static void shuffle(List<?> list)：打乱集合顺序

public static <T> void sort(List<T> list)：将集合中元素按照默认规则排序
public static <T> void sort(List<T> list，Comparator<? super T> )：将集合中元素按照指定规则排序

 */

package CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassUsages {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "a", "b", "c", "d", "e");
        System.out.println(list); // [a, b, c, d, e]

        Collections.shuffle(list);
        System.out.println(list); // [b, d, c, a, e]

    }
}
