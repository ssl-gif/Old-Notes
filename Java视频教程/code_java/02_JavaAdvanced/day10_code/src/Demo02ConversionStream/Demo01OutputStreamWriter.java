
/*

    java.io.OutputStreamWriter extends Writer，是字符输出转换流，它是字符流通向字节流的桥梁。它会覆盖重写其父类Writer
的所有成员方法，并且OutputStreamWriter流对象对这些成员方法的使用，和另一个子类FileWriter流对象使用这些成员方法无异。

        public OutputStreamWriter(OutputStream out)：创建一个使用IDE默认编码方式的字符输出转换流对象
        public OutputStreamWriter(OutputStream out, String charsetName)：创建一个指定编码方式的字符输出转换流对象

    参数OutputStream out是字符输出转换流底层用来写出字节数据的字节输出流。String charsetName是指定的编码表名称，不区分大
小写，可以是utf-8\UTF-8、gbk\GBK...，不指定时则使用IDE默认的编码表。

 */
package Demo02ConversionStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo01OutputStreamWriter {
    public static void main(String[] args) {

    }

    // 使用OutputStreamWriter写入数据到GBK格式的文件
    private static void demo01() throws IOException {

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10_code\\src\\Demo02ConversionStream\\File_GBK.txt"), "GBK");

        osw.write("你好");

        // osw.flush(); 刷新字节缓冲数组中的数据到文件中，可直接使用close()方法

        osw.close();

    }

    // 使用OutputStreamWriter写入数据到UTF-8格式的文件
    private static void demo02() throws IOException {

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10_code\\src\\Demo02ConversionStream\\File_UTF-8.txt"), "UTF-8");
        // OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10_code\\src\\Demo02ConversionStream\\File_UTF-8.txt"));  可使用默认的编码方式

        osw.write("你好");

        // osw.flush(); 刷新字节缓冲数组中的数据到文件中，可直接使用close()方法

        osw.close();

    }

}
