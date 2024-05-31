package Demo01_Extends.Demo02_Constructor;

public class DemoMain {
    public static void main(String[] args) {

        Zi zi1 = new Zi(); // 先调用父类构造方法，再执行子类构造方法

        Zi zi2 = new Zi(10, 20);
        System.out.println("numFu：" + zi2.numFu);
        System.out.println("numZi：" + zi2.numZi);

    }
}
