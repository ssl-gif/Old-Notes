package Demo02_XMLParsing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Demo03_ElementObject {
    public static void main(String[] args) throws IOException {

        Document document = Jsoup.parse(new File("day11_code\\src\\Demo02_XMLParsing\\student.xml"), "UTF-8");
        Element element_student = document.getElementsByTag("student").get(0);

        // ①.获取子元素对象的方法
        Elements elements01 = element_student.getElementsByTag("name");
        System.out.println(elements01.get(0));

        Elements elements02 = element_student.getElementsByAttribute("id");
        System.out.println(elements02.get(0));

        Elements elements03 = element_student.getElementsByAttributeValue("id", "1");
        System.out.println(elements03.get(0));

        // ②.获取属性值的方法
        String number = element_student.attr("number");
        System.out.println(number);

        // ③.获取文本内容的方法
        String text = element_student.text();
        System.out.println(text);

        String html = element_student.html();
        System.out.println(html);

    }
}
