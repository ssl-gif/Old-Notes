
/*

File类遍历(文件夹)目录功能的方法：

      public String[] list()：把该目录下的文件、文件夹的名称存储到一个String[]数组中
      public File[] listFiles()：把把该目录下的文件、文件夹封装为File对象存储到File[]数组中

(1).list()、listFiles()方法遍历的是构造方法中给出的目录。如果构造方法中给出的目录路径不存在，会抛出空指针异常。
如果构造方法中给出的路径不是一个目录，也会抛出空指针异常

(2).list()、listFiles()方法只能遍历目录下的子文件夹、子文件名称，对于子文件夹里面的内容无法遍历得到，要想遍历到
这个目录下的所有文件、文件夹，可以使用递归的形式遍历

 */

package FileClass.CommonMemberMethod;

import java.io.File;

public class TraverseDirectoryFunctionMethod {
    public static void main(String[] args) {
        demo01();
    }

    // list()方法
    private static void demo01() {

        // File file = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClass\\aaa"); // 路径不存在，NullPointerException
        // File file = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClass\\ConstructorMethod.java"); // 路径不是一个目录，NullPointerException
        File file = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClass");
        String[] array = file.list();
        for (String fileName : array) {
            System.out.println(fileName); // CommonMemberMethod   ConstructorMethod.java   FourStaticMemberVariable.java
        }

    }

    // listFiles()方法
    private static void demo02() {

        File file = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClass");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }

    }

}
