
/*

    java.text.DateFormat类是用来把日期和时间格式化、解析的抽象类。由于DateFormat类
是一个抽象类，无法直接创建对象使用，但可以使用它的子类SimpleDateFormat类。

(1).构造方法：
public SimpleDateFormat(String pattern)：用指定的格式构造对象，格式规则如下

                标识字母(区分大小写)         含义
                    y                       年
                    M                       月
                    d                       日
                    H                       时
                    m                       分
                    s                       秒
按照"yyyy-MM-dd HH:mm:ss"格式的日期时间为："2020-08-08 20:47:53"

(2).成员方法：
public String format(Date date)：按照指定的格式，把Date日期格式化为相应字符串
public Date parse(String source) throws ParseException：把符合格式的字符串解析为Date日期

#.注意事项：parse方法声明了一个异常叫ParseException，如果传入的字符串不符合指定的格式，那么
程序就会抛出此异常。调用一个可能抛出异常的方法，要么try catch自己处理，要么就继续向外抛出这个异常

 */

package DateAndTimeClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatClass {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf01 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date01 = new Date();
        String str = sdf01.format(date01);
        System.out.println(date01); // Tue Apr 07 21:02:39 CST 2020
        System.out.println(str);    // 2020-04-07 21:02:39

        SimpleDateFormat sdf02 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date02 = sdf02.parse("1998年10月25日 17时56分32秒");
        System.out.println(date02); // Sun Oct 25 17:56:32 CST 1998

    }
}
