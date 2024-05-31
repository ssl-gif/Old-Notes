
/*

5.数组的构造器引用

    如果Lambda要表达的函数方案已经存在于某个方法的实现中，并且这个方法是数组的构造方法(数组也是Object的子类对象，所以同样具有
构造器，只是语法稍有不同)，那么我们就可以使用数组的类型来引用该构造方法，并将其传递给函数式接口，以此来代替传递一个Lambda表达式，
一般用来创建一个数组。语法格式如下：

                                        数组类型[] :: new

在下例中：Lambda表达式的方法体就是根据整数长度创建一个int[]类型数组并返回，这个功能就是int[]类型数组的有参构造方法的功能，所以
我们可以使用该数组类型来引用其构造方法，即：int[]::new，并将其传递给函数式接口arrayBulider，以此来代替传递的Lambda表达式。

 */
package Demo02MethodReference.Demo05ArrayConstructorReference;

import java.util.Arrays;

public class DemoMain {
    public static void main(String[] args) {

        // 调用creatArray方法，传递一个Lambda表达式
        int[] array01 = creatArray(10, length -> new int[length]);
        System.out.println(Arrays.toString(array01));

        // 调用creatArray方法，传递一个数组的构造器引用
        int[] array02 = creatArray(10, int[]::new);
        System.out.println(Arrays.toString(array02));

    }

    // 定义一个方法，参数传递一个整数和一个ArrayBulider接口，用来创建并返回一个int类型数组
    private static int[] creatArray(int length, ArrayBulider arrayBulider) {
        return arrayBulider.buildArray(length);
    }

}
