public class Demo01_MethodDefine {
    public static void main(String[] args) {

        int sum = getSum(5, 6);        // 调用方法getSum，传递两个整数，这里传递的实际数据又称为实际参数
        System.out.println(sum);
    }

    public static int getSum(int a, int b) { // 这里的参数用来接收实际数据，又称为形式参数
        int result = a + b;
        return result;
    }

}
