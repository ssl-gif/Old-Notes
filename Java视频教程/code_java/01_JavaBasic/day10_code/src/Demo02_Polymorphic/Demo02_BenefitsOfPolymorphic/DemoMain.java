package Demo02_Polymorphic.Demo02_BenefitsOfPolymorphic;

public class DemoMain {
    public static void main(String[] args) {

        // 创建普通子类对象
        Cat c = new Cat();
        Dog d = new Dog();

        showCatEat(c); // 猫吃鱼
        showDogEat(d); // 狗吃骨头

        showAnimalEat(c); // 猫吃鱼
        showAnimalEat(d); // 狗吃骨头

    }

    public static void showCatEat(Cat c) {
        c.eat();
    }

    public static void showDogEat(Dog d) {
        d.eat();
    }

    // 将子类对象传递给方法，即 Animal a = c ，就是将父类引用指向子类对象，即多态
    public static void showAnimalEat(Animal a) {
        a.eat();
    }

}
