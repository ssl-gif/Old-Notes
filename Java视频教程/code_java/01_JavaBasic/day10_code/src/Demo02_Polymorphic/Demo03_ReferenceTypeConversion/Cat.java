package Demo02_Polymorphic.Demo03_ReferenceTypeConversion;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }

}
