package Demo01_FinalKeyWords.Demo03_FinalVariable.Demo01_LocalVariableBasic;

public class DemoMain {
    public static void main(String[] args) {

        final int a = 10;
        // a = 20; 编译报错，不可重新赋值

        final int b;
        b = 20; // 正确写法，只要保证有唯一一次赋值即可

    }
}
