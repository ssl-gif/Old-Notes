package Demo01_ScannerClass.Demo01_ScannerClass;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("输入的整数是：" + num);

        String str = sc.next();
        System.out.println("输入的字符串是：" + str);

    }
}