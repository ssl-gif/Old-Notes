
/*

    java.io.FileReader extends InputStreamReader extends Reader，是文件字符输入流，用于将硬盘文件中的数据通过该字符输入流
读取到程序中，FileReader类会覆盖重写其顶层父类Reader的所有抽象方法。

                FileReader(String name)：创建一个从 "具有指定名称的文件" 中读取数据的文件字符输入流
                FileReader(File file)：创建一个从 "指定File对象表示的文件" 中读取数据的文件字符输入流

    创建一个FileReader对象时，就是建立了一个文件字符输入流对象，并会把此FileReader对象指向构造方法中传递的文件(数据源)，
若文件不存在，则会抛出FileNotFoundException运行期异常。

#.注意事项：
    FileReader类的构造方法会抛出FileNotFoundException编译器异常，Reader类中的成员方法也会抛出IOException编译器异常，
并且"FileNotFoundException extends IOException"，所以在处理异常时，只需要 throws IOException、或 try...catch(IOException e)即可

 */
package Demo02CharacterStream.Demo02CharacterInputStream;

import java.io.FileReader;
import java.io.IOException;

public class Demo01FileReaderClass {
    public static void main(String[] args) {
    }

    // read()方法：一次读取一个字符
    private static void demo01() throws IOException {

        // 创建一个文件字符输入流对象，指向文件："day09_code\a.txt" (假设a.txt存储的是abc)
        FileReader fr = new FileReader("day09_code\\a.txt");

        /*
            调用read()方法就是通过文件字符输入流fr，读取a.txt文件的下一个字符并返回，若没有下一个字符则返回-1。
        由于返回值为int类型，所以会将字符形式的数据转换成对应的int类型整数返回。
         */
        int len = fr.read();
        System.out.println(len); // 97

        len = fr.read();
        System.out.println(len); // 98

        len = fr.read();
        System.out.println(len); // 99

        len = fr.read();
        System.out.println(len); // -1  没有下一个字符数据，返回-1


        // 使用循环来优化上述读取过程
        int length;
        while ((length = fr.read()) != -1) {
            System.out.println((char) length);
        }

        // 调用close()方法关闭此输入流，并释放此流相关联的任何系统资源
        fr.close();

    }

    // read(char[] cbuf)方法：使用字符数组，一次可读取多个字符
    private static void demo02() throws IOException {

        // 创建一个文件字符输入流对象，指向文件："day09_code\b.txt" (假设b.txt存储的是ABCDE)
        FileReader fr = new FileReader("day09_code\\b.txt");

        /*
            调用read(char[] b)方法就是通过文件字符输入流fr，读取b.txt文件中一定数量的字符，并将读取到的字符存储在字符数组cbuf中。
        返回读取到的有效字符个数，若没有读取到字符则返回-1。
        (1).字符数组 char[] b 称为缓冲区数组：
            方法的参数 char[] b 起到一种缓冲的作用，用来存储每次读取到的多个字符，并且会覆盖掉上一次读取数据时所存储的内容。其实
        每次读取到的字符数量取决于字符数组的长度，所以一般把数组的长度定义为1024或1024的整数倍，即每次读取几个kb
        (2).String类的构造方法
            String(char[] chars)：把字符数组转换为字符串
            String(char[] chars, int offset, int length)：把字符数组的一部分转换为字符串，offset为开始索引、length为字符个数
         */
        char[] cbuf = new char[2];
        int len = fr.read(cbuf);
        System.out.println(len); // 2
        System.out.println(new String(cbuf)); // AB

        len = fr.read(cbuf);
        System.out.println(len); // 2
        System.out.println(new String(cbuf)); // CD   将上一次读取得到的AB覆盖掉

        len = fr.read(cbuf);
        System.out.println(len); // 1
        System.out.println(new String(cbuf)); // ED   将上一次读取得到的C覆盖掉

        len = fr.read();
        System.out.println(len); // -1  没有下一个字符数据，返回-1


        // 使用循环来优化上述读取过程
        char[] charbuf = new char[1024];
        int length = 0;
        while ((length = fr.read(charbuf)) != -1) {
            System.out.println(length);
            System.out.println(new String(charbuf, 0, length));
        }

        // 调用close()方法关闭此输入流，并释放此流相关联的任何系统资源
        fr.close();

    }

}
