
/*

练习二：使用Lambda表达式的标准格式(有参有返回值)

    使用集合存储多个Person对象，对数组中的Person对象使用Arrays类的sort方法通过年龄进行升序排序。
                public static <T> void sort(T[] a, Comparator<? super T> c)
要给sort()方法传递一个Comparator接口的实现类对象。通过在Comparator接口的实现类中重写compare()方法，来制定排序规则。

 */

package Demo03LambdaExpression.Demo02Pratice;

import java.util.Arrays;
import java.util.Comparator;

public class DemoMain {
    public static void main(String[] args) {

        Person[] array = {
                new Person("柳岩", 38),
                new Person("迪丽热巴", 18),
                new Person("古力娜扎", 20)
        };

        // (1).创建接口的实现类对象，重写抽象方法
        ComparatorImpl c = new ComparatorImpl();
        Arrays.sort(array, c);

        // (2).使用匿名内部类的形式
        Arrays.sort(array, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        // (2).使用Lambda的标准格式
        Arrays.sort(array, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });


        // 使用Lambda的省略格式
        Arrays.sort(array, (o1, o2) -> o1.getAge() - o2.getAge());

        for (Person person : array) {
            System.out.println(person);
        }

    }
}
