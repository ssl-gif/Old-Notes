
/*

public String toString() ：返回该对象的字符串表示，字符串内容：包名.对象类型@对象地址值

(1).如果不希望使用toString方法的默认行为，则可以对它进行覆盖重写。

(2).看一个类是否重写了toString方法，直接打印这个类的对象即可，如果没有重写toString方法那么打印的是对象的地址值

 */

package ObjectClass;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ToStringMethod {
    public static void main(String[] args) {

        Person p1 = new Person("张三", 18);
        // 直接打印对象名，println方法内部就是调用了对象的toString方法
        System.out.println(p1.toString()); // ObjectClass.Person@16b98e56   未重写toString方法
        System.out.println(p1);            // ObjectClass.Person@16b98e56   未重写toString方法

        Person p2 = new Person("张三", 18);
        System.out.println(p2.toString()); // Person{name='张三', age=18}    重写了toString方法
        System.out.println(p2);            // Person{name='张三', age=18}    重写了toString方法



        Random r = new Random();
        System.out.println(r); // java.util.Random@3f3afe78  没有重写toString方法

        Scanner sc = new Scanner(System.in);
        System.out.println(sc); // java.util.Scanner[delimiters...  重写了toString方法

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list); // [1]  重写了toString方法

    }
}
