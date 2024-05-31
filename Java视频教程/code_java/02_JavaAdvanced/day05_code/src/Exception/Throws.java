
/*

throws关键字：异常处理的第一种方式，交给别人处理

    当方法内部抛出异常对象的时候，我们就必须在方法调用处进行异常处理。可以使用throws关键字处理
异常对象，此时会把异常对象抛出给方法的调用者处理(自己不处理，给别人处理)

        修饰符 返回值类型 方法名(参数列表) throws AAAException, BBBException ... {
                throw new AAAException("异常产生原因");
                throw new BBBException("异常产生原因");
                ...
        }

#.注意事项：

(1).throws关键字后边声明的异常必须是Exception或者是Exception的子类

(2).如果方法内部抛出了多个异常对象，那么throws后边也必须声明多个异常。如果抛出的多个异常对象有父子类关系，那么直接声明父类异常即可。

(3).调用了一个声明抛出异常的方法，我们就必须处理声明的异常
        要么继续使用throws声明抛出，交给方法的调用者处理(最终交给JVM)
        要么try...catch自己处理异常

 */

package Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Throws {

    // public static void main(String[] args) throws Exception
    // public static void main(String[] args) throws IOException
    public static void main(String[] args) throws FileNotFoundException, IOException {

        readFile("c:\\a.t");

        System.out.println("后续代码"); // JVM中断处理，后续代码不会被执行

    }

    // 定义一个方法，对传递的文件路径进行合法性判断。FileNotFoundException、IOException均为编译异常，必须要进行异常处理
    private static void readFile(String fileName) throws FileNotFoundException, IOException {

        // 如果路径不是"c:\\a.txt"，那么就抛出文件找不到异常 FileNotFoundException，告知方法的调用者
        if (fileName.equals("c:\\a.txt")) {
            throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");
        }

        // 如果路径不是".txt"结尾，那么就抛出IO异常 IOException，告知方法的调用者
        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件的后缀名不对");
        }

        System.out.println("文件路径没有问题，读取文件");

    }

}
