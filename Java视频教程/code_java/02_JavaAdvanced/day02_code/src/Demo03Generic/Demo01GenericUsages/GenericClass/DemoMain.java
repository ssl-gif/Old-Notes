package Demo03Generic.Demo01GenericUsages.GenericClass;

public class DemoMain {
    public static void main(String[] args) {

        // 创建GenericClass对象，泛型使用String类型
        GenericClass<String> gc1 = new GenericClass<>(); // 从JDK1.7+开始，右侧尖括号内的泛型可以省略不写
        gc1.setName("迪丽热巴");
        System.out.println(gc1.getName());

        // 创建GenericClass对象，泛型使用Integer类型
        GenericClass<Integer> gc2 = new GenericClass<>();
        gc2.setName(1);
        System.out.println(gc2.getName());

        // 不指定泛型默认为Object类型
        GenericClass gc3 = new GenericClass();
        gc3.setName("qwert");
        Object obj = gc3.getName();
        System.out.println(obj);

    }
}
