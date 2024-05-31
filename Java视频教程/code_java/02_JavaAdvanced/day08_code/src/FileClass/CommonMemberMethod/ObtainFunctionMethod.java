
/*

File类获取功能的方法：

            public String getAbsolutePath()：返回此File的绝对路径名字符串，获取的就是构造方法中传递路径的绝对路径
            public String getPath()：将此File转换为路径名字符串，获取的就是构造方法中传递的路径
            public String getName()：返回由此File表示的文件或目录的名称，获取的就是构造方法传递路径的结尾部分(文件/文件夹)
            public long length()：返回由此File表示的文件大小，以字节为单位。若构造方法中给出的路径不存在，则返回0

三个getXxx()方法的路径是否存在无所谓

 */

package FileClass.CommonMemberMethod;

import java.io.File;

public class ObtainFunctionMethod {
    public static void main(String[] args) {
    }

    // getAbsolutePath()方法：无论构造方法传递的路径是绝对的还是相对的，该方法返回的都是绝对路径
    private static void demo01() {

        File f1 = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClass\\ConstructorMethod.java");
        System.out.println(f1.getAbsolutePath()); // E:\code_ssl\advanced_code\day08_code\src\FileClass\ConstructorMethod.java

        File f2 = new File("day08_code\\src\\FileClass\\ConstructorMethod.java");
        System.out.println(f2.getAbsolutePath()); // E:\code_ssl\advanced_code\day08_code\src\FileClass\ConstructorMethod.java

    }

    // getPath()方法
    private static void demo02() {

        File f1 = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClass\\ConstructorMethod.java");
        System.out.println(f1.getPath()); // E:\code_ssl\advanced_code\day08_code\src\FileClass\ConstructorMethod.java

        File f2 = new File("day08_code\\src\\FileClass\\ConstructorMethod.java");
        System.out.println(f2.getPath()); // day08_code\src\FileClass\ConstructorMethod.java

    }

    // getName()方法
    private static void demo03() {

        File f1 = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClass\\ConstructorMethod.java");
        System.out.println(f1.getName()); // ConstructorMethod.java     以文件结尾

        File f2 = new File("day08_code\\src\\FileClass");
        System.out.println(f2.getName()); // FileClass      以文件夹结尾

    }

    // length()方法
    private static void demo04() {

        File f1 = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClass\\ConstructorMethod.java");
        System.out.println(f1.length()); // 2261    返回该文件的字节数

        File f2 = new File("E:\\code_ssl\\advanced_code\\day08_code\\src\\FileClass");
        System.out.println(f2.length()); // 0       文件夹是没有大小概念的，返回值为0

    }

}
