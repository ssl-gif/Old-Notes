
/*

    java.io.FileWriter extends OutputStreamWriter extends Writer，是文件字符输出流，用于将程序中的数据通过该
字符输出流写入到硬盘的文件中，FileWriter类会覆盖重写其顶层父类Writer的所有抽象方法。

                FileWriter(String name)：创建一个向 "具有指定名称的文件" 中写入数据的文件字符输出流
                FileWriter(File file)：创建一个向 "指定File对象表示的文件" 中写入数据的文件字符输出流

    创建一个FileWriter对象时，就是建立了一个文件字符输出流对象，并会把此FileWriter对象指向构造方法中传递的文件，
无论构造方法中的文件路径是否存在，都会创建一个空的文件。(若文件已存在则会被覆盖掉)

#.注意事项：
    FileWriter类的构造方法会抛出FileNotFoundException编译器异常，Writer类中的成员方法也会抛出IOException编译器异常，
并且"FileNotFoundException extends IOException"，所以在处理异常时，只需要 throws IOException、或 try...catch(IOException e)即可

 */

package Demo02CharacterStream.Demo01CharacterOutputStream;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01FileWriterClass {
    public static void main(String[] args) {
    }

    // write(int c)方法：写入单个字符
    private static void demo01() throws IOException {

        // 创建一个文件字符输出流对象，指向文件："day09_code\a.txt"
        FileWriter fw = new FileWriter("day09_code\\a.txt");

        // 调用write()方法将单个字符写入到内存缓冲区中
        fw.write(97);

        // fw.flush();  调用flush()方法刷新内存缓冲区中的数据到文件中，可直接使用close()方法

        // 调用close()方法关闭输出流释放系统资源，关闭输出流之前也会先刷新内存缓冲区中的数据到文件中
        fw.close();

    }

    // write(char[] cbuf)方法：写入字符数组
    private static void demo02() throws IOException {

        FileWriter fw = new FileWriter("day09_code\\b.txt");

        char[] cbuf = {'a', 'b', 'c', 'd', 'e'};
        fw.write(cbuf);

        fw.close();

    }

    // write(char[] cbuf, int off, int len)方法：写入字符数组的一部分
    private static void demo03() throws IOException {

        FileWriter fw = new FileWriter("day09_code\\c.txt");

        char[] cbuf = {'a', 'b', 'c', 'd', 'e'};
        fw.write(cbuf, 1, 3);

        fw.close();

    }

    // write(String str)方法：写入字符串
    private static void demo04() throws IOException {

        FileWriter fw = new FileWriter("day09_code\\d.txt");

        fw.write("迪丽热巴");

        fw.close();

    }

    // write(String str, int off, int len)方法：写入字符串的一部分
    private static void demo05() throws IOException {

        FileWriter fw = new FileWriter("day09_code\\e.txt");

        fw.write("迪丽热巴", 1, 2);

        fw.close();

    }

}
