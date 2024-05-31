package Demo01_StringClass;

public class Demo02_StringGet {
    public static void main(String[] args) {

        // 获取字符串的长度
        int len = "qwertyuiopasdfghjkl".length();
        System.out.println("长度是：" + len);

        // 拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1); // Hello，原封不动
        System.out.println(str2); // World，原封不动
        System.out.println(str3); // HelloWorld，在常量池中创建了一个新的字符串

        // 获取指定索引处的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引处的字符是：" + ch);

        // 查找参数字符串在当前字符串中首次出现的索引位置
        int index = "HelloWorldHelloWorld".indexOf("llo");
        System.out.println("首次出现的索引位置是：" + index); // 2
        System.out.println("HelloWorld".indexOf("abc")); // 如果没有返回-1值

    }
}