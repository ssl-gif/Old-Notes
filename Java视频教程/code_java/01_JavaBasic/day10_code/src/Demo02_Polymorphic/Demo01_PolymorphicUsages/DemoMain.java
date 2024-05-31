package Demo02_Polymorphic.Demo01_PolymorphicUsages;

public class DemoMain {
    public static void main(String[] args) {

        Animal one = new Dog();
        one.eat();   // 狗吃骨头
        one.method();// 父类重名方法

        Animal two = new Cat();
        two.eat();    // 猫吃鱼
        two.method(); // 父类重名方法

    }
}
