
/*

    java.util.Date 是表示日期和时间的类，每一个Date类的对象都是一个特定的时间瞬间，精确到毫秒。
日期和时间以"1970 年 1 月 1 日 00:00:00"为时间原点(0毫秒)，即自"1970 年 1 月 1 日 00:00:00"
以来，每一天的每个时间瞬间都有对应的毫秒值。所以Date类对象就是这种精确到毫秒的时间瞬间。
(Date类对象 = 时间瞬间)

(1).构造方法：
public Date()：根据系统当前的日期和时间构造Date类对象
public Date(long date)：根据传入的毫秒值构造Date类对象

(2).成员方法：
public long getTime()：返回Date类对象的毫秒值

#.注意事项：中国属于东八区，会把时间原点增加8个小时，即："1970 年 1 月 1 日 08:00:00"

 */

package DateAndTimeClass;

import java.util.Date;

public class DateClass {
    public static void main(String[] args) {

        Date date01 = new Date();
        // 直接打印Date类对象得到的是以下格式的日期和时间，所以Date类重写了toString方法
        System.out.println(date01); // Tue Apr 07 20:22:44 CST 2020

        Date date02 = new Date(234567878L);
        System.out.println(date02); // Sun Jan 04 01:09:27 CST 1970

        long Millisecond01 =  date01.getTime();
        System.out.println(Millisecond01); // 1586262406833

        long Millisecond02 =  date02.getTime();
        System.out.println(Millisecond02); // 234567878

    }
}
