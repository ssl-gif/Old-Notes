public class Demo03_LoopSentence {
    public static void main(String[] args) {

        // 计算1-100之间的偶数和
        // ①.for循环实现：
        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum1 += i;
            }
        }
        System.out.println("1‐100之间的偶数和是：" + sum1);

        // ②.while循环实现：
        int sum2 = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum2 += i;
            }
            i++;
        }
        System.out.println("1‐100之间的偶数和是：" + sum2);

        // ③.do...while循环实现：
        int sum3 = 0;
        int j = 1;
        do {
            if (j % 2 == 0) {
                sum3 += j;
            }
            j++;
        } while (j <= 100);
        System.out.println("1‐100之间的偶数和是：" + sum3);


        // break语句：打印完两次HelloWorld之后结束循环
        for (int k = 1; k <= 10; k++) {
            if (k == 3) {
                break;
            }
            System.out.println("HelloWorld:" + k);
        }

        // continue语句：不打印第三次HelloWorld
        for (int m = 1; m <= 10; m++) {
            if (m == 3) {
                continue;
            }
            System.out.println("HelloWorld:" + m);
        }

    }
}
