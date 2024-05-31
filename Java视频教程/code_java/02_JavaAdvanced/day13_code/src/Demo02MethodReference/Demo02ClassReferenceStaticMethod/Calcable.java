package Demo02MethodReference.Demo02ClassReferenceStaticMethod;

// 定义一个用来计算的函数式接口
@FunctionalInterface
public interface Calcable {

    // 定义用来对整数计算绝对值并返回的抽象方法
    int calc(int number);

}

