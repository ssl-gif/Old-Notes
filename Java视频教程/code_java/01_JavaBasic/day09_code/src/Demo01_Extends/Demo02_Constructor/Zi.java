package Demo01_Extends.Demo02_Constructor;

public class Zi extends Fu {

    int numZi;

    public Zi() {
        // super();  默认隐含调用父类无参构造方法
        System.out.println("子类无参构造方法执行！");
    }

    /*
    在继承关系中，子类全参构造方法的常用写法：
        a.在子类有参构造中使用super来调用父类全参构造，初始化从父类继承过来的成员变量
        b.然后子类再去初始化自己独有的成员变量
     */
    public Zi(int numFu, int numZi) {
        super(numFu);  // 调用父类重载的有参构造方法，来初始化从父类继承过来的成员属性numFu，此时默认隐含的 "super()" 调用就会失效
        this.numZi = numZi;
    }

}
