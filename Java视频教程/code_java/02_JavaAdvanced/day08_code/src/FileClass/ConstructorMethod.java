
/*

File类的构造方法：

    public File(String pathname)：通过将给定的路径名字符串转换为抽象路径名来创建新的File实例
    public File(String parent, String child)：从父路径名字符串和子路径名字符串创建新的File实例。父路径、子路径可以单独书写，使用起来比较灵活
    public File(File parent, String child)：从父抽象路径名和子路径名字符串创建新的File实例。父路径是File类型，可以使用File的方法对路径进行一些操作，再使用路径创建对象

#.注意事项：

(1).创建File对象，只是单纯地把字符串路径封装为File对象，并不考虑路径的真假情况，也不会在硬盘中创建相应的文件、文件夹

(2).路径是不区分大小写的。windows使用反斜杠来分隔文件名称，由于反斜杠在程序中是转义字符，所以两个反斜杠才代表一个普通的反斜杠

    绝对路径：是一个完整的从盘符(C:、D:...)开始的路径，如："E:\code_ssl\advanced_code\day08_code\src\FileClass\ConstructorMethod.java"
    相对路径：相对于当前项目的根目录的路径，如："day08_code\src\FileClass\ConstructorMethod.java" 即前面的项目路径可以省略不写

 */

package FileClass;

import java.io.File;

public class ConstructorMethod {
    public static void main(String[] args) {
    }

    private static void demo01() {

        File f1 = new File("D:\\JetBrains\\IntelliJ IDEA 2019.2\\bin");
        System.out.println(f1); // D:\JetBrains\IntelliJ IDEA 2019.2\bin    File类重写了toString()方法

        File f2 = new File("D:\\JetBrains\\IntelliJ IDEA 2019.2\\binbin");
        System.out.println(f2); // D:\JetBrains\IntelliJ IDEA 2019.2\binbin

    }

    private static void demo02() {

        File f1 = new File("D:\\JetBrains\\", "IntelliJ IDEA 2019.2\\bin");
        System.out.println(f1); // D:\JetBrains\IntelliJ IDEA 2019.2\bin

    }

    private static void demo03() {

        File parent = new File("D:\\JetBrains\\");

        File f1 = new File(parent, "IntelliJ IDEA 2019.2\\bin");
        System.out.println(f1); // D:\JetBrains\IntelliJ IDEA 2019.2\bin

    }

}
