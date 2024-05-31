package Demo01_Extends.Demo02_Constructor;

public class Fu {

    int numFu;

    public Fu() {
        System.out.println("父类无参构造方法执行！");
    }

    public Fu(int num) {
        this.numFu = num;
    }

}
