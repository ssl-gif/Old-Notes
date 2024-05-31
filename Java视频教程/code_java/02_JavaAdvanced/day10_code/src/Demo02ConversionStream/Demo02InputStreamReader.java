
/*

    java.io.InputStreamReader extends Reader，是字符输入转换流，它是字节流通向字符流的桥梁。它会覆盖重写其父类Reader
的所有成员方法，并且InputStreamReader流对象对这些成员方法的使用，和另一个子类FileReader流对象使用这些成员方法无异。

        public InputStreamReader(InputStream in)：创建一个使用IDE默认编码方式的字符输入转换流对象
        public InputStreamReader(InputStream in, String charsetName)：创建一个指定编码方式的字符输入转换流对象

    参数InputStream in是字符输入转换流底层用来读取字节数据的字节输入流。String charsetName是指定的编码表名称，不区分大
小写，可以是utf-8\UTF-8、gbk\GBK...，不指定时则使用IDE默认的编码表。
(构造方法中指定的编码表名称要和文件的编码方式相同，否则会发生乱码)

 */
package Demo02ConversionStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo02InputStreamReader {
    public static void main(String[] args) {
    }

    // 使用InputStreamReader读取GBK格式的文件中的数据
    private static void demo01() throws IOException {

        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10_code\\src\\Demo02ConversionStream\\File_GBK.txt"), "GBK");

        int length;
        while ((length = isr.read()) != -1) {
            System.out.println((char) length);
        }

        isr.close();

    }

    // 使用InputStreamReader读取UTF-8格式的文件中的数据
    private static void demo02() throws IOException {

        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10_code\\src\\Demo02ConversionStream\\File_UTF-8.txt"), "UTF-8");
        // InputStreamReader isr = new InputStreamReader(new FileInputStream("day10_code\\src\\Demo02ConversionStream\\File_UTF-8.txt"));  可使用默认的编码方式

        int length;
        while ((length = isr.read()) != -1) {
            System.out.println((char) length);
        }

        isr.close();

    }

}
