
/*

    java.io.FileInputStream extends InputStream，是文件字节输入流，用于将硬盘文件中的数据通过该字节输入流读取到程序中，
FileInputStream类会覆盖重写其父类InputStream的所有抽象方法。

                FileInputStream(String name)：创建一个从 "具有指定名称的文件" 中读取数据的文件字节输入流
                FileInputStream(File file)：创建一个从 "指定File对象表示的文件" 中读取数据的文件字节输入流

    创建一个FileInputStream对象时，就是建立了一个文件字节输入流对象，并会把此FileInputStream对象指向构造方法中传递的文件(数据源)，
若文件不存在，则会抛出FileNotFoundException运行期异常。

#.注意事项：
    FileInputStream类的构造方法会抛出FileNotFoundException编译器异常，InputStream类中的成员方法也会抛出IOException编译器异常，
并且"FileNotFoundException extends IOException"，所以在处理异常时，只需要 throws IOException、或 try...catch(IOException e)即可

 */
package Demo01ByteStream.Demo02ByteInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01FileInputStreamClass {
    public static void main(String[] args) {
    }

    // read()方法：一次读取一个字节
    private static void demo01() throws IOException {

        // 创建一个文件字节输入流对象，指向文件："day09_code\a.txt" (假设a.txt存储的是abc)
        FileInputStream fis = new FileInputStream("day09_code\\a.txt");

        /*
            调用read()方法就是通过文件字节输入流fis，读取a.txt文件的下一个字节并返回，若没有下一个字节则返回-1。
        由于返回值为int类型，所以会将字节形式的数据转换成对应的int类型整数返回。
         */
        int len = fis.read();
        System.out.println(len); // 97

        len = fis.read();
        System.out.println(len); // 98

        len = fis.read();
        System.out.println(len); // 99

        len = fis.read();
        System.out.println(len); // -1  没有下一个字节数据，返回-1


        // 使用循环来优化上述读取过程
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println(b);
        }

        // 调用close()方法关闭此输入流，并释放此流相关联的任何系统资源
        fis.close();

    }

    // read(byte[] b)方法：使用数组，一次可读取多个字节
    private static void demo02() throws IOException {

        // 创建一个文件字节输入流对象，指向文件："day09_code\b.txt" (假设b.txt存储的是ABCDE)
        FileInputStream fis = new FileInputStream("day09_code\\b.txt");

        /*
            调用read(byte[] b)方法就是通过文件字节输入流fis，读取b.txt文件中一定数量的字节，并将读取到的字节存储在字节数组b中。
        返回读取到的有效字节个数，若没有读取到字节则返回-1。
        (1).字节数组 byte[] b 称为缓冲区数组：
            方法的参数 byte[] b 起到一种缓冲的作用，用来存储每次读取到的多个字节，并且会覆盖掉上一次读取数据时所存储的内容。其实
        每次读取到的字节数量取决于字节数组的长度，所以一般把数组的长度定义为1024或1024的整数倍，即每次读取1kb或几kb
        (2).String类的构造方法
            String(byte[] bytes)：把字节数组转换为字符串
            String(byte[] bytes, int offset, int length)：把字节数组的一部分转换为字符串，offset为开始索引、length为字节个数
         */
        byte[] b = new byte[2];
        int len = fis.read(b);
        System.out.println(len); // 2
        System.out.println(new String(b)); // AB

        len = fis.read(b);
        System.out.println(len); // 2
        System.out.println(new String(b)); // CD   将上一次读取得到的AB覆盖掉

        len = fis.read(b);
        System.out.println(len); // 1
        System.out.println(new String(b)); // ED   将上一次读取得到的C覆盖掉

        len = fis.read();
        System.out.println(len); // -1  没有下一个字节数据，返回-1


        // 使用循环来优化上述读取过程
        byte[] bytes = new byte[1024];
        int length = 0;
        while ((length = fis.read(bytes)) != -1) {
            System.out.println(length);
            System.out.println(new String(bytes, 0, length));
        }

        // 调用close()方法关闭此输入流，并释放此流相关联的任何系统资源
        fis.close();

    }

}
