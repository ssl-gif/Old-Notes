package Demo03CommonFunctionalInterface.Demo04FunctionInterface.Demo01FunctionInterfaceLambdaUsages;

import java.util.function.Function;

public class FunctionImpl implements Function<String, Integer> {
    // 制定数据的转换规则：将String类型数据转换成Integer类型
    @Override
    public Integer apply(String s) {
        return Integer.parseInt(s);
    }
}
