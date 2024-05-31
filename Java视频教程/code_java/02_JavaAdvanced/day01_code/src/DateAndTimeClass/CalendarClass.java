
/*

    java.util.Calendar类是日历类，并且是一个抽象类，Calendar类无法直接创建对象使用，
里边有一个静态方法叫getInstance()，调用此方法会返回一个Calendar类的子类对象。

(1).创建Calendar类的子类对象：
public static Calendar getInstance()：使用默认时区和语言环境获得一个日历对象


(2).Calendar类里边提供了很多用来操作日历的字段(静态常量)，使用类名即可调用。

public static final int YEAR = 1;	年
public static final int MONTH = 2;	月
public static final int DATE = 5;	月中的某一天
public static final int DAY_OF_MONTH = 5;月中的某一天
public static final int HOUR = 10; 		时
public static final int MINUTE = 12; 	分
public static final int SECOND = 13;	秒

(2).成员方法：
public int get(int field)：返回给定日历字段的值
public void set(int field, int value)：将给定的日历字段设置为定值
public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量，正数增加、负数减少
public Date getTime()：返回一个此Calendar时间值的Date对象，即把日历对象转换为日期对象

参数 int field 就是日历字段

 */

package DateAndTimeClass;

import java.util.Calendar;
import java.util.Date;

public class CalendarClass {
    public static void main(String[] args) {
    }

    // get方法
    private static void demo01() {
        Calendar c = Calendar.getInstance(); // 多态

        int year = c.get(Calendar.YEAR);
        System.out.println(year); // 2020

        int month = c.get(Calendar.MONTH);
        System.out.println(month); // 3，西方的日历：0-11

        int date = c.get(Calendar.DATE);
        // int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date); // 7
    }

    // set方法
    private static void demo02() {
        Calendar c = Calendar.getInstance();

        c.set(Calendar.YEAR, 9999);
        c.set(Calendar.MONTH, 9);
        c.set(Calendar.DATE, 9);

        c.set(9999, 9, 9); // 调用set重载的方法同时设置日历字段的值

        System.out.println(c.get(Calendar.YEAR)); // 9999
        System.out.println(c.get(Calendar.MONTH)); // 9
        System.out.println(c.get(Calendar.DATE)); // 9
    }

    // add方法
    private static void demo03() {
        Calendar c = Calendar.getInstance();

        c.add(Calendar.YEAR, 2);   // 把年增加2年
        c.add(Calendar.MONTH, -3); // 把月份减少3个月


        int year = c.get(Calendar.YEAR);
        System.out.println(year); // 2022

        int month = c.get(Calendar.MONTH);
        System.out.println(month); // 0

    }

    // getTime方法
    private static void demo04() {
        Calendar c = Calendar.getInstance();

        Date date = c.getTime();
        System.out.println(date); // Tue Apr 07 22:08:26 CST 2020
    }

}
