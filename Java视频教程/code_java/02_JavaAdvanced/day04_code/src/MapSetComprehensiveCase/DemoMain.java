
// Map集合综合案例——斗地主案例
package MapSetComprehensiveCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DemoMain {
    public static void main(String[] args) {

        //1.准备牌

        // 创建一个Map集合，存储牌的索引和组装好的牌
        HashMap<Integer, String> poker = new HashMap<>();

        //创建一个List集合，存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();

        //定义两个集合，存储花色和牌的序号
        List<String> colors = List.of("♠", "♥", "♣", "♦");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        // 把索引为0的大王、索引为1的小王存储到集合中
        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;

        //循环嵌套遍历两个集合，组装52张牌，存储到集合中
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index, color + number);
                pokerIndex.add(index);
                index++;
            }
        }
        // System.out.println(poker);
        // System.out.println(pokerIndex);

        // 2.洗牌：使用Collections中的方法shuffle(List)
        Collections.shuffle(pokerIndex);
        // System.out.println(pokerIndex);

        // 3.发牌

        //定义4个集合，存储玩家牌的索引，和底牌的索引
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();

        // 遍历存储牌索引的List集合，将牌的索引发给底牌集合和每个玩家集合
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            // 先判断底牌
            if (i >= 51) {
                // 给底牌发牌
                diPai.add(in);
            } else if (i % 3 == 0) {
                // 给玩家1发牌
                player01.add(in);
            } else if (i % 3 == 1) {
                // 给玩家2发牌
                player02.add(in);
            } else if (i % 3 == 2) {
                // 给玩家3发牌
                player03.add(in);
            }
        }

        // 4.对手中的牌、底牌排序：使用Collections中的方法sort(List)，默认是升序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);

        // 5.看牌：调用看牌的方法
        lookPoker("刘德华", poker, player01);
        lookPoker("周润发", poker, player02);
        lookPoker("周星驰", poker, player03);
        lookPoker("底牌", poker, diPai);

    }

    /*
        定义一个看牌的方法，提高代码的复用性
        参数:
            String name:玩家名称
            HashMap<Integer, String> poker：存储牌的poker集合
            ArrayList<Integer> list：存储玩家和底牌的List集合
        遍历玩家或者底牌集合，获取牌的索引，然后使用索引去Map集合中找到对应的牌
     */
    public static void lookPoker(String name, HashMap<Integer, String> poker, ArrayList<Integer> list) {
        // 输出玩家名称,不换行
        System.out.print(name + ":");
        // 遍历玩家或者底牌集合，获取牌的索引
        for (Integer key : list) {
            // 使用牌的索引，在Map集合中找到对应的牌
            String value = poker.get(key);
            System.out.print(value + " ");
        }
        // 打印完每一个玩家的牌，换行
        System.out.println();
    }

}
