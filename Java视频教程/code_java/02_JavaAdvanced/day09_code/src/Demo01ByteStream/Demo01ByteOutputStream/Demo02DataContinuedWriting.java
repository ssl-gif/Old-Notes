
/*

(1).数据的追加续写：

    每次运行程序，创建文件字节输出流对象时无论文件是否存在都会创建一个新的文件，若文件已存在则会被覆盖掉。如果要向某个已存在的文件
中追加续写一些内容，就要使用以下构造方法来创建FileOutputStream对象。

        FileOutputStream(String name, boolean append)：创建一个向 "具有指定名称的文件" 中写入数据的文件字节输出流
        FileOutputStream(File file, boolean append)：创建一个向 "指定File对象表示的文件" 中写入数据的文件字节输出流

boolean append参数相当于是 "追加写的开关"。true：创建对象不会覆盖源文件，继续在文件的末尾追加写数据；false：创建一个新文件，覆盖源文件

(2).写换行符号到文件中：将换行符号写入文件中，形成换行

windows：\r\n
linux：/n
mac：/r

由于write()方法只能接收字节数组、int类型的整数，所以换行符号也要先转换成字节数组再写入

 */

package Demo01ByteStream.Demo01ByteOutputStream;

import java.io.IOException;
import java.io.FileOutputStream;

public class Demo02DataContinuedWriting {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("day09_code\\a.txt", true);

        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }

        fos.close();

    }
}
