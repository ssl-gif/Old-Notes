package Demo03CommonFunctionalInterface.Demo03PredicateInterface.Demo01PredicateInterfaceLambdaUsages;

import java.util.function.Predicate;

public class PredicateImpl implements Predicate<String> {
    // 制定数据的条件判断规则：字符串的长度是否大于5
    @Override
    public boolean test(String s) {
        return s.length() > 5;
    }
}
