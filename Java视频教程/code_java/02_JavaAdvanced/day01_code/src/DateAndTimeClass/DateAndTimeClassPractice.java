
// 练习：请使用日期时间相关的API，计算出一个人已经出生了多少天？
package DateAndTimeClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateAndTimeClassPractice {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期，格式：yyyy-MM-dd");
        String birthday = sc.next();

        // 将出生日期转换为Date日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate = sdf.parse(birthday);

        long birthMillisecond = birthDate.getTime(); // 获取出生日期的毫秒数
        long nowMillisecond = new Date().getTime();  // 获取当前时间的毫秒数
        long seconds = nowMillisecond - birthMillisecond;  // 得到二者的差值

        System.out.println(seconds / 1000 / 60 / 60 / 24); // 转换为天数输出

    }
}
