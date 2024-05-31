
// (2).Supplier接口的练习：使用 Supplier 接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值。
package Demo03CommonFunctionalInterface.Demo01SupplierInterface;

import java.util.function.Supplier;

public class Demo02SupplierInterfacePractice {
    public static void main(String[] args) {

        int[] array = {100, 0, -50, 880, 99, 33, -30};

        // (1).调用getMax方法，方法的参数是一个接口，所以可以传递接口的匿名内部类
        int maxValue1 = getMax(new Supplier<Integer>() {
            @Override
            public Integer get() {
                int max = array[0];
                for (int i : array) {
                    if (i > max) {
                        max = i;
                    }
                }
                return max;
            }
        });

        // (2).调用getMax方法，方法的参数Supplier是一个函数式接口，所以可以传递Lambda表达式
        int maxValue2 = getMax(() -> {
            int max = array[0];
            for (int i : array) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });

        System.out.println("数组中的最大值是:" + maxValue2);

    }

    // 定义一个方法，用于获取int类型数组中元素的最大值，方法的参数传递Supplier<Integer>接口
    private static int getMax(Supplier<Integer> supplier) {
        return supplier.get();
    }

}
