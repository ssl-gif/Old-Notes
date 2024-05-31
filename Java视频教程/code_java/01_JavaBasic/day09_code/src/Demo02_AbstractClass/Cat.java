package Demo02_AbstractClass;

public class Cat extends Animal {

    public Cat(){
        // super();  默认隐含调用父类的构造方法
        System.out.println("子类构造方法执行");
    }

    // 覆盖重写抽象方法：去掉abstract关键字，补充方法体内容
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

}
