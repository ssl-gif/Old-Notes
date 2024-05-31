package Demo01_StringClass;

public class Demo01_StringEquals {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true

        // 凡是写上双引号的字符串常量，都是字符串对象
        System.out.println(str1.equals("Hello")); // true
        System.out.println("Hello".equals(str1)); // true

        String str4 = "hello";
        System.out.println(str1.equals(str4)); // false，严格区分大小写
        System.out.println(str1.equalsIgnoreCase(str4)); // true，忽略大小写

    }
}