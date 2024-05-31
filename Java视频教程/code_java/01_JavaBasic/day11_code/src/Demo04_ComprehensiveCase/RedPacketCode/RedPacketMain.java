
/*

1.案例说明：
        红包发出去之后，所有人都有红包，大家抢完了之后，最后一个红包给群主自己。红包分发的策略：
    (1).普通红包(平均数额)：金额均分，不能整除的，零头放在最后一个红包中。
    (2).手气红包(随机数额)：金额随机，最少1分钱，最多不超过平均数的2倍。

2.红包界面框架使用说明：
    (1).定义一个子类继承 RedPacketFrame类，new一个子类对象即是一个发红包的界面。
    (2).在OpenMode接口的子类中制定分发规则，然后将该子类的对象传入setOpenWay()方法即可。

 */

package Demo04_ComprehensiveCase.RedPacketCode;

public class RedPacketMain {
    public static void main(String[] args) {

        // 生成一个发红包的界面
        RedPacketInterface red = new RedPacketInterface("发红包案例");

        // 设置界面上发红包的人
        red.setOwnerName("万怡");

        // 设置发红包的方式：普通红包
        NormalMode normal = new NormalMode();
        red.setOpenWay(normal);

//         设置发红包的方式：手气红包
//        RandomMode random = new RandomMode();
//        red.setOpenWay(random);

    }
}
