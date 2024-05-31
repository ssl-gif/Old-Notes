public class Demo01_JudgementSentence {
    public static void main(String[] args) {
        // 标准的if-else语句和三元运算符的互换
        int a = 10;
        int b = 20;
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("最大值是：" + max);
    }
}