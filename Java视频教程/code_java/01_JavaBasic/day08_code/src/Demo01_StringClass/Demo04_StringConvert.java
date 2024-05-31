package Demo01_StringClass;

public class Demo04_StringConvert {
    public static void main(String[] args) {

        // 转换成字符数组
        char[] chars = "Hello".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        // 转换成字节数组
        byte[] bytes = "Hello".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        // 字符串的内容替换
        String str1 = "How do you do?";
        String str2 = str1.replace("o","*");
        System.out.println(str1); // How do you do? ，原封不动
        System.out.println(str2); // How d* you d*? ，在常量池中创建了一个新的字符串

    }
}