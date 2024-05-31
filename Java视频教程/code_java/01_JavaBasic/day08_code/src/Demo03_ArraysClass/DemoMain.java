package Demo03_ArraysClass;

import java.util.Arrays;

public class DemoMain {
    public static void main(String[] args) {

        // 将int[]数组变成字符串
        int[] array1 = {10, 20, 30};
        String str = Arrays.toString(array1);
        System.out.println(str); // [10, 20, 30]

        // 对int[]数组升序排序
        int[] array2 = {2, 1, 3, 10, 6};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2)); // [1, 2, 3, 6, 10]

    }
}