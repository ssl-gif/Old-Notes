package Demo02_StaticKeyWord.Demo02_StaticMethod;

public class DemoMyClass {
    public static void main(String[] args) {

        // 普通成员方法需要创建对象才能调用
        MyClass obj = new MyClass();
        obj.method();

        // 静态成员方法直接使用类名即可调用
        MyClass.methodStatic();

    }
}
