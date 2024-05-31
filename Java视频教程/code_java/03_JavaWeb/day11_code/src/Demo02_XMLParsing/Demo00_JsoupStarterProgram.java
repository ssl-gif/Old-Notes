package Demo02_XMLParsing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Demo00_JsoupStarterProgram {
    public static void main(String[] args) throws IOException {

        // 第一步：导入 "jsoup-1.11.2.jar" 包，然后再右键 "Add As Library" 将其添加成库

        // 第二步：使用Jsoup工具类来获取Document文档对象
        Document document = Jsoup.parse(new File("day11_code\\src\\Demo02_XMLParsing\\student.xml"), "UTF-8");

        // 第三步：使用Document文档对象来获取Element元素对象
        Elements elements_name = document.getElementsByTag("name");

        // 第四步：使用Element元素对象来获取标签属性、标签内容
        System.out.println(elements_name.get(0).text());

    }
}
