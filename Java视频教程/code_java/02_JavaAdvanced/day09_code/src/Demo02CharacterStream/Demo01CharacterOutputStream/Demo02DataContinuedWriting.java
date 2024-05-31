
/*

(1).数据的追加续写：

    每次运行程序，创建文件字节输出流对象时无论文件是否存在都会创建一个新的文件，若文件已存在则会被覆盖掉。如果要向某个已存在的文件
中追加续写一些内容，就要使用以下构造方法来创建FileOutputStream对象。

        FileWriter(String name, boolean append)：创建一个向 "具有指定名称的文件" 中写入数据的文件字符输出流
        FileWriter(File file, boolean append)：创建一个向 "指定File对象表示的文件" 中写入数据的文件字符输出流

boolean append参数相当于是 "追加写的开关"。true：创建对象不会覆盖源文件，继续在文件的末尾追加写数据；false：创建一个新文件，覆盖源文件

(2).写换行符号到文件中：将换行符号写入文件中，形成换行

windows：\r\n
linux：/n
mac：/r

由于write()方法可以接收字符串，所以直接写入字符串"\r\n"即可

 */

package Demo02CharacterStream.Demo01CharacterOutputStream;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02DataContinuedWriting {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("day09_code\\a.txt", true);

        for (int i = 0; i < 10; i++) {
            fw.write("你好");
            fw.write("\r\n");
        }

        fw.close();

    }
}
