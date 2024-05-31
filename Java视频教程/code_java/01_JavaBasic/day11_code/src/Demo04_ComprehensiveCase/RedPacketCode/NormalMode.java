
// 普通红包的分发规则
package Demo04_ComprehensiveCase.RedPacketCode;

import Demo04_ComprehensiveCase.RedPacketFrame.OpenMode;

import java.util.ArrayList;

public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {

        ArrayList<Integer> list = new ArrayList<>();

        int avg = totalMoney / totalCount; // 平均值
        int mod = totalMoney % totalCount; // 零头

        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);
        }

        list.add(avg + mod); // 零头放在最后一个红包当中
        return list;
    }
}
