
/*

2.通过类名引用静态方法

    如果Lambda要表达的函数方案已经存在于某个方法的实现中，并且这个方法是某个类的静态方法，那么我们就可以使用该类的类名
来引用该静态方法，并将其传递给函数式接口，以此来代替传递一个Lambda表达式。语法格式如下：

                                        类名称 :: 静态方法名

在下例中：Lambda表达式的方法体就是计算并返回一个整数的绝对值，这个功能已经被Math类中的静态方法abs实现了，所以我们可以
使用该类的类名来引用该静态方法，即：Math::abs，并将其传递给函数式接口Calcable，以此来代替传递的Lambda表达式。

 */
package Demo02MethodReference.Demo02ClassReferenceStaticMethod;

public class DemoMain {
    public static void main(String[] args) {

        // 调用calcAbs方法，传递一个Lambda表达式
        int num01 = calcAbs(-123, i -> i < 0 ? -i : i);
        System.out.println(num01);

        // 调用calcAbs方法，传递一个Lambda表达式
        int num02 = calcAbs(-123, i -> Math.abs(i));
        System.out.println(num02);

        // 调用calcAbs方法，传递一个方法引用，通过类名来引用静态方法
        int num03 = calcAbs(-123, Math::abs);
        System.out.println(num03);

    }

    // 定义一个方法calcAbs，参数传递一个整数和Calcable接口，用来计算并返回一个整数的绝对值
    private static int calcAbs(int i, Calcable calcable) {
        return calcable.calc(i);
    }

}
