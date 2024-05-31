
// 手气红包的分发规则
package Demo04_ComprehensiveCase.RedPacketCode;

import Demo04_ComprehensiveCase.RedPacketFrame.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {

        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        int leftMoney = totalMoney; // 每次抽取完红包剩下的钱
        int leftCount = totalCount; // 每次抽取完红包剩下的红包个数

        for (int i = 0; i < totalCount - 1; i++) {
            int money = r.nextInt(leftMoney / leftCount * 2) + 1; // 在范围内随机抽取一个红包数额
            list.add(money);
            leftMoney -= money;
            leftCount--;
        }

        list.add(leftMoney); // 最后一个红包直接放进list集合
        return list;
    }
}
