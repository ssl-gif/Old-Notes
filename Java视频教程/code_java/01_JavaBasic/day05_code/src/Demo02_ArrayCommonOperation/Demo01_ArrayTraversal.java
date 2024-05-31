package Demo02_ArrayCommonOperation;

public class Demo01_ArrayTraversal {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {   // 这个for循环可使用：array.fori 自动生成
            System.out.println(array[i]);
        }

        // 或者：
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }
}
