package Demo02_RandomClass;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {

        Random r = new Random();

        int num1 = r.nextInt();
        System.out.println("随机数是：" + num1);

        int num2 = r.nextInt(10);
        System.out.println("随机数是：" + num2);

    }
}
