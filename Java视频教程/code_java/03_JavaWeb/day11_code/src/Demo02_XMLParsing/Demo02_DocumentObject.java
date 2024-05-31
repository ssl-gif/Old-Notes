package Demo02_XMLParsing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Demo02_DocumentObject {
    public static void main(String[] args) throws IOException {

        Document document = Jsoup.parse(new File("day11_code\\src\\Demo02_XMLParsing\\student.xml"), "UTF-8");

        // 获取id属性为1的标签元素
        Element elementById = document.getElementById("1");
        System.out.println(elementById);

        // 获取标签名称为name的标签元素
        Elements elements01 = document.getElementsByTag("name");
        for (int i = 0; i < elements01.size(); i++) {
            System.out.println(elements01.get(i));
        }

        // 获取属性名称为number的标签元素
        Elements elements02 = document.getElementsByAttribute("number");
        for (int i = 0; i < elements02.size(); i++) {
            System.out.println(elements02.get(i));
        }

        // 获取属性名称、属性值为 "number=heima_0001"的标签元素
        Elements elements03 = document.getElementsByAttributeValue("number", "heima_0001");
        for (int i = 0; i < elements03.size(); i++) {
            System.out.println(elements03.get(i));
        }

    }
}
