
/*

    java.io.FileOutputStream extends OutputStream，是文件字节输出流，用于将程序中的数据通过该字节输出流写入到硬盘的文件中，
FileOutputStream类会覆盖重写其父类OutputStream的所有抽象方法。

                FileOutputStream(String name)：创建一个向 "具有指定名称的文件" 中写入数据的文件字节输出流
                FileOutputStream(File file)：创建一个向 "指定File对象表示的文件" 中写入数据的文件字节输出流

    创建一个FileOutputStream对象时，就是建立了一个文件字节输出流对象，并会把此FileOutputStream对象指向构造方法中传递的文件，
无论构造方法中的文件路径是否存在，都会创建一个空的文件。(若文件已存在则会被覆盖掉)

#.注意事项：
    FileOutputStream类的构造方法会抛出FileNotFoundException编译器异常 ，OutputStream类中的成员方法也会抛出IOException编译器异常，
并且"FileNotFoundException extends IOException"，所以在处理异常时，只需要 throws IOException、或 try...catch(IOException e)即可

 */

package Demo01ByteStream.Demo01ByteOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo01FileOutputStreamClass {
    public static void main(String[] args) {
    }

    // write(int b)方法：一次写入一个字节
    private static void demo01() throws IOException {

        // 创建一个文件字节输出流对象，指向文件："day09_code\a.txt"
        FileOutputStream fos = new FileOutputStream("day09_code\\a.txt");

        /*
            调用write()方法就是将int类型整数97的字节形式："0000 0000 0000 0000 0000 0000 ‭0110 0001"‬，以字节为基本单位依次写入
        到文件字节输出流fos中，然后fos会把这些字节依次写入到文件a.txt中，此时a.txt中保存的就是字节："... ‭0110 0001"
            任意的文本编辑器在打开文本文件时，都会把根据编码表将字节转换为相应的字符表示，字节"... ‭0110 0001"对应的数值是97对应的
        字符是a，所以打开a.txt文件显示的就是字符a
         */
        fos.write(97);

        // 调用close()方法关闭此输出流，并释放此流相关联的任何系统资源
        fos.close();

    }

    // write(byte[] b)方法：使用数组，一次可写入多个字节
    private static void demo02() throws IOException {

        FileOutputStream fos = new FileOutputStream("day09_code\\b.txt");

        /*
            调用write()方法就是将数组中的byte类型整数的字节形式："‭0100 0001‬"、"‭0100 0010‬"、"‭0100 0011‬"、"‭0100 0100‬‬"、"‭0100 0101‬‬"
        以字节为基本单位依次写入到文件字节输出流fos中，然后fos会把这些字节依次写入到文件b.txt中，此时b.txt中保存的就是上述字节。
            上述字节对应的数值是65、66、67、68、69对应的字符是A、B、C、D、E，所以使用文本编辑器打开b.txt文件显示的就是字符ABCDE
         */
        byte[] b = {65, 66, 67, 68, 69};
        fos.write(b);

        fos.close();

        /*
        使用字节数组一次写入多个字节时：
            如果写的第一个字节是正数(0-127)，那么显示的时候会查询ASCII表
            如果写的第一个字节是负数，那么第一个字节会和第二个字节一起组成一个中文显示，会查询系统默认编码表GBK
         */
        // byte[] bytes = {-65, -66, -67, 68, 69};   烤紻E
        // fos.write(bytes);

    }

    // write(byte[] b, int off, int len)方法：
    private static void demo03() throws IOException {

        FileOutputStream fos = new FileOutputStream("day09_code\\c.txt");

        /*
            调用write()方法将数组中的byte类型整数的字节形式："‭0100 0001‬"、"‭0100 0010‬"、"‭0100 0011‬"、"‭0100 0100‬‬"、"‭0100 0101‬‬"
        将 "从数组索引为1处开始、2个数组元素对应的字节" 以字节为基本单位依次写入到文件字节输出流fos中，然后fos会把这些字节依次写入
        到文件c.txt中，此时c.txt中保存的就是上述字节。
            上述字节对应的数值是66、67对应的字符是B、C，所以打开c.txt文件显示的就是字符BC
         */
        byte[] b = {65, 66, 67, 68, 69};
        fos.write(b, 1, 2);

        fos.close();

    }

    // 额外拓展：写入字符串到文件的方法
    private static void demo04() throws IOException {

        FileOutputStream fos = new FileOutputStream("day09_code\\d.txt");

        // 使用String类中的getBytes()方法将字符串转换成字节数组
        byte[] b = "你好".getBytes();

        System.out.println(Arrays.toString(b)); // [-28, -67, -96, -27, -91, -67]

        fos.write(b);
        fos.close();

    }

}
