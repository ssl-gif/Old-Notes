
/*

java.util.List 接口中操作索引的特有抽象方法：

void add(int index, E element)：将指定的元素，添加到该集合中的指定位置上
E get(int index)：返回集合中指定位置的元素
E remove(int index)：移除列表中指定位置的元素，返回的是被移除的元素
E set(int index, E element)：用指定元素替换集合中指定位置的元素，返回的是替换前的元素

注意：操作索引的时候,一定要防止索引越界异常 IndexOutOfBoundsException

 */

package ListSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListUniqueMethod {
    public static void main(String[] args) {

        // 创建List集合对象，形成多态
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");

        System.out.println(list); // [a, b, c, a]  不是地址值，重写了toString方法

        // add方法
        list.add(2, "itheima");
        System.out.println(list); // [a, b, itheima, c, a]

        // get方法
        String str1 = list.get(2);
        System.out.println("返回的元素是：" + str1); // 返回的元素是：itheima
//        System.out.println(list.get(10)); 集合索引越界异常 IndexOutOfBoundsException

        // remove方法
        String str2 = list.remove(2);
        System.out.println("被移除的元素是：" + str2); // 被移除的元素是：itheima
        System.out.println(list); // [a, b, c, a]

        // set方法
        String str3 = list.set(0, "www");
        System.out.println(list); // [www, b, c, a]
        System.out.println("被替换的元素是：" + str3); // 被替换的元素是：a


        // List系集合有三种遍历方式

        // a.使用普通的for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // b.使用迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        // c.使用增强for遍历
        for (String s : list) {
            System.out.println(s);
        }

    }
}
