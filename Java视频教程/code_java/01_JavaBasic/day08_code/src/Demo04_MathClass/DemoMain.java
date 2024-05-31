package Demo04_MathClass;

public class DemoMain {
    public static void main(String[] args) {

        // 获取绝对值
        System.out.println(Math.abs(-2.5)); // 2.5

        // 向上取整
        System.out.println(Math.ceil(3.9)); // 4.0
        System.out.println(Math.ceil(3.0)); // 3.0

        // 向下取整
        System.out.println(Math.floor(30.9)); // 30.0
        System.out.println(Math.floor(31.0)); // 31.0

        // 四舍五入
        System.out.println(Math.round(20.4)); // 20

        // Math.PI是Math类的静态常量，为近似的圆周率
        System.out.println(Math.PI);

    }
}