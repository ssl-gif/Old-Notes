package Demo02MethodReference.Demo05ArrayConstructorReference;

// 定义一个用来创建数组的函数式接口
@FunctionalInterface
public interface ArrayBulider {

    // 定义一个用来根据长度创建int类型数组的抽象方法
    int[] buildArray(int length);

}
