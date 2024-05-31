
/*

(2).使用Lambda表达式作为方法返回值：其实就是当函数式接口作为方法返回值类型时，就可以直接返回一个Lambda表达式

    例如java.util.Comparator接口就是一个函数式接口，将Comparator接口作为getComparator方法的返回值，此方法
的作用是返回一个Comparator接口的实现类对象，即Comparator比较器，那么我们就可以直接返回一个Lambda表达式，用来
代替Comparator接口的实现类对象或者匿名内部类。

*Comparator接口的使用：Arrays类中的静态sort方法在对数组进行排序的时候，需要给方法参数传递一个Comparator接口
的实现类对象(Comparator比较器)，通过在Comparator接口的实现类中重写compare方法来制定排序规则。

 */
package Demo02FunctionalProgram.Demo02LambdaAsMethod;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02LambdaAsMethodReturnValue {
    public static void main(String[] args) {

        // 创建一个字符串数组
        String[] array = {"aaa", "b", "cccccc", "dddddddddddd"};

        // 输出排序前的数组
        System.out.println(Arrays.toString(array)); // [aaa, b, cccccc, dddddddddddd]

        // 调用Arrays中的sort方法，对字符串数组进行排序
        Arrays.sort(array, getComparator());

        // 输出排序后的数组
        System.out.println(Arrays.toString(array)); // [dddddddddddd, cccccc, aaa, b]

    }

    private static Comparator<String> getComparator() {

        /*
        // (1).方法的返回值类型是一个接口，那么可以返回该接口的匿名内部类
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        };
        */

        // (2).方法的返回值类型Comparator接口是一个函数式接口，那么可以直接返回一个Lambda表达式
        return (String o1, String o2) -> {
            return o2.length() - o1.length();
        };

    }

}
