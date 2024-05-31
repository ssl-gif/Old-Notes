
/*

(3).Function 接口的练习：自定义函数模型拼接
    请使用Function进行函数模型的拼接，按照以下顺序对字符串"赵丽颖,20"进行操作，需要执行的多个函数操作为：
a. 将字符串截取数字年龄部分，得到数字年龄的字符串："赵丽颖,20" ---> "20"
b. 将上一步得到的字符串转换成为int类型的数字："20" ---> 20
c. 将上一步得到的int类型数字加100，得到int类型数字： 20 ---> 120

 */
package Demo03CommonFunctionalInterface.Demo04FunctionInterface.Demo;

import java.util.function.Function;

public class Demo03Test {
    public static void main(String[] args) {

        String str = "赵丽颖,20";

        // 调用change方法，传递一个字符串、三个Function接口的匿名内部类
        int num1 = change(str, new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split(",")[1];
            }
        }, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }, new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 10;
            }
        });

        // 调用change方法，传递一个字符串、三个Function接口的Lambda实例
        int num2 = change(str,
                (String s) -> {
                    return s.split(",")[1];
                },
                (String s) -> {
                    return Integer.parseInt(s);
                },
                (Integer integer) -> {
                    return integer + 100;
                });

        // 使用Lambda表达式的省略格式
        int num3 = change(str, s -> s.split(",")[1], s -> Integer.parseInt(s), integer -> integer + 100);

        System.out.println(num3);

    }

    // 定义一个方法，参数传递字符串、三个Function<T, R>接口，该方法用来按照操作顺序转换数据类型
    private static int change(String s, Function<String, String> function01, Function<String, Integer> function02, Function<Integer, Integer> function03) {
        return function01.andThen(function02).andThen(function03).apply(s);
    }

}
