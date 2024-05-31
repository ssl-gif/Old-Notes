package Demo03_ExtendsExample;

import java.util.ArrayList;

public class Manager extends User {

    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    // 发红包的方法
    public ArrayList<Integer> send(int totalMoney, int count) {

        ArrayList<Integer> redList = new ArrayList<>();

        if (totalMoney > getMoney()) {
            System.out.println("余额不足");
            return redList;
        }

        int avg = totalMoney / count; // 平均每个红包多少钱
        int mod = totalMoney % count; // 除不开的零头

        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        redList.add(avg + mod); // 除不开的零头，包在最后一个红包当中

        // 发完红包后重新设置余额
        setMoney(getMoney() - totalMoney);

        return redList;
    }

}
