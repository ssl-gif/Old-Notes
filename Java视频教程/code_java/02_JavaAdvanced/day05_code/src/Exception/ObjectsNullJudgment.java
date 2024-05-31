
/*

    以后我们经常会对传递进方法的参数进行非空判断，即判断传递给方法的对象是否为null，
如果是null就必须new一个NullPointerException并抛出。为了实现代码复用，Objects类中
提供了一个静态方法requireNonNull()，用来判断对象是否为null。源码如下：

                        public static <T> T requireNonNull(T obj) {
                            if (obj == null)
                                throw new NullPointerException();
                            return obj;
                        }

    requireNonNull()方法内部就是throw了一个NullPointerException异常对象，所以以后就直接
调用该静态方法即可。

 */

package Exception;

import java.util.Objects;

public class ObjectsNullJudgment {
    public static void main(String[] args) {

        method(null);

    }

    private static void method(Object obj) {

        // 对传递进来的参数进行合法性的判断，判断是否为null
        if (obj == null) {
            throw new NullPointerException("传递的对象的值是null");
        }

        Objects.requireNonNull(obj);

        // requireNonNull()方法的重载，字符串参数可传递异常产生的原因
        Objects.requireNonNull(obj, "传递的对象的值是null");

    }

}
