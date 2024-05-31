
/*

    基本类型与对应的包装类对象之间，来回转换的过程称为"装箱"与"拆箱"。(均以Integer类为例)

1.装箱：从基本类型转换为对应的包装类对象，可以使用以下方法装箱

a.使用构造方法装箱:
public Integer(int value)：构造一个新分配的Integer对象，它表示指定的int值
public Integer(String s)：构造一个新分配的Integer对象，它表示String参数所指示的int值
传递的字符串，必须是基本类型的字符串，否则会抛出异常NumberFormatException

b.使用静态方法装箱:
public static Integer valueOf(int i)：返回一个表示指定int值的Integer实例
public static Integer valueOf(String s)：返回保存指定String值的Integer对象

2.拆箱：从包装类对象转换为对应的基本类型，可以使用成员方法拆箱

public int intValue()：以int类型返回该Integer的值

3.自动装箱、自动拆箱：从JDK1.5之后，基本类型的数据和包装类之间可以自动的相互转换

 */

package PackingClass;

public class BoxingAndUnboxing {
    public static void main(String[] args) {

        // 使用构造方法装箱
        Integer in1 = new Integer(1); // 方法上有横线,说明方法过时了
        System.out.println(in1);  // 1   说明Integer类重写了toString方法
        Integer in2 = new Integer("1");
        System.out.println(in2); // 1

        // 使用静态方法装箱
        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);
        Integer in4 = Integer.valueOf("1");
        System.out.println(in4);

        Integer in5 = Integer.valueOf("a"); // 会产生数字格式化异常 NumberFormatException

        // 使用成员方法拆箱
        int i = in1.intValue();
        System.out.println(i);

        // 自动装箱
        Integer in6 = 1;

       // 自动拆箱：in1是包装类对象，无法直接参与运算，先自动拆箱转换为int类型参与计算，之后再自动装箱转换为包装类
        Integer in7 = in6 + 2;

    }
}
