
// 使用递归计算1-n的和:    1 + 2 + 3 + ... + n  ===>  n + (n-1) + (n-2) + ... + 1

package Recursive;

public class RecursiveSum {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    private static int sum(int n) {

        // 递归结束条件：获取到1的时候结束
        if (n == 1) {
            return 1;
        }

        return n + sum(n - 1);
    }
}


