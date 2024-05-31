
/*

    含有泛型的接口有两种使用方式：

(1).定义实现类实现接口的同时指定接口的泛型。由于接口的泛型已经被指定，所以实现类重写抽象方法时泛型也已确定，所以此时实现类是不含有泛型的普通类

(2).接口使用什么泛型，实现类就使用什么泛型。相当于是定义了一个含有泛型的类，创建对象的时候再指定泛型的类型

#.注意：

①.Collection就是这种带泛型的接口，并且其实现类都是以第二种方式来使用泛型接口

②.两个额外思考：

a.含有泛型的接口的匿名内部类的使用，必须指定接口的泛型

                正确用法：                                       错误用法：
                new GenericInterface<String>() {                new GenericInterface<E>() {
                    @Override                                       @Override
                    public void method(String s) {                  public void method(E e) {
                        System.out.println(s);                          System.out.println(e);
                    }                                               }
                };                                              };

原因：匿名内部类相当于是创建一个匿名的接口实现类，再new一个该实现类的匿名对象出来。所以正确用法相当于是"含有泛型的接口的第一种使用方式"，
错误用法相当于是"含有泛型的接口的第二种使用方式"，但是第二种使用方式是在new一个接口的实现类对象的时候，指定泛型的类型，在上述错误用法中，
是没法指定泛型的类型的，所以不能这样使用。

b.含有泛型的接口与多态相结合时的使用规则，两种写法均可，最好还是把左边接口的泛型写出来

第一种使用方式与多态的结合：
GenericInterface gc1 = new GenericInterfaceImpl01();    GenericInterface<String> gc1 = new GenericInterfaceImpl01();

第二种使用方式与多态的结合：
GenericInterface gc2 = new GenericInterfaceImpl02<Integer>();   GenericInterface<Integer> gc2 = new GenericInterfaceImpl02<Integer>();

 */

package Demo03Generic.Demo01GenericUsages.GenericInterface;

public class DemoMain {
    public static void main(String[] args) {

        // 创建实现类GenericInterfaceImpl01的对象
        GenericInterfaceImpl01 gc1 = new GenericInterfaceImpl01();
        gc1.method("qwert");

        // 创建实现类GenericInterfaceImpl02的对象
        GenericInterfaceImpl02<Integer> gc2 = new GenericInterfaceImpl02<>();
        gc2.method(10);

        new GenericInterface<String>() {
            @Override
            public void method(String s) {
                System.out.println(s);
            }
        };

    }

}
