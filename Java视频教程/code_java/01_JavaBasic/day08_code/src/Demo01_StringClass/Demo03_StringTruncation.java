package Demo01_StringClass;

public class Demo03_StringTruncation {
    public static void main(String[] args) {

        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1); // HelloWorld，原封不动
        System.out.println(str2); // World，在常量池中创建了一个新字符串

        String str3 = str1.substring(2, 5);
        System.out.println(str1); // HelloWorld，原封不动
        System.out.println(str2); // llo，在常量池中创建了一个新字符串

    }
}