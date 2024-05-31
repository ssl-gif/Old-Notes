
/*

(1).字节缓冲输出流 BufferedOutputStream ：

    java.io.BufferedOutputStream extends OutputStream，是字节缓冲输出流。它会覆盖重写其父类OutputStream的所有成员方法，
并且BufferedOutputStream流对象对这些成员方法的使用，和另一个子类FileOutputStream流对象使用这些成员方法无异。

        public BufferedOutputStream(OutputStream out)：创建一个字节缓冲输出流对象，缓冲区数组为默认大小
        public BufferedOutputStream(OutputStream out, int size)：创建一个字节缓冲输出流对象，并指定缓冲区数组的大小

    参数OutputStream out是字节输出流，我们可以传递其子类FileOutputStream文件字节输出流对象作为参数，此时缓冲流会给该文件字
节输出流增加一个缓冲区数组，以提高该文件字节输出流的写入效率。


(2).字节缓冲输入流 BufferedInputStream ：

    java.io.BufferedInputStream extends InputStream，是字节缓冲输入流。它会覆盖重写其父类InputStream的所有成员方法，
并且BufferedInputStream流对象对这些成员方法的使用，和另一个子类FileInputStream流对象使用这些成员方法无异。

        public BufferedInputStream(InputStream in)：创建一个字节缓冲输入流对象，缓冲区数组为默认大小
        public BufferedInputStream(InputStream in, int size)：创建一个字节缓冲输入出流对象，并指定缓冲区数组的大小

    参数InputStream in是字节输入流，我们可以传递其子类FileInputStream文件字节输入流对象作为参数，此时缓冲流会给该文件字节
输入流增加一个缓冲区数组，以提高该文件字节输入流的读取效率。


#.注意事项：

a.对于字节缓冲输出流来说，写入的数据暂时存放在缓冲区数组中，当该缓冲区数组满了，才会将数据自动写入目的地。我们也可以调用flush()
方法把数据手动刷新到目的地。其实close()方法在关闭输出流之前，也会先刷新缓冲区中的数据到目的地，所以我们直接使用close()方法即可。
注意：字节缓冲输入流不需要使用flush()方法

b.字节缓冲流对象在调用close()方法关闭时，其构造方法中传递的字节流对象会自动关闭，不需要调用close()方法将其关闭。


 */
package Demo01BufferStream;

import java.io.*;

public class Demo01ByteBufferStream {
    public static void main(String[] args) {

    }

    // 使用普通字节流读写数据，完成图片复制
    private static void demo01() throws IOException {

        long s = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("day10_code\\test.jpg");
        FileOutputStream fos = new FileOutputStream("day10_code\\test_copy.jpg");

        byte[] bytes = new byte[1024];
        int length = 0;
        while ((length = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, length);
        }

        fos.close();
        fis.close();

        long e = System.currentTimeMillis();
        System.out.println("使用普通字节流复制文件共耗时:" + (e - s) + "毫秒");

    }

    // 使用缓冲字节流读写数据，完成图片复制
    private static void demo02() throws IOException {

        long s = System.currentTimeMillis();

        // 创建字节缓冲输入流对象，构造方法中传递文件字节输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day10_code\\test.jpg"));
        // 创建字节缓冲输出流对象，构造方法中传递文件字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day10_code\\test_copy.jpg"));

        byte[] bytes = new byte[1024];
        int length = 0;
        while ((length = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, length);
        }

        // bos.flush(); 刷新缓冲数组中的数据到文件中，可直接使用close()方法

        bos.close();
        bis.close();

        long e = System.currentTimeMillis();
        System.out.println("使用缓冲字节流复制文件共耗时:" + (e - s) + "毫秒"); // 使用缓冲流读写数据更高效，耗时更少

    }

}
