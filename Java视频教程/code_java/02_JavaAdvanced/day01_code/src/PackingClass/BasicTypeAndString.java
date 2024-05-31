
/*

基本类型与字符串类型之间的相互转换：

1.基本类型 --> 字符串(String)

法一： 加号连接  基本类型的值 + ""

法二：包装类的静态方法
public static String toString(int i)：返回一个表示指定整数的String对象(不是Object类的toString方法的覆盖重写，其他包装类也有)

法三：String类的静态方法
public static String valueOf(int i)：返回int参数的字符串表示形式(有很多重载形式)

2.字符串(String) --> 基本类型：除了Character类之外，其他所有包装类都具有parseXxx静态方法可以将字符串参数转换为对应的基本类型

public static byte parseByte(String s) ：将字符串参数转换为对应的byte基本类型
public static short parseShort(String s) ：将字符串参数转换为对应的short基本类型
public static int parseInt(String s) ：将字符串参数转换为对应的int基本类型
public static long parseLong(String s) ：将字符串参数转换为对应的long基本类型
public static float parseFloat(String s) ：将字符串参数转换为对应的float基本类型
public static double parseDouble(String s) ：将字符串参数转换为对应的double基本类型
public static boolean parseBoolean(String s) ：将字符串参数转换为对应的boolean基本类型

如果字符串参数的内容无法正确转换为对应的基本类型，则会抛出 NumberFormatException 异常

 */

package PackingClass;

public class BasicTypeAndString {
    public static void main(String[] args) {

        // 基本类型 --> 字符串(String)
        int a = 100;
        String s1 = a + "";
        System.out.println(s1);

        String s2 = Integer.toString(100);
        System.out.println(s2);

        String s3 = String.valueOf(100);
        System.out.println(s3);

        // 字符串(String) --> 基本类型
        int b = Integer.parseInt("100");
        System.out.println(b);

        int c = Integer.parseInt("qwertr"); // NumberFormatException异常

    }
}
