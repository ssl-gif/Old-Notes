
/*

    练习三：ArrayList<E>集合类的对象作为方法返回值。从 [1，100] 的范围内随机获取20个数字并存入到一个大集合中，
然后将大集合中的所有偶数筛选出来存入一个小集合，并且要求使用自定义的方法来实现筛选。

 */

package Demo03_ArrayListClass.Demo03_ArrayListPractice;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListPractice03 {
    public static void main(String[] args) {

        // 创建一个大集合对象，用来存储20个随机数字
        ArrayList<Integer> bigList = new ArrayList<>();

        // 生成20个随机数字，并存入大集合中
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int randomNumber = r.nextInt(100) + 1;
            bigList.add(randomNumber);
        }

        // 调用getSmallList()方法
        ArrayList<Integer> smallList = getSmallList(bigList);

        System.out.println("偶数总共有" + smallList.size() + "个");
        System.out.println(smallList);
    }

    // 定义筛选偶数的方法getSmallList()：将大集合对象传入方法，筛选出其中的偶数后放入小集合，并将小集合对象返回。
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> listA) {

        // 创建一个小集合用来存储偶数
        ArrayList<Integer> listB = new ArrayList<>();

        // 循环遍历大集合中的数据，将偶数筛选出来放入小集合
        for (int i = 0; i < listA.size(); i++) {
            int num = listA.get(i);
            if (num % 2 == 0) {
                listB.add(num);
            }
        }

        // 将小集合返回
        return listB;
    }

}