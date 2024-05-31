
/*

java.util.LinkedList 类操作首尾元素的特有方法：

public void addFirst(E e)：将指定元素插入列表的开头
public void addLast(E e)：将指定元素添加到列表的结尾
public void push(E e)：将元素推入此列表所表示的堆栈，相当于 addFirst(E e)方法

public E getFirst()：返回此列表的第一个元素
public E getLast()：返回此列表的最后一个元素

public E removeFirst()：移除并返回此列表的第一个元素
public E removeLast()：移除并返回此列表的最后一个元素
public E pop()：从此列表所表示的堆栈处弹出一个元素，相当于 removeFirst()方法

注意：使用LinkedList集合特有的方法，不能使用多态

 */

package ListSet;

import java.util.LinkedList;

public class LinkedListSetUsages {
    public static void main(String[] args) {

        // 创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();

        linked.add("a");
        linked.add("b");
        linked.add("c");

        System.out.println(linked); // [a, b, c]

        // add系列方法
        linked.addFirst("www");
        System.out.println(linked); // [www, a, b, c]

        linked.push("http");
        System.out.println(linked); // [http, www, a, b, c]

        linked.addLast("com");
        System.out.println(linked); // [http, www, a, b, c, com]

        // get系列方法
        String str1 = linked.getFirst();
        System.out.println("列表第一个元素是：" + str1);

        String str2 = linked.getLast();
        System.out.println("列表最后一个元素是：" + str2);

        // remove系列方法
        String str3 = linked.removeFirst();
        System.out.println("移除列表第一个元素是：" + str3);
        System.out.println(linked); // [www, a, b, c, com]

        String str4 = linked.pop();
        System.out.println("移除列表第一个元素是：" + str3);
        System.out.println(linked); // [a, b, c, com]

        String str5 = linked.removeLast();
        System.out.println("移除列表最后一个元素是：" + str5);
        System.out.println(linked); // [a, b, c]

    }
}
