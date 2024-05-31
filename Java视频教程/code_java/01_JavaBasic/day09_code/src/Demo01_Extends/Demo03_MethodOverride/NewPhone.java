package Demo01_Extends.Demo03_MethodOverride;

// 定义一个新手机类，使用老款手机作为父类，为来电显示添加更多功能
public class NewPhone extends OldPhone {

    /*
    在继承关系中，方法覆盖重写的常用写法：
        a.在子类的覆盖重写方法中，调用父类重名且被覆盖重写的成员方法，提高代码的复用率
        b.然后子类再来添加更多自己的内容
     */
    @Override
    public void show() {
        super.show();
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }

}
