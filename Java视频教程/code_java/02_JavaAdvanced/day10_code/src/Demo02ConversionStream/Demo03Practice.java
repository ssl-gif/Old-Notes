
// 练习：转换文件编码，将GBK编码的文本文件，转换为UTF-8编码的文本文件
package Demo02ConversionStream;

import java.io.*;

public class Demo03Practice {
    public static void main(String[] args) throws IOException {

        // 创建一个InputStreamReader流对象，用来读取GBK格式的文件中的数据
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10_code\\src\\Demo02ConversionStream\\File_GBK.txt"), "GBK");

        // 创建一个OutputStreamWriter流对象，用来写入数据到UTF-8格式的文件
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10_code\\src\\Demo02ConversionStream\\File_UTF-8.txt"), "UTF-8");

        int length;
        while ((length = isr.read()) != -1) {
            osw.write(length);
        }

        osw.close();
        isr.close();

    }
}