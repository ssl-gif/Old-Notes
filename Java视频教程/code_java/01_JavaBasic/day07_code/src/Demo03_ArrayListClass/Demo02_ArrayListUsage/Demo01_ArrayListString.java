package Demo03_ArrayListClass.Demo02_ArrayListUsage;

import java.util.ArrayList;

public class Demo01_ArrayListString {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(); // 从JDK1.7+开始，右侧尖括号内的泛型可以省略不写

        // 直接打印ArrayList<E>集合类的对象名：输出的不是list对象的地址值，而是对list集合里面的内容打印输出
        System.out.println(list); // [] 内容为空

        // ①.向集合中添加元素：add方法
        boolean b = list.add("柳岩");
        System.out.println(list); // [柳岩]
        System.out.println("是否添加成功：" + b); // 是否添加成功：true

        list.add("高圆圆");
        list.add("赵又廷");
        list.add("李小璐");
        System.out.println(list); // [柳岩, 高圆圆, 赵又廷, 李小璐]

        // ②.从集合中获取元素：get方法
        String name = list.get(2);
        System.out.println("第2号索引位置：" + name); // 第2号索引位置：赵又廷

        // ③.从集合中删除元素：remove方法
        String whoRemoved = list.remove(3);
        System.out.println("被删除的人是：" + whoRemoved); // 被删除的人是：李小璐
        System.out.println(list); // [柳岩, 高圆圆, 赵又廷]

        // ④.获取集合的长度，即其中元素的个数：size方法
        int size = list.size();
        System.out.println("集合的长度是：" + size); // 集合的长度是：3

        // ⑤.ArrayList<E>集合的遍历操作：
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
