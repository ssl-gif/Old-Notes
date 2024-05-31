package Demo03Generic.Demo02BenefitsOfGeneric;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoMain {
    public static void main(String[] args) {
    }

    /*
        创建集合对象，不使用泛型
        好处：集合不使用泛型，默认的类型就是Object类型，可以存储任意类型的数据
        弊端：不安全，会引发异常
     */
    private static void demo01() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);

        // 使用迭代器遍历list集合
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next(); // 取出元素也是Object类型
            String s = (String) obj; // 会抛出ClassCastException类型转换异常，不能把Integer类型转换为String类型
            System.out.println(s.length());
        }
    }


    /*
        创建集合对象，使用泛型
        好处：
            (1).避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
            (2).把运行期异常，提升到了编译期(写代码的时候会报错)
        弊端：泛型是什么类型，只能存储什么类型的数据
     */
    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("qwert");

        //使用迭代器遍历list集合
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s.length());
        }
    }

}
