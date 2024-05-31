
// 鼠标类，实现USB接口，并具备自己独有的点击方法
package Demo03_InterfaceAndPolymorphicExample;

public class Mouse implements USB {

    @Override
    public void open() {
        System.out.println("开启鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    public void click(){
        System.out.println("鼠标点击");
    }

}
