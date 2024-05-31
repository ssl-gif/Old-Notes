
// 笔记本类，包含开机、关机功能、使用USB设备功能
package Demo03_InterfaceAndPolymorphicExample;

public class Computer {

    public void run() {
        System.out.println("笔记本开机");
    }

    // 接口作为方法的参数，将其实现类对象传递进来形成多态
    public void useDevice(USB usb) {

        usb.open();

        if (usb instanceof Mouse) {
            Mouse m = (Mouse) usb;
            m.click();
        } else if (usb instanceof KeyBoard) {
            KeyBoard kb = (KeyBoard) usb;
            kb.type();
        }

        usb.close();

    }

    public void shutDown() {
        System.out.println("笔记本关机");
    }

}
