
/*

(3).Predicate接口的练习：信息筛选
    数组当中有多条"姓名+性别"的信息如下：String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
请通过Predicate接口的拼装将符合要求的字符串筛选到ArrayList集合中，需要同时满足两个条件：1.必须为女生  2.姓名为4个字

 */
package Demo03CommonFunctionalInterface.Demo03PredicateInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo03PredicateInterfacePractice {
    public static void main(String[] args) {

        String[] array = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女"};

        // 调用filterString方法，传递一个字符串数组、两个Predicate接口的匿名内部类
        ArrayList<String> list01 = filterString(array, new Predicate<String>() {
            // 制定数据的条件判断规则：获取字符串中的性别，并判断其是否为女
            @Override
            public boolean test(String s) {
                return s.split(",")[1].equals("女");
            }
        }, new Predicate<String>() {
            // 制定数据的条件判断规则：获取字符串中的姓名，并判断其长度是否为4个字符
            @Override
            public boolean test(String s) {
                return s.split(",")[0].length() == 4;
            }
        });

        // 调用filterString方法，传递一个字符串数组、两个Predicate接口的Lambda实例
        ArrayList<String> list02 = filterString(array,
                (String s) -> {
                    return s.split(",")[1].equals("女");
                }, (String s) -> {

                    return s.split(",")[0].length() == 4;
                });

        // 使用Lambda表达式的省略格式
        ArrayList<String> list03 = filterString(array, s -> s.split(",")[1].equals("女"), s -> s.split(",")[0].length() == 4);

        for (String s : list03) {
            System.out.println(s);
        }

    }

    // 定义一个方法，参数传递String数组、两个Predicate<String>接口
    private static ArrayList<String> filterString(String[] array, Predicate<String> predicate01, Predicate<String> predicate02) {

        ArrayList<String> list = new ArrayList<>();

        // 循环遍历该字符串数组，对数组中的每一个字符串进行条件判断，如果符合条件则将其添加到ArrayList集合中
        for (String s : array) {
            boolean b = predicate01.and(predicate02).test(s);
            if (b) {
                list.add(s);
            }
        }

        return list;
    }

}
