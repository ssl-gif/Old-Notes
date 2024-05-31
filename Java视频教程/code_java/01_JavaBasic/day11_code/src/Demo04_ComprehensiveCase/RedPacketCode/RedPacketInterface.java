
// 红包界面类继承自类RedPacketFrame，用于生成红包界面
package Demo04_ComprehensiveCase.RedPacketCode;

import Demo04_ComprehensiveCase.RedPacketFrame.RedPacketFrame;

public class RedPacketInterface extends RedPacketFrame {

    /**
     * 构造方法：生成红包界面。
     *
     * @param title 界面的标题
     */
    public RedPacketInterface(String title) {
        super(title);
    }
}
