
// 练习二：ArrayList<E>集合类的对象作为方法参数。定义一个方法用来打印集合，并且按照以下格式打印集合内容：{元素@元素@元素}。

package Demo03_ArrayListClass.Demo03_ArrayListPractice;

import java.util.ArrayList;

public class ArrayListPractice02 {
    public static void main(String[] args) {

        // 创建集合对象，用来存储字符串
        ArrayList<String> list = new ArrayList<>();

        list.add("张三丰");
        list.add("宋远桥");
        list.add("张无忌");
        list.add("张翠山");
        System.out.println(list); // [张三丰, 宋远桥, 张无忌, 张翠山]

        // 调用打印集合的方法
        printArrayList(list);  // {张三丰@宋远桥@张无忌@张翠山}

    }

    //定义打印集合的方法，对象list作为方法参数
    public static void printArrayList(ArrayList<String> list) {

        // 拼接左括号
        System.out.print("{");

        // 循环获取集合内容，并按指定格式打印
        for (int i = 0; i < list.size(); i++) {

            String name = list.get(i);

            if (i != list.size() - 1) {
                System.out.print(name + "@"); // 如果不是最后一个元素，就拼接 @
            } else {
                System.out.println(name + "}"); // 如果是最后一个元素，就拼接右括号
            }
        }
    }
}
