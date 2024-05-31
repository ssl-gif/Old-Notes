
/*

练习三：使用Lambda表达式的标准格式(有参有返回值、自定义的接口)

    给定一个计算器Calculator接口，内含唯一的抽象方法calc()用来将两个int数字相加得到和值，使用Lambda
的标准格式调用invokeCalc(int a, int b, Calculator c)方法，完成抽象方法的预计功能。

 */
package Demo03LambdaExpression.Demo03Pratice;

public class DemoMain {
    public static void main(String[] args) {

        // (1).创建接口的实现类对象，重写抽象方法
        CalculatorImpl calculatorImpl = new CalculatorImpl();
        invokeCalc(10, 20, calculatorImpl);

        // (2).使用匿名内部类的形式
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        // (3).使用Lambda的标准格式
        invokeCalc(10, 20, (int a, int b) -> {
            return a + b;
        });

        // 使用Lambda的省略格式
        invokeCalc(10, 20, (a, b) -> a + b);

    }

    public static void invokeCalc(int a, int b, Calculator c) {
        int sum = c.calc(a, b);
        System.out.println(sum);
    }

}
