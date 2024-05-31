package Demo02_XMLParsing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Demo01_JsoupToolClass {
    public static void main(String[] args) throws IOException {

        // 传递html、xml文档对应的File类对象
        Document document01 = Jsoup.parse(new File("day11_code\\src\\Demo02_XMLParsing\\student.xml"), "UTF-8");
        System.out.println(document01);

        // 传递html、xml文档的字符串
        String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "\n" +
                "<students>\n" +
                "\n" +
                "\t<student number=\"heima_0001\">\n" +
                "\t\t<name id=\"1\">tom</name>\n" +
                "\t\t<age>18</age>\n" +
                "\t\t<sex>male</sex>\n" +
                "\t</student>\n" +
                "\n" +
                "\t<student number=\"heima_0002\">\n" +
                "\t\t<name id=\"2\">jack</name>\n" +
                "\t\t<age>20</age>\n" +
                "\t\t<sex>female</sex>\n" +
                "\t</student>\n" +
                "\n" +
                "</students>";
        Document document02 = Jsoup.parse(str);
        System.out.println(document02);

        // 传递指定网络路径的html、xml文档
        URL url = new URL("https://www.baidu.com/");
        Document document03 = Jsoup.parse(url, 10000);
        System.out.println(document03);

    }
}
