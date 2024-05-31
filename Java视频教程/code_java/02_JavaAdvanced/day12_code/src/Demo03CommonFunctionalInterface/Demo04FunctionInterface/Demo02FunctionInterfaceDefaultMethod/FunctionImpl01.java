package Demo03CommonFunctionalInterface.Demo04FunctionInterface.Demo02FunctionInterfaceDefaultMethod;

import java.util.function.Function;

public class FunctionImpl01 implements Function<String, Integer> {
    // 制定数据的转换规则：将String类型数据转换成Integer类型，再加10
    @Override
    public Integer apply(String s) {
        return Integer.parseInt(s) + 10;
    }
}
