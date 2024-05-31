
/*

File类判断功能的方法：

                public boolean exists()：此File表示的文件或目录是否实际存在，判断构造方法中的路径是否存在
                public boolean isDirectory()：此File表示的是否为目录，判断构造方法中的路径是否是一个文件夹路径
                public boolean isFile()：此File表示的是否为文件，判断构造方法中的路径是否是一个文件路径

 */

package FileClass.CommonMemberMethod;

import java.io.File;

public class JudgmentFunctionMethod {
    public static void main(String[] args) {
        demo01();
    }

    // exists()方法
    private static void demo01() {

        File f1 = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClass\\ConstructorMethod.java");
        System.out.println(f1.exists()); // true

        File f2 = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClass\\123.java");
        System.out.println(f2.exists()); // false

    }

    // isDirectory()、isFile()方法：这两个方法使用前提，路径必须是真实存在的，否则都返回false
    private static void demo02() {

        File f1 = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClass\\ConstructorMethod.java");
        System.out.println(f1.isDirectory()); // false
        System.out.println(f1.isFile());      // true

        File f2 = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClass");
        System.out.println(f2.isDirectory()); // true
        System.out.println(f2.isFile());      // false

        File f3 = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClass\\123.java");
        System.out.println(f3.isDirectory()); // false
        System.out.println(f3.isFile());      // false

    }

}
