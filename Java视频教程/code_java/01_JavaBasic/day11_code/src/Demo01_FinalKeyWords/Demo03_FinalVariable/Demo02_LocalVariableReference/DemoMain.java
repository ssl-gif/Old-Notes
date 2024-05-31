package Demo01_FinalKeyWords.Demo03_FinalVariable.Demo02_LocalVariableReference;

public class DemoMain {
    public static void main(String[] args) {

        final Student stu = new Student();

        // stu = new Student(); 编译报错，stu指向了新的对象，保存的地址值改变

        stu.setName("张三"); // 对象内部的成员变量可以修改

    }
}
