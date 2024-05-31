package Demo02_StaticKeyWord.Demo03_StaticCodeBlock;

public class Student {

    static {
        System.out.println("静态代码块执行！");
    }

    public Student() {
        System.out.println("构造方法执行！");
    }
}
