
/*

(1).构造方法：
public StringBuilder()：构造一个空的StringBuilder容器
public StringBuilder(String str)：构造一个StringBuilder容器，并将字符串添加进去

(2).成员方法：
public String toString() ：将StringBuilder对象转换为String对象
public StringBuilder append(...) ：添加"任意类型数据的字符串形式"到容器中，append方法返回的是this，即返回的是调用该方法的对象本身


 */

package StringBuilderClass;

public class StringBuilderClassUsages {
    public static void main(String[] args) {

        // 空参构造方法
        StringBuilder sbu1 = new StringBuilder();
        System.out.println(sbu1);

        // 有参构造方法
        StringBuilder sbu2 = new StringBuilder("abc");
        System.out.println(sbu2);

    }

    // toString方法
    private static void demo01() {
        StringBuilder sbu = new StringBuilder("hello");
        String s = sbu.toString();
        System.out.println(s);
    }

    // append方法
    private static void demo02() {

        StringBuilder sbu1 = new StringBuilder();
        StringBuilder sbu2 = sbu1.append("abc");
        System.out.println(sbu1 == sbu2); // true，二者的地址一样，说明是用一个对象
        System.out.println(sbu1); // abc
        System.out.println(sbu2); // abc

        // append方法返回的就是对象sbu1本身，所以无需接收返回值
        sbu1.append(1);
        sbu1.append(true);
        sbu1.append(8.8);
        sbu1.append('中');
        System.out.println(sbu1); // abc1true8.8中

        /*
        链式编程：在开发中，会遇到调用一个方法后，返回一个对象的情况。然后使用返回的对象继续调用方法。
        这种时候，我们就可以把代码连在一起，如append方法一样
        */
        sbu1.append("23").append("qqq").append(false).append("xxx");
        System.out.println(sbu1);
    }

}
