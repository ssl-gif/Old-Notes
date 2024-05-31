
// 使用递归计算n的阶乘:    n! = n * (n-1) * ... * 3 * 2 * 1

package Recursive;

public class RecursiveFactorial {
    public static void main(String[] args) {
        System.out.println(jc(20));
    }

    private static int jc(int n) {

        // 递归结束条件：获取到1的时候结束
        if (n == 1) {
            return 1;
        }

        return n * jc(n - 1);
    }

}
