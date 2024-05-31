package Demo02_Polymorphic.Demo03_ReferenceTypeConversion;

public class DemoMain {
    public static void main(String[] args) {

        // 向上转型
        Animal a = new Cat();
        a.eat();         // 调用的是Cat的eat()方法
        // a.catchMouse(); 父类引用不能调用子类特有的方法

        // 向下转型
        Cat c = (Cat) a;
        c.catchMouse();  // 调用的是Cat的catchMouse()方法

    }
}
