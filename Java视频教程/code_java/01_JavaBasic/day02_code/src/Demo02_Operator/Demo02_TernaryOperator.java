package Demo02_Operator;

public class Demo02_TernaryOperator {
    public static void main(String[] args) {

        // 使用三元运算符求两个数的最大值：

        // 法一：
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println("最大值是：" + max);

        // 法二：
        System.out.println("最大值是：" + (10 > 20 ? 10 : 20));

    }
}
