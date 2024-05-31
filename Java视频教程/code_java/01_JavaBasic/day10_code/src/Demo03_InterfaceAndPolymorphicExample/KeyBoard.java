
// 键盘类，实现USB接口，并具备自己独有的打字方法
package Demo03_InterfaceAndPolymorphicExample;

public class KeyBoard implements USB {

    @Override
    public void open() {
        System.out.println("开启键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void type(){
        System.out.println("键盘打字");
    }

}
