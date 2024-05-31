
// 使用笔记本类，实现笔记本使用USB鼠标设备、USB键盘设备
package Demo03_InterfaceAndPolymorphicExample;

public class DemoMain {
    public static void main(String[] args) {

        // 创建笔记本对象
        Computer computer = new Computer();

        // 笔记本开机
        computer.run();

        // 以多态的方式创建鼠标对象
        USB u = new Mouse();
        computer.useDevice(u);

        // 创建普通键盘对象，但是传参的时候会向上转型，也是多态
        KeyBoard kb = new KeyBoard();
        computer.useDevice(kb);

        // 笔记本关机
        computer.shutDown();

    }
}
