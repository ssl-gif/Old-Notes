
/*

    我们在程序中创建的集合对象，集合里面的数据都是临时性的，当程序在内存中运行结束时，集合对象被释放，集合里面的数据也就不存在了。
但Properties集合类可以和IO流相结合使用，将集合中的数据写入到硬盘文件中，实现数据的持久化存储。所以Properties集合类表示了一个持久
的属性集，Properties集合可保存在流中或从流中加载，Properties集合是唯一一个可以和IO流相结合的集合。

(1).Properties集合中的store()方法，可以把集合中的临时数据，持久化写入到硬盘文件中存储

        public void store(OutputStream out, String comments)：使用字节输出流将集合中的数据写入到文件中(不能写入中文，会产生乱码)
        public void store(Writer writer, String comments)：使用字符输出流将集合中的数据写入到文件中(可以写入中文)

String comments：注释，用来解释说明保存的文件是做什么用的，该字符串会被写在文件第一行。不能使用中文，会产生乱码，一般使用空字符串""

(2).Properties集合中的load()方法，可以把硬盘文件中保存的数据(键值对型数据)，读取到集合中使用

        public void load(InputStream inStream)：使用字节输入流将文件中的键值对数据写入到集合中(不能读取含有中文的键值对，会产生乱码)
        public void load(Reader reader)：使用字符输入流将文件中的键值对数据写入到集合中(能读取含有中文的键值对)

a.在存储键值对数据的文件中，键与值的连接符号可以使用 =、空格、或其他符号
b.在存储键值对数据的文件中，可以使用#进行注释，被注释的键值对数据不会被读取
c.在存储键值对数据的文件中，键与值默认都是字符串，不用再加引号

 */
package Demo04AttributeSet;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo02_PropertiesSetAndIOStream {
    public static void main(String[] args) {
    }

    // store()方法：将集合中的数据存储到文件中
    private static void demo01() throws IOException {

        Properties prop = new Properties();
        prop.setProperty("赵丽颖", "168");
        prop.setProperty("迪丽热巴", "165");
        prop.setProperty("古力娜扎", "160");

        FileWriter fw = new FileWriter("day09_code\\prop.txt");

        prop.store(fw, "save data");

        fw.close();

        /*
        prop.txt文件中的内容如下：
        #save data
        #Thu May 07 22:48:14 CST 2020
        赵丽颖=168
        迪丽热巴=165
        古力娜扎=160
         */
    }

    // load()方法：将文件中的数据读取到集合中
    private static void demo02() throws IOException {

        Properties prop = new Properties();

        FileReader fr = new FileReader("day09_code\\prop.txt");

        prop.load(fr);

        fr.close();

        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }

    }

}
