package Demo03CommonFunctionalInterface.Demo04FunctionInterface.Demo02FunctionInterfaceDefaultMethod;

import java.util.function.Function;

public class FunctionImpl02 implements Function<Integer, String> {
    // 制定数据的转换规则：将Integer类型数据转换成String类型
    @Override
    public String apply(Integer integer) {
        return integer + "";
    }
}
