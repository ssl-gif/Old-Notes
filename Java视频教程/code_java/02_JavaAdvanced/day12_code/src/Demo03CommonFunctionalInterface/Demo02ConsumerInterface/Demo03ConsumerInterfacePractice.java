
/*

(3).Consumer接口的练习：格式化打印信息
    字符串数组当中存有多条信息，请按照格式“姓名：XX。性别：XX。”的格式将信息打印出来。要求将打印姓名的动作作为第一个Consumer
接口的Lambda实例，将打印性别的动作作为第二个Consumer接口的Lambda实例，将两个Consumer接口按照顺序"拼接"到一起。

 */
package Demo03CommonFunctionalInterface.Demo02ConsumerInterface;

import java.util.function.Consumer;

public class Demo03ConsumerInterfacePractice {
    public static void main(String[] args) {

        String[] array = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男"};

        // 调用printInfo方法，传递一个字符串数组、两个Consumer接口的匿名内部类
        printInfo(array, new Consumer<String>() {
            // 消费方式：切割message获取姓名，并按照指定的格式输出
            @Override
            public void accept(String message) {
                String name = message.split(",")[0]; // split方法返回的是一个String数组，可以简写为：split()[0]、split()[1]
                System.out.print("姓名: " + name);
            }
        }, new Consumer<String>() {
            // 消费方式：切割message获取年龄，并按照指定的格式输出
            @Override
            public void accept(String message) {
                String age = message.split(",")[1];
                System.out.print("姓名: " + age);
            }
        });

        // 调用printInfo方法，传递一个字符串数组、两个Consumer接口的Lambda实例
        printInfo(array,
                (String message) -> {
                    String name = message.split(",")[0];
                    System.out.print("姓名: " + name);
                },
                (String message) -> {
                    String age = message.split(",")[1];
                    System.out.println("。年龄: " + age + "。");
                });

        // 使用Lambda表达式的省略格式
        printInfo(array,
                message -> {
                    String name = message.split(",")[0];
                    System.out.print("姓名: " + name);
                },
                message -> {
                    String age = message.split(",")[1];
                    System.out.println("。年龄: " + age + "。");
                });

    }

    // 定义一个方法，参数传递String数组、两个Consumer<String>接口
    private static void printInfo(String[] array, Consumer<String> consumer01, Consumer<String> consumer02) {
        // 循环遍历该字符串数组，对数组中的每一个字符串进行连续消费操作
        for (String message : array) {
            consumer01.andThen(consumer02).accept(message);
        }
    }

}

