
/*

练习：将文件in.txt中被打乱顺序的《出师表》，按照每行文本前的数字排序，并写入到文件out.txt中

    HashMap集合是存取无序的集合，并且会按照Key的大小自动对集合元素进行排序，所以在此例中可以使用HashMap集合先存储每行内容，
再取出即可实现排序。而LinkedHashMap集合是存取有序的集合，所以如果此例使用LinkedHashMap集合那么取出的结果将不会改变。

 */
package Demo01BufferStream;

import java.io.*;
import java.util.HashMap;

public class Demo03Practice {
    public static void main(String[] args) throws IOException {

        // 创建一个HashMap集合对象，Key用来存储每行文本前的数字，value用来存储每行文本的内容
        HashMap<String, String> map = new HashMap<>();

        // 创建字符缓冲输入流对象，构造方法中传入文件字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader("day10_code\\src\\Demo01BufferStream\\in.txt"));
        // 创建字符缓冲输出流对象，构造方法中传入文件字符输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10_code\\src\\Demo01BufferStream\\out.txt"));

        // 使用字符输入缓冲流循环读取每行文本的内容
        String line;
        while ((line = br.readLine()) != null) {
            // 将读取到的每行内容按照英文句点分割
            String[] arr = line.split("\\.");
            // 将每行内容分割后的数字存入map集合的Key中，文本存入map集合的Value中
            map.put(arr[0], arr[1]);
        }

        // 遍历map集合获取所有键值对
        for (String key : map.keySet()) {
            String value = map.get(key);
            // 把每一个键值对，拼接成一个文本行
            line = key + "." + value;
            // 把拼接好的文本行使用字符输出缓冲流写入文件中
            bw.write(line);
            // 每一行的末尾写换行符号
            bw.newLine();
        }

        bw.close();
        br.close();

    }
}
