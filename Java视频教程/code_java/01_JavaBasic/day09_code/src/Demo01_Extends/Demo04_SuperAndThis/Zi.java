package Demo01_Extends.Demo04_SuperAndThis;

public class Zi extends Fu {

    public Zi() {
        // super();  隐含的super调用失效
        this(10, 20);
    }

    public Zi(int m, int n) {
        // this();  错误，形成了构造方法的递归调用！
    }

}