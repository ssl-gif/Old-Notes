package Demo03_MethodIntroduction;

public class Demo01_MethodIntroduction {
    public static void main(String[] args) {
        operator();  //调用自定义的方法operator
    }

    //自定义方法，封装三元运算符的代码
    public static void operator() {
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println("最大值是：" + max);
    }

}