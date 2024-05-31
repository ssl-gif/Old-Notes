package Demo02_XMLParsing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Demo05_QuickQuery_01Selector {
    public static void main(String[] args) throws IOException {

        Document document = Jsoup.parse(new File("day11_code\\src\\Demo02_XMLParsing\\student.xml"), "UTF-8");

        // 查询name标签
        Elements elements01 = document.select("name");
        System.out.println(elements01.get(0));
        System.out.println(elements01.get(1));

        // 查询id值为2的元素
        Elements elements02 = document.select("#2");
        System.out.println(elements02.get(0));

        // 查找student标签并且number属性值为heima_0001
        Elements elements03 = document.select("student[number='heima_0001']");
        System.out.println(elements03.get(0));

        // 查找student标签并且number属性值为heima_0001的age子标签
        Elements elements04 = document.select("student[number='heima_0001'] > age");
        System.out.println(elements04.get(0));

    }
}
