package Demo02_Polymorphic.Demo01_PolymorphicUsages;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void method(int m, int n) {
        System.out.println("子类重名但不是覆盖重写的方法");
    }

}
