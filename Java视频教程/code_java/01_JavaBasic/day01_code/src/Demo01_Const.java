public class Demo01_Const {
    public static void main(String[] args){

        // 输出整数常量
        System.out.println(456);
        System.out.println(-789);

        // 输出浮点数常量
        System.out.println(2.365);
        System.out.println(-13.56);

        // 输出字符常量
        System.out.println(' ');    // 正确，字符为一个空格字符
        System.out.println('好');   // 正确，Java中的字符常量支持单个中文字符
        // System.out.println('');   错误，不可没有字符
        // System.out.println('AB'); 错误，不可有两个字符

        // 输出字符串常量
        System.out.println("ABC");
        System.out.println("");    // 正确，字符串常量中的内容可以为空(打印出一个空白行)

        // 输出布尔常量
        System.out.println(true);
        System.out.println(false);  // 输出结果就是true、false

        // 输出空常量
        // System.out.println(null); 错误，空常量不能直接用来打印输出

    }
}