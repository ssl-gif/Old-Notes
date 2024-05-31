
/*

    Random类练习二：模拟猜数字小游戏。游戏开始时随机生成一个1-100之间的整数number 。玩家猜测一个数字 ，与number 作比较，
系统提示大了或者小了，直到玩家猜中，游戏结束。

 */

package Demo02_RandomClass;

import java.util.Random;
import java.util.Scanner;

public class RandomClassPractice02 {
    public static void main(String[] args) {

        Random r = new Random();
        int randomNumber = r.nextInt(100) + 1; // 生成一个随机数字，范围是[1,100]

        Scanner sc = new Scanner(System.in);

        //  循环输入猜测数字，进行比较大小，直到猜中数字才结束循环。且循环次数不确定，用死循环 while(true)
        while (true) {
            System.out.println("请输入你猜测的数字：");
            int guessNumber = sc.nextInt();

            if (guessNumber > randomNumber) {
                System.out.println("太大了，请重试。");
            } else if (guessNumber < randomNumber) {
                System.out.println("太小了，请重试。");
            } else {
                System.out.println("恭喜你，猜中了，游戏结束！");
                break;  // 如果猜中，直接结束循环，游戏结束
            }
        }
    }
}
