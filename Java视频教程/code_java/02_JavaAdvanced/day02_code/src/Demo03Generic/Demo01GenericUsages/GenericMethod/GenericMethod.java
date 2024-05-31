
/*

定义含有泛型的方法格式:

                    修饰符  <泛型>  返回值类型  方法名(泛型类型的参数){
                            方法体;
                    }

a.含有泛型的方法，在调用方法的时根据方法参数传递指定的数据类型
b.含有泛型的静态方法，static要写在 <泛型> 之前
c.当方法的参数是含有泛型的类、接口时，修饰符后面也要加上 <泛型>

 */

package Demo03Generic.Demo01GenericUsages.GenericMethod;

import java.util.Collection;

public class GenericMethod {

    // 定义一个含有泛型的方法
    public <E> void method01(E e) {
        System.out.println(e);
    }

    // 定义一个含有泛型的静态方法
    public static <E> void method02(E e) {
        System.out.println(e);
    }

    // 泛型类、接口作为方法参数
    public static <E> void method03(Collection<E> collection) {
        System.out.println(collection);
    }

}
