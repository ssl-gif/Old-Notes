package Demo01_ScannerClass.Demo02_AnonymousObject;

import java.util.Scanner;

public class AnonymousObject {
    public static void main(String[] args) {

        // (1).匿名对象的使用

        new Student().name = "赵丽颖"; // 创建了第一个匿名对象，由于没有名字，无法再对其进行操作。
        new Student().showName();     // 创建了第二个匿名对象，所以其name属性为null


        // (2).匿名对象作为方法的参数和返回值

        methodParam(new Scanner(System.in)); // 将new对象返回的地址值传递给形参引用类型变量sc，则sc就指向这个匿名对象
        Scanner sc1 = methodReturn();        // 将new对象的地址值返回赋值给引用类型变量sc1，则sc1就指向这个匿名对象
        System.out.println("输入的是：" + sc1.nextInt());

    }

    public static void methodParam(Scanner sc) {
        System.out.println("输入的是：" + sc.nextInt());
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }

}
