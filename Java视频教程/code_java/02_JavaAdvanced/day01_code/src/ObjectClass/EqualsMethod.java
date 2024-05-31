
/*

public boolean equals(Object obj) ：指示其他某个对象是否与此对象"相等"，比较的是对象的地址值

(1).equals方法源码:

          public boolean equals(Object obj) {    // Object obj:可以传递任意的对象，多态的写法
              return (this == obj);              // this指向调用方法的当前对象，其中保存的是当前对象的地址值
          }

(2).equals方法比较的是两个对象的地址值，没有意义，需要重写方法来比较对象的属性。

 */

package ObjectClass;

public class EqualsMethod {
    public static void main(String[] args) {

        Person p1 = new Person("迪丽热巴", 18);
        Person p2 = new Person("古力娜扎", 18);
        Person p3 = new Person("迪丽热巴", 18);

        System.out.println(p1.equals(p2)); // false   未重写equals方法
        System.out.println(p1.equals(p3)); // false   未重写equals方法

        System.out.println(p1.equals(p3)); // true    重写了equals方法

    }
}
