package Demo02_Polymorphic.Demo01_PolymorphicUsages;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void method(int m){
        System.out.println("子类重名但不是覆盖重写的方法");
    }

}
