package Demo01_Extends.Demo01_DuplicateMember;

public class DemoMain {
    public static void main(String[] args) {

        // 重名的普通成员变量、方法在其他类中的使用：子类对象优先使用重名的子类成员，不会使用继承过来的重名的父类成员
        Zi zi = new Zi();
        System.out.println(zi.normalNum);
        zi.normalMethod();

        // 重名的静态成员变量、方法在其他类中的使用：子类类名优先使用重名的子类成员，不会使用继承过来的重名的父类成员
        System.out.println(Zi.staticNum);
        Zi.staticMethod();

    }
}
