
/*

    java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作。常用的方法有：

public static long currentTimeMillis()：返回当前时间的毫秒值

public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：将数组中指定的数据拷贝到另一个数组中。
参数：
            src - 源数组
            srcPos - 源数组中的起始位置(起始索引)
            dest - 目标数组
            destPos - 目标数据中的起始位置
            length - 要复制的数组元素的数量

 */

package SystemClass;

import java.util.Arrays;

public class SystemClass {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    // currentTimeMillis方法
    private static void demo01() {
        // 验证for循环打印数字1-9999所需要使用的时间，用来查看程序的效率
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 9999; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("程序共耗时:" + (end - start) + "毫秒");
    }

    // arraycopy方法
    private static void demo02() {
        int[] src = {1, 2, 3, 4, 5};   // 定义源数组
        int[] dest = {6, 7, 8, 9, 10}; // 定义目标数组

        System.out.println("复制前:" + Arrays.toString(dest));

        System.arraycopy(src, 0, dest, 0, 3); // 把源数组的前3个元素复制到目标数组的前3个位置上

        System.out.println("复制后:" + Arrays.toString(dest));
    }

}

