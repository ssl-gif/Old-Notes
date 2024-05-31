package Demo01_StringClass;

public class Demo05_StringSplit {
    public static void main(String[] args) {

        // 遇见空格就分割
        String str1 = "aaa bbb ccc";
        String[] array1 = str1.split(" ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        // 遇见逗号就分割
        String str2 = "aaa,bbb,ccc";
        String[] array2 = str2.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array2[i]);
        }

        // 遇见英文句点就分割
        String str3 = "aaa.bbb.ccc";
        String[] array3 = str3.split("\\.");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

    }
}