package Demo02MethodReference.Demo04ClassConstructorReference;

// 定义一个用来创建Person对象的函数式接口
@FunctionalInterface
public interface PersonBuilder {

    // 定义一个用来根据姓名创建Person类对象的抽象方法
    Person buildPerson(String name);

}
