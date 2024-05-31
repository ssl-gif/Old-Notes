package Demo02_Operator;

public class Demo01_ArithmeticOperator {
    public static void main(String[] args) {

        // ①.单独使用：
        int num = 10;
        ++num;
        System.out.println(num); // 11
        num++;
        System.out.println(num); // 12

        // ②.与赋值操作混合使用：
        int num1 = 40;
        int result1 = ++num1;  // 如果是前++，变量立刻加1，然后再参与赋值运算
        System.out.println(result1); // 41
        System.out.println(num1);    // 41

        int num2 = 40;
        int result2 = num2++;  // 如果是后++，首先使用变量本来的40参与赋值运算，然后再让变量+1
        System.out.println(result2); // 40
        System.out.println(num2);    // 41

    }
}
