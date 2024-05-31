package Demo03CommonFunctionalInterface.Demo01SupplierInterface;

import java.util.function.Supplier;

public class SupplierImpl implements Supplier<String> {
    // 制定数据的生产规则：返回一个字符串常量
    @Override
    public String get() {
        return "Don't be afraid to fail!";
    }
}