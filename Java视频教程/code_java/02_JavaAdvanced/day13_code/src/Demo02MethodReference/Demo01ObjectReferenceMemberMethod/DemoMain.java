
/*

1.通过对象名引用成员方法

    如果Lambda要表达的函数方案已经存在于某个方法的实现中，并且这个方法是某个类的成员方法，那么我们就可以使用该类的对象
来引用该成员方法，并将其传递给函数式接口，以此来代替传递一个Lambda表达式。语法格式如下：

                                        对象名 :: 成员方法名

在下例中：Lambda表达式的方法体就是将字符串转换成大写再打印输出，这个功能已经被DemoClass类中的成员方法printUpperCaseString
实现了，所以我们可以使用该类的一个对象demoClass来引用该成员方法，即：demoClass::printUpperCaseString，并将其传递给函数式
接口printable，以此来代替传递的Lambda表达式。

 */
package Demo02MethodReference.Demo01ObjectReferenceMemberMethod;

public class DemoMain {
    public static void main(String[] args) {

        // 调用printString方法，传递一个Lambda表达式
        printString("Helllo", s -> System.out.println(s.toUpperCase()));

        // 调用printString方法，传递一个Lambda表达式
        printString("Helllo", s -> new DemoClass().printUpperCaseString(s));

        // 调用printString方法，传递一个方法引用，通过对象名来引用成员方法
        DemoClass demoClass = new DemoClass();
        printString("Helllo", demoClass::printUpperCaseString);

    }

    // 定义一个方法printString，参数传递一个字符串和Printable接口，用来打印输出一个字符串
    private static void printString(String s, Printable printable) {
        printable.print(s);
    }

}
