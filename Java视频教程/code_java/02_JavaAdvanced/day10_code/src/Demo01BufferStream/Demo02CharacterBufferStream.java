
/*

(1).字符缓冲输出流 BufferedWriter

    java.io.BufferedWriter extends Writer，是字符缓冲输出流。它会覆盖重写其父类Writer的所有成员方法，并且BufferedWriter
流对象对这些成员方法的使用，和另一个子类FileWriter流对象使用这些成员方法无异。

构造方法：
        public BufferedWriter(Writer out)：创建一个新的字符缓冲输出流对象，缓冲区数组为默认大小
        public BufferedWriter(Writer out, int size)：创建一个字符缓冲输出流对象，并指定缓冲区数组的大小
    参数Writer out是字符输出流，我们可以传递其子类FileWriter文件字符输出流对象作为参数，此时缓冲流会给该文件字符输出流增加一
个缓冲区数组，以提高该文件字符输出流的写入效率。

特有成员方法：
        void newLine()：写入一个换行符号(会根据不同的操作系统，获取不同的换行符号)


(2).字符缓冲输入流 BufferedReader

    java.io.BufferedReader extends Reader，是字符缓冲输入流。它会覆盖重写其父类Reader的所有成员方法，并且BufferedReader
流对象对这些成员方法的使用，和另一个子类FileReader流对象使用这些成员方法无异。

构造方法：
        public BufferedReader(Reader in)：创建一个字符缓冲输入流对象，缓冲区数组为默认大小
        public BufferedReader(Reader in, int size)：创建一个字符缓冲输入出流对象，并指定缓冲区数组的大小
    参数Reader in是字节输入流，我们可以传递其子类FileReader文件字符输入流对象作为参数，此时缓冲流会给该文件字符输入流增加一
个缓冲区数组，以提高该文件字符输入流的读取效率。

特有成员方法：
        String readLine()：读取一行数据。返回值是包含该行内容的字符串，但不包含任何行终止符，如果已到达流末尾，则返回null
        行的终止符号：可通过下列字符之一即可认为某行已终止：换行符号('\n')、回车符号('\r')、或回车后直接跟着换行("\r\n)


#.注意事项：

a.对于字符缓冲输出流来说，写入的数据暂时存放在缓冲区数组中，当该缓冲区数组满了，才会将数据自动写入目的地。我们也可以调用flush()
方法把数据手动刷新到目的地。其实close()方法在关闭输出流之前，也会先刷新缓冲区中的数据到目的地，所以我们直接使用close()方法即可。
注意：字符缓冲输入流不需要使用flush()方法

b.字符缓冲流对象在调用close()方法关闭时，其构造方法中传递的字符流对象会自动关闭，不需要调用close()方法将其关闭。

c.如果字符缓冲输出流BufferedWriter对象，是基于文件字符输出流FileWriter创建的，那么此时存在两个缓冲区，但二者是不同的概念。
文件字符输出流的缓冲区：是将流中的字符数据转换成字节数据，存储到bytebuffer[]数组中，以备传输
字符缓冲输出流的缓冲区：是将流中的数据放到一个缓冲区数组中，以备传输(底层可能就是将上述bytebuffer[]数组中的字节数据再次放入另一个缓冲区数组中以备传输)


 */
package Demo01BufferStream;

import java.io.*;

public class Demo02CharacterBufferStream {
    public static void main(String[] args) {
    }

    private static void demo01() throws IOException {

        // 创建字符缓冲输出流对象，构造方法中传递文件字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10_code\\a.txt"));

        for (int i = 0; i < 10; i++) {
            bw.write("你好");
            bw.newLine();
        }

        // bw.flush(); 刷新缓冲数组中的数据到文件中，可直接使用close()方法

        bw.close();

    }

    private static void demo02() throws IOException {

        // 创建字符缓冲输入流对象，构造方法中传递文件字符输入流
        BufferedReader br = new BufferedReader(new FileReader("day10_code\\b.txt"));

        // 循环读取单个字符
        int length;
        while ((length = br.read()) != -1) {
            System.out.println((char) length);
        }

        // 循环读取一行字符
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();

    }

}
