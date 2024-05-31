
/*

    增强for循环(也称foreach循环)是JDK1.5以后出来的一个高级for循环，专门用来遍历数组、Collection集合。
它的内部原理其实是个Iterator迭代器，所以在遍历的过程中，不能对集合中的元素进行增删操作。格式如下：

                        for(数组、集合的数据类型 变量名 : 集合名、数组名){
                            // ...
                        }

 */

package Demo02Iterator.Demo03EnhancedForLoop;

import java.util.ArrayList;

public class DemoMain {

    public static void main(String[] args) {
    }

    // 使用增强for循环遍历数组
    private static void demo01() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
    }

    // 使用增强for循环遍历集合
    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        for (String s : list) {
            System.out.println(s);
        }
    }

}
