
/*

    在JDK7以后添加了一个Objects工具类，它提供了一些静态方法来操作对象，这些方法是
null-save (空指针安全的)或 null-tolerant (容忍空指针的)

Objects类的equals方法：比较两个对象地址值，可以防止空指针异常。源码如下：

            public static boolean equals(Object a, Object b) {
                    return a == b || a != null && a.equals(b);
                }

无论是使用Object类的equals方法还是重写后的equals方法，调用方法的对象都不能为空，
否则会产生 NullPointerException，Objects类的equals方法就优化了这种情况。

 */

package ObjectClass;

import java.util.Objects;

public class ObjectsClass {
    public static void main(String[] args) {

        String s1 = null;
        String s2 = "abc";
        System.out.println(s1.equals(s2)); // 会抛出空指针异常

        System.out.println(Objects.equals(s1, s2)); // false

    }
}
