package Demo02_InnerClass.Demo01_MemberInnerClass.Demo02_VariableDuplicate;

public class DemoMain {
    public static void main(String[] args) {

        // 创建外部类对象
        Outer out = new Outer();
        out.methodOuter();

        // 创建内部类对象
        Outer.Inner in = new Outer().new Inner();
        in.methodInner();

    }
}
