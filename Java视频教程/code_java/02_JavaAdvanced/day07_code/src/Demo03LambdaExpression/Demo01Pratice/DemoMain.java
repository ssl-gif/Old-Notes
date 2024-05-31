
/*

练习一：使用Lambda表达式的标准格式(无参无返回值)

    给定一个厨子Cook接口，内含唯一的抽象方法makeFood()用来打印输出"吃饭啦！"，且无参数、无返回值。
使用Lambda的标准格式调用invokeCook(Cook cook)方法，完成抽象方法的预计功能。

 */
package Demo03LambdaExpression.Demo01Pratice;

public class DemoMain {
    public static void main(String[] args) {

        // (1).创建接口的实现类对象，重写抽象方法
        CookImpl cookImpl = new CookImpl();
        invokeCook(cookImpl);

        // (2).使用匿名内部类的形式
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭啦！");
            }
        });

        // (3).使用Lambda的标准格式
        invokeCook(() -> {
            System.out.println("吃饭啦！");
        });

        // 使用Lambda的省略格式
        invokeCook(() -> System.out.println("吃饭啦！"));
    }

    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }

}
