package Demo02_AbstractClass;

public class DemoMain {
    public static void main(String[] args) {

        // Animal animal = new Animal();  错误写法，不能创建抽象类对象

        Cat cat = new Cat();
        cat.eat();
        cat.normalMethod();

    }
}
