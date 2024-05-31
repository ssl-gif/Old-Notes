
// 练习一：使用ArrayList<E>集合存储基本类型数据。生成6个1~33之间的随机整数，添加到集合，并遍历集合。

package Demo03_ArrayListClass.Demo03_ArrayListPractice;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListPractice01 {
    public static void main(String[] args) {

        // 使用包装类Integer，创建一个集合list，用来存储6个随机整数
        ArrayList<Integer> list = new ArrayList<>();

        Random r = new Random();

        // 循环生成随机数字，并添加到list集合中
        for (int i = 0; i < 6; i++) {
            int randomNumber = r.nextInt(32) + 1;
            list.add(randomNumber);
        }

        // 遍历list集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
