package Demo01_Extends.Demo01_DuplicateMember;

public class Zi extends Fu {

    // 从父类继承过来的重名的成员变量、方法

    /*
    // 普通成员变量
    int normalNum = 10;
    // 普通成员方法
    public void normalMethod(){}

    // 静态成员变量
    static int staticNum = 100;
    // 静态成员方法
    public static void staticMethod(){}
     */


    // 子类本身重名的成员变量、方法

    // 普通成员变量
    int normalNum = 20;

    // 普通成员方法
    public void normalMethod() {
    }

    // 静态成员变量
    static int staticNum = 200;

    // 静态成员方法
    public static void staticMethod() {
    }


    public void method1() {

        /*
        重名的普通成员变量、方法在本类普通成员方法中的使用：
            优先使用重名的子类成员，默认使用隐含的this关键字修饰，一般省略不写。此时使用super关键字可以在子类中访问重名的父类成员，
        super与this一样，仍然指向当前对象(当前调用该方法的对象)，只不过this调用的是重名的子类成员，super调用的是继承过来的重名的
        父类成员。(类比this关键字的内存原理图，想象一下super关键字的内存原理图)
         */
        System.out.println(normalNum);
        normalMethod();
        System.out.println(super.normalNum);
        super.normalMethod();

        /*
        重名的静态成员变量、方法在本类普通成员方法中的使用：
            优先使用重名的子类成员，默认使用隐含的子类类名修饰，一般省略不写。此时使用super关键字、父类类名可以在子类中访问重名的父类成员。
        */
        System.out.println(staticNum);
        staticMethod();
        System.out.println(super.staticNum); // 或：System.out.println(Fu.staticNum);
        super.staticMethod();                // 或：Fu.staticMethod();

    }

    public static void method2() {

        /*
        重名的普通成员变量、方法在本类静态成员方法中的使用：
            静态不能访问本类的非静态内容。所以重名的子类成员、父类成员，均不可使用。
        */

        /*
        重名的静态成员变量、方法在本类静态成员方法中的使用：
            优先使用重名的子类成员，默认使用隐含的子类类名修饰，一般省略不写。此时使用父类类名可以在子类中访问重名的父类成员。
        由于静态方法中不能使用this、super关键字，所以不可使用super关键字在子类中访问重名的父类静态成员。
        */
        System.out.println(staticNum);
        staticMethod();
        System.out.println(Fu.staticNum);
        Fu.staticMethod();

    }

}
