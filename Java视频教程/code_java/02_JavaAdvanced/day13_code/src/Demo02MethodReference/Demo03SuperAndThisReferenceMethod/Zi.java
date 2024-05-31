
/*

3.通过super、this引用重名的父、子类成员方法

    复习回顾"重名的成员变量、成员方法在子类中的使用"，即可知道"使用super、this引用重名的父、子类成员方法"是什么意思了。
其实就是：在子类中，要想使用"重名的父类成员方法、重名的子类成员方法"的方法引用来代替Lambda表达式的传递，就要使用super、
this关键字来引用这些重名的方法。(与 "在子类中，使用super来访问重名的父类成员方法、使用this来访问重名的子类成员方法" 是一个道理)

#.注意事项：
    当然，在子类中，对于"不重名的父、子类成员方法"，如果想使用这些方法的方法引用来代替Lambda表达式的传递，必须要使用this
关键字来引用这些不重名的方法。(与 "在子类中，本类的成员方法默认使用this关键字修饰" 是一个道理)

 */
package Demo02MethodReference.Demo03SuperAndThisReferenceMethod;

// 定义一个子类
public class Zi extends Fu {

    // 从父类继承过来的重名的父类成员方法
    /*
    public void method(){
        System.out.println("你好，我是父类！");
    }
    */

    // 重名的子类成员方法
    public void method() {
        System.out.println("你好，我是子类！");
    }



    /*
    (1).通过super引用重名的父类成员方法：
        在子类的方法show01()中，调用methodInterface方法，可以给其传递一个Lambda表达式。由于Lambda表达式要表达的函数方案，已经
    存在于"从父类继承过来的重名的父类成员方法"method中，所以我们可以使用super来引用该方法，即：super::method，并将其传递给函数
    式接口functionalInterface，以此来代替传递的Lambda表达式。
     */
    public void show01() {

        // 调用methodInterface方法，传递一个Lambda表达式
        methodInterface(() -> System.out.println("你好，我是父类！"));

        // 调用methodInterface方法，传递一个Lambda表达式
        methodInterface(() -> super.method());

        // 调用methodInterface方法，传递一个方法引用，通过super来引用"从父类继承过来的重名的父类成员方法"
        methodInterface(super::method);

    }

    /*
    (2).通过this来引用重名的子类成员方法：
        在子类的方法show02()中，调用methodInterface方法，可以给其传递一个Lambda表达式。由于Lambda表达式要表达的函数方案，已经
    存在于"重名的子类成员方法"method中，所以我们可以使用this来引用该方法，即：this::method，并将其传递给函数式接口functionalInterface，
    以此来代替传递的Lambda表达式。
     */
    public void show02() {

        // 调用methodInterface方法，传递一个Lambda表达式
        methodInterface(() -> System.out.println("你好，我是子类！"));

        // 调用methodInterface方法，传递一个Lambda表达式
        methodInterface(() -> this.method());

        // 调用methodInterface方法，传递一个方法引用，通过this来引用"重名的子类成员方法"
        methodInterface(this::method);

    }



    // 定义一个方法，参数传递DemoFunctionalInterface接口，用来以多态的方式执行抽象方法
    private static void methodInterface(DemoFunctionalInterface functionalInterface) {
        functionalInterface.methodAbstract();
    }

}
