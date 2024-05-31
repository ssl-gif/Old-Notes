
/*

4.类的构造器引用

    如果Lambda要表达的函数方案已经存在于某个方法的实现中，并且这个方法是某个类的构造方法，那么我们就可以使用该类的类名
来引用该构造方法，并将其传递给函数式接口，以此来代替传递一个Lambda表达式，一般用来创建某个类的对象。语法格式如下：

                                        类名称 :: new

在下例中：Lambda表达式的方法体就是根据字符串name创建一个Person类对象并返回，这个功能就是Person类的有参构造方法的功能，
所以我们可以使用该类的类名来引用其构造方法，即：Person::new，并将其传递给函数式接口personBuilder，以此来代替传递的Lambda
表达式。

 */
package Demo02MethodReference.Demo04ClassConstructorReference;

public class DemoMain {
    public static void main(String[] args) {

        // 调用printName方法，传递一个Lambda表达式
        printName("迪丽热巴", name -> new Person(name));

        // 调用printName方法，传递一个类的构造器引用
        printName("迪丽热巴", Person::new);

    }

    // 定义一个方法，参数传递一个字符串和一个PersonBuilder接口，用来创建一个Person类对象并打印输出其姓名
    private static void printName(String name, PersonBuilder personBuilder) {
        Person person = personBuilder.buildPerson(name);
        System.out.println(person.getName());
    }

}
