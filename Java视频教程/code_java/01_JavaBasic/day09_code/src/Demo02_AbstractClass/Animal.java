package Demo02_AbstractClass;

public abstract class Animal {

    public Animal(){
        System.out.println("抽象父类构造方法执行");
    }

    // 抽象方法：代表吃东西，但是具体吃什么（方法体内容）不确定
    public abstract void eat();

    // 普通成员方法
    public void normalMethod() {
    }

}
