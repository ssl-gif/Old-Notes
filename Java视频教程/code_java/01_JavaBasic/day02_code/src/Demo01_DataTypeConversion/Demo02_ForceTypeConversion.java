package Demo01_DataTypeConversion;

public class Demo02_ForceTypeConversion {
    public static void main(String[] args) {

        // ①.整数型之间：long --> int
        long num1 = 100L;
        int num2 = (int) num1;  // 左边是int类型变量，右边是long类型变量。即把long类型变量赋值给int类型变量，这一行代码需要进行强制类型转换。
        System.out.println(num2); // 100

        // ②.浮点型之间：double --> float
        double num3 = 500.23;
        float num4 = (float)num3;  // 左边是float类型变量，右边是double类型变量。即把double类型变量赋值给float类型变量，这一行代码需要进行强制类型转换。
        System.out.println(num4);  // 500.23

        // ③浮点型--->整数型：float --> long
        float num5 = 30.0F;
        long num6 = (long)num5;    // 左边是long类型变量，右边是float类型变量。即把float类型变量赋值给long类型变量，这一行代码需要进行强制类型转换。
        System.out.println(num6);  // 注意由浮点数型--->整数型，结果变为30

    }
}
