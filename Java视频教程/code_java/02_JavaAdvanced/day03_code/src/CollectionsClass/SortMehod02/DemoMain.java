
/*

public static <T> void sort(List<T> list，Comparator<? super T> )：将集合中元素按照指定规则排序

    Comparator是一个含有泛型的接口，调用该sort方法时，必须要传入一个Comparator接口的实现类对象，我们
可以在这个实现类中对Comparator接口中的compare方法进行重写，来制定对象排序的规则。

 */

package CollectionsClass.SortMehod02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoMain {
    public static void main(String[] args) {

        // Integer类
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01); // [1, 3, 2]

        // 使用匿名内部类创建Comparator的实现类对象
        Collections.sort(list01, new Comparator<Integer>() {
            /*
            重写compare方法制定排序规则：
                    return o1-o2;   升序
                    return o2-o1;   降序
             */
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list01); // [3, 2, 1]


        // Student类
        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("迪丽热巴",18));
        list02.add(new Student("古力娜扎",20));
        list02.add(new Student("杨幂",17));
        System.out.println(list02); // [Student{name='迪丽热巴', age=18}, Student{name='古力娜扎', age=20}, Student{name='杨幂', age=17}]

        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 按照年龄升序排序
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(list02); // [Student{name='杨幂', age=17}, Student{name='迪丽热巴', age=18}, Student{name='古力娜扎', age=20}]

    }
}
