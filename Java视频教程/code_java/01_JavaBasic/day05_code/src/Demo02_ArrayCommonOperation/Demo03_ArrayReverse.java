package Demo02_ArrayCommonOperation;

public class Demo03_ArrayReverse {
    public static void main(String[] args) {

        int[] array = {10, 30, 89, 55, 60};

        // 遍历打印输出反转前的数组
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // 利用循环实现数组元素反转：min、max分别保存数组的最小、最大索引
        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }

        // 遍历打印输出反转后的数组
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
