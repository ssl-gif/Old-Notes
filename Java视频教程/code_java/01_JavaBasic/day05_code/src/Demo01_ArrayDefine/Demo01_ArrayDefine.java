package Demo01_ArrayDefine;

public class Demo01_ArrayDefine {
    public static void main(String[] args) {

        // ①.动态初始化：
        int[] array1 = new int[3];
        array1[0] = 5; array1[1] = 15; array1[2] = 25;
        String[] array2 = new String[3];
        array2[0] = "Hello"; array2[1] = "World"; array2[2] = "Java";

        // ②.静态初始化的标准格式：
        int[] array3 = new int[]{5, 15, 25};
        String[] array4 = new String[]{"Hello", "World", "Java"};

        // ③.静态初始化的省略格式：
        int[] array5 = {5, 15, 25};
        String[] array6 = {"Hello", "World", "Java"};

    }
}
