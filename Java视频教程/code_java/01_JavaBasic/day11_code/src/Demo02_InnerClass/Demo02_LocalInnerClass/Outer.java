package Demo02_InnerClass.Demo02_LocalInnerClass;

public class Outer { // 外部类

    public void methodOuter() { // 外部类方法

        // 从Java 8+开始，只要方法内的局部变量后面不会再改变，那么它就默认被final修饰
        /*final*/ int num = 10;

        class Inner { // 局部内部类
            public void methodInner() {
                System.out.println("局部内部类的成员方法");
                System.out.println(num);
            }
        }

        // 方法内部创建局部内部类对象
        Inner inner = new Inner();
        inner.methodInner();

    }

}
