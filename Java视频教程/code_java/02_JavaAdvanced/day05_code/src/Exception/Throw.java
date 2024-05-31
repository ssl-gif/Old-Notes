
/*

    我们在程序中调用JDK的API时，有时由于传递的参数不合法，程序会抛出异常。不仅在此种情况下会产生
异常，我们还可以在自定义的方法中"主动地"抛出异常对象，用来检验传递进方法的参数是否合法。当传递给
方法的参数不合法时，我们就可以使用throw关键字new出来一个"指定的"异常对象然后抛出给方法的调用者。

                    throw new xxxException("异常产生的原因");

#.注意事项：

(1).throw关键字后边new的对象必须是Exception或者Exception的子类对象

(2).throw关键字抛出指定的异常对象给方法的调用者时，我们就必须处理这个异常对象
        throw关键字后边创建的是runtimeException，我们可以不处理，默认交给JVM处理(打印异常对象，中断程序)
        throw关键字后边创建的是checkedException，我们就必须处理这个异常(要么throws，要么try...catch)

(3).其实调用API时抛出异常，就是JDK在方法内部使用throw关键字new出来的异常对象

 */

package Exception;

public class Throw {
    public static void main(String[] args) {

        int[] arr01 = null;
        System.out.println(getElement(arr01, 5)); // NullPointerException是运行期异常，我们不用处理，默认交给JVM处理

        int[] arr02 = new int[3];
        System.out.println(getElement(arr02, 5)); // ArrayIndexOutOfBoundsException是运行期异常，我们不用处理，默认交给JVM处理

    }

    /*
    定义一个方法，用于获取数组指定索引处的元素
    以后我们对传递给方法的参数进行合法性校验时，如果参数不合法，那么我们就必须使用抛出异常的方式，告知方法的调用者，传递的参数有问题
     */
    private static int getElement(int[] arr, int index) {

        /*
        我们可以对传递过来的参数数组，进行合法性校验
        如果数组arr的值是null
        那么我们就抛出空指针异常，告知方法的调用者"传递的数组的值是null"
         */
        if (arr == null) {
            throw new NullPointerException("传递的数组是null");
        }

        /*
        我们可以对传递过来的参数index进行合法性校验
        如果index的范围不在数组的索引范围内
        那么我们就抛出数组索引越界异常，告知方法的调用者"传递的索引超出了数组的使用范围"
         */
        if (index < 0 || index > arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("传递的索引超出了数组的使用范围");
        }

        int ele = arr[index];
        return ele;
    }

}
