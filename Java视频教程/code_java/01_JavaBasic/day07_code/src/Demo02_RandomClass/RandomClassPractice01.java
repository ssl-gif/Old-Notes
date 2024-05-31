
// Random类练习一：在范围 [1，n] 内获取随机的int数字

package Demo02_RandomClass;

import java.util.Random;

public class RandomClassPractice01 {
    public static void main(String[] args) {

        int n = 10;
        Random r = new Random();

        for (int i = 0; i < 100; i++) {    //循环获取100个随机数并打印输出
            int result = r.nextInt(n) + 1;  //本来范围是左闭右开区间[0,10),将获取的数字加1后，范围就变为[1,10]
            System.out.println(result);
        }

    }
}
