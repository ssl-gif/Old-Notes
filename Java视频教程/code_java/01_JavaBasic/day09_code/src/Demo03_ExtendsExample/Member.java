package Demo03_ExtendsExample;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    // 收红包的方法
    public void receive(ArrayList<Integer> list) {

        // 先随机抽取一个红包
        int index = new Random().nextInt(list.size());

        // 将抽取的红包从list中删除
        int delta = list.remove(index);

        // 将抽取的红包存入个人余额
        setMoney(getMoney() + delta);

    }

}
